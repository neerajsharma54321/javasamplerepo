package sample_github;

public class MathUtil {
	
	public static int add(int ...a ) {
		int sum = 0;
		for(int i: a) {
				sum += i;
			}
		return sum;
	}
}
