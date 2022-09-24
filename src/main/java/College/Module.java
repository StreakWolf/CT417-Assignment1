package College;

import java.util.ArrayList;

public class Module {
    String name;
    String id;
    ArrayList<Student> students;
    ArrayList<Course> courses;
    Lecturer lecturer;

    public Module(String name, String id, ArrayList<Student> students, Lecturer lecturer, ArrayList<Course> courses){
        this.name = name;
        this.id = id;
        this.students = students;
        this.lecturer = lecturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
