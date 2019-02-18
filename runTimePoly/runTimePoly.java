class run_1 {
	int a = 4000;
	public void doStuff(int a,int b) {
		System.out.println("a = " + this.a);
		System.out.println("Addition is " + (a+b));
	}
}
class run_2 extends run_1 {
		int a = 5000;
		public void doStuff(int a,int b) {
		System.out.println("a = " + this.a);
		System.out.println("Subtraction is " + (a-b));
	}
}
class run_main {
	public static void main(String[] args) {
		run_1 R1;
		R1 = new run_1();
		R1.doStuff(5,20);
		R1 = new run_2();
		R1.doStuff(40,25);
	}
}
	