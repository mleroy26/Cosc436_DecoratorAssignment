package interfaces;

import decorator_assignment.PurchasedItems;

public interface StateTax {
	float getTax(PurchasedItems items);
}
