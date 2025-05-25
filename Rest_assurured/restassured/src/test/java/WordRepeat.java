import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;


public class WordRepeat {
    
    @Test
    public void wordCount(){
        String data = "Sets the format of payload you are sending dharshan lokesh dharshan lokesh dharshan lokesh" ;
        String[] dataset = data.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for(String word: dataset){
            map.put(word, map.getOrDefault(word, 0)+1); 
        }

        for (Map.Entry<String, Integer> en : map.entrySet()) {
            String key = en.getKey();
            int val = en.getValue();
            System.out.println(key + ":" + val);

            
        }
    }
}
