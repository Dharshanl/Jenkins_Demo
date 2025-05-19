
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Custard Apple");

      List<String> str = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
      System.out.println(str);
      
    }
}
