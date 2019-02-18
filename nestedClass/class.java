class A {
	private class B {
		public void show() {
			System.out.println("roboGOD");
		}
	}
	public void show2() {
		B B1 = new B();
		B1.show();
	}
}
class main {
	public static void main(String[] args) {
		A A1 = new A();
		A1.show2();
	}
}