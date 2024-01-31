package rvt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println(MainProgram.indexOfSmallest(numbers));

        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));

        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));



    }

}
