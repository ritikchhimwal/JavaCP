package cp;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,5,3,7,2,4};
        int target = 9;
        List<int[]> resultList = new ArrayList<>(); // Create a list to store pairs of indices

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    resultList.add(new int[]{i, j}); // Store the pair of indices
                }
            }
        }

        // Print the pairs of indices
        System.out.println("Indices of numbers that add up to the target:");
        for (int k = 0; k < resultList.size(); k++) {
            int[] pair = resultList.get(k);
            System.out.println(pair[0] + ", " + pair[1]);
        }
    }
}

