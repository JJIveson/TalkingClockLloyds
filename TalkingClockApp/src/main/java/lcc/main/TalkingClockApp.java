package lcc.main;

import lcc.helper.ClockHelper;

import java.time.LocalTime;

public class TalkingClockApp {
    public static void main(String[] args) {
        ClockHelper clockHelper = new ClockHelper();

        System.out.println(clockHelper.getHumanReadibleTime(LocalTime.now()));
    }
}
