// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		String minutes =("" + args[0].charAt(3) + args[0].charAt(4));
			
		if (hours>=12)
		{
			if (hours == 12)
			{
			System.out.println(hours + ":" + minutes + " PM");	
			}
			else
			{
			int pm = hours-12;
			System.out.println(pm + ":" + minutes  + " PM");
			}
		}
		else
		{
		System.out.println(hours + ":" + minutes + " AM");
		}
	}
}