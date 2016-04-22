package com.company;

import java.util.Scanner;

/**
 * Created by Helen on 9/04/16.
 */
public class Pancake2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int testCases = Integer.parseInt(s.nextLine());

        for (int i = 0; i < testCases; i++){
            int flipCount = 0;
            String pancakes = s.nextLine();

            char bottomPancake = pancakes.charAt(pancakes.length()-1);
            char currentPancake = pancakes.charAt(0);
            for (int j = 0; j < pancakes.length(); j++){
                if (pancakes.charAt(j) != currentPancake){
                    flipCount++;
                    currentPancake = pancakes.charAt(j);
                }
            }
            if (bottomPancake == '-')
                flipCount++;


            int caseCount = i + 1;

            System.out.println("Case #" + caseCount + ": " + flipCount);


        }
    }
}
