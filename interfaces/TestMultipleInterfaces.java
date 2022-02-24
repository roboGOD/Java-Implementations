interface Interface1 {
  default public void print() {
    System.out.println("Interface 1");
  }
}

interface Interface2 {
  default public void print() {
    System.out.println("Interface 2");
  }
}

public class TestMultipleInterfaces implements Interface1, Interface2 {

  @Override
  public void print() {
    System.out.println("TestMultipleInterfaces");
  }

  public static void main(String args[]) {
    TestMultipleInterfaces test = new TestMultipleInterfaces();

    test.print();
  }
}
