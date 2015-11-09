package decorator_assignment;

import java.util.ArrayList;
import java.util.Scanner;

import interfaces.Receipt;

public class Client {

	@SuppressWarnings({ "unchecked", "null", "resource" })
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		PurchasedItems items = null;
		ReceiptDate date=new ReceiptDate(11,5,2015);
		ArrayList<Item> list=new ArrayList<Item>();

		list.add(new Item("1406 Macbook pro",999.99));
		list.add(new Item ("1310 HP pavillion",599.99));
		int i=0;
		for(Item a:list){
			System.out.println(i+": "+a.getDescription() +"       "+a.getPrice() +"\n");
			i++;
		}
		boolean loop=true;
		int choice;
		while(loop){
			System.out.println("Which item would you like to add? (enter number) or 10 to exit");
			choice=in.nextInt();
			if(choice==10)
				loop=false;
			else
				items.addItem(list.get(choice));
		}
		ReceiptFactory factory = null;
		try {
			factory = new ReceiptFactory(items, date);
		} catch (UnknownAddOnType e) {
		}
		Receipt receipt = factory.getReceipt();
		receipt.prtReceipt();

	}

}
