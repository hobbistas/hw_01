

public class Factorial{
	
	public static void main(String[] args){
		System.out.print("\nEnter a number to calculate factorial: ");
        String number = System.console().readLine();
		System.out.print("\nfactorial equals: " + factorial(Integer.parseInt(number)) + "\n");
	}

	public static int factorial(int n){
		if(n <= 1){
		    return 1;
		}
		else{
		return n * factorial(n - 1);
		}
	}
}

