package decorator_assignment;

public class ReceiptDate {
	private int day,month,year;
	
	public ReceiptDate(int month,int day, int year){
		this.month=month;
		this.day=day;
		this.year=year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
}
