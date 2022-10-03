import org.joda.time.DateTime;

import java.util.ArrayList;

public class Lecturer {
    String name;
    int age;
    DateTime dob;
    int id;
    String username;
    ArrayList<Module> modules;

    public Lecturer(String name, int age, DateTime dob, int id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = getUsername();
        this.modules = new ArrayList<Module>();
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

    public void setUsername(String username) {
        this.username = username;
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

    public void addModule(Module module) {
        modules.add(module);
    }

    public String toString() {
        return "Lecturer: " + id + ", " + username;
    }
}
