package oopddemo3;

public class ShapeTest {

	public static void main(String[] args) {
		//programming for interfaces not implementation
		Shape shape=new Circle(10);
		
		System.out.println("using interface: "+shape.LABLE);
		shape.draw();
		System.out.println("area of circle with radius : "+shape.getArea());
		
		
		System.out.println("-------------------------------------");
		//switching from one implementation to another easily
		shape=new Rectangle(10,7);
		System.out.println("using interface: "+shape.LABLE);
		shape.draw();
		System.out.println("area of rectangle: "+shape.getArea());
		
		
		
		
	}

}
