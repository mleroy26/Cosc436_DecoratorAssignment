package decorator_assignment;

public class Client {
	
	public static void main(String[] args){
		PurchasedItems purchasedItems=null;
		Decorator[] decorators =new Decorator[10];
		getCurrentDecorators(decorators);//supporting method
		//user input (display avail items, user selects from)
		//create factory
		ReceiptFactory factory = new ReceiptFactory(purchasedItems,decorators);
		Basic_Receipt receipt=factory.getReceipt(); 
		receipt.prtReceipt();
	}

	private static void getCurrentDecorators(Decorator[] decorators) {
		
	}
}
