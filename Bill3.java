// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int num = Integer.parseInt(args[3]);
	    double sum = num / 3.0;
		double result1 = Math.ceil(sum);
		
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + result1 + " Shekels each.");
	
	}
}
