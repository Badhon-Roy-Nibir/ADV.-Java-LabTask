
public class DepartmentGradeCountThread extends Thread {
    private Student[] students;

    public DepartmentGradeCountThread(Student[] students) {
        this.students = students;
    }

    @Override
    public void run() {
        for (int i = 0; i < students.length; i++) {
            String deptName = students[i].getDepartment().toString();

            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (students[k].getDepartment().toString()
                        .equals(deptName)) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }
            int aPlus = 0, a = 0, bPlus = 0, b = 0;
            int cPlus = 0, c = 0, dPlus = 0, d = 0, f = 0;

            for (int j = 0; j < students.length; j++) {
                if (!students[j].getDepartment().toString().equals(deptName)) {
                    continue;
                }
                int[] marks = students[j].getMarks();

                if (marks == null || marks.length == 0) {
                    continue;
                }

                double total = 0;

                for (int mark : marks) {
                    total += mark;
                }

                double average = total / marks.length;

                if (average >= 90 && average <= 100) {
                    aPlus++;
                } else if (average >= 85) {
                    a++;
                } else if (average >= 80) {
                    bPlus++;
                } else if (average >= 75) {
                    b++;
                } else if (average >= 70) {
                    cPlus++;
                } else if (average >= 65) {
                    c++;
                } else if (average >= 60) {
                    dPlus++;
                } else if (average >= 50) {
                    d++;
                } else {
                    f++;
                }
            }



            System.out.println(deptName + ": A+=" + aPlus + ", A=" + a + ", B+=" +
                    bPlus + ", B=" + b + ", C+=" + cPlus + ", C=" + c + ", D+=" + dPlus + ", D=" + d + ", F=" + f);


        }
    }
}
