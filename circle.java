package deneme;

public class circle {
	final static double pi = 3.14159;
	double r; // radius
	
	public double perimeter(){
		return 2 * pi * r;
	}
	
	public double area(){
		return pi * r * r;
	}
	
	public static void main(String[] args) {
		circle c1 = new circle();
		c1.r = 4.0;

		System.out.println("perimeter of circle c1 = " + c1.perimeter());
		System.out.println("area of circle c1 = " + c1.area());

	}

}
