import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class MyStream {

  static void mapAndLoop() {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5);

    List<Integer> result = numbers.stream().map(x -> x*2).collect(Collectors.toList());
    result.stream().forEach(x -> System.out.println(x));
  }

  static void parallelStreamTest() {
    List<Integer> numbers = new ArrayList<>();
    for(int i=1; i<=30; i++) {
      numbers.add(i);
    }

    numbers.stream().parallel().forEach(x -> System.out.println(Thread.currentThread().getName() + "\t" + x));
    System.out.println();
  }

  static void mapAndLoopFunctional() {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5);

    System.out.println("Printing from functional interface");
    Consumer<Integer> print = x -> System.out.println(x);
    Function<Integer, Integer> makeTriple = x -> x*3;

    List<Integer> result = numbers.stream().map(makeTriple).collect(Collectors.toList());
    result.stream().forEach(print);
  }

  public static void main(String args[]) {
    parallelStreamTest();
  }
}