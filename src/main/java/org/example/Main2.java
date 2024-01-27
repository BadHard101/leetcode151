package org.example;

import java.util.Arrays;

public class Main2 {
    public static String reverseWords(String s) {
        String[] words = s.strip().split("\\s+");

        System.out.println(Arrays.toString(words));

        StringBuilder ans = new StringBuilder();
        for (int i = words.length-1; i > 0; i--) {
            String word = words[i];
            if (!word.isEmpty())
                ans.append(word).append(" ");
        }
        ans.append(words[0]);

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(
                reverseWords("  hello world  ")
        );
    }
}