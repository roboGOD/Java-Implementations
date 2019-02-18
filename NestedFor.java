class NestedFor {
	public static void main(String[] args) {
		int lmid=9;
		int umid=9;
		for(int i=0; i<5;i++) {
			for(int j=0;j<10;j++) {
				if(j>=lmid&&j<=umid)
					System.out.print(0 + " ");
				else 
					System.out.print(" ");
			}
			if(lmid!=0)
				lmid-=1;
			if(umid!=10)
				umid+=1;
			System.out.print("\n");
		}	
		System.out.println("\n\nNot Perfect Huh? .... See Pattern1.java ");
	}
}
				