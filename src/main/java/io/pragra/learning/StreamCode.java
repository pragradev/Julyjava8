package io.pragra.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class StreamCode {

    public void processTream(){
        AtomicReference<Integer> counter = new AtomicReference<>(0);
        List<Student> students = new ArrayList<>(Arrays.asList(
                Student.builder().firstName("Vanshika").lastName("S").phoneNumbers(Arrays.asList("1112223344","2223334455","3334445566")).build(),
                Student.builder().firstName("Favour").lastName("O").phoneNumbers(Arrays.asList("4433443344","7766554433","2233445566")).build(),
                Student.builder().firstName("Ayushi").lastName("K").phoneNumbers(Arrays.asList("4433443344","7766554433","2233445566")).build(),
                Student.builder().firstName("Ashwini").lastName("H").phoneNumbers(Arrays.asList("8877665544","1144556677","9988665544")).build(),
                Student.builder().firstName("Ravneet").lastName("K").phoneNumbers(Arrays.asList("3377227722","3377337733","4488448844")).build()
        ));

        List<String> phoneNumbers = students.stream()
                .flatMap(s -> s.getPhoneNumbers().stream())
                .map(p -> {
                    counter.getAndSet(counter.get() + 1);
                    return  p;
                })
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);
    }
}
