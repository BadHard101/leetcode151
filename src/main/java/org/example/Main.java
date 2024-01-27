package org.example;

import java.util.Arrays;

public class Main {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");

        System.out.println(Arrays.toString(words));

        StringBuilder ans = new StringBuilder();
        for (int i = words.length-1; i >= 0; i--) {
            String word = words[i];
            if (!word.isEmpty())
                ans.append(word).append(" ");
        }
        ans.deleteCharAt(ans.length()-1);

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(
                reverseWords("  hello world  ")
        );
    }
}