package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("1234");
		
	}

	@Override
	public void speed() {
		System.out.println("5676");
	}

	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.cost();
		k.speed();
}

	}
