package decorator_assignment;

public class DelawareTax extends TaxComputation{

	public double computeTax(PurchasedItems items) {
		return 0;
	}
	protected boolean TaxHoliday() {
		return false;
	}

}
