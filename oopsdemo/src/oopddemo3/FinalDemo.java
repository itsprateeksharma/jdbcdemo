package oopddemo3;

final class Hello {
	final void display() {
		System.out.println("final method");
	}
}
/*
 * class World extends Hello // final classes cannoyt be extended { //final met
 * cant be over ridden final void display() {
 * 
 * } }
 */

public class FinalDemo {

	public static void main(String[] args) {
		final int AGE = 20;
		// age=30;-- comp. error -final variabe cannot be changed

	}

}
