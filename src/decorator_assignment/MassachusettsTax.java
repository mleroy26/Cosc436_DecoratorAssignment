package decorator_assignment;

import java.util.Calendar;

public class MassachusettsTax extends TaxComputation {
	private final double tax_rate=.0625;

	public double computeTax(PurchasedItems items) {
		if(TaxHoliday())
			return 0;
		return Double.parseDouble(items.getTotal())*tax_rate;
	}

	protected boolean TaxHoliday() {
	//	if ()
		return false;
	}

}
