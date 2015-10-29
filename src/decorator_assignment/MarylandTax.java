package decorator_assignment;


public class MarylandTax extends TaxComputation {

	private final double tax_rate=.06;

	public double computeTax(PurchasedItems items) {
		if(TaxHoliday())
			return 0;
		return Double.parseDouble(items.getTotal())*tax_rate;
	}
	protected boolean TaxHoliday() {
		return false;
	}

}
