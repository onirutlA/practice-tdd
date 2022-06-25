package com.onirutla.algorithmdatastructures.algorithm;

public class ReverseString {
    public static String reverseString(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char temp;
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(ch);
    }

    public static String reverseString2(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            ch[start] ^= ch[end];
            ch[end] ^= ch[start];
            ch[start] ^= ch[end];
            start++;
            end--;
        }
        return String.valueOf(ch);
    }

    public static String reverseString3(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < s.length() && i < j; i++, j--) {
            char temp;
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        return String.valueOf(ch);
    }

    public static String reverseString4(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < s.length() && i < j; i++, j--) {
            ch[i] ^= ch[j];
            ch[j] ^= ch[i];
            ch[i] ^= ch[j];
        }
        return String.valueOf(ch);
    }
}
