package io.pragra.learning;

import java.util.function.Predicate;

public class DriveTest {
    public void issueDL(String name, Predicate<String> test){
        if(test.test(name)){
            System.out.println("Issue DL");
        } else {
            System.out.println("don't issue DL");
        }
    }
}
