package abstractClasses;

import decorator_assignment.PurchasedItems;
import decorator_assignment.ReceiptDate;

public abstract class TaxComputation {
	public abstract double computeTax(PurchasedItems items, ReceiptDate date);
	protected abstract boolean TaxHoliday(ReceiptDate date);
}
