/*
 * @author Guillermo Montes Martos
 * @author xmonte03
 *
 */

package xmonte03.GUI;

import java.io.*;
import java.math.*;
import java.util.ArrayList;
import java.util.regex.*;
import javax.script.*;
import javax.swing.*;
import xmonte03.Model.*;


/**
 * Class that serves as midlayer between GUI and Model.
 *
 * @author Guillermo Montes Martos
 * @author xmonte03
 * @version 1.0
 */
public class Controller {
    
    /** Main windows */
    private JFrame frame;
    private Calculator calc;
    private Angle angle;
    private Base base;
    private Mode mode;
    
    
    /**
     * Basic constructor.
     */
    public Controller () {
        try {
            this.calc = new Calculator();
        }
        catch (ScriptException|IOException e){  // MalformedURLException is subclass of IOException
            System.err.println("Error creating the calculator... Exiting.");
            System.exit(-1);
        }
        this.frame = new View();
        angle = Angle.RADIANS;
        base = Base.DECIMAL;
        mode = Mode.GUIDED;
    }
    
    
    /**
     * Tells the frame to set the Controller instance.
     */
    public void setFrameControl() {
        ((View)frame).setController(this);
    }
    
    
    /**
     * 
     * @param angle 
     */
    public void setAngleUnit(Angle angle) {
        this.angle = angle;
    }

    
    /**
     * Returns the unit base of the calculations.
     * @return base
     */
    public Base getBase() {
        return base;
    }

    
    /**
     * Sets a new unit base calculations.
     * @param base 
     */
    public void setBase(Base base) {
        this.base = base;
    }
    
    
    /**
     * Returns the mode of execution of the app (noob, guided, free).
     * @return mode
     */
    public Mode getMode() {
        return mode;
    }
    
    
    /**
     * Sets a new mode.
     * @param mode 
     */
    public void setMode(Mode mode) {
        this.mode = mode;
    }

    
    /**
     * Calculates the input expression and returns the result.
     * @param input String with the expression to calculate.
     * @return String with the result.
     */
    public String calculate(String input) {
        String output = "";
        if (input.length() > 0){
            input = parseInput(input);
            System.out.println("input = " + input);
            try {
                output = calc.eval(input);
                System.out.println(output);
            }
            catch (ScriptException e) {
                output = "Error!";
                System.err.println(e.getMessage());
            }
            output = parseOutput(output);
        }
        return output;
    }
    
    
    /**
     * Parses the input to the correct syntax for the Calculator. 
     * @param input String to parse.
     * @return Parsed expression.
     */
    private String parseInput(String input){
        input = input.replaceAll("\\s|\\n|\\t", "");    // Removing white spaces and break lines
        input = input.replaceAll("ln\\(", "log\\(");   
        input = input.replaceAll("log2\\(([+,-]*)([0-9a-fA-Fx]+)(\\.[0-9]+)?(e[-,+]*\\d+)?\\)", "log($1$2$3$4,2)");
                
        input = parseSinCos(input);
        
        if (base != Base.DECIMAL)
            input = parseToDecimal(input);
        
        if (mode == Mode.FREE)
            input = parseUnitChange(input);
        
        return input;
    }
    
        
    /**
     * Parses a number in non regular syntax to decimal.
     * @param input Number to parse.
     * @return Parsed number.
     */
    public String parseToDecimal(String input) {
        String regex = "";
        int b = 0;

        switch (base) {
            case BINARY:
                regex = "(0b)([0-1]+)";
                b = 2;
                break;
            case OCTAL:
                regex = "(0o)([0-7]+)";
                b = 8;
                break;
            case DECIMAL:
                regex = "\\d+(\\.\\d+)?(e[-,+]*\\d+)";  // we only need to parse scientific notation in decimal base
                b = 10;
                break;
            case HEXADECIMAL:
                regex = "(0x)([0-9a-fA-F]+)";
                b = 16;
                break;
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(input);
        while (m.find()) {
            String s;
            BigDecimal number;
            if (b != 10){
                s = m.group(2);
                number = new BigDecimal( new BigInteger(s, b) );
            }
            else{
                s = m.group();
                number = new BigDecimal(s);
            }
            
            input = input.replaceFirst(m.group(), "" + number);
        }

        return input;
    }
    
    
    /**
     * Parse sinus and cosinus to correct value for calculation. I don't know why but the mathjs library makes bad
     * calculations for sinus and cosinus greater than 360º/2*PI. This is the reason why it should be parsed.
     *
     * @param number Number to parse.
     * @param m Matcher.
     * @param input String.
     * @return Parsed number.
     */
    public String parseSinCos(String input) {
        final BigDecimal mod = new BigDecimal((angle == Angle.DEGREES)? 360 : 2*Math.PI);
        String regex = "(sin|cos)\\(([+,-]*)([0-9a-fA-Fx]+)(\\.[0-9]+)?(e[-,+]*\\d+)?\\)";

        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(input);
        while (m.find()) {
            String s = "";
            for (int i = 3; i<=5; i++)
                s += (m.group(i) != null)? m.group(i) : "";
            BigDecimal b = new BigDecimal(parseToDecimal(s));
            b = b.remainder(mod);   
            String replacement = m.group(1) + "(" + m.group(2) + b + ((angle==Angle.DEGREES)? " deg" : "") + ")";
            input = m.replaceFirst(replacement);
        }

        return input;
    }
    
    
    /**
     * Parses unit change operations, which are identified by keyword "to" and only allowed in Mode.FREE.
     * @param input String to parse.
     * @return Parsed string.
     */
    public String parseUnitChange(String input) {       
        StringBuilder str = new StringBuilder(input);
        int cnt = 0;
       
        Pattern pattern = Pattern.compile("to");
        Matcher m = pattern.matcher(input);
        while (m.find()) {
            System.out.println("estoy dentro");
            str.insert(m.start()+cnt, " ");
            str.insert(m.end()+1+cnt, " ");
            cnt++;
        }
        
        return str.toString();
    }
    
    
    /**
     * Parses the result of the calculation to the correct syntax.
     * @param output Result of the calculation.
     * @return Parsed result.
     */
    private String parseOutput(String output) {
        if (!output.matches("Error!|Infinity|-Infinity")) {
            String regex = "\\d+(\\.\\d+)?(e[-,+]*\\d+)?";
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(output);
            while (m.find()) {
                BigDecimal number = new BigDecimal(m.group());
                System.out.println("number = " + number + "\nstring = " + m.group());
                output = output.replaceFirst(m.group(), "" + number);
            }

            if (base != Base.DECIMAL)
                output = parseToEachBase(output);
        }
        return output;
    }
    
    
    /**
     * Parses the result non decimal base.
     * @param number Number to parse.
     * @return Binary/Octal/Hexadecimal number.
     */
    public String parseToEachBase(String number) {
        String output = "";
        BigInteger b = (new BigDecimal(number)).setScale(0, RoundingMode.DOWN).toBigInteger();     // Rounding the number

        switch (base) {
            case BINARY:
                output = "0b" + b.toString(2).toUpperCase();
                break;
            case OCTAL:
                output = "0o" + b.toString(8).toUpperCase();
                break;
            case HEXADECIMAL:
                output = "0x" + b.toString(16).toUpperCase();
                break;
        }

        return output;
    }
    
    
    /**
     * Check the correctness of the input expression of the frame.
     * @param input String to analyze.
     * @return true if it's in correct syntax, false in other case.
     */
    public boolean checkInput(String input) {
        if (input.length() == 0)
            return false;
        
        String input_copy = input;
        
        ArrayList<String> regex = new ArrayList<>();
        regex.add("\\+");
        regex.add("\\-");
        regex.add("\\*");
        regex.add("\\/");
        regex.add("\\%");
                
        switch(base) {
            case BINARY:
                regex.add("0b([0-1]+)?");
                break;
            case OCTAL:
                regex.add("0o([0-7]+)?");
                break;
            case DECIMAL:
                regex.add("sin\\(\\d+(\\.\\d+)?(e[-,+]*\\d+)?\\)");
                regex.add("cos\\(\\d+(\\.\\d+)?(e[-,+]*\\d+)?\\)");
                regex.add("exp\\(\\d+(\\.\\d+)?(e[-,+]*\\d+)?\\)");
                regex.add("log2\\(\\d+(\\.\\d+)?(e[-,+]*\\d+)?\\)");
                regex.add("ln\\(\\d+(\\.\\d+)?(e[-,+]*\\d+)?\\)");
                regex.add("\\d+(\\.\\d+)?(e[-,+]*\\d+)?");
                break;
            case HEXADECIMAL:
                regex.add("0x([0-9a-fA-F]+)?");
                break;
        }
        
        regex.add("\\(");
        regex.add("\\)");
        
        for (String s : regex){
            input_copy = input_copy.replaceAll(s, "");
        }
                
        return input_copy.length() == 0;
    }
        
}
