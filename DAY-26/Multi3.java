// class Multi3 implements Runnable{  
//     public void run(){  
//     System.out.println("Thread is running");  
//     }  
      
//     public static void main(String args[]){  
//     Multi3 m1=new Multi3();  
//     Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
//     t1.start();  
//      }  
//     }  
/**
 * Multi3
 */
public class Multi3 implements Runnable {

    public void run(){
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        Multi3 m = new Multi3();
        Thread t1 = new Thread(m);
        t1.start();
    }

}