import java.util.ArrayList;
import java.util.List;

    public class University {
        private String name;
        private List<Collage> collageList;
        private static int studentId=1;

        public University(String name) {
            this.name = name;
            this.collageList = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Collage> getCollageList() {
            return collageList;
        }

        public void setCollegeList(List<Collage> collegeList) {
            this.collageList = collegeList;
        }

        public static int getStudentId(){
            return studentId++;
        }

        public void addCollege(Collage collage){
            collageList.add(collage);
        }

        public void sendReportToUniversity() {
            for(Collage collage:collageList){
                collage.sendCollageReportToUniversity();;
            }
        }

    }

