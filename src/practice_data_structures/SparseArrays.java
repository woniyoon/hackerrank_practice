package practice_data_structures;

public class SparseArrays {
	
	 static int[] matchingStrings(String[] strings, String[] queries) {
	        int[] counters = new int[queries.length];
	        
	        for(int i=0; i<queries.length; i++){
	            int counter = 0;
	            for(int j=0; j<strings.length; j++){
	            	
	                if (strings[j].equals(queries[i])) {
	                    counter ++;
	                }
	                
	                if(j == strings.length -1) {
	                    counters[i] = counter;
	                }
	            }
	        }

	        return counters;
	    }
}
