import java.util.Scanner;

class functions_1 {
	public void Sum(int x,int y) {
		int z=x+y;
		System.out.println(x + " + " + y + " = " + z);
	}
	public static void Print() {
		System.out.println(" I Am GOD") ;
	}
}
class functions_2 {
	public static void main(String[] args) {
		functions_1 f1 = new functions_1() ;
		f1.Sum(10,20);
		functions_1.Print();
	}
}
	
	