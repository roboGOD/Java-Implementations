import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.*;

class Util {

  public static void sleep() {
    Util.sleep(1);
  }

  public static void sleep(long seconds) {
    try {
      TimeUnit.SECONDS.sleep(seconds);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void printThread(int i) {
    System.out.println(Thread.currentThread().getName() + "\t" + i);
  }

  public static void shutdownExecutor(ExecutorService executorService) {
    // Shutdown Executor and wait for task to finish
    executorService.shutdown();
    try {
      // Check if task is terminated within the 1000 milliseconds 
      if (!executorService.awaitTermination(1000, TimeUnit.MILLISECONDS)) {
        // Terminate all the tasks and shutdown immediately
        executorService.shutdownNow();
      } 
    } catch (InterruptedException e) {
      executorService.shutdownNow();
    }
  }
}

public class MyExecutor {

  public static void main(String args[]) {

    // -----------------------------------------------------------------------
    // Using the Executor
    Runnable runLoop = () -> {
      for(int i=0; i<5; i++) {
        Util.printThread(i);
        Util.sleep();
      }
    };

    // Executor executor = Executors.newCachedThreadPool();
    // executor.execute(runLoop);
    // executor.execute(runLoop);

    // -----------------------------------------------------------------------
    // Using the ExecutorService
    Callable<String> getValue = () -> {
      System.out.println("Task process started");
      Long startTime = System.currentTimeMillis();
      Util.sleep(3);
      Long endTime = System.currentTimeMillis();
      return "Execution Done in " +  (endTime - startTime) + " milliseconds";
    };

    ExecutorService executorService = Executors.newCachedThreadPool();
    Future<String> result =  executorService.submit(getValue);
    
    System.out.println("Doing other stuff!");
    Long startTime = System.currentTimeMillis();
    System.out.println("Going to sleep!");
    Util.sleep(4);
    Long endTime = System.currentTimeMillis();
    System.out.println("Woke up in " + (endTime - startTime) + " milliseconds");

    try {
      System.out.println("Result is " + result.get());
    } catch(InterruptedException e) {
      e.printStackTrace();
    } catch(ExecutionException e) {
      e.printStackTrace();
    }

    Util.shutdownExecutor(executorService);
  }
}