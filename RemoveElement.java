package cp;

public class RemoveElement {
    public static void main(String[] args) {
        // Original array
        int[] arr = {3, 5, 7, 9, 11,7};
        int target = 7; // Element to be removed

        // Display original array
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Count occurrences of the target element
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        // Create a new array with size adjusted for removed elements
        int[] result = new int[arr.length - count];
        int index = 0;

        // Copy non-target elements to the new array
        for (int num : arr) {
            if (num != target) {
                result[index++] = num;
            }
        }

        // Display array after removing the target element
        System.out.println("Array after removing " + target + ":");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

