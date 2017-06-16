import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
	Rectangle myRectangle = new Rectangle(2,3);

	@Test
	public void testGetArea() {
	assertEquals(myRectangle.getArea(), 6);
	}
}
