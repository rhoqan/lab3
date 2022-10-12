import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedWithMore() {
    int[] input1 = {1, 9, 24};
    assertArrayEquals(new int[]{24, 9, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedInPlaceWithMore() {
    int[] input1 = {1, 9, 24, 36};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{36, 24, 9, 1}, input1);
  }
}
