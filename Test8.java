package com.study;

import java.util.ArrayList;
import java.util.Collections;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<String> devs = new ArrayList();
            devs.add("Johny");
            devs.add("Valerya");
            devs.add("Tatyana");
            devs.add("Peter");
            devs.add("Marry");
        String firstNameChar = devs.get(0);
        System.out.println("\"" + firstNameChar.charAt(0) + ".\"");
        String secondNameChar = devs.get(1);
        System.out.println("\"" + secondNameChar.charAt(0) + ".\"");
        String thirdNameChar = devs.get(2);
        System.out.println("\"" + thirdNameChar.charAt(0) + ".\"");
        String fourthNameChar = devs.get(3);
        System.out.println("\"" + fourthNameChar.charAt(0) + ".\"");
        String fifthNameChar = devs.get(4);
        System.out.println("\"" + fifthNameChar.charAt(0) + ".\"");

        String maxString = new String();
        String maxSecondString = new String();
        int maxNumber = 0;
        int maxSecondNumber = 0;
        for (int i = 0; i < devs.size(); i++){
            if (devs.get(i).length() > maxNumber){
                maxNumber = devs.get(i).length();
                maxString = devs.get(i);
            }
            else if (maxNumber == devs.get(i).length()){
                maxSecondNumber = devs.get(i).length();
                maxSecondString = devs.get(i);
            }
        }
        System.out.println();
        System.out.println("Longest name length: " + maxNumber);
        System.out.println("Longest name: " + maxString);
        System.out.println();
        if (maxSecondNumber != 0) {
            System.out.println("Longest second name length: " + maxSecondNumber);
            System.out.println("Longest second name: " + maxSecondString);
        }
        System.out.println();
        Collections.swap(devs, 0, 4);
        System.out.println("Names after swapping: ");
        for (int i = 0; i < devs.size(); i++){
            System.out.println(devs.get(i));
        }
    }
}
