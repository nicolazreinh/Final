package Project;

public class Administrator extends Person {
	String userName;
	String password;

	Administrator(String name, int age, Address address, String userName, String password) {
		super(name, age, address);
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Administrator [userName=" + userName + ", password=" + password + ", name=" + name + ", age=" + age
				+ ", address=" + address + "]";
	}
}
