package array;

public class Kadane {

    int kadaneAlgo(int[] arr){
        int local_max = 0;
        int global_max = Integer.MIN_VALUE;

        for (int val : arr) {
            local_max = Math.max(val, val + local_max);
            global_max = Math.max(global_max, local_max);
        }

        return global_max;
    }
}
