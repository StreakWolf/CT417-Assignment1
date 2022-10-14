import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * A class that represents a lecturer within a college
 */
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
