package com.alura.hotel.test;

import com.alura.hotel.utils.ReservePrice;

public class TestReservePrice {
	
	public static void main(String[] args) {
		ReservePrice vc = new ReservePrice(2);
		System.out.println(vc.getTotalPrice());
	}

}
