package decorator_assignment;

import interfaces.AddOn;
import interfaces.Applies;
import interfaces.Greeting;
import interfaces.Receipt;
import rebates.Rebate1406;
import rebates.Rebate3610;
import secondary_headers.HolidayGreeting;
import abstractClasses.TaxComputation;
import coupons.Coupon100Get10Percent;
import coupons.Coupon200Get25Percent;

public class ReceiptFactory {
	private PurchasedItems items;
	private ReceiptDate date;

	private AddOn[] addons; //greeting, rebate, and coupons

	public ReceiptFactory(PurchasedItems items, ReceiptDate date)throws UnknownAddOnType {
		this.items=items;
		this.date=date;

		Receipt receipt=new Basic_Receipt(items,date);

		//link taxcomputation obj (tbd)

		getAddOns(addons);
		for (AddOn a: addons){
			if (a instanceof Applies){
				if (((Applies) a).applies(items))  {
					if (a instanceof Greeting)
						receipt = new PreDecorator(a, receipt);
					else
						if (a instanceof interfaces.Rebate || a instanceof interfaces.Coupon)
							receipt = new PostDecorator(a, receipt);
				}
				else{
					if (a instanceof Greeting)
						receipt = new PreDecorator(a, receipt);
					else
						throw new UnknownAddOnType();
				}
			}
		}
	}
	private void getAddOns(AddOn[] addOns){
		addOns = new AddOn[5];

		addOns[0] = new HolidayGreeting();
		addOns[1] = new Rebate1406();
		addOns[2] = new Rebate3610();
		addOns[3] = new Coupon100Get10Percent();
		addOns[4] = new Coupon200Get25Percent();
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
	public Receipt getReceipt() {
		
		return null;
	}
	
}
