package decorator_assignment;

import java.util.Date;

import abstractClasses.TaxComputation;
import interfaces.Receipt;

public class Basic_Receipt implements Receipt{
	private String storeInfo;
	private String stateCode;
	
	private PurchasedItems items;
	private ReceiptDate date;
	private TaxComputation tc;

	public Basic_Receipt(PurchasedItems items,ReceiptDate date2) {
		this.items=items;
		this.date=date2;
	}
	public void prtReceipt(){
		//to implement
	}
	public void setTaxComputation(TaxComputation tc){
		this.tc=tc;
	}
}
