package pkg.search.binary;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

/*
 * Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.

Note that the letters wrap around.

For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.

*/

public class Q3_smallestLetter {
	public static void main(String[] args) {
		char[] arr = { 'b', 'b', 'c', 'd', 'e' };
		char target = 'e';
		System.out.println(smallestLetterGTTarget(arr, target));

	}

	static char smallestLetterGTTarget(char[] arr, char target) {
		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return arr[start % arr.length];

	}// main end

}
