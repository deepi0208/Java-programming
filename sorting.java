//ascending order using sorting
import java.util.*;
public class sorting {
    public static void main(String[] args) {
        int [] arr = {8,3,4,5,2,0};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}