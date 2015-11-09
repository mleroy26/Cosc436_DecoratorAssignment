package decorator_assignment;

import interfaces.AddOn;
import interfaces.Applies;
import interfaces.Greeting;
import interfaces.Receipt;
import rebates.Rebate1406;
import rebates.Rebate3610;
import secondary_headers.HolidayGreeting;
import taxes.CaliforniaTax;
import taxes.DelawareTax;
import taxes.MarylandTax;
import taxes.MassachusettsTax;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

import abstractClasses.TaxComputation;
import coupons.Coupon100Get10Percent;
import coupons.Coupon200Get25Percent;

public class ReceiptFactory {
	private PurchasedItems items;
	private ReceiptDate date;
	private Receipt receipt;

	private AddOn[] addons; //greeting, rebate, and coupons

	public ReceiptFactory(PurchasedItems items, ReceiptDate date)throws UnknownAddOnType {
		this.items=items;
		this.date=date;

		receipt=new Basic_Receipt(items,date);
		Random rand = null;
		int config = rand.nextInt((4 - 1) + 1) + 1;
		switch(config){
		case 1:receipt.set("Store # 1111 123 fake street 410 555 5555 ", "MD", new MarylandTax());break;
		case 2:receipt.set("Store # 2222 4565 big street 856 555 5555 ", "DE", new DelawareTax());break;
		case 3:receipt.set("Store # 3333 7902 blvd road 254 555 5555 ", "MA", new MassachusettsTax());break;
		case 4:receipt.set("Store # 4444 1600 pennslyavannia ave 489 555 5555 ", "CA", new CaliforniaTax());break;
		}

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
		Random rand = null;
		int config = rand.nextInt((4 - 1) + 1) + 1;
		switch(config){
		case 1:receipt.set("Store # 1111 123 fake street 410 555 5555", "MD");break;
		}
		
	}
	public Receipt getReceipt() {
		return receipt;
	}
}
