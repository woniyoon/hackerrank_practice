package practice_data_structures;

import java.util.*;

public class LeftRotation {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        
        int numOfRotate = d%n;	// to get the final index for each int to put
        
        for (int i=0; i<n; i++) {
        	System.out.print(a[numOfRotate] + " ");
        	
        	if(numOfRotate == (n-1)) {
        		numOfRotate=0;
        	}else {
        		numOfRotate++;
        	}
        }
        
        scanner.close();
    }
}
