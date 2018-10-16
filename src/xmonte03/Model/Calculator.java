/*
 * @author Guillermo Montes Martos
 * @author xmonte03
 *
 */

package xmonte03.Model;

import java.io.*;
import java.net.*;
import javax.script.*;


/**
 * Class that makes calculations from the javascript mathjs library.
 *
 * @author Guillermo Montes Martos
 * @author xmonte03
 * @version 1.0
 */
public class Calculator {
    
    private static String JSMATH_URL = "https://cdnjs.cloudflare.com/ajax/libs/mathjs/3.17.0/math.js";
    /** Engine that will execute the script. */
    private ScriptEngine eng;
     
    
    /**
     * Basic constructor.
     * @throws MalformedURLException if URL doesn't exit.
     * @throws ScriptException if there's a bug trying to run the javascript mathjs library.
     * @throws IOException if there's an error trying to read the file.
     */
    public Calculator() throws MalformedURLException, ScriptException, IOException {
        ScriptEngineManager man = new ScriptEngineManager();
        eng = man.getEngineByName("js");

        eng.eval(new InputStreamReader(new URL(JSMATH_URL).openStream()));
        eng.eval("var parser = math.parser();");
        eng.eval("var precision = 10;");
    }

    
    /**
     * Calculate the result of the expression.
     * @param expr Expression to calculate.
     * @return Result of the calculation.
     * @throws ScriptException if expression has bad syntax.
     */
    public String eval(String expr) throws ScriptException {
        String expression = "math.format(parser.eval('" + expr + "'), precision);";
        return (String) eng.eval(expression);
    }
        
}

