import java.util.stream.IntStream;

class FibonacciState {
  int i, j;

  FibonacciState() {
    this.i = 0;
    this.j = 1;
  }

  public int getNext() {
    int temp = i;
    i = j;
    j = temp + j;
    return temp;
  }
}

public class InfiniteFibonacciStream {
  public static IntStream get() {
    FibonacciState fstate = new FibonacciState();

    return IntStream.generate(fstate::getNext);
  }

  public static void main(String[] args) {
    InfiniteFibonacciStream.get().limit(7).forEach(System.out::println);
  }
}
