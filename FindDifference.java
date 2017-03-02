package leetCode;

public class FindDifference {
	public char findTheDifference(String s, String t){
		char[] schar = s.toCharArray();
		char[] tchar = t.toCharArray();
		int s_ascii = 0;
		int t_ascii = 0;
		
		for(int i=0; i<schar.length; i++){
			s_ascii = s_ascii + (int)schar[i];
		}
		for(int j=0; j<tchar.length; j++){
			t_ascii = t_ascii + (int)tchar[j];
		}
		if (t_ascii > s_ascii) {
			return (char)(t_ascii-s_ascii);
		}else {
			return (char)(s_ascii-t_ascii);
		}
	}
	
	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		FindDifference fd = new FindDifference();
		char dif = fd.findTheDifference(s, t);
		System.out.println(dif);
	}
}
