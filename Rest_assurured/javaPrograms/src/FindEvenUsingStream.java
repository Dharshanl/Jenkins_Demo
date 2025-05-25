
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenUsingStream {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(22,3,2,33,34,43,65,56,87,89,76,90));

        List<String> data = new LinkedList<>(List.of("abcd", "matches", "suport"));

       List<Integer> output = nums.stream().filter(x -> x %2 == 0).collect(Collectors.toList());

       data.stream().map(String::toUpperCase).forEach(System.out::println);

       System.out.println(output);
    }


}
