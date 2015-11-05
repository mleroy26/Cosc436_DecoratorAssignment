package decorator_assignment;

public class CaliforniaTax extends TaxComputation {

	private final double tax_rate=.075;

	public double computeTax(PurchasedItems items, ReceiptDate date) {
		if(TaxHoliday(date))
			return 0;
		return items.getTotal()*tax_rate;
	}

	protected boolean TaxHoliday( ReceiptDate date) {
		return false;
	}

	
}
