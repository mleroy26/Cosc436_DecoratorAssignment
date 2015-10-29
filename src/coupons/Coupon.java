package coupons;

import decorator_assignment.Decorator;
import decorator_assignment.Receipt;
import interfaces.Applicable;

public class Coupon extends Decorator implements Applicable{

	public Coupon(Receipt r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean applies(String[] x) {
		// TODO Auto-generated method stub
		return false;
	}

}
