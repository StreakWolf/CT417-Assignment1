import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class registrationTests {
    @Test
    public void testUsername() {
        Student student = new Student("Steve", 20, new DateTime(2002, 1, 1, 0, 0), 123456);
        Assertions.assertEquals("Steve20", student.getUsername());
    }

    @Test
    public void testLecturerUsername() {
        Lecturer lecturer = new Lecturer("Bob", 32, new DateTime(1990, 1, 1, 0, 0), 123456);
        Assertions.assertEquals("Bob22", lecturer.getUsername());
    }

    @Test
    public void testSetStudentsModule(){
        Student student1 = new Student("Steve", 20, new DateTime(2002, 1, 1, 0, 0), 123456);
        Student student2 = new Student("Mary", 20, new DateTime(2002, 1, 1, 0, 0), 123456);
        Lecturer lecturer1 = new Lecturer("Bob", 32, new DateTime(1990, 1, 1, 0, 0), 123456);
        Module module1 = new Module("Software Engineering", "CT417", lecturer1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        module1.setStudents(students);
        Assertions.assertEquals(students, module1.getStudents());
    }
    @Test
    public void testAddStudentsModule(){
        Student student1 = new Student("Steve", 20, new DateTime(2002, 1, 1, 0, 0), 123456);
        Student student2 = new Student("Mary", 20, new DateTime(2002, 1, 1, 0, 0), 123456);
        Lecturer lecturer1 = new Lecturer("Bob", 32, new DateTime(1990, 1, 1, 0, 0), 123456);
        Module module1 = new Module("Software Engineering", "CT417", lecturer1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        module1.setStudents(students);
        Student student3 = new Student("John", 22, new DateTime(2000, 1, 1, 0, 0), 123456);
        module1.addStudent(student3);
        Assertions.assertTrue(module1.getStudents().contains(student3));
    }
    @Test
    public void testRegister() {
        Student student1 = new Student("Steve", 20, new DateTime(2002, 1, 1, 0, 0), 123456);
        Lecturer lecturer1 = new Lecturer("Bob", 32, new DateTime(1990, 1, 1, 0, 0), 123456);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        ArrayList<Module> modules = new ArrayList<Module>();
        Module module1 = new Module("Software Engineering", "CT417", lecturer1);
        modules.add(module1);
        Course course = new Course("CS&IT", modules, new DateTime(2020, 9, 1, 0, 0), new DateTime(2021, 5, 1, 0, 0));
        student1.register(course);
        Assertions.assertEquals(course, student1.getCourse());
        System.out.println(course);
        System.out.println(student1.getCourse());
    }

}
