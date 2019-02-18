import java.util.Scanner ;

class Nested_If {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter A Choice \n\n1. To Find Even Odd\n2. To Find Greatest of 10\n3. To Find Prime or Not");
		int k = reader.nextInt();
		if(k==1) {
			System.out.println("Enter A Number To Find Even/Odd");
			int m = reader.nextInt();
			if(m%2==0)
				System.out.println(m + " is Even");
			else
				System.out.println(m + " is Odd");
		}
		if(k==2){
			int numbers[] = new int[10];
			System.out.println("Enter 10 Numbers To Find The Greatest : \n");
			for(int i=0;i<10;i++){
				numbers[i] = reader.nextInt();
			} 
			int Greatest = numbers[0];
			for(int i=0;i<10;i++){
             if(numbers[i]>Greatest){
                 Greatest = numbers[i];
             }
          } 
          System.out.println("Greatest of All is " + Greatest);
		}
		if(k==3){
			System.out.println("Enter A Number To Find Prime Or Not");
			int m = reader.nextInt();
			int h=15;
			for(int i=2;i<m/2;i++){
				if(m%i==0)
					h=0;
				else 
					h=1;
			}
				if(h==0)
					System.out.println(m + " is Prime");
				else if (h==1)
					System.out.println(m + " is Not Prime");
			
		}
	}
}