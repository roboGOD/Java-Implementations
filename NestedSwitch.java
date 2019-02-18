import java.util.Scanner;

class NestedSwitch {
	public static void main(String []args) {
		String vOnv;
		System.out.println("\n\n\tWelcome To Our Restraunt ");
		System.out.println("Enter Veg or NonVeg");
		Scanner reader = new Scanner(System.in);
	    vOnv = reader.nextLine();
		switch(vOnv) {
			case  "Veg" : {
				System.out.println("Choose Any of The Following Veg Dishes\nA\nB\nC\nD");
				String Veg = reader.nextLine();
				switch(Veg) {
					case  "A": {
						System.out.println("You Ordered A");
						break;
					}
					case  "B":{
						System.out.println("You Ordered B");
						break;
					}
					case  "C":{
						System.out.println("You Ordered C");
						break;
					}
					case  "D":{
						System.out.println("You Ordered D");
						break;
					}
					default :{
						System.out.println("Invalid Selection ");
						break;
					}
				}
				break;
			}
			case  "NonVeg" :{
				System.out.println("Choose Any of The Following NonVeg Dishes\nE\nF\nG\nH");
				String nVeg = reader.nextLine();
				switch(nVeg) {
					case  "E":{
						System.out.println("You Ordered E");
						break;
					}
					case  "F":{
						System.out.println("You Ordered F");
						break;
					}
					case  "G":{
						System.out.println("You Ordered G");
						break;
					}
					case  "H":{
						System.out.println("You Ordered H");
						break;
					}
					default :{
						System.out.println("Invalid Selection ");
						break;
					}
				}
				break;
			}
			default : {
				System.out.println("You Entered : " + vOnv + " Which is Invalid Option ");
			}
		}
	}
	}	