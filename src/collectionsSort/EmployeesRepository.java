package collectionsSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesRepository {
    static List<Employee> generateListOfEmployee(){
        List<Employee> listOfEmployees = new ArrayList<>();

        listOfEmployees.add(new Employee("Mateusz", "Sarczak", 4500));
        listOfEmployees.add(new Employee("Marek", "Kowalski", 2800));
        listOfEmployees.add(new Employee("Kinga","Wrona",6000));
        listOfEmployees.add(new Employee("Krzysztof", "Sikorski", 8000));
        listOfEmployees.add(new Employee("Oskar", "Kowalski", 2800));
        listOfEmployees.add(new Employee("Katarzyna", "Wrona", 5600));

//       Collections.sort(listOfEmployees);
        listOfEmployees.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getSurname).thenComparing(Employee::getName));

        return listOfEmployees;
    }

    static int mediana(List<Employee> listOfEmployees){
        List<Integer> salaries = new ArrayList<>();

        for (Employee employee: listOfEmployees){
            salaries.add(employee.getSalary());
        }

        int middle = salaries.size() /2;
        int middleValue = 0;

        if (salaries.size() % 2 == 1){
            middleValue = salaries.get(middle);
        }
        else {
            middleValue = (salaries.get(middle - 1) + salaries.get(middle + 1)) /2;
        }
        return middleValue;
    }

    static List<Employee> filtrListBySalary(List<Employee> listOfEmployees, int moreThan){

        List<Employee> newListOfEmployees = listOfEmployees.stream().filter(employee -> employee.getSalary() >= moreThan).collect(Collectors.toList());

        return newListOfEmployees;
    }

    static void printListOfEmloyees(List<Employee> listOfEmployees){
        for (Employee e : listOfEmployees){
            System.out.println(e.toString());
        }
    }
}
