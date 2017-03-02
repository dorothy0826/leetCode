//判断n是否是2的幂次方
package leetCode;

class PowerOfTwoSolution{
	public boolean isPowerOfTwo(int n){
		if (n>0) {
			return n == (n&-n);
		}else {
			return false;
		}
	}
}

public class PowerOfTwo {
	public static void main(String[] args) {
		int n = -2;
		PowerOfTwoSolution p = new PowerOfTwoSolution();
		boolean res = p.isPowerOfTwo(n);
		System.out.println(res);
	}
}
