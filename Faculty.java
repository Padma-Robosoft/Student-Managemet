public abstract class Faculty {
    protected int facultyId;
    protected String facultyName;
    protected Collage collage;

    public Faculty(int facultyId, String facultyName, Collage collage){
        this.facultyId=facultyId;
        this.facultyName=facultyName;
        this.collage=collage;
    }

    public void displayFacultyRole(){
    }
}
