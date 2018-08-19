package java8.features.streams;

import java.util.*;

public class StreamsImplementation {


    public static  void main(String[] args) {
//Finding the first letter 'S' in the List of String Using Java 8  Lamda features
        List<String> list = new LinkedList<>();
        list.add("Premananth");
        list.add("Mute");
        list.add("Mona");
        list.add("Srivathsan");
        list.add("Sriram");

       Optional<String> s = list.stream()
               .filter(x->x.startsWith("S")).findFirst();
        System.out.printf("String Found is :::" + s);
    }
}
