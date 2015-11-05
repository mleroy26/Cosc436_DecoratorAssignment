package decorator_assignment;

import java.util.ArrayList;
import interfaces.ItemIterator;

public class PurchasedItems extends ArrayList{
	
	private ArrayList Items=new ArrayList();
	private ArrayList pItems=new ArrayList();
	
	public PurchasedItems(){
		pItems.add(new Item(" "," "));
	}
	
	public void addItem(){
		
	}
	public ItemIterator getIterator(){
		return null;
	}
	public double getTotal(){
		return 0;
	}
}
