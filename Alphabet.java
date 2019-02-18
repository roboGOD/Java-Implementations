import java.util.Scanner;

class Alphabet {
	public static void main(String[] args) {
		char name2[] = new char[5];
		Scanner reader = new Scanner(System.in);
		System.out.println("Please Enter Any String : ");
		String name1 = reader.nextLine();
		name1.getChars(0,5,name2,0);
		for(char element : name2) {
		switch(element) {
			case 'A' :
				for(int i=0;i<7;i++) {
					for(int k=1;k<5-i;k++)
						System.out.print(" ");
					for(int j=0;j<i;j++) {
						if((j==0||j==i-1||((j==1||j==2||j==3)&&i==4))&&i<5)
							System.out.print("# ");
						else if((j==0||j==3)&&i>=5)
							System.out.print("# ");					
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'B' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if(j==0||((i==0||i==3||i==6)&&j<3&&j!=0)||(j==3&&(i!=0&&i!=3&&i!=6)))
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();				
				break;
			case 'C' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if((j==0&&(i==3||i==2||i==4))||(j==1&&(i==1||i==5))||(j==2&&(i==0||i==6))||((j==3||j==4)&&(i==0||i==6)))
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();				
				break;
			case 'D' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if(j==0||((j==1||j==2)&&(i==0||i==6))||(j==3&&(i==1||i==5))||(j==4&&(i==2||i==3||i==4)))
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();				
				break;
			case 'E' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if(j==0||((j==1||j==2)&&(i==0||i==3||i==6))||((j==3)&&(i==0||i==6)))
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'F' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if(j==0||((j==1||j==2)&&(i==0||i==3))||((j==3)&&(i==0)))
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'G' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if((j==0&&(i==2||i==3||i==4))||(j==1&&(i==1||i==5))||((j==2||j==3)&&(i==0||i==3||i==6))||(j==4&&(i!=1&&i!=2)))
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'H' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if(j==0||j==4||i==3)
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;				
			case 'I' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if(j==2||i==0||i==6)
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'J' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if((j==0&&(i==4||i==5))||(i==0)||j==3||((j==1||j==2)&&i==6))
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'K' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if(j==0||(j==1&&i==3)||(j==2&&(i==2||i==4))||(j==3&&(i==1||i==5))||(j==4&&(i==0||i==6)))
							System.out.print("#");
						else 
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'L' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if(j==0||i==6)
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'M' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<9;j++) {
						if(j==0||j==8||(i==1&&(j==1||j==7))||(i==2&&(j==2||j==6))||(i==3&&(j==3||j==5))||(i==4&&j==4))
							System.out.print("#");
						else
							System.out.print(" ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'N' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<7;j++) {
						if(j==0||j==6||(i==1&&j==1)||(i==2&&(j==2))||(i==3&&(j==3))||(i==4&&j==4)||(i==5&&j==5))
							System.out.print("#");
						else
							System.out.print(" ");
					}
					System.out.println();
				}
				System.out.println();
				break;				
			case 'O' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if(((j==0||j==4)&&(i!=0&&i!=6))||((j==1||j==2||j==3)&&(i==0||i==6)))
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'P' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if(j==0||((j==1||j==2||j==3)&&(i==0||i==3))||(j==4&&(i==1||i==2)))
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'Q' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<6;j++) {
						if(((j==0||j==4)&&(i!=0&&i!=6&&i!=7&&i!=8))||((j==1||j==2||j==3)&&(i==0||i==6))||(j==3&&i==5)||(j==2&&i==4)||(j==4&&i==6)||(j==5&&i==6))
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;				
			case 'R' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if(j==0||((j==1||j==2||j==3)&&(i==0||i==3))||(j==4&&(i==1||i==2))||(j==2&&i==4)||(j==3&&i==5)||(j==4&&i==6))
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;				
			case 'S' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if((j==0&&(i==1||i==2||i==5))||((j==1||j==2||j==3)&&(i==0||i==3||i==6))||(j==4&&(i==1||i==4||i==5)))
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'T' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if(i==0||j==2)
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;
			case 'U' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<5;j++) {
						if(((j==0||j==4)&&i!=6)||(i==6&&(j!=0&&j!=4)))
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.println();
				}
				System.out.println();
				break;				
			case 'V' :
				for(int i=0;i<7;i++) {
					for(int j=0;j<13;j++) {
						if(((j==0||j==12)&&(i==0))||((j==1||j==11)&&(i==1))||((j==3||j==9)&&(i==3))||((j==2||j==10)&&(i==2))||((j==4||j==8)&&(i==4))||((j==5||j==7)&&(i==5))||((j==6)&&(i==6)))
							System.out.print("#");
						else
								System.out.print(" ");
					}
					System.out.println();
				}
				System.out.println();
				break;				
			default :
				System.out.println("Invalid Entry : Please Enter Capital Letter Alphabets Only ");
		}
	}
	}
}