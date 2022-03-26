import java.util.concurrent.CompletableFuture;

public class MyCompletableFuture {
  
  public static void main(String[] args) {
    // Simple async supplier
    CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> "Hello");
    f1.thenAccept(System.out::println);
    f1.thenRun(() -> System.out.println("F1 is done!"));

    CompletableFuture<String> f2 = f1.thenApply(s -> s + " F2!");
    f2.thenAccept(System.out::println);

    // Chain futures
    CompletableFuture<String> f3 = CompletableFuture.supplyAsync(() -> "Hello");
    CompletableFuture<String> f4 = f3.thenCompose(s -> CompletableFuture.supplyAsync(() -> (s + " F4!")));
    f4.thenAccept(System.out::println);

    // Run the callback asynchronously after receiving the data instead of calling thread
    CompletableFuture<String> f5 = CompletableFuture.supplyAsync(() -> "Hello")
        .thenApplyAsync(s -> s + " F5!");
    f5.thenAccept(System.out::println);
  }
}
