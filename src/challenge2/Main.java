package challenge2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Tim", "Sim", "Jin", "Bob", "Samuel", "Victor"));
        System.out.println(names);

        names.replaceAll(s -> (s.toUpperCase()));
        System.out.println(names);
        List<String> backedArray = new ArrayList<>(names);

        names.replaceAll(s -> s + " " + (char) ('A' + (int) (Math.random() * 26)) + ".");
        System.out.println(names);


        backedArray.replaceAll(s -> s + " " + new StringBuilder(s).reverse());
        backedArray.forEach(s -> System.out.println(s));


        List<String> newNames = new ArrayList<>(names);
        newNames.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ") + 1)));
        System.out.println(newNames);
    }

}
