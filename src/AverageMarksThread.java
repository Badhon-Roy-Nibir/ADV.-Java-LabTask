public class AverageMarksThread extends Thread{
    private String studentName;
    private double marks[];
    private String letterGrade;
    private double gradePoint;

    public AverageMarksThread(String studentName, double... marks){
        this.studentName = studentName;
        this.marks = marks;
    }

    @Override
    public void run() {
        double averge=0;
        double total=0;
        for(int i=0; i<this.marks.length;i++){
            total+=marks[i];
        }
        averge = total / marks.length;

        System.out.printf("Average Marks for %s: %.2f%n", this.studentName, averge);
        if(averge >= 90 && averge <=100){
            letterGrade = "A+";
            gradePoint = 4.00;
        } else if (averge >=85 && averge < 90) {
            letterGrade = "A";
            gradePoint = 3.75;
        }else if (averge >=80 && averge < 85) {
            letterGrade = "B+";
            gradePoint = 3.50;
        }else if (averge >=75 && averge < 80) {
            letterGrade = "B";
            gradePoint = 3.25;
        }else if (averge >=70 && averge < 75) {
            letterGrade = "C+";
            gradePoint = 3.00;
        }else if (averge >=65 && averge < 70) {
            letterGrade = "C";
            gradePoint = 2.75;
        }else if (averge >=60 && averge < 65) {
            letterGrade = "D+";
            gradePoint = 2.50;
        }else if (averge >=50 && averge < 60) {
            letterGrade = "D";
            gradePoint = 2.25;
        }else if (averge < 50) {
            letterGrade = "F";
            gradePoint = 0.00;
        }

        System.out.println("Letter Grade for "+studentName+": "+letterGrade);
        System.out.println("Grade Point for "+studentName+": "+gradePoint);


    }
}
