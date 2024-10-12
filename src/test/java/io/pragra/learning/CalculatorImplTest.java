package io.pragra.learning;


import io.pragra.learning.exception.AgeNotMatchException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;

public class CalculatorImplTest {

    CalculatorImpl calculator;


    private PrimeRate primeRate;



    @Before
    public void setup(){
        primeRate = Mockito.mock(PrimeRate.class);
        //prepare data to insert in constructor
        calculator = new CalculatorImpl();
        calculator.setPrime(primeRate);
    }

    @Test
    public void calculateTest(){

        Mockito.when(primeRate.getPrimeRate()).thenReturn(5);
        //Assert.assertEquals(2,calculator.calculate(1,1));
        Assert.assertTrue( calculator.calculate(1,1) >= 7 );
        Mockito.verify( primeRate).saveResult(7);

    }

    @Test
    public void checkEvenTest(){
        Assert.assertEquals(true, calculator.checkEven(4));
        Assert.assertEquals(false, calculator.checkEven(5));
        Assert.assertTrue(calculator.checkEven(4));
    }
//    @Test(expected = ArithmeticException.class)
//    public void calculateExceptionTest(){
//        calculator.calculate(22,1);
//    }

//    @Test(expected = AgeNotMatchException.class)
//    public void calculateAgeExceptionTest(){
//        calculator.calculate(15,11);
//    }

}
