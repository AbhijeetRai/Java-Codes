class Custom {
	
	private String name = "Shane Watson";

	String fun() {
		
		//it is okay to return private variables
		return name;
	}
}

class Demo {
	
	static public String name;

	public static void main(String[] args) {
		
		Custom C = new Custom();
		name = C.fun();
		System.out.println(name);
	}
}
