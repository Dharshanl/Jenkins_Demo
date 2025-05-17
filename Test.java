
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1, 2, 4, 5, 5, 6, 3, 12, 34, 5, 12};
        Map<Integer, Integer> counter = new HashMap<>();
        for (int n : a) {
            if (counter.containsKey(n)) {
                counter.put(n, counter.getOrDefault(n, 0) + 1);
            }
        }
        for (Entry<Integer, Integer> entry : counter.entrySet()) {
            System.out.println(String.format("The key %d is repeated: %d times", entry.getKey(), entry.getValue()));
        }
    }
}

class Test2 {

    public static void main(String[] args) {
        String data = "{{}}{{}}(((())))";
        System.out.println("The number of patterns match: "+ isBalanced(data));
    }

    public static Boolean isBalanced(String data) {

        Stack<Character> stack = new Stack<>();

        for (char a : data.toCharArray()) {
            if (a == '{' || a == '(') {
                stack.push(a);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}


class Test123{

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,3,4,3,2,3,5,6,7,7,5));
       // System.out.println(removeDuplicates(numbers));

        //removeDuplicatesV2(numbers);

        removeDuplicatesV3(numbers);
        
    }


    public static List<Integer> removeDuplicates(List<Integer> numbers){
        Set<Integer> setx = new HashSet<>(numbers);        
        numbers.clear();
        numbers.addAll(setx);
        return numbers;
    }

    public static void removeDuplicatesV2(List<Integer> numbers){
        List<Integer> dataset = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();
        for(int n: numbers ){
            count.put(n, count.getOrDefault(n, 0)+1);
        }

        for(Entry<Integer, Integer> data: count.entrySet()){
            dataset.add(data.getKey());
        }

        System.out.println(dataset);
    }

    public static void removeDuplicatesV3(List<Integer> numbers){
        int pointer = 0;
        int temp;
        for(int i = 1; i < numbers.size(); i++ ){
            if (!numbers.get(i).equals(numbers.get(pointer))) {
                temp = numbers.get(i);
                numbers.add(i, numbers.get(pointer));
                numbers.add(pointer, temp);
                pointer = i;
                pointer++;
            }
        }
        System.out.println(pointer);
        for(int j = 0; j < pointer; j++){
            System.out.println(numbers.get(pointer));
        }
    }
}

