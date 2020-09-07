class MIUI1 {

	void version() {

		System.out.println(1);
	}
}

class MIUI2 extends MIUI1 {


}

class Demo extends MIUI2 {


	public static void main(String[] args) {
		
		new Demo().version();
	}

	void version() {

		super.version();
	}
}