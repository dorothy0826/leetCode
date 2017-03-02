package leetCode;

import java.util.Arrays;

class canConstruct{
	public boolean canConstruct(String ransomNote, String magazine){
		int[] r_count = new int[26];
		int[] m_count = new int[26];
		char offset = 'a';
		Arrays.fill(r_count, 0);
		Arrays.fill(m_count, 0);
		
		for(int i=0; i<ransomNote.length(); i++){
			r_count[(int)ransomNote.charAt(i) - offset]++;
		}
		for(int j=0; j<magazine.length(); j++){
			m_count[(int)magazine.charAt(j) - offset]++;
		}
		for(int k=0; k<26; k++){
			if (m_count[k]<r_count[k]) {
				return false;
			}
		}
		return true;
	}
}

public class RansomNote {
	public static void main(String[] args) {
		canConstruct t = new canConstruct();
		String ransomNote = "aa";
		String magazine = "aba";
		if (t.canConstruct(ransomNote, magazine)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
