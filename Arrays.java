import java.util.Scanner;

class Arrays {
	public static void main(String[] args) {
		int flag=0,k;
		boolean z=true;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Number of Elements in Array :");
		int n = reader.nextInt();
		int arr[] = new int[n];
		System.out.println();
		for (int i=0;i<n;i++) {
			System.out.print("Enter Element " + (i+1) + " : " );
			arr[i] = reader.nextInt();
			System.out.println();
		}
		while(z==true) {
		System.out.println("\n\nEnter The Option \n\n 1.Sorting\n 2.Searching\n 3.Sum of All\n 4.Reverse\n 5.Copy Into Another Array(Appending)\n99.Exit \n\n(Don't Press 99 You Will Be Cursed)\n\n");
		k = reader.nextInt();
		switch(k) {
			case 1 :
			for(int i=0;i<n;i++) {
				flag = 0;
				for(int j=0;j<n-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						flag = 1;
					}
				}
				if(flag == 0) {
					break;
				}
			}
			System.out.println("Sorted Array is : ");
			for(int i = 0 ; i<n;i++)
				System.out.print(" " + arr[i]);
			break ;
			case 2 :
			int x;
			System.out.println("Enter The Element You Want To Search  : ");
			x = reader.nextInt();
			for(int i=0;i<n;i++) {
				if(arr[i]==x) {
					System.out.println("Element " + x + " is At Location " + (i+1));
					flag = 1;
				}
			}
			if(flag == 0) 
				System.out.println("Element Does Not Exist ");
			break;
			case 3 :
			int s=0;
			for(int i=0; i<n ; i++) {
				s = s+arr[i];
			}
			System.out.println("Sum of All is " + s);
			break;
			case 4:
			System.out.println("Reverse of Array is ");
			for(int i=n-1;i>=0;i--) {
				System.out.print("  " + arr[i]);
			}
			break;
			case 5 :
			System.out.println("Please Wait ...... ");
			reader.next();
			reader.next();
			break;
			case 99 :
			System.out.println("Get The Hell Out!!!!!!");
			z=false;
			break;
			default :
			System.out.println("Are You Blind ????? ");
		}
		}
	}
}
