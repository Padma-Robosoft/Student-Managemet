public class Subject {

    private String subjectName;
    private int marks;
    private boolean isElective;

    public Subject(String subjectName, int marks, boolean isElective){
        this.subjectName=subjectName;
        this.marks=marks;
        this.isElective=isElective;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public boolean isElective() {
        return isElective;
    }

    public int getMarks(){
        return marks;
    }

    public String toString(){
        return subjectName+" : "+marks;
    }
}
