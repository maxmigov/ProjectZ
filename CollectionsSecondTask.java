package com.study;

import java.util.ArrayList;
import java.util.Collections;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Double> temps = new ArrayList<Double>();
        int i = 0;
        while (i < 31){
            double randTemp = Math.round(((Math.random() * -50) + 25) * 10.0) / 10.0;
            temps.add(randTemp);
            i++;
        }
        ArrayList<String> days = new ArrayList<String>();
            days.add("mo");
            days.add("tu");
            days.add("we");
            days.add("th");
            days.add("fr");
            days.add("sa");
            days.add("su");

        System.out.print("  ");
        for (int k = 0; k < days.size(); k++){
            System.out.print(String.format("%5.2s  ", days.get(k)));
        }
        System.out.println();
        System.out.print("1. ");
        for (int m = 0; m < 7; m++){
            System.out.print(String.format("%5.1f  ",temps.get(m)));
        }
        System.out.println();
        System.out.print("2. ");
        for (int n = 7; n < 14; n++){
            System.out.print(String.format("%5.1f  ",temps.get(n)));
        }
        System.out.println();
        System.out.print("3. ");
        for (int o = 14; o < 21; o++){
            System.out.print(String.format("%5.1f  ",temps.get(o)));
        }
        System.out.println();
        System.out.print("4. ");
        for (int p = 21; p < 28; p++){
            System.out.print(String.format("%5.1f  ",temps.get(p)));
        }
        System.out.println();
        System.out.print("5. ");
        for (int q = 28; q < 31; q++){
            System.out.print(String.format("%5.1f  ",temps.get(q)));
        }
        System.out.println();
        System.out.println();

        double min = Collections.min(temps);
        System.out.println("Lowest month temperature: " + min);
        double max = Collections.max(temps);
        System.out.println("Highest month temperature: " + max);
        double averageTemp = 0;
        for (int r = 0; r < temps.size(); r++) {
            averageTemp += temps.get(r);
        }
        averageTemp /= 31;
        double roundAverageTemp = Math.round(averageTemp * 10.0)/10.0;
        System.out.println("Average month temperature: " + roundAverageTemp);
    }
}
