package com.alura.hotel.utils;

public class Format {
	
	// Check if it has date format
	// Use in Row editing from the view "Busqueda"

	public Format() {
		throw new AssertionError("This class cannot be instantiated.");
	}

	public static boolean isValidString(String input) {
		if (input.matches("[a-zA-Z ]+")) {
			return true;
		}
		return false;
	}

	public static boolean isValidNumber(String input) {
		if (input.matches("\\d+")) {
			return true;
		}
		return false;
	}

	public static boolean isValidDate(String input) {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		sdf.format(txtFechaN.getDate()).toString()
		return false;
	}

	public static String capitalize(String input) {
		if (input == null || input.isEmpty()) {
			return input; // Return the input as is if it's null or empty
		}
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}

}
