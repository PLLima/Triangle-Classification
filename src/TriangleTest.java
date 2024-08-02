import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void testScaleneTriangle(){
        Triangle Scalene = new Triangle(3, 4, 5);
        assertEquals("Scalene Triangle", Scalene.classify());
    }

    @Test
    public void testIsoscelesTriangleA(){
        Triangle Isosceles = new Triangle(4, 3, 3);
        assertEquals("Isosceles Triangle", Isosceles.classify());
    }

    @Test
    public void testIsoscelesTriangleB(){
        Triangle Isosceles = new Triangle(3, 4, 3);
        assertEquals("Isosceles Triangle", Isosceles.classify());
    }

    @Test
    public void testIsoscelesTriangleC(){
        Triangle Isosceles = new Triangle(3, 3, 4);
        assertEquals("Isosceles Triangle", Isosceles.classify());
    }

    @Test
    public void testEquilateralTriangle(){
        Triangle Equilateral = new Triangle(3, 3, 3);
        assertEquals("Equilateral Triangle", Equilateral.classify());
    }

    @Test
    public void testNullInputA(){
        Triangle NotATriangle = new Triangle(0, 3, 3);
        assertEquals("Not a Triangle", NotATriangle.classify());
    }

    @Test
    public void testNullInputB(){
        Triangle NotATriangle = new Triangle(3, 0, 3);
        assertEquals("Not a Triangle", NotATriangle.classify());
    }

    @Test
    public void testNullInputC(){
        Triangle NotATriangle = new Triangle(3, 3, 0);
        assertEquals("Not a Triangle", NotATriangle.classify());
    }

    @Test
    public void testAllNullInputs(){
        Triangle NotATriangle = new Triangle(0, 0, 0);
        assertEquals("Not a Triangle", NotATriangle.classify());
    }

    @Test
    public void testNegativeInputA(){
        Triangle NotATriangle = new Triangle(-1, 3, 3);
        assertEquals("Not a Triangle", NotATriangle.classify());
    }

    @Test
    public void testNegativeInputB(){
        Triangle NotATriangle = new Triangle(3, -1, 3);
        assertEquals("Not a Triangle", NotATriangle.classify());
    }

    @Test
    public void testNegativeInputC(){
        Triangle NotATriangle = new Triangle(3, 3, -1);
        assertEquals("Not a Triangle", NotATriangle.classify());
    }

    @Test
    public void testAllNegativeInputs(){
        Triangle NotATriangle = new Triangle(-1, -1, -1);
        assertEquals("Not a Triangle", NotATriangle.classify());
    }

    @Test
    public void testEqualSideLengthA(){
        Triangle NotATriangle = new Triangle(3, 1, 2);
        assertEquals("Not a Triangle", NotATriangle.classify());
    }

    @Test
    public void testEqualSideLengthB(){
        Triangle NotATriangle = new Triangle(1, 3, 2);
        assertEquals("Not a Triangle", NotATriangle.classify());
    }

    @Test
    public void testEqualSideLengthC(){
        Triangle NotATriangle = new Triangle(1, 2, 3);
        assertEquals("Not a Triangle", NotATriangle.classify());
    }

    @Test
    public void testBiggerSideLengthA(){
        Triangle NotATriangle = new Triangle(4, 1, 2);
        assertEquals("Not a Triangle", NotATriangle.classify());
    }

    @Test
    public void testBiggerSideLengthB(){
        Triangle NotATriangle = new Triangle(1, 4, 2);
        assertEquals("Not a Triangle", NotATriangle.classify());
    }

    @Test
    public void testBiggerSideLengthC(){
        Triangle NotATriangle = new Triangle(1, 2, 4);
        assertEquals("Not a Triangle", NotATriangle.classify());
    }
}
