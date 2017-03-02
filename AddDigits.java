package leetCode;

public class AddDigits {
	
	public int adddigits(int num){
		if (num == 0) {
			return num;
		}else if (num%9 == 0) {
			return 9;
		}else {
			return num%9;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
