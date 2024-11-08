import java.util.*;
import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private int attendance;
    private List<Integer> marksList;
    private Branch branch;
    private List<Subject> subjectList;
    private Map<String, Integer> subjectMarks = new HashMap<String, Integer>();

    public Student(String studentName, Branch branch){
        this.studentId=University.getStudentId();
        this.studentName=studentName;
        this.attendance=0;
        this.marksList=new ArrayList<>();
        this.branch=branch;
        this.subjectList = new ArrayList<>();

    }

    public int getStudentId(){
        return studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getAttendance(){
        return attendance;
    }

    public void setAttendance(int attendance){
        this.attendance=attendance;
    }

    public List<Integer> getMarksList(){
        return marksList;
    }

    public void addMark(int mark){
        marksList.add(mark);
    }
    public List<Subject> getSubjectList() {
        return subjectList;
    } StudentManagement studentManagement = new StudentManagement();

    public void addSubject(Subject subject, int marks) {
      //  Subject subjects = new Subject("java",90,true);
        subjectList.add(subject);
    }

    public boolean canAttendExam(){
        return  attendance>=75;
    }

    public boolean isEligibleForHallTicket(){
        return attendance>=75;
    }

    public void generateHallTicket(){
        if(isEligibleForHallTicket()){
            System.out.println("Hall Ticket has been issued to "+studentName);

        }
        else{
            System.out.println(studentName+ " is not eligible for getting Hall Ticket");
        }

    }
    public int getTotalMarks() {
            return subjectMarks.values().stream().mapToInt(Integer::intValue).sum();
        }

    public void setMarks(String name, Integer mark) {
        subjectMarks.put(name, mark);
    }
    public void getStudentMarks(){
        System.out.println(subjectMarks);
    }

    public void studentDetails(){
        System.out.println("Student details: ");
        System.out.println("Student ID: "+studentId+ "\n"+
                "Student Name: "+studentName+"\n"+
                "Branch: "+ branch.getBranchName()+"\n"+
                "Attendence: "+attendance+"%");
              //  "Marks: "+ marksList);

    List<Subject> subjects=branch.getSubjectList();
    System.out.println("Subjects and Marks: ");
    for(Subject subject : subjects){
         System.out.println(subject.getSubjectName() + ": " + subject.getMarks());
        }
    }
}
