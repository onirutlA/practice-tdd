package com.onirutla.algorithmdatastructures.hackerrank.problemsolving.basic;

import java.util.HashMap;
import java.util.List;

public class MinimumDistances {
    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int minDistance = a.size();
        for (int i = 0, j = a.size() - 1; i < a.size(); i++) {
            int leftKey = a.get(i);
            if (map.containsKey(leftKey)) {
                int prevIndex = map.get(leftKey);
                int distance = Math.abs(prevIndex - i);
                map.put(leftKey, distance);
                minDistance = Math.min(distance, minDistance);
            }
            map.put(leftKey, i);
        }
        return minDistance == a.size() ? -1 : minDistance;
    }


    /*public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }*/
}
