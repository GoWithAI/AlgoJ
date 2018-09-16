package algo.pojo;
//Pojo
public class Person {
	private String name;
	private String roolNo;

	public Person(String name, String roolNo) {
		this.name = name;
		this.roolNo = roolNo;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", roolNo=" + roolNo + "]";
	}
}
