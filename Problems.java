
import java.util.Arrays;

class Problems {

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 6, 8, 10};
        boolean sorted;
        for (int i = 0; i < arr.length - 1; i++) {
            sorted = arr[i] < arr[i + 1];
            if (!sorted) {
                System.out.println("Array is not sorted");
                break;
            }
        }
        System.out.println("Array is sorted");

        int[] arr1 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr1));

    }

}
