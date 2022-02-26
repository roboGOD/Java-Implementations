import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Products {
  private Map<String, Integer> mp = new ConcurrentHashMap<>();

  public void waitForProduct(String key) {
    synchronized(mp) {
      if(!isAvailable(key)) {
        try {
          mp.wait();
        } catch(InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public Integer getCount(String key) {
    return mp.get(key);
  }

  public boolean isAvailable(String key) {
    return mp.containsKey(key);
  }

  public void updateProduct(String key, Integer value) {
    mp.put(key, value);
    
    synchronized(mp) {
      mp.notifyAll();
    }
  }
}

public class InterthreadCommunication {

  public static void main(String[] args) {
    
    Products products = new Products();
    String myProduct = "Gintama";
    Integer myStock = 12;

    Runnable t1 = () -> {
      while(products == null || !products.isAvailable(myProduct)) {
        System.out.println(Thread.currentThread().getName() + "\twaiting for product...");
        products.waitForProduct(myProduct);
      }

      System.out.println(Thread.currentThread().getName() + "\tProduct found! " + myProduct + ": " + products.getCount(myProduct));
    };

    Runnable t2 = () -> {
      try {
        TimeUnit.SECONDS.sleep(3);
        System.out.println(Thread.currentThread().getName() + "\tUpdating stock " + myProduct + ": " + myStock);
        products.updateProduct(myProduct, myStock);

      } catch(InterruptedException e) {
        e.printStackTrace();
      }
    };

    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.execute(t1);
    executorService.execute(t2);

    executorService.shutdown();
  }  
}
