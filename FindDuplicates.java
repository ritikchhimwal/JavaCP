package cp;

import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        int [] arr = {1,2,4,2,5};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
