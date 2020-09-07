import java.util.*;

class ArrayListDemo {

	public static void main(String[] args) {

		/**
		 * If arrayList is created with negative capacity it throws illegal
		 * argument exception(unchecked, run time)
		 */
		ArrayList al = new ArrayList(0);

		al.add("Shashi");
		al.add("Kanha");
		al.add("Ashish");
		al.add(null);
		al.add(1);
		al.add(75);
		al.add(98.5);

		System.out.println(al);

		/**
		 * Hetrogenous collection is directly added in string generic
		 */
		ArrayList<String> al2 = new ArrayList<String> (al);
		System.out.println(al2);

		al2.add("Snehal");
		al2.add("Sonali");
		al2.add("Nihara");


		//al2.add(10);

		System.out.println(al2);

	}
}
