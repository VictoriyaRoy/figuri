package ua.com.samsungitschool.figuri;

public class Student extends Human {
    protected String nameOfUniversity;

    public Student(String name, int yearOfBirth,
                   String nameOfUniversity) {
        super(name, yearOfBirth);
        this.nameOfUniversity = nameOfUniversity;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }
}
