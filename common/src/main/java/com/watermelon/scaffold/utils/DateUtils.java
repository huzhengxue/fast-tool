package com.watermelon.scaffold.utils;

import com.watermelon.scaffold.exception.StringEmptyException;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.LocalTime;


public class DateUtils {

    public enum DateFormatEnum {
        DATE_FORMAT("yyyy-MM-dd"),
        TIME_FORMAT("hh:mm:ss"),
        DATE_TIME_FORMAT("yyyy-MM-dd hh:mm:ss"),
        ;
        private String value;

        DateFormatEnum(String format) {
            this.value = format;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    /**
     * get now date, 'yyyy-MM-dd'
     * @return
     */
    public static String getNowDate() {
        LocalDate now = LocalDate.now();
        return now.toString();
    }

    /**
     * get LocalDate by string, 'yyyy-MM-dd'
     * @param date
     * @return
     */
    public static LocalDate parseLocalDate(String date) {
        if (StringUtils.isEmpty(date)) {
            throw new StringEmptyException();
        }
        LocalDate localDate = LocalDate.parse(date);
        return localDate;
    }

    /**
     * get now time with no nano, 'hh:mm:ss'
     * @return
     */
    public static String getNowTime() {
        LocalTime time = LocalTime.now().withNano(0);
        return time.toString();
    }

    /**
     * get now time with nano, 'hh:mm:ss'
     * @return
     */
    public static String getNowTimeWithNano() {
        LocalTime time = LocalTime.now();
        return time.toString();
    }

    /**
     * parse to localTime class by string
     * @param time
     * @return
     */
    public static LocalTime parseLocalTime(String time) {
        if (StringUtils.isEmpty(time)) {
            throw new StringEmptyException();
        }
        LocalTime localTime = LocalTime.parse(time);
        return localTime;
    }

    /**
     * Get the specified number of days per month.
     * min(count) = 0
     * @param count
     * @return
     */
    public static LocalDate getNowMonthFirstDay(int count) {
        LocalDate today = LocalDate.now();
        LocalDate firstDayOfThisMonth = today.withDayOfMonth(count);
        return firstDayOfThisMonth;
    }

    public static void main(String[] args) {
        System.out.println(getNowDate());
        System.out.println(getNowTime());
        System.out.println(getNowTimeWithNano());
        LocalDate day = getNowMonthFirstDay(1);
        System.out.println(day.toString());
    }
}
