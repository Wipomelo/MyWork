package com.project.util;

import jdk.vm.ci.meta.Local;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;

public class TimeCountUtil {
    public int timeCount(LocalDateTime startDate, LocalDateTime endDate) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH");

        long time1 = startDate.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        long time2 = endDate.toInstant(ZoneOffset.of("+8")).toEpochMilli();


        long between_days=(time2-time1)/(1000*3600);

        return Integer.parseInt(String.valueOf(between_days));

    }
}
