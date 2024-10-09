package io.pragra.learning;

import java.util.function.Predicate;

public class Utility {

    public void calculate(int a, int b, ICalculator calculator){
        int x = calculator.calculate(a,b);
        System.out.println(x);
    }

    public String check(String str,Predicate<String> predicate){
        if(predicate.test(str)){
            return str;
        }
        else {
            return null;
        }
    }
}
