package challenge3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {

    private static Random random = new Random();

    private record Person(String first) {

        public String last(String s) {
            return first + " " + s.substring(0, s.indexOf(" "));
        }
    }

    public static void main(String[] args) {

        String[] names = {"Tim", "Sim", "Jin", "Bob", "Samuel", "Victor"};

        Person tim = new Person("Tim");

        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
                String::toUpperCase,
                s -> s += " " + getRandomChar('D', 'M') + ".",
                s -> s += " " + reverse(s, 0, s.indexOf(" ")),
                Main::reverse,
                String::new,
                s -> new String(s),
                String::valueOf,
                tim::last
        ));


        changeNames(names, list);


    }

    private static void changeNames(String[] names, List<UnaryOperator<String>> functions) {
        List<String> backedByArray = Arrays.asList(names);
        for (var function : functions) {
            backedByArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }

    private static char getRandomChar(char start, char end) {
        return (char) random.nextInt((int) start, (int) end + 1);
    }

    private static String reverse(String s) {
        return reverse(s, 0, s.length());
    }

    private static String reverse(String s, int start, int end) {
        return new StringBuilder(s.substring(start, end)).reverse().toString();
    }
}
