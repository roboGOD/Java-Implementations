class compile_1 {
	public void doStuff(int a,int b) {
		System.out.println("Addition is " + (a+b));
	}
}
class compile_2 extends compile_1 {
		public void doStuff(int a,int b) {
		System.out.println("Subtraction is " + (a-b));
	}
}
class comp_main {
	public static void main(String[] args) {
		compile_2 C1 = new compile_2();
		C1.doStuff(10,20);
	}
}
	