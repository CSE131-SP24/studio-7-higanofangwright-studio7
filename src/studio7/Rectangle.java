package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}
	
	public double area() {
		return this.length * this.width;
	}
	
	public boolean isSquare() {
		if(this.length == this.width) {
			return true;
		}
		else
			return false;
	}
	
	public static String bigger(Rectangle a, Rectangle b) {
		if(a.area() > b.area()) {
			return a + " is bigger than " + b;
		}
		else if(b.area() > a.area()) {
			return b + " is bigger than " + a;
		}
		else
			return a + " and " + b + " are equal.";
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2.0, 3.0);
		Rectangle r2 = new Rectangle(5.0, 6.0);
		Rectangle r3 = new Rectangle(4.5, 4.5);
		
		System.out.println("Is rectangle r1 square?");
		if(r1.isSquare()) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		
		System.out.println("Is rectangle r2 square?");
		if(r2.isSquare()) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		
		System.out.println("Is rectangle r3 square?");
		if(r3.isSquare()) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		
		
		System.out.println(bigger(r1, r2));
		System.out.println(bigger(r2, r3));
		System.out.println(bigger(r1, r3));
		
	}
	
}
