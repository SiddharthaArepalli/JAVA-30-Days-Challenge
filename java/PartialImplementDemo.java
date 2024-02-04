// class a{
//     void run(){
//         System.out.println("run");
//     }
// }
// class b extends a {
//     void run(){
//          System.out.println("walk");
//     }
//     void jog(){
//             System.out.println("jog");
//     }
//     void ex(){
//         this.jog();
//         super.run();
//     }
// }
// class exam{
//     public static void main(String[] args) {
//          b obj = new b();
//          obj.ex();

//     }
// }
// 
// class A
// {
//     static String cname;
//     String name;
//     int rno;
   
//     void display()
//     {
//      System.out.println("Student name: " + name);
//      System.out.println("Student rno:  " + rno);
//      System.out.println("College name: " + cname);
   
//     }
//    }
//    class stat
// {
//  public static void main(String ar[])
//  {
//       A a1=new A();
//       A a2=new A();
//         a1.name="Jaffar";
//         a1.rno=1201;
//         a1.cname="SNIST";
//         a1.cname = "VBIT";
//     a1.display();

//        a2.name="Sameer";
//        a2.rno=1202;
       
//     a2.display();
//  }
// }

interface Study {
	void theory( );
	void practical( );
 class Lab implements Study{	
	
	public void theory( ) {
		System.out.println("Theory Work in Class Room");
	} 
	public void practical( ) {
		System.out.println("practical Work in Class Room");
	} 
 }
// class Lab extends Room{	
// 	// @Override
// 	public void practical( ) {
// 		System.out.println("Practical Work in Lab");		
// 	}   }
public class PartialImplementDemo{
	public static void main(String []a) {	
		Lab L= new Lab();
		L.theory();
		L.practical();
	}  }
}
