package decorator_assignment;

import java.util.ArrayList;

public class PurchasedItems{

	private ArrayList<Item> Items=new ArrayList<Item>();
	private int current=0;
	public void addItem(Item i){
		Items.add(i);
	}
	public double getTotal(){
		double total=0;
		for(Item a:Items){
			total+=a.getPrice();
		}
		return total;
	}
	public boolean hasNext() {
		if(current<Items.size())
			return true;
		return false;
	}
	public Item getItem() {
		return Items.get(current);
	}
	public void next() {
		current++;
	}
	public void start(){
		current=0;
	}
}
