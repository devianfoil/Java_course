package practise_2;

public class Student {
    int age;
    String name;
    String group = "9-A";

    public Student(int age, String name, String group) {
        this.age = age;
        this.name = name;
        this.group = group;

    }

    public Student(int someage, String somename) {
        this.age = someage;
        this.name = somename;
    }

    public void printInfo() {
        System.out.println("Name:" + name + "Age:" + age + "Group:" + group);
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newname) {
        newname = name;
    }


}