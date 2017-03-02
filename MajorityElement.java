package leetCode;

import java.util.Arrays;

class Majority_solution{
	public int majorityElement(int[] nums){
		
		//very clever and short code
		Arrays.sort(nums);
		return nums[nums.length/2];
		
		
		
		//my slow function
		/*int majority = nums.length/2;
		int[] temp = new int[10];
		for(Integer i: nums){
			temp[i]++;
		}
		for(int i=0; i<temp.length; i++){
			if (temp[i] > majority) {
				return i;
			}
		}
		return -1;*/
	}
}

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = {2,2,3,2,2,1};
		Majority_solution ms = new Majority_solution();
		int res = ms.majorityElement(nums);
		System.out.println(res);
	}

}
