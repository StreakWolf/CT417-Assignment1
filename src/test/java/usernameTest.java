import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class usernameTest {
    @Test
    public void testUsername() {
        Student student = new Student("Steve", 20, new DateTime(2002, 1, 1, 0, 0), 123456, new Course("CS", new ArrayList<Module>(), new ArrayList<Student>(), new DateTime(2019, 9, 1, 0, 0), new DateTime(2020, 5, 1, 0, 0)), new ArrayList<Module>());
        Assertions.assertEquals("Steve20", student.getUsername());
    }
}
