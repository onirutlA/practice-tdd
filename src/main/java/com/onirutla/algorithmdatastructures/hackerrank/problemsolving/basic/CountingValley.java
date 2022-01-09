package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

public class CountingValley {

    public static int countingValleys(int steps, String path) {
        int result = 0;
        int altitude = 0;
        if (steps >= 2 && steps <= 1000_000) {
            boolean isInValley = false;
            String[] temp = path.split(""); //O(n)
            for (String s : temp) { // O(n)
                if (s.equalsIgnoreCase("U")) {
                    altitude++;
                    if (altitude == 0 && isInValley) {
                        result++;
                        isInValley = false;
                    }
                }
                if (s.equalsIgnoreCase("D")) {
                    altitude--;
                    if (altitude < 0 && !isInValley) {
                        isInValley = true;
                    }
                }
            }
        } else {
            return 0;
        }
        return result;
    }

    /* time O(n + 6n) / O(n)
     *  space O(2 + n) / O(n)
     * */
    public static int countingValleysOptimized(int steps, String path) {
        int result = 0;
        int altitude = 0;

        String[] temp = path.split(""); // O(n)

        for (String s : temp) { // O(6n)
            if (s.equalsIgnoreCase("U")) {
                altitude++;
                if (altitude == 0) result++;
            }
            if (s.equalsIgnoreCase("D")) {
                altitude--;
            }
        }

        return result;
    }
}
