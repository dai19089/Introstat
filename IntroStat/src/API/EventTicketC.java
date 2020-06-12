package API;

public class EventTicketC {
	
	private String home;
	private String away;
	private String day;
	private String month;
	private String referee;
	private String location;
	
	public EventTicketC(String aHome,String anAway,String aDay,String aMonth,String aReferee,String aLocation) {
		 home = aHome;
		 away = anAway;
		 day = aDay;
		 month = aMonth;
		 referee = aReferee;
		 location = aLocation;
	}
	
	public String getHome() {
		return home;
	}
	
	public String getAway() {
		return away;
	}
	
	public String getDay() {
		return day;
	}
	
	public String getMonth() {
		return month;
	}
	
	public String getReferee() {
		return referee;
	}
	
	public String getLocation() {
		return location;
	}
}
