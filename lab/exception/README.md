Exception handling
==

An exception (or exceptional event) is a problem that arises during the execution of a program. When an Exception occurs the normal 
flow of the program is disrupted and the program/Application terminates abnormally, which is not 
recommended, therefore, these exceptions are to be handled.

An exception can occur for many different reasons. Following are some scenarios where an exception occurs.

A user has entered an invalid data.

A file that needs to be opened cannot be found.

A network connection has been lost in the middle of communications or the JVM has run out of memory.

Some of these exceptions are caused by user error, others by programmer error, and others by physical resources that have failed in 
some manner.

Based on these, we have three categories of Exceptions. You need to understand them to know how exception handling works in Java.

Checked exceptions − A checked exception is an exception that is checked (notified) by the compiler at compilation-time, these are 
also called as compile time exceptions. These exceptions cannot simply be ignored, the programmer should take care of (handle) these
exceptions.

For example, if we use FileReader class in your program to read data from a file, if the file specified in its constructor doesn't
exist, then a FileNotFoundException occurs, and the compiler prompts the programmer to handle the exception.

There are 5 keywords used for handling exceptions:
 ==
 

 + try
  
The try keyword is used to specify a block where we should place exception code. The try block must be followed by either catch or
finally.

 + catch
 The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. 
It can be followed by finally block later.

+ throw
The "throw" keyword is used to throw an exception.

 + finally
Java finally block is always executed whether exception is handled or not.

 + throws
The "throws" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception
in the method. It is always used with method 
signature.
