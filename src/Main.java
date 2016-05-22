
public class Main {

	public static void main(String[] args) {
		printNumber(3);
		printNumber(4);
		printNumber(5);
		printNumber(6);
		printNumber(10);
	}

	private static void printNumber(int a) {
		if (a % 2 == 0) {
			System.out.println("Number is even.");
		} else {
			System.out.println("Number is odd.");
		}
	}
}
