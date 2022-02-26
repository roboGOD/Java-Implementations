import java.util.concurrent.TimeUnit;
import java.util.function.*;

class Util {
  public static void sleep() {
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void printThread(int i) {
    System.out.println(Thread.currentThread().getName() + "\t" + i);
  }
}

public class ThreadJoin {

  public static void main(String args[]) {
    Runnable runLoop5 = () -> {
      for(int i=0; i<5; i++) {
        Util.printThread(i);
        Util.sleep();
      }
    };

    Runnable runLoop2 = () -> {
      for(int i=0; i<2; i++) {
        Util.printThread(i);
        Util.sleep();
      }
    };

    // -----------------------------------------------------------------------
    // Using the Thread class
    Thread t1 = new Thread(runLoop2, "T1");
    Thread t2 = new Thread(runLoop5, "T2");
    Thread t3 = new Thread(runLoop5, "T3");

    t1.start();
    t2.start();
    t3.start();

    try {
      t1.join();
    } catch(InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(Thread.currentThread().getName() + "\tfinished!");
  }
}