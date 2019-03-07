package edu.dmacc.codedsm.hw9;

import java.util.ArrayList;
import java.util.Random;


public class HomeworkNine {

    public static void main(String[] args) {
        ArrayList<Integer> integers = generateIntegers(20);
        for (int i : integers) {
            System.out.println("i = " + i);
            if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else if(i %3 == 0 && i % 5 == 0){
                System.out.println("Fizzbuzz");
            }
            else{
                System.out.println(i+ " is not fizzy");
            }
        }
    }

    public static ArrayList<Integer> generateIntegers(int size) {
        ArrayList<Integer> xs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            xs.add(Math.abs(random.nextInt(Integer.MAX_VALUE - 1) + 1));
        }
        return xs;
    }
}

