package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AMPMToMilitaryTime {
    public static String calculate(String s) {
        List<String> times = new ArrayList<>(Arrays.asList(s.split(":")));
        String hours = times.get(0);
        String minutes = times.get(1);

        List<String> list = new ArrayList<>(Arrays.asList(times.get(2).split("AM|PM")));
        String seconds = list.get(0);
        List<String> result = new ArrayList<>(Arrays.asList(times.get(2).split("\\d\\d")));
        String meridian = result.get(1);

        StringBuilder timeString = new StringBuilder();
        int hoursPreMilitary = Integer.parseInt(hours);
        int hoursToMilitary;
        if(meridian.equalsIgnoreCase("PM")){
            hoursToMilitary = hoursPreMilitary < 12 ? (12 + hoursPreMilitary) : hoursPreMilitary;
        } else {
            hoursToMilitary = hoursPreMilitary == 12 ? 0 : hoursPreMilitary;
        }
        timeString.append(String.format("%02d", hoursToMilitary));
        timeString.append(":");
        timeString.append(minutes);
        timeString.append(":");
        timeString.append(seconds);
        return timeString.toString();
    }
}
