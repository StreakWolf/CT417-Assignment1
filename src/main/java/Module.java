import java.util.ArrayList;

public class Module {
    String name;
    String id;
    ArrayList<Student> students;
    ArrayList<Course> courses;
    Lecturer lecturer;

    public Module(String name, String id, Lecturer lecturer){
        this.name = name;
        this.id = id;
        this.lecturer = lecturer;
        lecturer.addModule(this);
        this.students = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public String toString() {
        return name;
    }
}
