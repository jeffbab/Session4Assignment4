
public class Assignment4 {
	/*
	 * Calculate the area of square and rectangles using constructor overloading
	 */
	public static void main(String[] args) {
		FourSidedShape square = new FourSidedShape(10);
		FourSidedShape rect = new FourSidedShape(10, 20);

		System.out.println(square.area());
		System.out.println(rect.area());
	}

}

class FourSidedShape {

	double length;
	double width;

	/*
	 * if only one entry we assume all sides are equal
	 */
	public FourSidedShape(double length) {
		this.length = length;
		this.width = length;
	}

	/*
	 * if two values we assume sides are not equal
	 */
	public FourSidedShape(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		return (length * width);
	}
}
