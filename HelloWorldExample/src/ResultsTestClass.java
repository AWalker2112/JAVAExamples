
public class ResultsTestClass {

	public static int physics = 69;
	public static int chemistry = 51;
	public static int biology = 88;
	public static int total;
	public static double percentage;

	public static void main(String[] args) {

		method2();
		method1();

		// Physics, Chemistry, and Biology, total and percentage

	}

	public static void method1() {

		System.out.println("You're Physics Grade is: " + physics);
		System.out.println("You're Chemistry Grade is: " + chemistry);
		System.out.println("You're Biology Grade is: " + biology);
		System.out.println("You're Total Grade is: " + total);
		System.out.println("You're Percentage is: " + percentage);

	}

	public static void method2() {

		total = physics + chemistry + biology;
		percentage = (total * 100) / 450;

	}

}
