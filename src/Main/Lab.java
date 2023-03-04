package Main;

public class Lab {
    private Student[] students;
    private String teacherName;

    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avgGrade;

    public Lab (String teacherName, String dayOfWeek, int maxSize){
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;

        students = new Student[maxSize];
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public Student[] getStudents(){
        return students;
    }

    public void setStudents(Student[] students){
        this.students = students;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public double calAvg(){
        double sum=0;
        int tedad = students.length;

        for (int i =0 ; i<tedad; i++){
            if (students[i]==null){
                break;
            }
            sum+=students[i].getGrade();
        }
        return (sum/tedad);

    }
}
