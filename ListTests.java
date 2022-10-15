import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testListFilter() {
        List<String> strs = new ArrayList<>();
        strs.add("doom");
        strs.add("cheese");
        strs.add("down");
        String s = ListExamples.filter(strs, new ContainsDStringChecker()).get(0);
        assertEquals("doom", s);
    }

    @Test
    public void testListMerge() {
        List<String> strs = new ArrayList<>();
        strs.add("cheese");
        strs.add("doom");
        strs.add("down");
        List<String> strs2 = new ArrayList<>();
        strs2.add("a");
        strs2.add("aa");
        strs2.add("f");
        List<String> expected = new ArrayList<>();
        expected.add("a");
        expected.add("aa");
        expected.add("cheese");
        expected.add("doom");
        expected.add("down");
        expected.add("f");
        assertEquals(expected, ListExamples.merge(strs, strs2));
    }
}


