package decorator_assignment;

import abstractClasses.TaxComputation;
import interfaces.Receipt;

public class Basic_Receipt implements Receipt{
	private String storeInfo;
	private String stateCode;
	
	private PurchasedItems items;
	private ReceiptDate date;
	private TaxComputation tc;

	public Basic_Receipt(PurchasedItems items,ReceiptDate date) {
		this.items=items;
		this.date=date;
	}
	public void prtReceipt(){
		double subtotal=items.getTotal();
		double tax=tc.computeTax(items, date);
		double total=subtotal+tax;
		System.out.println("Best Buy "+storeInfo +stateCode);
		System.out.println(date.getMonth()+"/"+date.getDay()+"/"+date.getYear());
		items.start();
		while(items.hasNext()){
			System.out.println(items.getItem().getDescription()+"        "+items.getItem().getPrice());
			items.next();
		}
		System.out.println("Subtotal:   "+subtotal);
		System.out.println("Tax:        "+tax);
		System.out.println("Total:      "+total);
	}
	public void setTaxComputation(TaxComputation tc){
		this.tc=tc;
	}
	public void set(String storeinfo, String statecode, TaxComputation tc){
		this.storeInfo=storeinfo;
		this.stateCode=statecode;
		this.tc=tc;
	}
}
