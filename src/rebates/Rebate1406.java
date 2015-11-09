package rebates;

import decorator_assignment.PurchasedItems;
import interfaces.AddOn;
import interfaces.Applies;
import interfaces.Rebate;

public class Rebate1406 implements Applies, AddOn, Rebate {

	public String getAddedOutput() {
		return "Mail-in Rebate for Item #1406\n" +
				"Name:\n" + "Address:\n\n" +
				"Mail to: Best Buy Rebates, P.O. Box 1400, Orlando, FL";

	}
	public boolean applies(PurchasedItems items) {
		boolean applies=false;
		items.start();
		while(items.hasNext()){
			if(items.getItem().getDescription().substring(0, 3).equals("1406"))
				applies=true;
			items.next();
		}
		return applies;
	}




}
