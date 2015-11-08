package decorator_assignment;

import abstractClasses.TaxComputation;


public class MassachusettsTax extends TaxComputation {
	private final double tax_rate=.0625;

	public double computeTax(PurchasedItems items, ReceiptDate date) {
		if(TaxHoliday(date))
			return 0;
		return items.getTotal()*tax_rate;
	}

	protected boolean TaxHoliday(ReceiptDate date) {
		if(date.getMonth()==8 && (date.getDay()==8 || date.getDay()==9) && date.getYear()==2015)
			return true;
		return false;
	}

}
