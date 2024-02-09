abstract class Shape {
	static int numberOfShapes = 0;
	
	public Shape() {
		numberOfShapes++;
	}
	
	abstract void draw();
	
	static void displayTotalShapes() {
		System.out.println("Total number of shapes: " + numberOfShapes);
	}
	
	void displayInfo() {
		System.out.println("This is a shape.");
	}
}

class Circle extends Shape {
	
	@Override	// annotation
	void draw() {
		System.out.println("Drawing Circle");
	}
}

class Square extends Shape {
	
	@Override
	void draw() {
		System.out.println("Drawing Square");
	}
}

public class AbstractionExample {

	public static void main(String[] args) {
		
		// in-line anonymous instantiation
		Circle circle = new Circle();
		circle.draw();
		circle.displayInfo();
		
		Shape square = new Square();	
		square.draw();
		Shape circle1 = new Circle();	
		circle1.draw();
	}
}