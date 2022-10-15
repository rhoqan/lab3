import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
	public void testAppend() {
		LinkedList l_list1 = new LinkedList();
		l_list1.append(2);
		l_list1.append(3);
		l_list1.append(5);
		l_list1.append(7);
		String expectedString = "2 3 5 7 ";
        assertEquals(expectedString, l_list1.toString());
	}

}
