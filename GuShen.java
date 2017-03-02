package leetCode;

import java.util.Scanner;

public class GuShen {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			int n;
			int profit = 1;
			int i =2;
			int raise = 1;
			n = in.nextInt();
			while(i<=n){
				for(int j=1; j<=raise && i<=n; j++){
					profit++;
					i++;
				}
				if(i<=n){
					profit--;
					raise++;
					i++;
				}
				
			}
			System.out.println(profit);
		}
	}
}
