package treeSet;

import java.util.Set;
import java.util.TreeSet;

public class Drzewko {
    final static String SEP = "________________";
    public static void main(String[] args) {
        TreeSet<String> setOfStrings = new TreeSet<>();

        setOfStrings.add("Kasia");
        setOfStrings.add("Ola");
        setOfStrings.add("Basia");
        setOfStrings.add("Zosia");
        setOfStrings.add("Paweł");

        printSet(setOfStrings);

        System.out.println(SEP);

        System.out.println("Pierwszy element: " + (setOfStrings).first());
        System.out.println("Ostatni element: " + (setOfStrings).last());
        (setOfStrings).pollLast();
        System.out.println("Element został usunięty!");
        System.out.println("Rozmiar:" + setOfStrings.size());

        System.out.println(SEP);

        printSet(setOfStrings);
    }

    private static void printSet(Set<String> setOfStrings){
        for (String name: setOfStrings){
            System.out.println(name);
        }
    }
}
