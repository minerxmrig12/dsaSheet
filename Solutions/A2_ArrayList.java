package pkg.array;
import java.util.*;

public class A2_ArrayList {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		//Adding element
		list.add(80);
		list.add(9);
		list.add(100);
		System.out.println("Enter");
		list.add(sc.nextInt());
		
		//Printing list
		System.out.println(list);
		
		//Check if any element exist in list
		System.out.println(list.contains(80));
		
		//Update the value at some index
		list.set(0, 300);
		System.out.println(list);
		
		//removing element at certain index
		list.remove(2);
		System.out.println(list);
		
		//Getting element at certain index
		System.out.println(list.get(0));
		
		
	}
	
}
