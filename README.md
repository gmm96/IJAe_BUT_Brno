# IJAe 2017/18 Project

### December, 2017

### Assignment

Creating a **calculator application** that provides both basic and more complex mathematical operations and
supports number representation in different bases (decimal, binary, etc.). For this task, I use a well-known 
JavaScript library called [math.js](http://mathjs.org/index.html) as *calculation engine*. **Math.js** features a flexible 
expression parser with support for symbolic computation, comes with a large set of built-in functions and constants, 
and offers an integrated solution to work with different data types like numbers, big numbers, complex numbers, 
fractions, units, and matrices.

### Graphical user interface specification

1. Input and Output fields– the application provides the option to input the numeric values from
keyboard. It also displays a list of the expressions along with their results. One click in one expression
will write in input field.
2. C, CE and DEL buttons– allow to delete the current input, erase the memory and delete the last
digit/operator from the user input respectively.
3. Equals sign button– starts the computation.
4. Number buttons, parethesis buttons, decimal mark button– allow to input numeric values without using keyboard, include
hexadecimal values as well. Keyboard could also be used.
5. Basic maths operation buttons– include addition, multiplication, subtraction, division and modulo
operations.
6. Numeric base option– allows the user to choose in which numeric base the numbers are represented.
Number buttons are enabled / disabled accordingly to the current base selected (e.g. with
*binary* numbers, only 1 and 2 are enabled). Input values also changes when calculation base is changed.
7. Advanced maths operation buttons– include sinus, cosinus, exponential function, logarithm with
the base of 2 and natural logarithm. User can choose whether the advanced operations are displayed or hidden.
8. Edit menu with options to copy from both fields and paste to the input field.
9. Help section with credits about the application and an manual of use. This will show the 
[documentation](http://mathjs.org/docs/index.html) for the math.js library for advance input use. 


### Functionality specification

- The calculator has memory storing the result of the last computation.
- The next computation can use the value in memory as its first operand.
- The application provides **different modes of use** depends on the level of the user: a *noob mode* with basic use;
a *guided mode* with restricted input; and an *advance mode* with free input, which will help us to take real advantage
of calculation engine math.js
- User is able to provide input expressions from the keyboard. The application checks the format and
    ensure the correctness of the user input. A warning should be shown in case of incorrect input.
- Angles can be expressed in *degrees* or *radians*.
- Main class is called CalcDemo.java. Math.js is obtained by internet.

### Captures

![Binary base](https://raw.githubusercontent.com/gmm96/IJAe_BUT_Brno/master/img/Screenshot_20181016_032547.png "Binary base")

![Octal base](https://raw.githubusercontent.com/gmm96/IJAe_BUT_Brno/master/img/Screenshot_20181016_032552.png "Octal base")

![Decimal base](https://raw.githubusercontent.com/gmm96/IJAe_BUT_Brno/master/img/Screenshot_20181016_032557.png "Decimal base")

![Hexadecimal base](https://raw.githubusercontent.com/gmm96/IJAe_BUT_Brno/master/img/Screenshot_20181016_032603.png "Hexadecimal base")

![Calculation example](https://raw.githubusercontent.com/gmm96/IJAe_BUT_Brno/master/img/Screenshot_20181016_032928.png "Calculation example")