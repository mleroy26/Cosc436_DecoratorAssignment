package decorator_assignment;

import interfaces.Receipt;

public class Client {
	
	public static void main(String[] args){
		PurchasedItems items;
		ReceiptDate date=new ReceiptDate(11,5,2015);
		
		//display items here
		
		//get user selections
		
		ReceiptFactory factory = new ReceiptFactory(items, date);
		Receipt receipt = factory.getReceipt();
		receipt.prtReceipt();

	}

}
