import java.util.stream.*;
import java.util.Arrays;

// Parallel streams need a combiner along with accumulator in reduction operation
// The combiner combines all the results (or accumulations) from all streams
public class ParallelStreams2 {

  public static void main(String args[]) {
    Double[] arr = {1d,4d,9d,16d,25d};
    Stream<Double> s = Arrays.stream(arr).parallel();
    s.reduce(1.0, (a, b) -> {
      System.out.println(Thread.currentThread().getName() + "\t" + "Accumulator " + a + " " + b);
      return a * Math.sqrt(b);
    }, (a, b) -> {
      System.out.println(Thread.currentThread().getName() + "\t" + "Combiner " + a + " " + b);
      return a * b;
    });
  }
}
