package leetCode;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

class intersection{
	public int[] intersection(int[] nums1, int[] nums2){
		
		Set<Integer> intersection_set = new HashSet<Integer>();
		Set<Integer> num1_set = new HashSet<Integer>();
		Set<Integer> num2_set = new HashSet<Integer>();
		for(int i=0; i<nums1.length; i++){
			num1_set.add(nums1[i]);
		}
		for(int i=0; i<nums2.length; i++){
			num2_set.add(nums2[i]);
		}
		
		for(Integer e:num2_set){
			if (num1_set.contains(e)) {
				intersection_set.add(e);
			}
		}
		int[] res = new int[intersection_set.size()];
		int k = 0;
		for(Integer i : intersection_set){
			res[k++] = i;
		}
		return res;
	}
}

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,3,4,1};
		int[] nums2 = {2,2,4,4,4};
		intersection i = new intersection();
		int[] result = i.intersection(nums1, nums2);
		if (result == null) {
			System.out.println("null");
		}else{
			for(int k=0; k<result.length; k++){
				System.out.print(result[k] + " ");
		}
		
		}
		
	}
}


