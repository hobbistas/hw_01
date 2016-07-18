

public class Max{
	
	public static void main(String[] args){
		int[] givenVals = {1,2,3,4,5,7,8,-50,15,44444};
		System.out.println(max(givenVals));
	}
	
	public static int max(int... vargs){
		int max = Integer.MIN_VALUE;
		for (int ii : vargs){
			if (ii > max){
				max = ii;
			}
		}
		return max;
	}
}