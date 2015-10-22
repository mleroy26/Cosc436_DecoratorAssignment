package decorator_assignment;

import rebates.RebateItem;

public class ReceiptFactory {
	private PurchasedItems items;
	private Decorator[] decorators;
	private Basic_Receipt receipt;
	
	private String StoreInfo;
	private String StateCode;
	private String StoreNum;
	private String StoreAddress;
	private String PhoneNumber;
	
	public ReceiptFactory(PurchasedItems items, Decorator[] decorators){
		this.items=items;
		this.decorators=decorators;
		readConfigFile();
		receipt=new Basic_Receipt(items);
		addTaxComputation();
		addDecorators();
	}
	private void readConfigFile() {
		//can have two lines in file:
		//Store# address Phone-number
		//State code
		
		
		//store in receipt factory:
		// instance variables, store info, and state code
	}
	private void addDecorators() {
		receipt=new GreetingDecorator(receipt);
		receipt=new RebateItem(receipt);
	}
	private void addTaxComputation() {
		TaxComputation tc = null;
		if(StateCode.equals("DE"))
			tc=new DelawareTax();
		else if(StateCode.equals("MD"))
			tc=new MarylandTax();
		else if(StateCode.equals("CA"))
			tc=new CaliforniaTax();
		else if(StateCode.equals("MA"))
			tc=new MassachusettsTax();
		receipt.setTax(tc);
	}
	public Receipt getReceipt(){
		return receipt;
	}
}
