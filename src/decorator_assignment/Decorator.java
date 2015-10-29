package decorator_assignment;

public abstract class Decorator {
	private Receipt receipt;
	
	public Decorator(Receipt r) {
		
	}
	public void create(Receipt r){
		
	}
	public void callTrailer(){
		receipt.prtReceipt();
	}
}
