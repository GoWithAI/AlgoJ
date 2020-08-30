package datastructures;

public class Person {

	private int id;
	private String address;

	public Person(int id, String address) {
		this.id = id;
		this.address = address;
	}

	@Override
	public int hashCode() {
		System.out.println(super.hashCode());
		int result = id;
		result = 31 * result + (address != null ? address.hashCode() : 0);		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
	public static void main(String[] args) {
		Person person = new Person(1, "Deep");
		System.out.println(person);
	}
}
