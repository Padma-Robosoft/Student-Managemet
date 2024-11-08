public class NonTeachingFaculty extends Faculty{

    public NonTeachingFaculty(int facultyId, String facultyName, Collage collage){
        super(facultyId, facultyName, collage);
    }

    public void displayFacultyRole(){
        System.out.println(facultyName+"  a Non Teaching Faculty Responsible for Logistics and Administration");
    }

}
