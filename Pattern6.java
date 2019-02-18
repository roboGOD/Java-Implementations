class Pattern6 {
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int k=1;k<5-i;k++)
				System.out.print("  ");
			for(int j=0;j<=i;j++)
				System.out.print("#   ");
			System.out.println();
		}
		for(int i=0;i<5;i++) {
			for(int k=i;k>0;k--) 
				System.out.print("  ");
			for(int j=i;j<5;j++)
				System.out.print("#   ");
			System.out.println();
		}
	}
}
