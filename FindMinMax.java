package cp;

public class FindMinMax {
    public static void main(String[] args) {
        int [] arr = {1, 4, 2, 8, 6, 3};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}

