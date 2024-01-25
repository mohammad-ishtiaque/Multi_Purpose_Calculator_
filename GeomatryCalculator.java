package sampleJava2;

public class GeomatryCalculator {
//	double a, b, area;

	public double triangle(double width, double height) {
		double area = 0.5 * (width * height);
		return area;
	}

	public double rectangle(double length, double width) {
		double area = length * width;
		return area;
	}
	
	
	public double circle(double redius) {
		double area = 3.1416 * (redius * redius);
		return area;
	}
	
	;
	public double square(double length) {
		double area = length * length;
		return area;
	}
}
