package leetCode;

class MinMoves_solution{
	public int MinMoves_solutin(int[] nums){
		int min = nums[0];
		int sum = 0;
		for(int i=1; i<nums.length; i++){
			if (nums[i]<min) {
				min = nums[i];
			}
		}
		for(int i=0; i<nums.length; i++){
			sum += nums[i] - min;
		}
		return sum;
	}
}

public class minMoves {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4};
		MinMoves_solution ms = new MinMoves_solution();
		int res = ms.MinMoves_solutin(nums);
		System.out.println(res);

	}

}
