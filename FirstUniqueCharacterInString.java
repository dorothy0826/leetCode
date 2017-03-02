package leetCode;

class FirstUnique{
	public int firstUniqChar(String s){
		
		//faster solution 
		int freq[] = new int[26];
		for(int i=0; i<s.length(); i++){
			freq[s.charAt(i) - 'a']++;
		}
		for(int i=0; i<s.length(); i++){
			if (freq[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		return -1;
		
		
		//slow solution
		/*char[] arr = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++){
			char temp = arr[i];
			if (map.containsKey(temp)) {
				map.put(temp, 1);
			}else {
				map.put(temp, 0);
			}
		}
		for(int i=0; i<arr.length; i++){
			if (map.get(arr[i]) == 0) {
				return i;
			}
		}
		return -1;*/
	}
}

public class FirstUniqueCharacterInString {

	public static void main(String[] args) {
		String s = "yyy";
		FirstUnique fu = new FirstUnique();
		int res = fu.firstUniqChar(s);
		System.out.println(res);
	}

}
