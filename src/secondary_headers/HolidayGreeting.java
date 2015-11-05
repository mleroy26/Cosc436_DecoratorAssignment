package secondary_headers;

import interfaces.AddOn;
import interfaces.Greeting;

public class HolidayGreeting implements AddOn,Greeting {
	
	public String getAddedOutput() {
		return "* Happy Holidays from Best Buy *";
	}

}
