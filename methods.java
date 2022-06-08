package quiz;

public class methods {
	public static int factorial(int num) {
		int fact=1;
		for(int i=1; i<num ;++i) {
			fact*=i;
		}
		return fact;
	}
	public static int odd(int num) {
		int odd_1=num%2;
		return odd_1;
	}
	public static int even(int num) {
		int even_1=num%2;
		return even_1;
	}
	public static boolean prime(int num) {
		if(num <= 1) {
			return false;
		}
	for (int i=2 ; i < Math.sqrt(num); i++) {
		return false;
	}
	
	return true;
	}
}


