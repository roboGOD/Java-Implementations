import java.util.Scanner;

public class Greatest {
    public static void Main() {
          Scanner reader = new Scanner(System.in);
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
          reader.close();
    }
	public static void main(String[] args) {
		Main();
	}
}
