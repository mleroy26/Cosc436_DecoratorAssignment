package rebates;

import interfaces.Applicable;
import interfaces.Receipt;
import decorator_assignment.Decorator;
import decorator_assignment.PurchasedItems;

public class RebateItem extends Decorator implements Applicable {
	
	

	public RebateItem(Receipt r) {
		super(r);
	}

	public boolean applies(String[] x) {
		if (x[0].equalsIgnoreCase("true"))
			return true;
		return false;
	}

	@Override
	public boolean applies(PurchasedItems items) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void prtReceipt() {
		// TODO Auto-generated method stub
		
	}

}
