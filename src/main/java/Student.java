import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * A class that represents a student in a college
 */
public class Student {
    String name;
    int age;
    DateTime dob;
    int id;
    String username;
    Course course;
    ArrayList<Module> modules;

    public Student(String name, int age, DateTime dob, int id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        username = getUsername(); // Generates username
        this.modules = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DateTime getDob() {
        return dob;
    }

    public int getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = new ArrayList<>(modules);
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public String getUsername() {
        return name + age;
    }

    public String toString() {
        return "Student: " + id + ", " + username;
    }
}