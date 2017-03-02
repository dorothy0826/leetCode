package leetCode;

/* 
@param num, your guess
@return -1 if my number is lower, 1 if my number is higher, otherwise return 0
   int guess(int num); 
   
my number 是指给定的待猜的number
*/

class guessNumberSolution{
	public int guessNumber(int n){
		int low = 1;
        int high = n;
        while(low<high){
            int mid = (low+high)/2;
            if(guess(mid) == 0){
                return mid;
            }else if(guess(mid) == 1){
                low=mid+1;
            }else {
                high = mid;
            }
        }
        return low;
	}
	
	public int guess(int n){
		int given = 6;
		if (n>6) {
			return -1;
		}else if (n<6) {
			return 1;
		}else {
			return 0;
		}
	}
}

public class GuessNumber {

	public static void main(String[] args) {


	}

}
