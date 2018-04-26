package Project;

public class Employee extends Person {
	int salary;

	Employee(String name, int age, Address address, int salary) {
		super(name, age, address);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
