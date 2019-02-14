package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		
		return width*height/2.0;
	}

	@Override
	public double getPerimeter() {
		double a,b,c;
		a = width;
		b = height;
		c = Math.sqrt(width*width + height*height);
		return a+b+c;
	}
}
