package rebates;

import decorator_assignment.PurchasedItems;
import interfaces.AddOn;
import interfaces.Applicable;
import interfaces.Rebate;

public class Rebate3610 implements Applicable, AddOn, Rebate {

	public String getAddedOutput() {
		return "Mail-in Rebate for Item #1406\n" +
				"Name:\n” + “Address:\n\n" +
				"Mail to: Best Buy Rebates, P.O. Box 1400, Orlando, FL";

	}
	public boolean applies(PurchasedItems items) {
		// implement to check if any of the items in purchased items
		// is item # 1406
		return false;
	}




}
