package practice_data_structures;

public class ArrayManipulation {
	
    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n];
        long max = 0;
      
        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                arr[j-1] += queries[i][2];
            }
        }

        for (long item : arr) {
        	
            if (item > max) {
                max = item;
            }
        }

        return max;
    }
}
