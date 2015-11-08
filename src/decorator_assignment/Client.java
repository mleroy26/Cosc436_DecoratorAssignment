package decorator_assignment;

import java.util.ArrayList;

import interfaces.Receipt;

public class Client {
	
	public static void main(String[] args){
		PurchasedItems items = null;
		ReceiptDate date=new ReceiptDate(11,5,2015);
		ArrayList<Item> list=new ArrayList<Item>();
		
		list.add(new Item("1406 Macbook pro",999.99));
		list.add(new Item ("1310 HP pavillion",599.99));
		for(Item a:list){
			System.out.println(a.getDescription() +"       "+a.getPrice() +"\n");
		}
		
		//get user selections
		
		ReceiptFactory factory = null;
		try {
			factory = new ReceiptFactory(items, date);
		} catch (UnknownAddOnType e) {
			
			e.printStackTrace();
		}
		Receipt receipt = factory.getReceipt();
		receipt.prtReceipt();

	}

}
