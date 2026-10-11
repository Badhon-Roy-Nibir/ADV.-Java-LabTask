public class Student {
    private int id;
    private String name;
    private Department department;
    private int marks[];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public Student(int id, String name, Department department, int... marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }
    public void showInfo(){
        System.out.print(this.getId()+", "+this.getName()+", "+this.getDepartment()+", [");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]);
            if (i < marks.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
