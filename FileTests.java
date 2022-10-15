import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTests {
    
    @Test
    public void testGetFilesAgain() throws IOException {
        List<File> files = FileExample.getFiles(new File("File1/")); 
        List<File> expected = new ArrayList<>();
        expected.add(new File("File1/a.txt"));
        expected.add(new File("File1/File2/b.txt"));
        //expected.add(new File("File1/File3/c.txt"));
        expected.add(new File("File1/File3/d.txt"));
        assertEquals(expected, files);
    }
}
