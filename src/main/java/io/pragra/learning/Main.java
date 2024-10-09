package io.pragra.learning;

import io.pragra.learning.service.StudentService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        StudentService service = new StudentService();
        service.fetchStudents();


//        StreamCode sc = new StreamCode();
//        sc.processTream();
//
        List<String> names = new ArrayList<>(Arrays.asList("Favour", "Favour", "Favour", "Vanshika", "Ayushi", "Meet", "Ashwini"));


        names.stream().filter(n -> n.length() > 111).findAny()
        Stream<String> nameStream = names.stream();
        List<Integer> processedData = names
                .stream()
                .filter(n -> n.length() >= 6)
                .sorted()
                .distinct()
                .map(n -> n.length())
                .collect(Collectors.toList());
//
//
//        List<Integer> grades = Arrays.asList(22,33,44,55,6,66,77,88,99,34,54,67,87,89);
//        Integer answer = grades.stream().filter(n -> n % 2 != 0).reduce(1, (a, b) -> a * b);
//        System.out.println(answer);
//
//        System.out.println(processedData);




        // EXECUTER FRAMEWORK
        // COMPLETABLE FUTURE



        /*
        * make a number list of Integers : add values from 11 to 99, and use stream to filter even numbers and print those
        *
        * Emp: fName, lName, salary, company, age (25-40)
        * make a list of employee objects:
        * (while adding employees: salaries: 75000,85000,65000,95000,100000; company name as apple, amazon,microsoft,meta,netflix)
        * use stream to get a list of emp firstNames, who has salary higher than 80000, and companyName starts with "A"
        * */




//        Utility utility = new Utility();
//        String checked = utility.check("H4616", ServiceOntario::ckeckmethod);
//        System.out.println(checked);





//        DriveTest dt = new DriveTest();
//        //ITest<String> test = n -> n.length()>4;
//        dt.issueDL("Shu", n -> n.length()>4);
//
//
//
//        ServiceOntario so = new ServiceOntario();
//        so.issueHC(30, a -> a>25);





        //ICalculator calculator = new CalculatorImpl();
        //ICalculator calculator = (a,b) -> a+b;

//        Utility utility = new Utility();
//        utility.calculate(2,3,(a,b) -> a+b+2-4-3-5+6);
//        utility.calculate(2,3,(a,b) -> a+b+2);
//        utility.calculate(2,3,(a,b) -> a+b+2-4-3);
//        utility.calculate(2,3,(a,b) -> a+b+2-4-3-5+6+888);



//        ICalculator calculator = new ICalculator() {
//            @Override
//            public void calculate(int c, int d) {
//                System.out.println("I am calculating");
//            }
//
//
//        };

//        ICalculator calculator2 = (c,d)-> c+d;
//        ICalculator calculator3 = (c,d)-> c-d;
//        ICalculator calculator4 = (c,d)-> c*d;
//        ICalculator calculator5 = (c,d)-> c+d+34;
//        ICalculator calculator6 = (c,d)-> c+d-34;
//        ICalculator calculator7 = (c,d)-> c+d;
//        ICalculator calculator8 = (c,d)-> c+d;



//        calculator2.calculate(3,4);



//        System.out.println("Hello world!");
//        CalculatorImpl calculator = new CalculatorImpl();
//        calculator.play();
//        Work work  = ( n,  r)-> System.out.println("Name "+ n +" is working for "+ r);
//
//        work.doWork("Harinder", 50);
//
//        Work fun = Main::haveFun;
//        fun.doWork("Ravneet", 100);
//    }
//
//    static void haveFun(String name, double funMoney){
//        System.out.println("Name "+ name +" is having fun with money  "+ funMoney);
//    }
    }
}