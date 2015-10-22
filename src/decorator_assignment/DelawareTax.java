package decorator_assignment;

public class DelawareTax extends TaxComputation{

	@Override
	public double computeTax(PurchasedItems items) {
		// TODO Auto-generated method stub
		return 0;
	}
	protected boolean TaxHoliday() {
		return false;
	}

}
