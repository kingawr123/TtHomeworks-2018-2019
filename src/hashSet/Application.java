package hashSet;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class Application  {
    public static Scanner scanner = new Scanner(System.in);
    public static HashSet<Person> setOfPersons = new HashSet<>();

    public static void main(String[] args) {

        int number;

        do {
            System.out.println("1 - dodaj osobę || 2 - usuń osobę || 3 - pokaż szczegóły || 4 - edytuj dane || 5 - zapisz set do pliku 6 - wyjście");
            number = getNumber();

            switch (number){
                case 1:
                    addPerson();
                    break;
                case 2:
                    deletePerson();
                    break;
                case 3:
                    personsDetails();
                    break;
                case 4:
                    editePerson();
                    break;
                case 5:
                    try {
                        saveToFile("hashSet.txt");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
        while(number != 6);

        try {
            saveToFile("hashSet.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void addPerson(){
        System.out.println("Podaj imię:");
        String name = scanner.next();
        System.out.println("Podaj nazwisko:");
        String secondName = scanner.next();
        Person person = new Person(name, secondName);

        if (!comparePersons(person)){
            setOfPersons.add(person);
            System.out.println("Człowiek został dodany.");
            System.out.println(person.getId());
        }
        else
            System.out.println("Taka osoba już istnieje!");
    }

    private static void deletePerson(){
        if (!setOfPersons.isEmpty()){
            System.out.println("Podaj id osoby, którą chcesz usunąć.");
            String id = scanner.next();
            setOfPersons.remove(findPersonById(id));
        }
        else
            System.out.println("Set jest pusty!");
    }

    private static void personsDetails(){
        if (!setOfPersons.isEmpty()){
            System.out.println("Podaj id osoby, której chcesz szczegóły.");
            String id = scanner.next();
            Person person = findPersonById(id);
            System.out.println("Imię: "+person.getName()+", Nazwisko: "+person.getSecondName());
        }
        else
            System.out.println("Set jest pusty!");
    }

    private static void editePerson(){
        if (!setOfPersons.isEmpty()){
            System.out.println("Podaj id osoby, którą chcesz zedytować.");
            String id = scanner.next();
            Person person = findPersonById(id);

            System.out.println("Podaj nowe imię:");
            person.setName(scanner.next());
            System.out.println("Podaj nowe nazwisko:");
            person.setSecondName(scanner.next());

            System.out.println("Dane zostały zmienione!");
        }
        else
            System.out.println("Set jest pusty!");
    }

    private static void saveToFile(String path) throws Exception{
        PrintWriter printWriter = null;
        try{
            printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));

            int index = 1;
            for (Person p: setOfPersons){
                printWriter.println(index+". " + p.getName()+" "+p.getSecondName()+", "+p.getId());
                index++;
            }
        } finally {
            printWriter.close();
        }

    }

    private static boolean comparePersons(Person person){
        for (Person p: setOfPersons){
            if (person.getId().equals(p.getId()) && person.getName().equals(p.getName()) && person.getSecondName().equals(p.getSecondName()))
                return true;
        }
        return false;
    }

    private static Person findPersonById(String id){
        for (Person p: setOfPersons){
            if (p.getId().equals(id))
                return p;
        }
        System.out.println("Nie znaleziono osoby o takim id.");
        return null;
    }

    private static void printSet(){
        int index = 1;
        for (Person p: setOfPersons){
            System.out.println(index +". Imię: "+ p.getName()+", Nazwisko: "+p.getSecondName()+", ID: "+p.getId());
            index++;
        }
    }

    private static int getNumber(){
        return scanner.nextInt();
    }
}
