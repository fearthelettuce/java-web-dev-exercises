package org.launchcode.java.demos.lsn3classes1;
import java.util.ArrayList;
public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student brad = new Student("Brad", 1, 1, 4.0);
        System.out.println(brad.getGpa());
    }

    public class Course{
        private String courseName;
        private Teacher courseTeacher;
        private ArrayList<Student> students;

    }

    public class Teacher {
        private String firstName;
        private String lastName;
        private String Subject;
        private int yearsTeachinng;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setSubject(String subject) {
            Subject = subject;
        }

        public void setYearsTeachinng(int yearsTeachinng) {
            this.yearsTeachinng = yearsTeachinng;
        }

        public String getName(){
            return firstName + " " + lastName;
        }
    }
}
