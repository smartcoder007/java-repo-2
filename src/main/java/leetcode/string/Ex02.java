package leetcode.string;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

//Java Program to Sort a String
public class Ex02 {
    public static void main(String[] args) {
     List<String> names =  Stream.of("siva", "antony", "krishna").collect(Collectors.toList());
        names =names.stream().sorted().collect(Collectors.toList());
        names =names.stream().sorted( (o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(names);


    }

}
