package practise_2;

public class Teacher {
    String name;
    String subject;

    Teacher(String name,String subject){
        this.name = name;
        this.subject = subject;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void printInfo() {
        System.out.println("Учитель" +name + "введет у нас" + subject);
    }
}
