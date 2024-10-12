package io.pragra.learning;

public class PrimeRate {
    public Integer getPrimeRate(){
        Integer rate = (int) Math.random()*10+5;
        return rate;
    }

    public void saveResult(int result){
        // saving resilt
        System.out.println("saving result");
    }
}
