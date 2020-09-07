interface Punjab {

	static void capital() {

		System.out.println("Capital of Punjab is Chandigarh");
	}
}

interface Haryana {

	static void capital() {

		System.out.println("Capital of Haryana is Chandigarh");
	}
}

class CapitalList implements Punjab, Haryana {

}

class Demo {

	public static void main(String[] args) {

		Haryana.capital();
	}
}
