package interview.question.Array;


import streams.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionExample {
    public static void main(String[] args) {
        //Employee e;
        /*String[] s= {"java","techie","Springboot","microservices"};
       String ss= Arrays.stream(s).reduce((st1,st2)->st1.length()>st2.length()?st1:st2).get();
        System.out.println(ss);*/
        List<Person> collect = Stream.of(
                new Person(1, "xx", Arrays.asList("a.gmail.com", "b.gmail.com", "c.gmail.com")),
                new Person(2, "xx", Arrays.asList("ad.gmail.com", "e.gmail.com", "f.gmail.com")),
                new Person(3, "xx", Arrays.asList("g.gmail.com", "h.gmail.com", "i.gmail.com"))
        ).collect(Collectors.toList());
       /* collect.stream().map(p->p.getEmail()).forEach(list-> {
            list.stream().forEach(System.out::println);
        });*/
        collect.stream().flatMap(person -> person.getEmail().stream()).forEach(System.out::println);
    }
}
