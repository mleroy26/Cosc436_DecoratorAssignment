package decorator_assignment;

import interfaces.AddOn;
import interfaces.Receipt;

public class PostDecorator extends Decorator {
	public PostDecorator(AddOn a, Receipt r){
		super(r);
	}
	public void prtReceipt() {
		// similar, except that prtReceipt print the add on information
		// after the other parts of the receipt are printed	
	}
}
