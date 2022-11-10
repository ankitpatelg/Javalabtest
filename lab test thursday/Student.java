class Student {
	private String name;
	private int grade;
	private String email;

	public Student(String name, int grade, String email) {

		this.name = name;
		this.grade = grade;
		this.email = email;
	}

	public String toString() {

		return name + " " + grade + " " + email;
	}
}