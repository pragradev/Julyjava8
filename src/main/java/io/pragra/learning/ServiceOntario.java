package io.pragra.learning;

import java.util.function.Predicate;

public class ServiceOntario {
    public void issueHC(Integer age, Predicate<Integer> test){
        if(test.test(age))
            System.out.println("issue HC");
        else
            System.out.println("dont issue HC");
    }

    public static boolean ckeckmethod(String str){
        return str.startsWith("H");
    }
}
