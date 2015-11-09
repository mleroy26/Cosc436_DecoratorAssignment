package taxes;

import abstractClasses.TaxComputation;
import decorator_assignment.PurchasedItems;
import decorator_assignment.ReceiptDate;

public class DelawareTax extends TaxComputation{

	public double computeTax(PurchasedItems items, ReceiptDate date) {
		return 0;
	}
	protected boolean TaxHoliday(ReceiptDate date) {
		return false;
	}

}
