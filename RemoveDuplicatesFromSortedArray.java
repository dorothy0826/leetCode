package leetCode;

//还需要注意的一个地方是，数组中元素的位置不能改变。比如对于数组[1,1,1,4,5]，移除重复元素后为[1,4,5]，起始数字为1，而不能是其它数字。
//我们只需对对组遍历一次，并设置一个计数器，每当遍历前后元素不相同，计数器加1，并将计数器对应在数组中位置定位到当前遍历的元素。

class removeSolution{
	public int RemoveDuplicates(int[] nums){
		int count = 1;
		for(int i=0; i<nums.length-1; i++){
			if (nums[i] == nums[i+1]) {
				continue;
			}else {
				nums[count] = nums[i+1];
				count++;
			}
		}
		return count;
	}
}

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int[] nums = {1,1,2,2,2,3};
		removeSolution rs = new removeSolution();
		int res = rs.RemoveDuplicates(nums);
		System.out.println(res);
	}
}
