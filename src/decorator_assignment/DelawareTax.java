package decorator_assignment;

import abstractClasses.TaxComputation;

public class DelawareTax extends TaxComputation{

	public double computeTax(PurchasedItems items, ReceiptDate date) {
		return 0;
	}
	protected boolean TaxHoliday(ReceiptDate date) {
		return false;
	}

}
