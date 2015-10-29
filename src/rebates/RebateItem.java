package rebates;

import interfaces.Applicable;
import decorator_assignment.Basic_Receipt;
import decorator_assignment.Decorator;
import decorator_assignment.Receipt;

public class RebateItem extends Decorator implements Applicable {
	
	

	public RebateItem(Receipt r) {
		super(r);
	}

	public boolean applies(String[] x) {
		if (x[0].equalsIgnoreCase("true"))
			return true;
		return false;
	}

}
