package Main;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("Amir","Rezaei","4013101");
        Student std2 = new Student("Ali","Ahmadi","4013105");
        Student []students = {std1,std2};
        std1.setGrade(18);
        std2.setGrade(18.5);


        std1.printStudentInfo();
        std2.printStudentInfo();

        Lab kargah = new Lab("Mr.Smith","Monday",30);
        kargah.setStudents(students);
        double avg = kargah.calAvg();
        System.out.println("\nAverage: " + avg);
    }


}

