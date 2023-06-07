package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str.isEmpty() || str.equals("null")) {
            return false;
        } else {
            return Double.parseDouble(str) > 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.isPositiveNumber("null"));
    }
}
