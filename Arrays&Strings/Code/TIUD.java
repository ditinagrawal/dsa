import java.util.Arrays;

public class TIUD {
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

        // Traverse and print all elements in an array.
        for (int ele : arr) {
            System.out.println(ele);
        }

        // Update a specific element in an array.
        // By Index - 4
        arr[4] = 909;
        System.out.println(Arrays.toString(arr));
        // By Value - 88
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 88) {
                arr[i] = 101;
            }
        }
        System.out.println(Arrays.toString(arr));

        // Insert an element at a specific position in an array.
        arr = Arrays.copyOf(arr, arr.length + 1);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 3) {
                arr[i] = 1001;
            }
            if (i > 3) {
                arr[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(arr));

        // Delete an element from an array.
        // By Index - 5
        for (int i = 5; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr = Arrays.copyOf(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
