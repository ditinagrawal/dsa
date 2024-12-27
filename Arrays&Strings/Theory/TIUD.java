import java.util.Arrays;

public class TIUD {
    public static void main(String[] args) {
        System.out.println("Traversal, Insertion, Updation & Deletion");

        int[] arr = { 1, 2, 3, 4, 5 };

        // Traversal
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Insertion
        arr = Arrays.copyOf(arr, (arr.length + 1));
        arr[arr.length - 1] = 11;
        System.out.println(Arrays.toString(arr));

        // Updation
        arr[2] = 55;
        System.out.println(Arrays.toString(arr));

        // Deletion
        arr = Arrays.copyOf(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
