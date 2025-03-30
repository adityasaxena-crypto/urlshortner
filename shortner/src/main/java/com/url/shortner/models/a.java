package com.url.shortner.models;

import java.util.ArrayList;
import java.util.Arrays;

public class a {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 7,8,9));
        int start = result.get(0);

        for (int i = 1; i < result.size(); i++) {
            // Check if the current number is not consecutive
            if (result.get(i) != result.get(i - 1) + 1) {
                appendRange(sb, start, result.get(i - 1));
                start = result.get(i); // Start a new range
            }
        }
        // Append the last range or number
        appendRange(sb, start, result.get(result.size() - 1));

        System.out.println(sb.toString());
    }

    private static void appendRange(StringBuilder sb, int start, int end) {
        if (sb.length() > 0) {
            sb.append(",");
        }
        if (start == end) {
            sb.append(start); // Single number
        } else {
            sb.append(start).append("-").append(end); // Range
        }
    }
}
