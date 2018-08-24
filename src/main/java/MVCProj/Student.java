package MVCProj;

public class Student {
    private String name;
    private String lastname;
    private String index;

    public Student(String name, String lastname, String index) {
        this.name = name;
        this.lastname = lastname;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}