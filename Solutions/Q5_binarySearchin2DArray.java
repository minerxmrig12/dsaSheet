package pkg.search.binary;
//apply row and col reduction method to search for an element in the array.
import java.util.*;

public class Q5_binarySearchin2DArray {
	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 49 }, { 33, 34, 38, 50 } };
		int target = 300;
		System.out.println(Arrays.toString(search2DArray(arr, target)));
	}// main end

	static int[] search2DArray(int[][] arr, int target) {
		int r = 0;
		int c = arr.length - 1;

		while (r < arr.length && c >= 0) {
			if(arr[r][c] == target) {
				return new int[] {r, c};
			}else if(target < arr[r][c]) {
				c--;
			}else {
				r++;
			}
		}

		return new int[] { -1, -1 };
	}

}
