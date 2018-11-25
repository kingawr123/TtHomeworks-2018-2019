package listOfStudents;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        StudentsRepo studentsRepo = new StudentsRepo();
        try {
            studentsRepo.addStudent(new Student("Asia","Wrona",4));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printListOfStudents(studentsRepo.list);
    }
    private static void printListOfStudents(List<Student> list){
        for (int i = 0; i<list.size(); i++){
            printStudent(list.get(i));
        }
    }
    private static void printStudent(Student student){
        System.out.println(student.number +". "+student.secondName +" "+student.firstName);
    }
}
