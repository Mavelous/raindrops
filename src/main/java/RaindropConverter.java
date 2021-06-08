class RaindropConverter {
	private static final String PLING = "Pling";
	private static final String PLANG = "Plang";
	private static final String PLONG = "Plong";

	public String convert(int input) {
		String response = "";

		response = checkIfPling(input, response);

		if (isDivisibleBy5(input)) {
			response += PLANG;
		}

		if (isDivisibleBy7(input)) {
			response += PLONG;
		}

		if (response.isEmpty()) {
			response = String.valueOf(input);
		}

		return response;
	}

	private String checkIfPling(int input, String response) {
		if (input % 3 == 0) {
			response = PLING;
		}
		return response;
	}

	private boolean isDivisibleBy7(int input) {
		return input % 7 == 0;
	}

	private boolean isDivisibleBy5(int input) {
		return input % 5 == 0;
	}


}
