class Pattern3 {
	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=10;i++) {
			for(int j=0;j<i;j++) {
				if(k%10==k)
					System.out.print(k + "  ");
				else
					System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}
}