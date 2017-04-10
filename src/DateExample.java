import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date();
		long now = date1.getTime();
		Date date2 = new Date(now+1000);
		
		System.out.println("date1 is after date2 " + date1.after(date2));
		System.out.println("date1 is before date2 " + date1.before(date2));
		System.out.println("date1 is same date2 " + date1.equals(date2));
		System.out.println("date2 is after date1 " + date2.compareTo(date1) + "\n");
		
		/*Calendar*/
		
		Calendar c1 = Calendar.getInstance();
		Object obj= Calendar.getInstance().getClass();
		System.out.println("Calendar Instance" + c1);
		System.out.println("Calendar getClass" + obj);
		System.out.println("Show date; "+c1.get(Calendar.YEAR) +"/"+ c1.get(Calendar.MONTH) +"/"+ c1.get(Calendar.DATE)+"\n");
	
		/*DateFormat*/
		
		Date date11=new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("'year'yyyy' month'MM' day'dd");
		
		System.out.println(sdf1.format(date11));
		
		sdf1.applyPattern("yyyy/MM/dd");
		System.out.println(sdf1.format(date11));
	}
}
