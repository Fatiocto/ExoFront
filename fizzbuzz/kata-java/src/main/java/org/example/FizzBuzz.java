package org.example;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String execute(int nombre) {

        String result = "";

        for (int i = 1; i <= nombre; i++) {
            if (isMultipleOf3(i) && isMultipleOf5(i)) {
                result += FIZZ + BUZZ;
            } else if (isMultipleOf3(i)) {
                result += FIZZ;
            } else if (isMultipleOf5(i)) {
                result += BUZZ;
            } else {
                result += String.valueOf(i);
            }

            if (isNotLastNumber(nombre, i)) {
                result += " ";
            }
        }

        return result;
    }

    private boolean isMultipleOf3(int i) {
        return i % 3 == 0;
    }

    private boolean isMultipleOf5(int i) {
        return i % 5 == 0;
    }

    private boolean isNotLastNumber(int lastNumber, int i) {
        return i != lastNumber;
    }
}
