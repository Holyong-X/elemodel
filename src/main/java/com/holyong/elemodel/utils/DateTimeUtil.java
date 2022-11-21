package com.holyong.elemodel.utils;


import java.util.Calendar;
import java.util.Date;

public class DateTimeUtil {

    public static Date AFewMinutesAgo(int min){

        Calendar calendar = Calendar.getInstance();
        calendar.add(calendar.MINUTE,min);
        Date time = calendar.getTime();
        return time;
    }



    public static Date currentTime(){
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        return time;
    }
}
