package leetCode;

import java.util.Scanner;

class Test{
	public int solution(int m){
		if ((m-1) == 1) {
			return 1;
		}else if ((m-1) == 2) {
			return 2;
		}else {
			return solution(m-1)+solution(m-2);
		}
	}
}

public class WaysOfStep {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		int ways;
		n=in.nextInt();
		Test01 t = new Test01();
		while(n>0){
			m=in.nextInt();
			ways = t.solution(m);
			System.out.println(ways);
			n--;
		}
		
	}
}
