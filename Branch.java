import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String branchName;
    private List<Student> studentList;
    private List<Subject> subjectList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.studentList = new ArrayList<>();
        this.subjectList = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void add(Student student) {
        studentList.add(student);
    }

    public void add(Subject subject) {
        subjectList.add(subject);
    }

    public void sendBranchReportToUniversity() {
        System.out.println("Branch Report to " + branchName + ":");
        for (Student student : studentList) {
            System.out.println("Student Details in: " + branchName + "\n" +
                    " Student Name: " + student.getStudentName() + "\n" +
                    " Student ID: " + student.getStudentId() + "\n" +
                    " Student Attendence: " + student.getAttendance() + "%" + "\n" +
                    " Marks: " + student.getTotalMarks() + "\n");
        }
    }

    public void announceTopScorers() {
        studentList.sort((s1, s2) -> Integer.compare(s2.getTotalMarks(), s1.getTotalMarks()));
        System.out.println("Top 3 Scorers in " + branchName + ":");
        for (int i = 0; i < 3 && i < studentList.size(); i++) {
            System.out.println((i + 1) + ". " + studentList.get(i).getStudentName() + " - " + studentList.get(i).getTotalMarks());
        }
    }
}


