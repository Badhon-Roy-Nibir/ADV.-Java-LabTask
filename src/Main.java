public class Main {
    public static void main(String[] args) {

        System.out.println("Student Information:");

        Student[] students = new Student[6];
        students[0] = new Student(101,"Rahim", Department.CSE,80,75,90);
        students[1] = new Student(102,"Karim", Department.CSE,60, 65,70);
        students[2] = new Student(103,"Ayesha", Department.EEE,90,95,92);
        students[3] = new Student(104,"Nusrat", Department.EEE,50,55,60);
        students[4] = new Student(105,"Sakib", Department.BBA,75,80,85);
        students[5] = new Student(106,"Mim", Department.BBA,40,45,50);

        for(int i=0; i<6; i++){
            students[i].showInfo();
        }
        TotalMarksThread[] totalMarksThreads = new TotalMarksThread[6];
        totalMarksThreads[0] = new TotalMarksThread("Rahim", 80,75,90);
        totalMarksThreads[1] = new TotalMarksThread("Karim", 60, 65,70);
        totalMarksThreads[2] = new TotalMarksThread("Ayesha", 90,95,92);
        totalMarksThreads[3] = new TotalMarksThread("Nusrat", 50,55,60);
        totalMarksThreads[4] = new TotalMarksThread("Sakib", 75,80,85);
        totalMarksThreads[5] = new TotalMarksThread("Mim", 40,45,50);


        AverageMarksThread[] averageMarksThread = new AverageMarksThread[6];
        averageMarksThread[0] = new AverageMarksThread("Rahim", 80,75,90);
        averageMarksThread[1] = new AverageMarksThread("Karim", 60, 65,70);
        averageMarksThread[2] = new AverageMarksThread("Ayesha", 90,95,92);
        averageMarksThread[3] = new AverageMarksThread("Nusrat", 50,55,60);
        averageMarksThread[4] = new AverageMarksThread("Sakib", 75,80,85);
        averageMarksThread[5] = new AverageMarksThread("Mim", 40,45,50);
        AverageMarksThread amt = new AverageMarksThread("Rahim", 90, 75, 90);

        try {
            for (int i = 0; i < totalMarksThreads.length; i++) {
                totalMarksThreads[i].start();
            }

            for (int i = 0; i < totalMarksThreads.length; i++) {
                totalMarksThreads[i].join();
            }

            for (int i = 0; i < averageMarksThread.length; i++) {
                averageMarksThread[i].start();
            }

            for (int i = 0; i < averageMarksThread.length; i++) {
                averageMarksThread[i].join();
            }

            System.out.println("Department-Wise Grade Count:");
            DepartmentGradeCountThread departmentGradeCountThread = new DepartmentGradeCountThread(students);

            departmentGradeCountThread.start();
            departmentGradeCountThread.join();

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }

        System.out.println("Result processing completed.");

    }
}