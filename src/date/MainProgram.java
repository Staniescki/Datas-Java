package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class MainProgram {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf1.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR, 4);
		d = cal.getTime();
		
		System.out.println(d);
		System.out.println(sdf1.format(d));
		
		int minutes = cal.get(Calendar.MINUTE);
		int hour = cal.get(Calendar.HOUR);
		
		System.out.println(minutes);
		System.out.println(hour);
		
		
		
		
	}

}
