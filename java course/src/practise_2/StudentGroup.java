package practise_2;

public class StudentGroup {
    String groupName;
    int studentCount;



    StudentGroup(String groupName,int srudentCount){
        this.groupName=groupName;
        this.studentCount=srudentCount;
    }


    public void setGroupName(String groupName){
        this.groupName=groupName;
    }

    public void setSrudentCount(int studentCount){
        this.studentCount=studentCount;
    }

    public String getGroupName(){
        return groupName;
    }

    public int getStudentCount(){
        return studentCount;
    }

    public void printInfo(){
        System.out.println("В данной группе у нас студентов"+ studentCount + "а название группы"+groupName);
    }

}




