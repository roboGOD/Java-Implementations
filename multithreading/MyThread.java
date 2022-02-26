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

public class MyThread {

  public static void main(String args[]) {

    Runnable runLoop = () -> {
      for(int i=0; i<5; i++) {
        Util.printThread(i);
        Util.sleep();
      }
    };

    // -----------------------------------------------------------------------
    // Using the Thread class
    Thread t1 = new Thread(runLoop, "T1");
    Thread t2 = new Thread(runLoop, "T2");
    Thread t3 = new Thread(runLoop, "T3");

    t1.start();
    t2.start();
    t3.start();
  }
}