package pkg.array;

import java.util.Arrays;

public class A1_printArray {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,6};
		for(int i:arr) {//for every element in the array
			System.out.println(i + " ");//i is the element of the array
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
	}//main end

}
