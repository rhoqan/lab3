import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
	public void testAppend() {
		LinkedList llist1 = new LinkedList();
		llist1.append(2);
		llist1.append(3);
		llist1.append(5);
		llist1.append(7);
		String expectedString = "2 3 5 7 ";
        assertEquals(expectedString, llist1.toString());
	}

}
