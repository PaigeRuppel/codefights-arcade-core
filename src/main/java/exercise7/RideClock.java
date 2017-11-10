package exercise7;

public class RideClock {

	public int lateRide(int n) {
		int firstHour = n / 600;
		n -= firstHour * 600;
		int secondHour = n / 60;
		n -= 60 * secondHour;
		int firstMinute = n / 10;
		n -= 10 * firstMinute;
		int secondMinute = n;
		return firstHour + secondHour + firstMinute + secondMinute;
	}

}
