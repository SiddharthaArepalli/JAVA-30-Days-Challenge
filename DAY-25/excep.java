// class Exc0 {
// 	public static void main(String args[])
//     {	int d = 0;
// 		int  a = 42 / d;
//        System.out.print("This will not be printed");
// 	}
// }



// class Exc0
// {	public static void main(String args[]) 
//     {	int d, a;
// 	 	   try			 // monitor a block of code.
//           {  d = 0;
// 	         a = 42 / d;
// 		       System.out.println("This will not be printed.");
// 		    } 
// 		    catch (Exception e) // catch divide-by-zero error
// 		    { 		System.out.println("Exception: " + e  );
															       
// 		}
//           System.out.println("After catch statement.");
// 	}
// }


// class SuperSubCatch {
// 	public static void main(String args[]) {
// 		try {
// 			int a = 0;
// 			int b = 42 / a;
// 		}
// 		catch(ArithmeticException e){ 				
// 			System.out.println("This is never reached.");
// 		}
// 		catch(Exception e) {
// 			System.out.println("Generic Exception catch.");
// 		}
/* This catch is never reached because ArithmeticException is a subclass of Exception. */
		// catch(ArithmeticException e){ 				
		// 	System.out.println("This is never reached.");
		// }
// 	}
// }

// class NestedTry
// { 
	
//    public static void main(String args[]) 
//    { 
// 	   try { 
// 		   int a[] = { 1, 2, 3, 4, 5 };  
// 		   System.out.println(a[5]); 
// 		   try { 
// 			   int x = a[2] / 0;
// 		   } 
// 		   catch (ArithmeticException e2)
//           { 
// 	System.out.println("division by zero is not possible"); 
// 			} 
// 		} 
//     catch (ArrayIndexOutOfBoundsException  e1) 
// { 
//  System.out.println("ArrayIndexOutOfBoundsException"); 
//  System.out.println("Element at such index does not exists"); 
// 		} 
// 	}
	
// }

// public class TestThrow1 {
// //functiontocheckifpersoniseligibletovoteornot
// public static void validate(int age){
// if(age<18){
// //throwArithmeticexceptionifnoteligibletovote
// throw new ArithmeticException("Person is not eligibl to vote");
// }
// else{
// System.out.println("Person is eligible to vote!!");
// }
// }
// //mainmethod
// public static void main(String args[]) {
// //callingthefunction
// validate(13);
// System.out.println("restofthecode...");
// }
// }

import java.io.*;
class excep { 
	public static void main(String[] args) 
{ 
try { 
	System.out.println("Inside try block"); 
// Throw an Arithmetic exception 
System.out.println(34 / 0); 
} 
// Can not accept Arithmetic type exception // Only accept Null Pointer type Exception 
catch (NullPointerException e) { 
System.out.println( "catch : exception not handled."); 
} 
// Always execute 
finally { 
System.out.println( "finally : i will execute always."); 
} 
System.out.println("i want to run"); // This will not execute 
} 
}




   


