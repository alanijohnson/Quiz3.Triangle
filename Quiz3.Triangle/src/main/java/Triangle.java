import Exceptions.InvalidTriangle;

/**
 * This package extends GeometricObjects.class to create a Triangle
 * @author Alani
 *
 */
public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	/**
	 * Default Constructor
	 * Creates an equilateral triangle with side lengths of 1.0.
	 */
	public Triangle(){
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	
	/**
	 * 3 Arg Constructor
	 * Creates triangle with 3 user defined side lengths.
	 * @param side1
	 * @param side2
	 * @param side3
	 * @throws InvalidTriangle
	 */
	public Triangle(double side1, double side2, double side3) throws InvalidTriangle{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
		if (!(side1 + side2 > side3) || !(side1 - side2 < side3)){
			throw new InvalidTriangle();
		}
	}

	/**
	 * getter for side1
	 * @return
	 */
	public double getSide1() {
		return side1;
	}

	/**
	 * getter for side2
	 * @return
	 */
	public double getSide2() {
		return side2;
	}

	/**
	 * getter for side3
	 * @return
	 */
	public double getSide3() {
		return side3;
	}
	
	/**
	 * returns the area of the triangle
	 * @return
	 */
	public double getArea(){
		double s = ((side1 + side2 +side3)/2);
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
	}
	
	/**
	 * returns triangle perimeter
	 * @return
	 */
	public double getPerimeter(){
		return (side1 + side2 + side3);
	}
	
	/**
	 * returns information pertaining to the triangle (sides, area, and perimeter)
	 * @return
	 */
	@Override
	public String toString(){
		return "The triangle with side lengths of " + side1 + ", " + side2 + ", " + side3 + 
				" has an area of " + this.getArea() + " and a perimeter of " + this.getPerimeter() + ".";
	}
	
}
