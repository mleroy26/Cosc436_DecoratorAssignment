package decorator_assignment;


public class MassachusettsTax extends TaxComputation {
	private final double tax_rate=.0625;

	public double computeTax(PurchasedItems items, ReceiptDate date) {
		if(TaxHoliday(date))
			return 0;
		return items.getTotal()*tax_rate;
	}

	protected boolean TaxHoliday(ReceiptDate date) {
	//	if ()
		return false;
	}

}
