package io.pragra.learning;

import io.pragra.learning.exception.AgeNotMatchException;

public class CalculatorImpl implements ICalculator{


    PrimeRate prime;

    public void setPrime(PrimeRate prime) {
        this.prime = prime;
    }

    @Override
    public int calculate(int x, int y) {
        // Data retrieved from third party (Prime rate)

        Integer rate = prime.getPrimeRate();
        if(x<0){
            throw new AgeNotMatchException(x + " is less then 16");
        }
        int result = x+y+rate;
        // persist it in database
        // hibernate.save(result);
        prime.saveResult(result);
        return result;
    }

    public boolean checkEven(int x){
        return x%2 == 0;
    }


}
