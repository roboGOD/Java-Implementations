class encap_main {
	public static void main(String[] args) {
		encapGetSet E1 = new encapGetSet();
		E1.setA(48);
		E1.setS("roboGOD");
		double d = 22/7;
		E1.setD(d);
		System.out.println("Here Are The Variables : \nInteger : " + E1.getA() + "\nString : " + E1.getS() + "\nDouble : " + E1.getD());
	}
}