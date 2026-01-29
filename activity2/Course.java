package activity2;

public class Course {
    String courseCode;
    String courseTitle;
    Student[] enrolledStudents;
    int enrollmentCount = 0;
    static String schoolName = "My University";

    public Course() {
    }

    public Course(String courseCode, String courseTitle) {
        this.enrolledStudents = new Student[50];
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }

    public void enrollStudent(Student student) {
        if (enrollmentCount < enrolledStudents.length) {
            enrolledStudents[enrollmentCount] = student;
            enrollmentCount++;
        }
    }

    public void displayCourseInfo() {
        System.out.printf("""
                School: %s
                Course:  %s %s
                """,schoolName,courseCode,courseTitle);
        System.out.println("Enrolled Students: ");
        for(int i = 0; i < enrollmentCount; i++){
            System.out.println("- Student " + (i + 1));
            enrolledStudents[i].displayStudentInfo();
        }

    }
    public static String getSchoolName(){
        return schoolName;
    }
}
