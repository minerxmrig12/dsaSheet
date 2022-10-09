package pkg.search.binary;

import java.util.*;

public class Q4_firstAndLastIndexOfElement {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 4, 4, 6, 76 }; // ans should be 3,5
		int target = 76;
		System.out.println(Arrays.toString(firstAndLast(arr, target)));

	}// main end

	static int[] firstAndLast(int[] arr, int target) {
		int[] ans = { -1, -1 };
		ans[0] = search(arr, target, true);
		ans[1] = search(arr, target, false);
		return ans;
	}// firstAndLast end

	static int search(int[] arr, int target, boolean isFirst) {
		int ans = -1;
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				ans = mid;
				// this if will check if we are finding the 1st or last occurrence.
				// for 1st occurrence we will search for the element in the left halve and in
				// right halve for last occurrence.
				if (isFirst) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		} // while end

		return ans;
	}

}
