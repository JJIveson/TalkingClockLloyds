package lcc.helper;

import java.time.LocalTime;

public class ClockHelper {
    public String convertToHumanHour(LocalTime time) {
        int hour = time.getHour();
        hour = hour>12? getHourAfterTwelve(hour): hour;

        if(time.getHour()==23 && time.getMinute()>30) {
            hour = 0;
        } else {
            hour = time.getMinute() > 30? hour + 1: hour;
        }
        hour = hour > 12? hour - 12: hour;
        return switch (hour) {
            case 0 -> "midnight";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            case 10 -> "ten";
            case 11 -> "eleven";
            case 12 -> "twelve";
            default -> "unknown hour";
        };
    }

    public int getHourAfterTwelve (int hour) {
        return hour - 12;
    }

    public String convertToHumanMinute(LocalTime time) {
        int minute = time.getMinute();
        minute = minute>30? (30-(minute-30)): minute;
        return switch (minute) {
            case 0 -> "";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            case 10 -> "ten";
            case 11 -> "eleven";
            case 12 -> "twelve";
            case 13 -> "thirteen";
            case 14 -> "fourteen";
            case 15 -> "quarter";
            case 16 -> "sixteen";
            case 17 -> "seventeen";
            case 18 -> "eighteen";
            case 19 -> "nineteen";
            case 20 -> "twenty";
            case 21 -> "twenty-one";
            case 22 -> "twenty-two";
            case 23 -> "twenty-three";
            case 24 -> "twenty-four";
            case 25 -> "twenty-five";
            case 26 -> "twenty-six";
            case 27 -> "twenty-seven";
            case 28 -> "twenty-eight";
            case 29 -> "twenty-nine";
            case 30 -> "half";

            default -> "Unknown min";
        };
    }

    public String sentenceBuilder(LocalTime localTime) {
        StringBuilder sb = new StringBuilder();
        return sb.append(convertToHumanMinute(localTime))
                .append(" ")
                .append(getJoiningWord(localTime))
                .append(" ")
                .append(convertToHumanHour(localTime))
                .append(localTime.getMinute()==0?localTime.getHour()!=0?" o'clock":"":"").toString().trim();
    }

    public String getJoiningWord(LocalTime localTime) {
        if(localTime.getMinute()==0){
            return "";
        } else if(localTime.getMinute()<=30){
            return "past";
        } else {
            return "to";
        }
    }

    public String capitaliseFirstLetter(String allLowerCase) {
        return allLowerCase.substring(0,1).toUpperCase() + allLowerCase.substring(1).toLowerCase();
    }

    public String getHumanReadibleTime(LocalTime localTime) {
        return capitaliseFirstLetter(sentenceBuilder(localTime));
    }
}
