package decorator_assignment;

import abstractClasses.TaxComputation;


public class MarylandTax extends TaxComputation {

	private final double tax_rate=.06;

	public double computeTax(PurchasedItems items, ReceiptDate date) {
		if(TaxHoliday(date))
			return 0;
		return items.getTotal()*tax_rate;
	}
	protected boolean TaxHoliday(ReceiptDate date) {
		return false;
	}
}
