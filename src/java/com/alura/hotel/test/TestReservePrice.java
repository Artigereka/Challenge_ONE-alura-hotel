package java.com.alura.hotel.test;

import java.com.alura.hotel.utils.ReservePrice;

public class TestReservePrice {
	
	public static void main(String[] args) {
		ReservePrice vc = new ReservePrice(2);
		System.out.println(vc.getTotalPrice());
	}

}
