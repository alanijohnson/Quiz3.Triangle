import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Exceptions.InvalidTriangle;

public class test_TriangleClass {

	
	@Test
	public void test_DefaultConstructor(){
		Triangle triangle1 = new Triangle();
		assertEquals(triangle1.getSide1(),1.0,0.0);
		assertEquals(triangle1.getSide2(),1.0,0.0);
		assertEquals(triangle1.getSide3(),1.0,0.0);
		assertEquals(triangle1.getPerimeter(),3.0,0.0);
		assertEquals(0.433,triangle1.getArea(),0.0001);
	}
	
	@Test
	public void test_ThreeArgConstructor() throws InvalidTriangle{
		Triangle triangle1 = new Triangle(3,4,5);
		assertEquals(3.0,triangle1.getSide1(),0.0);
		assertEquals(4.0,triangle1.getSide2(),0.0);
		assertEquals(5.0,triangle1.getSide3(),0.0);
		assertEquals(12.0,triangle1.getPerimeter(),0.0);
		assertEquals(6.0,triangle1.getArea(),0.0001);
	}
	
	@Test
	public void test_InvalidTriangleException() throws InvalidTriangle {
		Triangle triangle1 = new Triangle(3,5,1);
	}
}
