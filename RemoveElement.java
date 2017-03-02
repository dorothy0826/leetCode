package leetCode;

class removeElementSolution{
	public int removeElement(int[] nums, int val){
		int length = nums.length;
		int sum =0;
		for(int i=0; i<length; i++){
			if (nums[i] != val) {
				sum++;
			}
		}
		return length-sum;
	}
}

public class RemoveElement {
	
	public static void main(String[] args) {
		removeElementSolution res = new removeElementSolution();
		int[] nums = {3,2,2,3};
		int val = 3;
		int result = res.removeElement(nums, val);
		System.out.println(result);
		
	}

}
