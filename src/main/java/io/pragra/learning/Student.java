package io.pragra.learning;

import lombok.*;

import java.util.List;
@Data
@Builder
public class Student {
    private final String firstName;
    private final String lastName;
    private final List<String> phoneNumbers;

}
