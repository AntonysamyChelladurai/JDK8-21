package com.jbeans;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println("########################################################################");
        //String Filter only Alpha numeric
        String rawdata="34948i&^@*7a7YE7T63T232U3Y9I23J2KNK2JWN@*9482knkmqneYQ@(";
        String alphnum= rawdata.replaceAll("[^ a-zA-Z0-9]","");
        System.out.println("\n Alpha Numeric :: "+ alphnum);
        System.out.println("########################################################################");
        //String Reverse
        String reversmsg="Hello and welcome!";
        StringBuilder sb=new StringBuilder(reversmsg);
        Stream.of(sb.reverse()).forEach(System.out::println);
        System.out.println("########################################################################");
        //String Repeated charecter
        String msg="Hello and welcome!";
        Map<Character, Long> charmap=msg.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("String Repeated charecter");
        charmap.entrySet().forEach(System.out::println);

        System.out.println("########################################################################");

        Employee emp1 = new Employee("Antony",10000,"CS");
        Employee emp2 = new Employee("Aravid",20000,"CS");
        Employee emp3 = new Employee("Muthu",10500,"HR");
        Employee emp4 = new Employee("Siva",30000,"devops");
        Employee emp5 = new Employee("Raja",20000,"Dev");

        List<Employee> emplist=new ArrayList<>();
        emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp3);
        emplist.add(emp4);
        emplist.add(emp5);
        Optional<Employee> salary=emplist.stream().sorted(Comparator.comparing(Employee::getSalary)).toList().reversed().stream().findFirst();
        System.out.println("Top salary :: "+salary.get().salary);
        System.out.println("########################################################################");

        String input = "Hello world this is a test. This test is only a test.";
       // StringBuilder sb =new StringBuilder(input);
       String[] strarr=input.split(" ");
        Stream.of(strarr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().forEach(System.out::println);

        StrigManupulation sm=new StrigManupulation();
        int low=sm.lengthOfLastWord("Hello and welcome!");
        System.out.println("LengthOfLastWord :: "+low);
    }
}