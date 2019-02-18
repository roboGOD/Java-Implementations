import java.util.Scanner;

interface inter_1 {
	String a = "Interface 1";
	public void add(int a,int b);
	public void sub(int a,int b);
}
interface inter_2 {
	String b = "Interface 2";
	public void mul(int a,int b);
	public void div(double a,double b);
}
class imple_1 implements inter_1 , inter_2 {
	public void add(int a,int b) {
		System.out.println("Addition is " + (a+b));
	}
	public void sub(int a,int b) {
		System.out.println("Subtraction is " + (a-b));
	}
	public void mul(int a,int b) {
		System.out.println("Multiplication is " + (a*b));
	}
	public void div(double a,double b) {
		System.out.println("Division is " + (a/b));
	}
	public void printS() {
		System.out.println(" Strings Are : \n " + a + " \n " + b );
	}
}
class inter_main {
	public static void main(String[] args) {
	imple_1 I1 = new imple_1();
	I1.add(12,13);
	I1.sub(48,37);
	I1.mul(48,37);
	I1.div(22,7);
	I1.printS();
	System.out.println(I1.getClass());
	}
}


	