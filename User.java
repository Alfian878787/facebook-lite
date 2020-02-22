class User extends Person implements IDisplay {
	private String status;
	private boolean isAgeVisible;

	public User(String name, String last, int age) {
		super(name, last, age);
		status = "What are you doing today";
		isAgeVisible = true;
	}
	
	public void display() {
		Util.println("-----User Info-----");
		Util.print("First Name: ");
		Util.println(getName());
		Util.print("Last Name: ");
		Util.println(getLast());
		Util.print("Age: ");
		if(isAgeVisible) {
			Util.println(Integer.toString(getAge()));
		}
		Util.print("Status: ");
		Util.println(getStatus());
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void toggleVisibility() {
		isAgeVisible = !isAgeVisible;
	}
}