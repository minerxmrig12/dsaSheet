package pkg.recursion;

public class Q2_countSteps {
	public static void main(String[] args) {
		System.out.println(countSteps(8, 0));
	}
	
	public static int countSteps(int n, int count) {
		if(n==0) {
			return count;
		}
		int ans;
		if(n%2 ==0) {
			ans = countSteps(n/2, count+1);
		}else {
			ans = countSteps(n-1, count+1);
		}
		return ans;
		
	}

}
