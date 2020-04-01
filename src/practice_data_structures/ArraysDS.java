package practice_data_structures;

import java.util.Scanner;

public class ArraysDS {

	static int[] reverseArray(int[] a) {
        int[] reverseArr = new int[a.length];
        int j = 0;
        
        for(int i=a.length-1; i>=0; i--) {
        	reverseArr[j++] = a[i];
        }
				
		return reverseArr;
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[size];
		
		String[] arrItems = sc.nextLine().split(" ");
		
		for(int i=0; i<size; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
		}
		
		int[] newArr = reverseArray(arr);
		
		for(int item : newArr) {
			System.out.print(item + " ");
		}
		
		sc.close();
	}
	
}




/*
 
 An array is a type of data structure that stores elements of the same type in a contiguous block of memory. 
 In an array, , of size , each memory location has some unique index,  (where ), that can be referenced as  
 (you may also see it written as ).
Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.
Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

Input Format
The first line contains an integer,  (the number of integers in ). 
The second line contains  space-separated integers describing .

Output Format
Print all  integers in  in reverse order as a single line of space-separated integers.
 
 */