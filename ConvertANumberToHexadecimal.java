package leetCode;

class HexadecimalSolution{
	public String toHex(int num){
		char[] arr = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		String res = "";
		if (num == 0) {
			return "0";
		}else {
			while(num != 0){
				res = arr[num & 15] + res;
				num = num >>> 4;
			}
			return res;
		}
	}
}

public class ConvertANumberToHexadecimal {
	public static void main(String[] args) {
		int num = -1;
		HexadecimalSolution hs = new HexadecimalSolution();
		String res = hs.toHex(num);
		System.out.println(res);
	}
	
	
}
