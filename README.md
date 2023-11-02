# JAVA-30-Days-Challenge
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

