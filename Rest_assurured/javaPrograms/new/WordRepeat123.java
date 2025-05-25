
import java.util.HashMap;
import java.util.Map;

public class WordRepeat123 {
    

    public static void main(String[] args) {
        String data = "Hello world! Hello world! Hello world! Hello world!";

        Map<Character, Integer> map = new HashMap<>();

        for(char c: data.toCharArray() ){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            System.out.println(String.format("The repeatations of %c: %d times", entry.getKey(), entry.getValue()));
        }
    }


    
}
