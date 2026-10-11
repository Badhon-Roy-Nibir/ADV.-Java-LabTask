public class TotalMarksThread extends Thread{
    private String studentName;
    private double marks[];

    public TotalMarksThread(String studentName, double... marks){
        this.studentName = studentName;
        this.marks = marks;
    }
    @Override
    public void run() {
        double total=0;
        for(int i=0; i<this.marks.length;i++){
            total+=marks[i];
        }
        System.out.println("Total Marks for "+this.studentName+": "+total);

    }
}
