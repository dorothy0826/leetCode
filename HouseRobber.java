package leetCode;

class HouseRobberSolution{
	public int rob(int[] nums){
		int n = nums.length;
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return nums[0];
		}else if (n == 2) {
			return Math.max(nums[0], nums[1]);
		}
		else{
			int[] dp = new int[n];
			dp[0] = nums[0];
			dp[1] = Math.max(nums[0], nums[1]);
			int i = 2;
			while(i<n){
				dp[i] = Math.max(dp[i-1], nums[i]+dp[i-2]);
			}
			int max = dp[0];
			for(int j=1; j<n; j++){
				if (dp[j]>max) {
					max = dp[j];
				}
			}
			return max;
		}
		
		
	}
}

public class HouseRobber {

	public static void main(String[] args) {
		
	}

}
