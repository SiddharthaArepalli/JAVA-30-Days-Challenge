class Parent
{	
    int a=10,b=20; //instance variables
};
class Child extends Parent
{	//instance variables	
	int a=100;	
	int b=200;	
	void m1(int a,int b)	
                      //local variables	
	{	
            System.out.println(a+b);
                     //local variables addition
	System.out.println(this.a+this.b);
        //current class variables addition

System.out.println(super.a+super.b);	//super class variables addition
  }

public static void main(String[] args)
{	Child c = new Child(); c.m1(1000,2000);
}
};