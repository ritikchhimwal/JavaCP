package cp;
import java.util.*;

public class ItemInCommon {
    public static void main(String[] args) {
        int [] arr1={1,3,6,4,8};
        int [] arr2={2,5,0,3,9};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.println("common");
                }
            }
        }
        System.out.println("not common");
    }
}
