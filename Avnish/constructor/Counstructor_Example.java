package constructor;

public class Counstructor_Example {
	int c ;
	int d;
	static int x= 8;
	static int y= 12;
	int w= 24;
	int q= 32;


	public static void main(String[] args) {
		Sum(10, 20);

		Counstructor_Example C= new Counstructor_Example();//user define constructor without parameter
		Counstructor_Example C2= new Counstructor_Example(10,20);//user define constructor with parameter
		C.Addition1();
		System.out.println("value of w is "   + C.w );
		System.out.println("value of x is "   + x );


	}
	public static void Sum(int c,int d) {
		int a=15;
		int b= 30;
		int sum= a+b;

		System.out.println("sum of two numbers "  +  sum);
		System.out.println("add of  numbers "  +  sum);
		int demo= a+b+c+d;
		System.out.println(demo);


	}
	public Counstructor_Example(){     //user define constructor as name of method and class is name and we 
		//declare constructor i.e.Counstructor_Example C= new Counstructor_Example();
		int addition= x+y;            
		System.out.println("Sum of x+y is " +addition);

	}
	public Counstructor_Example(int a,int b) {//user define constructor as name of method and class is name and we 
		//declare constructor i.e.Counstructor_Example C1= new Counstructor_Example();
		System.out.println("sum of a+b is " + (a+b));
	}

	public void Addition1() {
		int add= w+q;
		int add1=x+q;
		System.out.println(add+add1);
	}


}
