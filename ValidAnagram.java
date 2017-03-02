package leetCode;

class Anagram{
	public boolean isAnagram(String s, String t){
		int[] temp = new int[26];
		for(char c: s.toCharArray()){
			temp[c - 'a']++;
		}
		for(char c: t.toCharArray()){
			temp[c - 'a']--;
		}
		for(int i: temp){
			if (i != 0){
				return false;
			}
		}
		return true;
	}
}

public class ValidAnagram {
	public static void main(String[] args) {
		String s = "abc";
		String t = "cab";
		Anagram a = new Anagram();
		boolean res = a.isAnagram(s, t);
		System.out.println(res);
	}
}
