package streams;

import java.util.List;

public class Person {
    int id;

    public int getId() {
        return id;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    List<String> email;

    public Person(int id, String name, List<String> email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
