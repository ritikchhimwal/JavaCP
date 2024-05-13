package cp;
import java.util.*;

public class LongestString {
    public static void main(String []args){
         String[] arr = {"apple","banana","pomegranate"};
         String longestStr = "";
         for(int i=0;i<arr.length;i++){
             String currentStr = arr[i];
             if(currentStr.length() > longestStr.length()){
                 longestStr = currentStr;
             }
         }
        System.out.println(longestStr);
    }
}
