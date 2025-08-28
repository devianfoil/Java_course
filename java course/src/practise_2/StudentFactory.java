package practise_2;

public class StudentFactory {

    public static Student Create(int age, String name) {
        return new Student(age, name);
    }

    public static Student CreateWithGroup(int someage, String somename, String somegroup) {
        return new Student(someage, somename, somegroup);
    }
}
