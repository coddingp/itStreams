package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Integer[] ints = new Integer[]{15, 2, 5, 6};
        Stream.of(ints).forEach(x -> System.out.println(x * x + ", "));

        //Here we go through String Array and changing letters
        String[] words = new String[]{"sdfcwscf", "afasdf", "asergfaerfg", "afaf" };
        Stream.of(words).forEach(x -> System.out.println(x.replace("a", "o")));


        Stream.of(ints).forEach(x -> System.out.println(x * 0.10 + ", "));

        Stream.of(words).forEach(x -> System.out.println(x.replace(x, x + x)));

        List<Student> students = new ArrayList<>();

        students.add(new Student(123, "Bob"));
        students.add(new Student(13, "Boby"));
        students.add(new Student(1, "Bobik"));
        students.add(new Student(23, "Bobr"));
        students.add(new Student(3, "Bomb"));

        students.stream().forEach(x -> System.out.println(x.getFullName()));

        List<String> studentsFullNames = students.stream().map(x -> x.getFullName()).collect(Collectors.toList()) ;
        System.out.println(studentsFullNames);

    }


}
