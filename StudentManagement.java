public class StudentManagement {
    public void studentManagement() {
        University university=new University("VTU University");

        Collage collage=new Collage("SDM Collage");

        Branch cseBranch=new Branch("Computer Science and Engineering");
        Branch eceBranch=new Branch("Electronics and Communication");
        Branch mechBranch=new Branch("Mechanical Branch");

        collage.add(cseBranch);
        collage.add(eceBranch);
        collage.add(mechBranch);

        Student cseStudent1=new Student("Ram", cseBranch);
        Student cseStudent2=new Student("Kavya", cseBranch);
        Student cseStudent3=new Student("Nidhi", cseBranch);
        Student eceStudent4=new Student("Bheem", eceBranch);
        Student mechStudent5=new Student("Ravi",mechBranch);


        cseStudent1.setMarks("Java Programming",95);
        cseStudent1.setMarks("Python", 85);
        cseStudent1.setMarks("OS", 90);

        cseStudent2.setMarks("Java Programming",55);
        cseStudent2.setMarks("Python", 65);
        cseStudent2.setMarks("OS", 70);

        cseStudent3.setMarks("Java Programming",50);
        cseStudent3.setMarks("Python", 60);
        cseStudent3.setMarks("OS", 70);

        eceStudent4.setMarks("ADE",90);
        eceStudent4.setMarks("Digital Electronics",95);
        eceStudent4.setMarks("Micro Controller",97);

        mechStudent5.setMarks("cad",70);
        mechStudent5.setMarks("ABB",80);
        mechStudent5.setMarks("Mechanical",90);
        System.out.println("Subject and Marks of the Student in CSE Branch");
        cseStudent1.getStudentMarks();
        cseStudent2.getStudentMarks();
        cseStudent3.getStudentMarks();
        System.out.println("Subject and Marks of the Student in ECE Branch");
        eceStudent4.getStudentMarks();
        System.out.println("Subject and Marks of the Student in Mechanical Branch");
        mechStudent5.getStudentMarks();

        university.addCollege(collage);

        cseBranch.add(cseStudent1);
        cseBranch.add(cseStudent2);
        cseBranch.add(cseStudent3);
        eceBranch.add(eceStudent4);
        mechBranch.add(mechStudent5);

        cseStudent1.setAttendance(80);
        cseStudent2.setAttendance(74);
        cseStudent3.setAttendance(85);
        eceStudent4.setAttendance(95);
        mechStudent5.setAttendance(95);

        TeachingFaculty teachingFaculty=new TeachingFaculty(101, "Arjun",collage);
        NonTeachingFaculty nonTeachingFaculty=new NonTeachingFaculty(102,"Divya", collage);

        teachingFaculty.displayFacultyRole();
        nonTeachingFaculty.displayFacultyRole();

        cseStudent1.studentDetails();
        cseStudent2.studentDetails();
        cseStudent3.studentDetails();
        eceStudent4.studentDetails();
        mechStudent5.studentDetails();

        cseStudent1.generateHallTicket();
        cseStudent2.generateHallTicket();
        cseStudent3.generateHallTicket();
        eceStudent4.generateHallTicket();
        mechStudent5.generateHallTicket();

        cseBranch.announceTopScorers();
        eceBranch.announceTopScorers();
        mechBranch.announceTopScorers();

        university.sendReportToUniversity();
    }
}
