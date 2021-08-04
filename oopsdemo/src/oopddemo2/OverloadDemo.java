package oopddemo2;

public class OverloadDemo {

	public static void main(String[] args) {

		Addition a1=new Addition();
		// invoking add() overload method
		a1.add();
		a1.add(10, 20);
		a1.add(2.3f, 10.2f);
		a1.add("hello", "world");
		a1.add(23, 100, 5);
	}

}
