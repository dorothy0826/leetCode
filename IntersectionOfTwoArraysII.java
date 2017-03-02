package leetCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class IntersectionSolution{
	public int[] intersect(int[] nums1, int[] nums2){
		List<Integer> list_long = new ArrayList<>();
		List<Integer> list_short = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		if (nums1.length > nums2.length) {
			Collections.addAll(list_long, nums1);
		}else{
			
		}
			
			
		int[] res = new int[list.size()];
		for(int i=0; i<res.length; i++){
			res[i] = list.get(i).intValue();
		}	
			
			
			return res;
		}
	}
}

public class IntersectionOfTwoArraysII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
