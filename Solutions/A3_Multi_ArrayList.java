package pkg.array;

import java.util.*;

public class A3_Multi_ArrayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // ArrayList list is initialized but not the arraylists
																// inside it
		// when this arrayList is created basically all the values are null, so We have to declare it with ArrayLists
		for (int i = 0; i < 3; i++) {// how many ArrayList we want to add in the list
			list.add(new ArrayList<>());
			// we don't specify index while pushing the element to the ArrayList, So we
			// don't need to get the ith index of list

		}

		// inserting element inside the ArrayList of ArrayList

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				list.get(i).add(sc.nextInt()); // getting ith ArrayList in the list and adding the element to that list

			}
		}

	}// main method end

}
