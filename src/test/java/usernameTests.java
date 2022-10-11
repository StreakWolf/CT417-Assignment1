import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class usernameTests {
    @Test
    // Test that the student username is created correctly
    public void testStudentUsername() {
        Student student = new Student("Steve", 20, new DateTime(2002, 1, 1, 0, 0), 123456);
        Assertions.assertEquals("Steve20", student.getUsername());
    }

    @Test
    // Test that the lecturer username is created correctly
    public void testLecturerUsername() {
        Lecturer lecturer = new Lecturer("Barry", 30, new DateTime(1992, 1, 1, 0, 0), 345678);
        Assertions.assertEquals("Barry30", lecturer.getUsername());
    }
}
