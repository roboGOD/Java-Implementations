class while_1 {
	public static void main(String[] args) {
		int i=1;
		while(i<5)  {
			for(int j=0;j<i;j++)
				System.out.print(" Wifi " + j);
			System.out.println(" Woohoo! " + i);
			i++;
		}
	}
}