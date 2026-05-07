package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int[] data = {10, 45, 2, 33, 45, 30};
        int result = Exercise.calculate(data);
        
        System.out.println("Друге за величиною число у масиві: " + result);
    }
}
