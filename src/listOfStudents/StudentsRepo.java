package listOfStudents;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsRepo {

    StudentsRepo() throws FileNotFoundException {
        takeStudentsFromFile();
    }

    public static List<Student> list = new ArrayList<>();

    public void takeStudentsFromFile() throws FileNotFoundException {
        File file = new File("studentsList.txt");
        Scanner scanner = new Scanner(new FileInputStream(file));
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            list.add(new Student(line));
        }
    }
    public static void addStudent(Student student) throws FileNotFoundException {
        list.add(student);
        saveInFile();
    }
    private static void saveInFile() throws FileNotFoundException{
        PrintWriter printWriter = new PrintWriter(new File("studentsList.txt"));
        for (Student student: list){
            printWriter.println(student.firstName+" "+student.secondName+" "+student.number);
        }
        printWriter.close();
    }
}
