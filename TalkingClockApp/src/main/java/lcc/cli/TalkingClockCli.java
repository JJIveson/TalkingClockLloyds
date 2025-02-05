package lcc.cli;

import lcc.helper.ClockHelper;

import java.time.LocalTime;

public class TalkingClockCli {
    public static void main(String[] args) {
        ClockHelper clockHelper = new ClockHelper();
        LocalTime time;

        if (args.length > 0) {
            try {
                // Expecting the time to be in HH:mm format
                time = LocalTime.parse(args[0]);
            } catch (Exception e) {
                System.err.println("Invalid time format. Please provide time in HH:mm format.");
                return;
            }
        } else {
            // No argument provided: use the current system time
            time = LocalTime.now();
        }

        System.out.println(clockHelper.getHumanReadibleTime(time));
    }
}