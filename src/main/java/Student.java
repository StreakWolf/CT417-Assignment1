import org.joda.time.DateTime;

import java.util.ArrayList;

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
        username = getUsername();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void register(Course course) {
        this.course = course;
        course.addStudent(this);
        modules = course.getModules();
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public String getUsername() {
        return name + age;
    }
}