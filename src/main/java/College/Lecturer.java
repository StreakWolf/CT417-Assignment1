package College;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Lecturer {
    String name;
    int age;
    DateTime dob;
    int id;
    String username;
    ArrayList<Module> modules;

    public Lecturer(String name, int age, DateTime dob, int id, String username, ArrayList<Module> modules) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = getUsername(name, age);
        this.modules = modules;
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

    public String getUsername() {
        return username;
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

    public String getUsername(String name, int age) {
        return name + age;
    }

}
