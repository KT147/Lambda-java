package challenge;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

//        Consumer<String> printWordsLambda = sentence -> {
//            String [] parts = sentence.split(" ");
//            for(String part: parts) {
//                System.out.println(part);
//            }
//        };
//
//        printWordsLambda.accept("Lets split this up");
//
//        Consumer<String> printWordsForEach = sentence -> {
//            String [] parts = sentence.split(" ");
//            Arrays.asList(parts).forEach(s -> System.out.println(s));
//        };
//
//        printWordsForEach.accept("Lets split this up");
//
//        Consumer<String> printWordsConcise = sentence -> {
//            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
//        };
//
//        printWordsConcise.accept("Lets split this up");

        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        };



        System.out.println(everySecondChar.apply("1234567890"));
        System.out.println(everySecondCharacter(everySecondChar, "1234567890"));

        Supplier<String> iLoveJava = () -> "I love Java";
        var supplierResult = iLoveJava.get();
        System.out.println(supplierResult);


    }

    public static String everySecondCharacter (Function < String, String > func, String source){

        return func.apply(source);
    }


//    public static String everySecondChar(String source) {
//        StringBuilder returnVal = new StringBuilder();
//        for (int i = 0; i < source.length(); i++) {
//            if (i % 2 == 1) {
//                returnVal.append(source.charAt(1));
//            }
//        }
//
//        return returnVal.toString();
//    }

}
