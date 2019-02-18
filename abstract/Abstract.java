import java.util.Scanner;

abstract class abs_1 {
	abstract public void sub(int a, int b);
	public void add(int a,int b) {
		System.out.println(" Addition is " + (a+b));
	}
}
class abs_2 extends abs_1 {
	public void sub(int a,int b) {
		System.out.println(" Subtraction is " + (a-b));
	}
}
class abs_main {
	public static void main(String[] args) {
		abs_2 a1 =new abs_2();
		a1.add(12,13);
		a1.sub(48,37);
	}
}