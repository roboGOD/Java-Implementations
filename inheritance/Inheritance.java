import java.util.Scanner;

class inh_main {
	public static void main(String []args) {
		int a,b;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Values of A and B : ");
		a = reader.nextInt();
		b = reader.nextInt();
		inh_2 I1 = new inh_2(a,b);
		System.out.println("Enter the Values of E and F : ");
		int e = reader.nextInt();
		int f = reader.nextInt();
		I1.add(e,f);
	}
}
class inh_1 {
	int a,b;
	inh_1() {
		a=7;
		b=37;
	}
	inh_1(int a,int b) {
		this.a = a;
		this.b = b;
	}
}
class inh_2 extends inh_1 {
	int c,g,h;
	public void scan() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter Values of A and B : ");
		g = reader.nextInt();
		h = reader.nextInt();
	}
	inh_2(int a,int b) {
		super(a,b);
	}
	public void add(int e,int f) {
		c=a+b+e+f;
		System.out.println("Sum of All is " + c);
	}
}
	