package com.epam.utils;

import java.util.Objects;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (!org.apache.commons.lang3.StringUtils.isBlank(str) && !str.equals("null")) {
            double num = Double.parseDouble(str);
            return num > 0;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPositiveNumber("-11.22"));
    }
}
