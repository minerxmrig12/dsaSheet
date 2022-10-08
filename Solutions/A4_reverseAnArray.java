package pkg.array;

import java.util.*;

public class A4_reverseAnArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {

			swap(arr, start, end);
			start++;
			end--;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}// main end

	public static void swap(int[] arr, int start, int end) {

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

	}// swap end

}
