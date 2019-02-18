class constructor {
	int a,b;
	constructor() {
		a=10;
		b=20;
		System.out.println("Constructor 1 ");
		System.out.println(" a = " + a + "\n b = " + b );		
	}	
	constructor(int a) {
		this();
		this.a = a;
		b = a ;
		System.out.println("Constructor 2 ");
		System.out.println(" a = " + a + "\n b = " + b );		
	}
	constructor(int a,int b) {
		this(a);
		this.a = a;
		this.b = b;
		System.out.println("Constructor 3 ");
		System.out.println(" a = " + a + "\n b = " + b );
	}	
	public static void main ( String[] args) {
		constructor C1 = new constructor(5,6);
	}
}
	