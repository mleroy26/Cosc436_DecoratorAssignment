package coupons;

import decorator_assignment.PurchasedItems;
import interfaces.AddOn;
import interfaces.Applicable;
import interfaces.Coupon;

public class Coupon100Get10Percent implements AddOn, Applicable, Coupon {

	public boolean applies(PurchasedItems items) {
		if(items.getTotal()>=100)
			return true;
		return false;
	}
	public String getAddedOutput() {
		return "Here is a coupon for 10% of your next purchase\n" +
				"Please present to cashier to use.";
	}

}
