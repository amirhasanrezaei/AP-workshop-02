package Main;

    public class Student {
        private String firstName;
        private String lastName;
        private String id;
        private double grade;

        public Student(String firstName, String lastName, String id){
            this.id= id;
            this.firstName = firstName;
            this.lastName = lastName;
            grade= 0;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName(){
            return firstName;
        }

        public String getId(){
            return id;
        }

        public double getGrade() {
            return grade;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }

        public boolean setId(String id) {
            int len = id.length();
            if(len!=7){
                System.out.println("Invalid input!!");
                return false;
            }
            this.id = id;
            return true;
        }

        public void printStudentInfo(){
            System.out.println(firstName+""+lastName+"\nID: "+ id + "\nGRADE: "+ grade);
        }
    }

