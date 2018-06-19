package com.vpb.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise6 {
    public static void main(String[] args) {
        String string = "Saturday, 26 November 27$ | Marina Sand Bay, Singapore";
        String regexA = "^[A-Z]\\w+";

        Pattern patternA = Pattern.compile(regexA, Pattern.MULTILINE);
        Matcher matcherA = patternA.matcher(string);
        while (matcherA.find()) {
            System.out.println("String a = " + matcherA.group(0));
        }
        String regexB = "\\d+\\s\\w+\\s\\d+\\$";

        Pattern patternB = Pattern.compile(regexB, Pattern.MULTILINE);
        Matcher matcherB = patternB.matcher(string);
        while (matcherB.find()) {
            System.out.println("String b = " + matcherB.group(0));
        }
        String regexC = "[A-Za-z]+\\s[A-Za-z]+\\s[A-Za-z]+";

        Pattern patternC = Pattern.compile(regexC, Pattern.MULTILINE);
        Matcher matcherC = patternC.matcher(string);
        while (matcherC.find()) {
            System.out.println("String c = " + matcherC.group(0));
        }
        String regexD = "[A-Za-z]+$";

        Pattern patternD = Pattern.compile(regexD, Pattern.MULTILINE);
        Matcher matcherD = patternD.matcher(string);
        while (matcherD.find()) {
            System.out.println("String d = " + matcherD.group(0));
        }

        }
}
