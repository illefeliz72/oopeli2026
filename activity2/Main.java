package activity2;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                INITIAL STUDENT COUNT:
                """ + Student.getTotalStudents());

        Student s1 = new Student(2511101, "Eli Felize", "Cruz", "Herreria", "Female", "elifelize.herreria@lorma.edu");
        Student s2 = new Student(102394, "Bartholomew", "Jojo", "Simpson", "Male", "eat_my_shorts@springfield.edu");
        Student s3 = new Student(880012, "Justin", "Peter", "Griffin", "Male", "bird_is_the_word@pawtucket.com");

        System.out.println("""
                STUDENT COUNT AFTER CREATION
                """ +  Student.getTotalStudents()); 
        System.out.println("\nDisplaying Info for Student 1:");
        s1.displayStudentInfo();

        System.out.println("\nSchool Name : " + Course.getSchoolName());
        
        Course cs101 = new Course("CS101", "Introduction to Programming");
        cs101.enrollStudent(s1);
        cs101.enrollStudent(s2);
        cs101.enrollStudent(s3);

        cs101.displayCourseInfo();

    }
}
