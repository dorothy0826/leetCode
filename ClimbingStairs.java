package leetCode;

class ClimbSolution{
	public int climbStairs(int n){
		if (n<=2) {
			return n;
		}else {
			int ans1 = 1;
			int ans2 = 2;
			int temp = 0;
			for(int i=n; i>2; i--){
				temp = ans1 + ans2;
				ans1 = ans2;
				ans2 = temp;
			}
			return ans2;
		}
		
	}
}

public class ClimbingStairs {

	public static void main(String[] args) {
		int n = 44;
		ClimbSolution cs = new ClimbSolution();
		int res = cs.climbStairs(n);
		System.out.println(res);
	}

}
