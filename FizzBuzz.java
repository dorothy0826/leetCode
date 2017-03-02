package leetCode;
import java.util.*;

public class FizzBuzz {
	public List<String> fizzBuzz(int n){
		List<String> list = new ArrayList<String>();
		int i=1;
		while(i<=n){
			if (i%3 == 0 && i%5 == 0) {
				list.add("FizzBuzz");
				i++;
			}else if (i%3 == 0) {
				list.add("Fizz");
				i++;
			}
			else if (i%5 == 0) {
				list.add("Buzz");
				i++;
			}else {
				
				list.add("" + i);
				i++;
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		int n = 1;
		FizzBuzz fb = new FizzBuzz();
		List<String> list =  fb.fizzBuzz(n);
		System.out.println(list);
	}
}
