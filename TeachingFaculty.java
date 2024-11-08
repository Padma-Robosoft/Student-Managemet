public class TeachingFaculty extends Faculty{

    public TeachingFaculty(int facultyId, String facultyName, Collage collage){
        super(facultyId,facultyName,collage);
    }

    public void displayFacultyRole(){
        System.out.println("Faculty Details: ");
        System.out.println(facultyName +"  a Teaching Faculty Responsible for Assigning Marks and Assignment");
    }

    public void assignMarks(Student student,int mark){
        student.addMark(mark);
      System.out.println("Assigned marks " + mark + " to " + student.getStudentName());

    }

    public void assignAssignment(Student student, String assignment){
        System.out.println(student.getStudentName()+" has been Assigned to "+assignment);
    }



}
