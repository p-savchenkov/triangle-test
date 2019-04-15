import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;


@RunWith(Parameterized.class)
public class TriangleIsValidTest {

  private Triangle triangle = new Triangle();

  @Parameterized.Parameter
  public int aSide;

  @Parameterized.Parameter(1)
  public int bSide;

  @Parameterized.Parameter(2)
  public int cSide;

  @Parameterized.Parameter(3)
  public boolean result;

  @Parameterized.Parameters(name = "A: {0} B: {1} C: {2} Result: {3}")
  public static Collection<Object[]> parameters() {
    return Arrays.asList(
            new Object[][]{
                    {5, 3, 8, false},
                    {-1, -2, -5, false},
                    {0, 0, 0, false},
                    {7, 5, 10, true},
                    {105, 105, 105, true},
                    {1001, 1001, 21, true},
                    {Integer.MAX_VALUE, 2345, Integer.MAX_VALUE, true}
            }
    );
  }

  @Before
  public void setupTriangle() {
    triangle.setA(aSide);
    triangle.setB(bSide);
    triangle.setC(cSide);
  }

  @Test
  public void triangleIsValidShouldCheckTriangleExistence() {
    assertEquals(
            String.format(
                    "Некорректный результат валидации существования треугольника со сторонами: %d, %d, %d",
                    triangle.getA(),
                    triangle.getB(),
                    triangle.getC()
            ),
            result,
            triangle.isValid()
    );
  }

}
