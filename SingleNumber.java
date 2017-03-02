package leetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingleNumber {
	
	public int singleNumber(int[] array){
		HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (nums.containsKey(array[i])) {
				nums.put(array[i], 2);
			}else{
				nums.put(array[i], 1);
			}
		}
		Iterator iter = nums.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer, Integer> element = (Map.Entry<Integer, Integer>) iter.next();
			int val = element.getValue();
			if (val == 1) {
				return (int)element.getKey();
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		SingleNumber sn = new SingleNumber();
		int[] array = {2,2,1,3,1};
		int n = sn.singleNumber(array);
		System.out.println(n);
	}

}
