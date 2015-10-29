package rebates;

import decorator_assignment.PurchasedItems;
import interfaces.AddOn;
import interfaces.Applicable;

public class Rebate1406 implements Applicable, AddOn {


	public String getAddedOutput() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean applies(PurchasedItems items) {
		//returns true if any item is item #1406
		return false;
	}


	public boolean applies(String[] x) {
		// Check this
		return false;
	}

}
