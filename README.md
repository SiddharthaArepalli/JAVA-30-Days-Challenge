# JAVA-30-Days-Challenge(Starts from 31-10-2023)
A 30 days java programing challenge

**Getting Started with Java DAY - 1**

Installation & First Program

**Install Java**
a. Install JDK (https://www.oracle.com/in/java/technologies/javase-downloads.html)
b. Install IntelliJ (https://www.jetbrains.com/idea/download/#section=mac)
		OR
b. Install Visual Studio Code (VS Code) - Prefer THIS (https://code.visualstudio.com/download)



**Sample Code**
Functions
A function is a block of code which takes some input, performs some operations and returns some output. 
The functions stored inside classes are called methods.
The function we have used is called main.

Class
A class is a group of objects which have common properties. A class can have some properties and functions (called methods).
The class we have used is Main.

Our 1st Program

public class Main {

   public static void main(String[] args) {
  // Our 1st Program
       System.out.println("Hello World");
   }
}

**DAY-2**
Variables & Data Types

Variables
A variable is a container (storage area) used to hold data.  
Each variable should be given a unique name (identifier).  

package com.apnacollege;

public class Main {

   public static void main(String[] args) {
      // Variables
       String name = "Aman";
       int age = 30;

       String neighbour = "Akku";
       String friend = neighbour;
   }
}


Data Types
Data types are declarations for variables. This determines the type and size of  data associated with variables which is essential to know since different data  types occupy different sizes of memory.

There are 2 types of Data Types :
Primitive Data types : to store simple values
Non-Primitive Data types : to store complex values

	Primitive Data Types
	These are the data types of fixed size.
Non-Primitive Data Types
	These are of variable size & are usually declared with a ‘new’ keyword.

	Eg : String, Arrays

	String name = new String("Aman");
int[] marks = new int[3];
marks[0] = 97;
marks[1] = 98;
marks[2] = 95;

Constants
A constant is a variable in Java which has a fixed value i.e. it cannot be assigned a different value once assigned.

package com.apnacollege;

public class Main {

   public static void main(String[] args) {
  // Constants
       final float PI = 3.14F;
   }
}

**DAY-4 **

-**-> Java Operators **:
Operators are used to perform operations on variables and values.
In the example below, we use the + operator to add together two values:
int x = 100 + 50;

--> Java divides the operators into the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Bitwise operators

**-->Arithmetic Operators:**

Arithmetic operators are used to perform common mathematical operations.

Operator  	Name	        Description	Example	
+	        Addition	    Adds together two values	x + y	
-	       Subtraction	    Subtracts one value from another	x - y	
*	       Multiplication	Multiplies two values	x * y	
/	        Division	    Divides one value by another	x / y	
%	        Modulus	        Returns the division remainder	x % y	
++	        Increment	    Increases the value of a variable by 1	++x	
--	        Decrement	    Decreases the value of a variable by 1	--x

**-->> Java Comparison Operators:**
Comparison operators are used to compare two values (or variables). This is important in programming, because it helps us to find answers and make decisions.

The return value of a comparison is either true or false. These values are known as Boolean values, and you will learn more about them in the Booleans and If..Else chapter.

In the following example, we use the greater than operator (>) to find out if 5 is greater than 3:

example:
int x = 5;
int y = 3;
System.out.println(x > y); // returns true, because 5 is higher than 3

Operator	Name	                    Example	

==	        Equal to	                x == y	
!=	        Not equal	                x != y	
>	        Greater than	            x > y	
<	        Less than	                x < y	
>=	        Greater than or equal to	x >= y	
<=	        Less than or equal to	    x <= y	

**
---->> Java Logical Operators : **

You can also test for true or false values with logical operators.

Logical operators are used to determine the logic between variables or values:

Operator	Name	            Description

&& 	        Logical and	        Returns true if both statements are true	x < 5 &&  x < 10	
||          Logical or	        Returns true if one of the statements is true	x < 5 || x < 4	
!	        Logical not	        Reverse the result, returns false if the result is true	!(x < 5 && x < 10)	


