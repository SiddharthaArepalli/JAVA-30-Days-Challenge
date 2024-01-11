import java.util.Scanner;

class StringBufferExp {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String is: ");
        String s = sc.next();
        StringBuffer sb  = new StringBuffer("Sid");
        sb.append(s);
        System.out.println(sb);
    }
}