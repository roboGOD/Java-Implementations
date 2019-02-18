import java.util.Scanner;

class Pattern2 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=i;j<10;j++)
				System.out.print(" ");
			for(int j=10-i;j<10;j++)
				System.out.print("$");
			System.out.println();
		}
	}
}

		