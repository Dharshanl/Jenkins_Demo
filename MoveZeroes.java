public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int index = 0; // Pointer to place the next non-zero element

        // First pass: move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Second pass: fill the remaining elements with 0
        while (index < arr.length) {
            arr[index++] = 0;
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}