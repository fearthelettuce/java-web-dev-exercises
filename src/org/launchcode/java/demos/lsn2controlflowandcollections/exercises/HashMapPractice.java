package org.launchcode.java.demos.lsn2controlflowandcollections.exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<String, Integer> students =getStudents();
        for(Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " - " + student.getValue());
        }
    }

    public static HashMap<String, Integer> getStudents() {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> studentMap = new HashMap<>();
        String newStudent;

        do {
            System.out.println("Enter name:");
            newStudent = input.nextLine();
            if(!newStudent.equals("")) {
                System.out.println("ID:");
                Integer studentId = input.nextInt();
                studentMap.put(newStudent, studentId);
                input.nextLine();
            }
        } while (!newStudent.equals(""));
        return studentMap;
    }
}

//    It takes in student names and ID numbers (as integers) instead of names and grades.
//
//        The keys should be the IDs and the values should be the names.
//
//        Modify the roster printing code accordingly.