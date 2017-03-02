package leetCode;

class titleNumber{
	public int titleNumber(String s){
		char[] arr = s.toCharArray();
		int len = arr.length;
		int sum = 0;
		for(int i=0; i<len; i++){
			int n = len-1-i;
			int temp = arr[i]-64; 
			while(n>0){
				temp = temp*26;
				n--;
			}
			sum = sum + temp;
		}
		return sum;
	}
}

public class ExcelSheetColumnNumber {
	public static void main(String[] args) {
		String s = "ABC";
		titleNumber tn = new titleNumber();
		int res = tn.titleNumber(s);
		System.out.println(res);
	}
}
