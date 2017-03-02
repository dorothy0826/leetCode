package leetCode;

class HammingWeightSolution{
	public int hammingWeight(int n){
		int sum = 0;
		if (n == 0) {
			return 0;
		}else{
			while(n>0){
				int temp = n & -n;
				if (temp == 1) {
					sum = sum + temp;
				}
				n = n >>> 1;
			}
			return sum;
		}
	}
}

public class NumberOfBits {

	public static void main(String[] args) {
		int n = 16;
		HammingWeightSolution hw = new HammingWeightSolution();
		int res = hw.hammingWeight(n);
		System.out.println(res);

	}

}
