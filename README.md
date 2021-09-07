# evaluate-expression

My solution for Chapter 8 Exercise 4 of “Introduction to Programming Using Java”.

Problem Description:
The source code file Expr.java defines a class, Expr, that can be used to represent mathematical
expressions involving the variable x. The expression can use the operators +, -,
*, /, and ^ (where ^ represents the operation of raising a number to a power). It can use
mathematical functions such as sin, cos, abs, and ln. See the source code file for full
details. The Expr class uses some advanced techniques which have not yet been covered in
this textbook. However, the interface is easy to understand. It contains only a constructor
and two public methods.
The constructor new Expr(def) creates an Expr object defined by a given expres-
sion. The parameter, def, is a string that contains the definition. For example,
new Expr("x^2") or new Expr("sin(x)+3*x"). If the parameter in the constructor call
does not represent a legal expression, then the constructor throws an IllegalArgumentEx-
ception. The message in the exception describes the error.
If func is a variable of type Expr and num is of type double, then func.value(num)
is a function that returns the value of the expression when the number num is substituted
for the variable x in the expression. For example, if Expr represents the expression 3*x+1,
then func.value(5) is 3*5+1, or 16. If the expression is undefined for the specified value
of x, then the special value Double.NaN is returned; no exception is thrown.
Finally, func.toString() returns the definition of the expression. This is just the
string that was used in the constructor that created the expression object.
For this exercise, you should write a program that lets the user enter an expression. If
the expression contains an error, print an error message. Otherwise, let the user enter some
numerical values for the variable x. Print the value of the expression for each number that
the user enters. However, if the expression is undefined for the specified value of x, print
a message to that effect. You can use the boolean-valued function Double.isNaN(val)
to check whether a number, val, is Double.NaN.
The user should be able to enter as many values of x as desired. After that, the user
should be able to enter a new expression.

Note: This project relies on Expr.java, a class provided by the author of the textbook. 
