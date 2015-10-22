package decorator_assignment;

public abstract class TaxComputation {
	public abstract double computeTax(PurchasedItems items);
	protected abstract boolean TaxHoliday();
}
