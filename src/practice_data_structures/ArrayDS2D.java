package practice_data_structures;

public class ArrayDS2D {

    static int hourglassSum(int[][] arr) {
        int r = arr.length;
        int c = arr[r-1].length;
        int max = -81;
        
        
        if(r<3 && c<3) {
            return -1;
        }

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if ((j+2) < c && (i+2) < r) {
                    int sum = arr[i][j]+ arr[i][j+1] + arr[i][j+2]
                                         + arr[i+1][j+1]    
                              + arr[i+2][j] + arr[i+2][j+1]+ arr[i+2][j+2];    
                    
                    if(sum > max) {
                        max = sum;
                    }
                } else break;
            }
        }
        
        return max;
    }
}
