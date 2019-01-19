package jp.springbootreference.smartdategenerator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateObject{

    private CalenderBuilder calender;


    public DateObject(CalenderBuilder calenderBuilder){
        calender = calenderBuilder;
    }

    public DateObject(String dateString,String format){
        try {
            final Date date = generateSimpleFormat(format).parse(dateString);
            calender = new CalenderBuilder(date);
        } catch (ParseException e) {
            System.out.println("parse失敗"+e.getMessage());
            calender = new CalenderBuilder();
        }
    }


    // generate response
    public Date toDate(){
        return calender.build().getTime();
    }

    public Calendar toCalender(){
        return calender.build();
    }

    public String toString(String format){
        SimpleDateFormat formatObj = generateSimpleFormat(format);
        return formatObj.format(calender.build().getTime());
    }

    protected static SimpleDateFormat generateSimpleFormat(String format){
        return new SimpleDateFormat(format);
    }

    /* setter */
    public DateObject dayChange(int day){
        calender.setDayChange(day);
        return this;
    }

    public DateObject setYear(int year){
        calender.setYear(year);
        return this;
    }

    public DateObject setMonth(int month){
        calender.setMonth(month);
        return this;
    }

    public DateObject setDate(int date){
        calender.setDate(date);
        return this;
    }

    public DateObject setTimeZone(TimeZone timeZone){
        calender.setTimezone(timeZone);
        return this;
    }

}
