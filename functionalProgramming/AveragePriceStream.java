import java.util.List;
import java.util.OptionalDouble;
import java.util.ArrayList;
import java.util.stream.*;

class Item {
  String name;
  double price;
  int quantity;

  Item(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
}

public class AveragePriceStream {
  public static void main(String args[]) {
    List<Item> list = new ArrayList<>();
    list.add(new Item("Item 1", 10.0, 2));
    list.add(new Item("Item 2", 20.0, 2));
    list.add(new Item("Item 3", 30.0, 2));
    list.add(new Item("Item 5", 20.0, 2));

    DoubleStream stream = list.stream().mapToDouble((item) -> item.price);
    OptionalDouble avg =  stream.average();
    if(avg.isPresent()) {
      System.out.println(avg.getAsDouble());
    } else {
      System.err.println("No average!");
    }
  }
}
