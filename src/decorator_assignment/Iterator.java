package decorator_assignment;

import interfaces.ItemIterator;

public class Iterator implements ItemIterator {

	public boolean hasNext() {
		
		return false;
	}

	public Item getItem() {
		return null;
	}

	@Override
	public void next() {

	}

}
