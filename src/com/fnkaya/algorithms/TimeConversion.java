package com.fnkaya.algorithms;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
    }

    // 12:00 am - 11:59 am => 00:00 - 11:59
    // 12:00 pm - 11:59 pm => 12:00 - 23:59

    public static String timeConversion(String s) {
        String pmam = s.substring(s.length() - 2, s.length());
        String t12 = s.replace(pmam, "");
        String[] hhmmss = t12.split(":");

        if (pmam.equals("PM") && !hhmmss[0].equals("12"))
            hhmmss[0] = String.valueOf(Integer.parseInt(hhmmss[0]) + 12);
        if (pmam.equals("AM") && hhmmss[0].equals("12"))
            hhmmss[0] = "00";

        return hhmmss[0] + ":" + hhmmss[1] + ":" + hhmmss[2];
    }
}
