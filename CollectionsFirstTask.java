package com.study;

import java.util.ArrayList;
import java.util.Random;

public class CollectionsFirstTask {
    public static void main(String[] args) {
        Integer thisyear = new Integer(2020);
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            randomList.add(getRandomNumberInRange(1900, 2019)); //adding random years
        }

        System.out.println("Random year list: ");

        for (int i = 0; i < randomList.size(); i++) {
            System.out.println(randomList.get(i));  //show random list
        }

        System.out.println("People younger than 50: ");

        for (int i = 0; i < randomList.size(); i++) {
            if (thisyear - randomList.get(i) < 50) // showing people younger than 50
                System.out.println(randomList.get(i));
        }

        ArrayList<Integer> young_dates = new ArrayList<Integer>();

        for ( int i = 0; i < randomList.size(); i++ ) {
            if (thisyear - randomList.get(i) <= 30) // adding into young_dates those younger than 30
                young_dates.add(randomList.get(i));
        }

        System.out.println("People younger than 30 put into young_dates");

        for (int i = 0; i < young_dates.size(); i++ ){
            System.out.println(young_dates.get(i)); // showing people younger than 30
        }



        System.out.println("People younger than 30: while loop...");

       /* int z = 0;
            while (z < young_dates.size()) {
                for (int y = 0; y < young_dates.size(); y++) {
                    young_dates.remove(0);
                }
                System.out.println(young_dates.get(z));
                z++;

            }

        */



    }



    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
