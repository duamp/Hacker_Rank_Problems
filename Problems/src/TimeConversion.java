/*
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 */
public class TimeConversion {
	public static String timeConversion(String s) {
		String dayTime = s.substring(8, 10);
		String hour = s.substring(0,2);
		String minute = s.substring(3,5);
		String second = s.substring(6,8);
		if(dayTime.equals("AM") && hour.equals("12")){hour = "00";}
		else if(!dayTime.equals("AM") && !hour.equals("12")){
			hour = "" + (Integer.valueOf(hour) + 12) + "";
		}
		return hour + ":" + minute + ":" + second;
	}
}
