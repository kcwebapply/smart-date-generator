package jp.springbootreference.smartdategenerator;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

class CalenderBuilder {

    protected Calendar calendar;

    CalenderBuilder(){
        this.calendar = Calendar.getInstance();
    }

    CalenderBuilder(Calendar calendar){
        this.calendar = calendar;
    }

    CalenderBuilder(Date date){
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        this.calendar = calendar;
    }

    CalenderBuilder setYear(int year){
        calendar.set(Calendar.YEAR,year);
        return this;
    }

    CalenderBuilder setMonth(int month){
        calendar.set(Calendar.MONTH,month);
        return this;
    }

    CalenderBuilder setDate(int date){
        calendar.set(Calendar.DATE,date);
        return this;
    }

    CalenderBuilder setTimezone(TimeZone timezone){
        calendar.setTimeZone(timezone);
        return this;
    }

    CalenderBuilder setDayChange(int day){
        calendar.add(Calendar.DATE,day);
        return this;
    }

    Calendar build(){
        return this.calendar;
    }

}
