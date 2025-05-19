
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeDuplicateArray {

    public static void main(String[] args) {
        int[] num = {2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 6, 7, 8, 8, 8,9,9,9,9,9,9,0,0,0,0,0};
        Arrays.sort(num);
        int pointer = 0;
        int temp;
        for (int i = 0; i < num.length; i++) {
            if (num[pointer] != num[i]) {
                temp = num[pointer++];
                num[pointer] = num[i];
                num[i] = temp;
               
            }
        }
        List<Integer> data = new ArrayList<>();
        for(int j = 0; j <= pointer; j++){
            data.add(num[j]);
        }
        System.out.println(data);
    }
}
