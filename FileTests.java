import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTests {
    @Test
    public void testGetFiles() throws IOException {
        List<File> files = FileExample.getFiles(new File("File1/")); 
        List<File> expected = new ArrayList<>();
        expected.add(new File("File1/a.txt"));
        expected.add(new File("File1/File2/b.txt"));
        assertEquals(expected, files);
    }
}
