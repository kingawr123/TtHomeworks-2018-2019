package collectionsSort;

import java.util.List;

import static collectionsSort.EmployeesRepository.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> listOfEmployee = generateListOfEmployee();
        printListOfEmloyees(listOfEmployee);

        System.out.println("____________");

        System.out.println(mediana(listOfEmployee));

        System.out.println("____________");

        printListOfEmloyees(filtrListBySalary(listOfEmployee, 4000));

    }
}
