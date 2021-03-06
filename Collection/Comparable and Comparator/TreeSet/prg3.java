import java.util.*;

class Employee implements Comparable<Employee> {

	int id;

	Employee(int id) {

		this.id = id;
	}

	public int compareTo(Employee e) {

		return this.id - e.id;
	}
	public String toString() {

		return Integer.toString(id);
	}
}

class Demo {

	public static void main(String[] args) {

		TreeSet<Employee> t = new TreeSet<Employee>();
		t.add(new Employee(1));
		t.add(new Employee(2));
		System.out.println(t);
	}
}
