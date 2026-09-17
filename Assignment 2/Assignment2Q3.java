class Date{
	private int month;
	private int  day;
	private int year;
	
	public Date(int month,int day,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void setMonth(int month) {
		this.month=month;
	}
	public int getMonth() {
		return month;
	}
	
	
	public void setDay(int day) {
		this.day=day;
	}
	public int getDay() {
		return day;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	public int getYear() {
		return year;
	}
	public void displayDate() {
		System.out.println(month +"/" + day+ "/"  + "/"+ year);
	}
}






public class DateTst {

	public static void main(String[] args) {
		Date d1=new Date(9,11,2026);
		System.out.println("Date is:");
		d1.displayDate();
		
	
		d1.setMonth(10);
		d1.setDay(5);
		d1.setYear(2026);
		System.out.println("Update Date is:");
		d1.displayDate();
		
		 System.out.println("Month: " + d1.getMonth());
	        System.out.println("Day: " + d1.getDay());
	        System.out.println("Year: " + d1.getYear());
	    }
	}

}
