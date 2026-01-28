package activity2;

public class Student {
    int studentId;
    String firstName;
    String middleName;
    String lastName;
    String gender;
    String email;

    static int totalStudents;

    public Student() {
    }

    public Student(int studentId, String firstName, String middleName, String lastName, String gender, String email) {
        Student.totalStudents = 0;
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

    }

    public void displayStudentInfo() {
        System.out.printf("""
                Student ID: %s
                Name:       %s %s %s
                Gender:     %s
                Email:      %s
                """, studentId, firstName, middleName, lastName, gender, email);
    }
     public static int getTotalStudents(){
        return totalStudents;
    }
}

   
