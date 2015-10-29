package decorator_assignment;

public class CaliforniaTax extends TaxComputation {

	private final double tax_rate=.075;

	public double computeTax(PurchasedItems items) {
		if(TaxHoliday())
			return 0;
		return Double.parseDouble(items.getTotal())*tax_rate;
	}

	protected boolean TaxHoliday() {
		return false;
	}

	
}
