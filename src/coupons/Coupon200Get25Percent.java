package coupons;

import decorator_assignment.PurchasedItems;
import interfaces.AddOn;
import interfaces.Applies;
import interfaces.Coupon;

public class Coupon200Get25Percent implements AddOn, Applies, Coupon {

	public boolean applies(PurchasedItems items) {
		if(items.getTotal()>=200)
			return true;
		return false;
	}
	public String getAddedOutput() {
		return "Here is a coupon for 25% of your next purchase\n" +
				"Please present to cashier to use.";
	}

}
