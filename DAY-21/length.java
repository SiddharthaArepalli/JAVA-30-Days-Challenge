public class length  
{  
public static void print(int mat[][])  
{  
System.out.println(mat.length);  
System.out.println(mat[0].length);  
System.out.println(mat[1].length);      
}  
public static void main(String args[])   
{  
int mat[][] = { { 1, 2, 3}, { 5, 6, 7 }};  
print(mat);  
}  
}  