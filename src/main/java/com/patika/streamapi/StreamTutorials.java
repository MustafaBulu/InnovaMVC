package com.patika.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTutorials {


    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("kayseri");
        list.add("istanbul");
        list.add("ankara");
        List<String> list2=list.stream().sorted().collect(Collectors.toList());
        list2.forEach(System.out::println);

        List<String> list3=list.stream().sorted().collect(Collectors.toList());
        list2.forEach(System.out::println);

        list.stream().filter( patika ->!"kayseri".equals(patika)).collect(Collectors.toList());

        System.out.println("++++++++++++++++++++++++++++");
        List<String> list5= Arrays.asList("kayseri","istanbul","ankara");

    }
}
