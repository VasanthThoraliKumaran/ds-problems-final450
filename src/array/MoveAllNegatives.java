package array;

import java.util.Arrays;

public class MoveAllNegatives {

    //O(n) : O(1)
    void moveAllNegatives(int[] arr){
        int len = arr.length;
        for(int i=1, j = 0;i<len;i++){
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    //2 0 -1 2 -3
    //-1 -3 2 2 0
}
