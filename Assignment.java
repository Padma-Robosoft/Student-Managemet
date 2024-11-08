public class Assignment {
    private String title;
    private String format;
    private boolean isSubmitted;

    public Assignment(String title, String format){
        this.title=title;
        this.format=format;
        this.isSubmitted=true;
    }

    public void submit(){
        isSubmitted=true;
        System.out.println("Assignment "+title+ "submitted in "+format+" format");
    }

    public boolean isSubmitted(){
        return isSubmitted;
    }
}
