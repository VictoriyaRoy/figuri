package ua.com.samsungitschool.figuri;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth &&
                Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
