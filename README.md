# Exception-Handling-in-Java
## Overview 
This project is dedicated to demonstrate different types of exceptions and ways to handle them in Java language. It is an IntelliJ IDEA project, So you can open the project using that IDE.

## Key Concepts

Following are summarized theories and rules that will be helpful

- **Advantage of Handling Exception** 
  - It continues the flow of the program even if exceptions occur. 
- **Hierarchy of Java Exception Classes** 
  - The java.lang.Throwable class is the root class of Java Exception hierarchy inherited by two subclasses: Exception and Error.
		
- **Types of Exceptions**
  - **Checked Exceptions**
		- IOException, SQLException, etc.
  - **Unchecked Exception**
		- ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException
  - **Errors** 
		- OutOfMemoryError, VirtualMachineError.
		
- **`Which Exceptions should be declared?`**
	- Checked Exceptions only. Unchcked exceptions should handle by the programmer.

- **Try block**
	- Must be followed by catch or finally block
	- If error occurred rest of the code in try block doesn't get executed.
  
- **Catch block**
	- Must be preceded by try block 
	- Can be followed by finally block later
	- Should declare the type of exception within the method parameter
		- Good approach is to declare the most specific exception ('ArithmeticException') instead of parent exception ('Exception')
			
- **Multiple catch blocks** 
	- Can use multiple catch block with a single try block
	- Each catch block must contain a different exception handler. 
	- At a time only one exception occurs and executed. 
	- All catch blocks must be ordered from most specific to most general- eg: 'ArithmeticException' comes before  'Exception'.
	
- **Finally block**
	- Can be used to put '"clean up" code such as closing a file, connection,  or to print important statements. 
	- Try block can only have one finally block
	- Finally blocks is executed even if you don’t handle the exception. 
		
- **Throw Exception**
	- 'throw' keyword is used to throw an exception explicitly. 
	- It's mainly used to throw custom exception, but can be used to throw checked or unchecked exceptions. 

		
- **Throws keyword** 
	- Is used to declare an exception. 
	- It gives an information to the programmer that they may occur an exception. 
		
- **Custom exceptions**
	- Can be used to catch and provide specific treatment to a subset of existing java exceptions.
	- Business logic exceptions: These are the exceptions related to business logic and workflow. It is useful for application users or the developers to understand the exact problem. 
		
- **Exception Propagation** 
  	- An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method until they are caught or util they reach the very bottom of the call stack. This is called exception propagation
		
	- By default Unchecked Exceptions are forwarded in calling chain (propagated).
	- By default Checked Exceptions are not forwarded in calling chain (propagated). 
		
- **Exception handling with method overriding**
	- If the superclass method does not declare an exception, subclass overridden method cannot declare checked exception but it can declare unchecked exception.
	- If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception. 
		
*References used to write this summarized note: [JavaTPoint](https://www.javatpoint.com/exception-handling-in-java) and [Baeldung](https://www.baeldung.com/java-exceptions)* 
