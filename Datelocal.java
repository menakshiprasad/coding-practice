import java.time.LocalDate;

public class Datelocal {

	public static void main(String[] args) {
		//String DOB="2019-05-20";
		//String arr[]=DOB.split("-");
		/*int age;
			int year=Integer.parseInt(arr[0]);
		int month=Integer.parseInt(arr[1]);
		int day=Integer.parseInt(arr[2]);
		System.out.println("Date:"+day+"year:"+year+"month:"+month);*/
		
		LocalDate date = LocalDate.now();  
		System.out.println(date);
		//date.atStartOfDay();
		 int d=date.getDayOfMonth();
		 System.out.println(d);
		 int y=date.getYear();
		 System.out.println(y);
		 int m=date.getMonthValue();
		 System.out.println(m);
		
		 
		 
		 
		
		 
		 
	}

}
