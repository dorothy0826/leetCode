//打印10000以内的回文数字


package interviewQuestion;

public class IsCircleNumber {

	//利用int转换成String进行判断
	public boolean solution_String(int num){
		String str = String.valueOf(num);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String newStr = sb.toString();
		return str.equals(newStr);
	}
	
	
	//通过调换int数据的方式
	public boolean solution_int(int num){
		int oldVal = num;
		int newVal = 0;  //反过来的值，初始化为0
		while(num>0){
			newVal = 10*newVal + num%10;
			num = num/10;
		}
		return (newVal == oldVal);
	}
	
	
	
	public static void main(String[] args) {
		IsCircleNumber t = new IsCircleNumber();
		int count = 0;
		for(int i=10; i<=10000; i++){
			
			//利用int转换成String进行判断
			/*if (t.solution_String(i)) {
				count++;
				System.out.println(i + " is a circlr number.");
			}*/
			
			
			//通过调换int数据的方式进行判断
			if (t.solution_int(i)) {
				count++;
				System.out.println(i + " is a circlr number.");
			}
		}
		System.out.println(count);
	}

}


