package com.tp2.stringcalculator;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;

        String[] parts = numbers.split("[,\n]");
        int sum = 0;
        for (String part : parts) {
            int n = Integer.parseInt(part.trim());
            if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed: " + n);
            sum += n;
        }
        return sum;
    }
}
