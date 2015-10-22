package interfaces;

import decorator_assignment.Item;

public interface ItemIterator {
	
	public boolean hasNext();
	public Item getItem();
	public void next();

}
