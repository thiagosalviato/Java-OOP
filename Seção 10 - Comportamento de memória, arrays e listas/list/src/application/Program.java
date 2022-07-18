package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Thiago");
        list.add("Leticia");
        list.add("Thais");
        list.add("Josiel");
        list.add("Bruno");
        list.add(2,"Gabriel");

        for (String x : list){
            System.out.println(x);
        }

        System.out.println(" ");
        list.remove("Thais");
        list.remove(2);
        // remove if initial letter is T //
        list.removeIf(x -> x.charAt(0) == 'T');


        for (String x : list){
            System.out.println(x);
        }
        System.out.println(" ");

        System.out.println("Index of Bruno = " + list.indexOf("Bruno"));
        System.out.println(" ");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
        for (String x: result){
            System.out.println(x);
        }
        System.out.println(" ");

        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
        for (String x: result) {
            System.out.println(x);
        }
    }
}
