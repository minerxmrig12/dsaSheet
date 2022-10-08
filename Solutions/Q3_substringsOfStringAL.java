package pkg.recursion;
import java.util.*;

public class Q3_substringsOfStringAL {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list = getAllSubstring("abc");
		System.out.println(list);
	}//main end

	private static ArrayList<String> getAllSubstring(String str) {
		
		if(str.length() == 0) {
			ArrayList<String> base = new ArrayList<>();
			base.add(" ");
			return base;
		}
		
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myres = new ArrayList<>();
		ArrayList<String> recres = getAllSubstring(ros);
		for(int i=0; i<recres.size(); i++) {
			myres.add(recres.get(i));
			myres.add(cc + recres.get(i));
			
		}
		return myres;
	}
	
	

}
