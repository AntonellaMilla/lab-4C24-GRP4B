package pe.edu.tecsup.lab02;

public class StudentModel {
    private String name;
    private int age;

    public StudentModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
