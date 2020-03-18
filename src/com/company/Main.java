package com.company;

public class Main {

    public static void main(String[] args) {
//        getDurationString(130, 0);
            getDurationString(90);
        }
    private static void getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59){
            System.out.println("Invalid value");
        }else{
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            System.out.println(hours + "h " + remainingMinutes + "m " + seconds + "s");
        }
    }
    private static void getDurationString(int seconds){
        if (seconds < 0){
            System.out.println("Invalid value");
        }else{
            int minutesFromSeconds = seconds / 60;
            int remainingSeconds = seconds % 60;
            getDurationString(minutesFromSeconds, remainingSeconds);
        }
    }

}

