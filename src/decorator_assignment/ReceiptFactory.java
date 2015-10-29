package decorator_assignment;

import java.util.Date;
import coupons.Coupon;
import rebates.Rebate;
import secondary_headers.Greeting;

public class ReceiptFactory {
	private PurchasedItems items;
	private Greeting greeting;
	private Rebate[] rebates;
	private Coupon[] coupons;
	private Basic_Receipt receipt;
	
	private Decorator[] decorators;
	
	
	private String StoreInfo;
	private String StateCode;
	private String StoreNum;
	private String StoreAddress;
	private String PhoneNumber;
	
//	public ReceiptFactory(PurchasedItems items, Decorator[] decorators){
//		this.items=items;
//		this.decorators=decorators;
//		readConfigFile();
//		receipt=new Basic_Receipt(items);
//		addTaxComputation();
//		addDecorators();
//		old code
//	}
	
	public ReceiptFactory(PurchasedItems items, Date date){
		this.items=items;
//		getAddOns(greeting,rebates,coupons);
		//iterate through each adding applicable addons as decorators
		receipt=new Basic_Receipt(items,date);
		receipt=new PreDecorator(greeting,receipt);
	}
	private void readConfigFile() {
		//can have two lines in file:
		//Store# address Phone-number
		//State code
		
		
		//store in receipt factory:
		// instance variables, store info, and state code
	}
	private void addDecorators() {
//		receipt=new GreetingDecorator(receipt);
//		receipt=new RebateItem(receipt);
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
	public Basic_Receipt getReceipt(){
		return receipt;
	}
}
