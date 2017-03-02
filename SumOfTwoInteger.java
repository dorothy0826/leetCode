package leetCode;

public class SumOfTwoInteger {

	public int sumoftwointeger(int a, int b){
		int sum, carry;  //carry:代表进位
		if (b == 0) {
			return a;
		}else {
			sum = a ^ b; //算出不需要进位的和
			carry = (a&b) << 1;  //算出进位
			return sumoftwointeger(sum, carry); //递归，直到没有进位为止
		}
	}
	
	//将上述过程简化成一句
	public int sumoftwointeger2(int a, int b){
		int tempSum = a & b;
		return tempSum == 0 ? a^b : sumoftwointeger2(a^b, tempSum); 
	}
	
	public static void main(String[] args) {
		

	}

}
