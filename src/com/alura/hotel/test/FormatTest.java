package com.alura.hotel.test;

import com.alura.hotel.utils.Format;

public class FormatTest {
	
	public static void main(String[] args) {
		
		System.out.println(Format.isValidNumber("20"));
		System.out.println(Format.isValidString("pedro"));
		System.out.println(Format.isValidDate("2024-06-13"));
		System.out.println(Format.capitalize("Nombre"));
		
	}

}
