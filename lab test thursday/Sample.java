public class Sample {

	public static void main(String[] args) {
		Student[] s = new Student[3];// Array of objects.

		s[0] = new Student("Peter", 3, "p@gmail.com");
		s[1] = new Student("John", 4, "j@gmail.com");
		s[2] = new Student("Lisa", 5, "l@gmail.com");

		for (int i = 0; i < 3; ++i) {
			System.out.println(s[i].toString());
		}
	}
}