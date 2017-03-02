package leetCode;

class SaySolution{

	public String countAndSay(int n){
		if (n ==1) {
			return "1";
		}else{
			String res = "1";
			for(int j=2; j<=n; j++){
				res = stringRes(res);
			}
			return res;
		}
	}
	
	public String stringRes(String s){
		char[] arr = s.toCharArray();
		int len = arr.length;
		StringBuffer sb = new StringBuffer();
		if (len == 1) {
			return sb.append("1" + "" + arr[0]).toString();
		}else {
			for(int i=0; i<len-1; i++){
				int flag = 1;
				
				while((i<len-1) && (arr[i] == arr[i+1])){
					i++;
					flag++;
					
				}
				sb.append(("" + flag) + ""+arr[i]);
			}
			if (!(arr[len-1] == arr[len-2])) {
				sb.append("1" + "" + arr[len-1]);
			}
			return sb.toString();
		}
		
		
	}
	
}


public class CountAndSay {

	public static void main(String[] args) {
		SaySolution ss = new SaySolution();
		String s = ss.stringRes("111221");
		System.out.println(s);
	}

}
