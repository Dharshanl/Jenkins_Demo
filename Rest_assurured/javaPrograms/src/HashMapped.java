import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapped {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("D", 5);
        map.put("C", 15);

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> System.out.println(e.getKey() + ":" +e.getValue() ));

    }
}


class Second extends HashMapped{
    public static void main(String[] args) {
        String word = "dharshan lokesh";
        Map<Character, Integer> map = new LinkedHashMap<>();
        Collections.reverseOrder();

        for(char c : word.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
        }
     
        for(Entry<Character, Integer> letter : map.entrySet()){
            if(letter.getValue() == 1){
                System.out.println(String.format("This is the first found character: %c", letter.getKey()));
               break;
            }
        }
    }


}