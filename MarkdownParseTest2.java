import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
public class MarkdownParseTest2 {
    @Test
    public void addition() throws IOException {
        // assertEquals(2, 1 + 1);

        String contentsTest = Files.readString(Path.of("test-file.md"));
        String contentsTest1 = Files.readString(Path.of("test-file2.md"));
        String contentsTest2 = Files.readString(Path.of("test-file3.md"));

        assertEquals(List.of("https://something.com", "some-page.html"), 
            MarkdownParse2.getLinks(contentsTest));
        assertEquals(List.of("https://anything.com"), 
            MarkdownParse2.getLinks(contentsTest1));
        assertEquals(List.of("weird-page.html"), 
            MarkdownParse2.getLinks(contentsTest2));
    }
}
