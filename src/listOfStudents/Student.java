package listOfStudents;

public class Student {
    String firstName;
    String secondName;
    int number;

    Student(String dane){
        this.firstName = dane.split(" ")[0];
        this.secondName = dane.split(" ")[1];
        this.number = Integer.parseInt(dane.split(" ")[2].trim());
    }
    Student(String firstName, String secondName, int number){
        this.firstName = firstName;
        this.secondName = secondName;
        this.number = number;
    }
}
