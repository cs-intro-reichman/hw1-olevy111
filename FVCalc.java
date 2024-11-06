// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]); 
		double rate = Double.parseDouble(args[1]);
		int years =  Integer.parseInt(args[2]);
		double rate1 =rate/100;
		double num1 = (1 + rate1);
		double num2 = Math.pow(num1,(double)years);
		double futureValue = currentValue * num2;
		System.out.println("After " + years + " years, a $" + currentValue + " saved at " + rate + "% will yield $" + (int)futureValue);
	}
}