package cp;
import java.util.*;

public class FindZeroTriplets {
    public static void main(String[] args) {
        int [] arr = {1,-1,2,-3,1};
        boolean found = false;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        System.out.println("triplets are :" +arr[i]+" " + arr[j]+ " " + arr[k]);
                        found = true;
                    }
                }
            }
        }
        if(!found){
            System.out.println("Triplets Not Found");
        }
    }
}
