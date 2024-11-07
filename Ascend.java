// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		double a = Math.random()*lim;
		double b = Math.random()*lim;
		double c = Math.random()*lim;
		System.out.println((int)a + " " + (int)b + " " + (int)c);
		
		double min = Math.min((Math.min(a,b)),c);
		double max = Math.max((Math.max(a,b)),c);
		double middle = (a + b + c) - min - max;
		System.out.println((int) min + " " + (int)middle + " " + (int)max);

	}
}
