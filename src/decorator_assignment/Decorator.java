package decorator_assignment;

import interfaces.Receipt;

public abstract class Decorator implements Receipt{
	private Receipt receipt;
	
	public Decorator(Receipt r) {
		receipt=r;
	}
	public void callTrailer(){
		receipt.prtReceipt();
	}
	public abstract void prtReceipt();
}
