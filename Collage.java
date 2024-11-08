import java.util.ArrayList;
import java.util.List;

public class Collage {
    private String collageName;
    private List<Branch> branchList;
    private List<Student> studentList;

    public Collage(String collageName){
        this.collageName=collageName;
        this.branchList=new ArrayList<>();
        this.studentList=new ArrayList<>();
    }

    public String getCollageName(){
        return collageName;
    }

    public List<Branch> getBranchList(){
        return branchList;
    }

    public List<Student> getStudentList(){
        return studentList;
    }

    public void add(Student student){
        studentList.add(student);
    }

    public void add(Branch branch){
        branchList.add(branch);
    }

    public void sendCollageReportToUniversity(){
        System.out.println("Sending Report to College: "+collageName);
        for(Branch branch:branchList){
            branch.sendBranchReportToUniversity();
        }
    }
}
