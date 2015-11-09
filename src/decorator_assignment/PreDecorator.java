package decorator_assignment;

import abstractClasses.Decorator;
import abstractClasses.TaxComputation;
import interfaces.AddOn;
import interfaces.Receipt;

public class PreDecorator extends Decorator{
	private AddOn a;
	
	public PreDecorator(AddOn a, Receipt r){
		super(r);
		this.a=a;
	}
	public void prtReceipt(){
		System.out.println(a.getAddedOutput());
		callTrailer();
	}
	public void set(String string, String string2, TaxComputation tc) {		
	}
}
