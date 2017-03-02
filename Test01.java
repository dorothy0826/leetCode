package leetCode;

class Test01{
	
	public String solution(String str){
		StringBuffer sb = new StringBuffer();
		int len = str.length();
		for(int i=0; i<len; i++){
			int count = 1;
			char temp = str.charAt(i);
			while(i<len-1 && temp == str.charAt(i+1)){
				count++;
				i++;
			}
			sb.append(count);
			sb.append(str.charAt(i));
		}
		String res = sb.toString();
		return res;
	}
	
	public static void main(String[] args) {  
		String str = "ABCDE";
		Test01 t1 = new Test01();
		String s = t1.solution(str);
		System.out.println(s);
    }  
}
