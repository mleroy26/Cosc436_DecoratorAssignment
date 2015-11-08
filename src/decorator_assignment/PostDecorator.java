package decorator_assignment;

import abstractClasses.Decorator;
import interfaces.AddOn;
import interfaces.Receipt;

public class PostDecorator extends Decorator {
	private AddOn a;
	
	public PostDecorator(AddOn a, Receipt r){
		super(r);
		this.a=a;
	}
	public void prtReceipt() {
		// similar, except that prtReceipt print the add on information
		// after the other parts of the receipt are printed	
	}
}
