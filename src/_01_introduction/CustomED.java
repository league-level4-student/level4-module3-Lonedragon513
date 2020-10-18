package _01_introduction;

public class CustomED extends Exception {
	void terminate() {
		System.out.println("THE TERMINATOR");
		System.exit(0);
	}
}
