import java.util.Scanner;  
public class method  
{  
public static void main (String args[])  
{  
//creating Scanner class object     
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
//reading value from user  
int num=sc.nextInt();  
//method calling  
findEvenOdd(num);  
}  
//user defined method  
public static void findEvenOdd(int num)  
{  
//method body  
if(num%2==0)   
System.out.println(num+" is even");   
else   
System.out.println(num+" is odd");  
}  
}  
