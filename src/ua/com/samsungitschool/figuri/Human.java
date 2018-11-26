package ua.com.samsungitschool.figuri;

public class Human {
    protected final String name;
    protected final int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
