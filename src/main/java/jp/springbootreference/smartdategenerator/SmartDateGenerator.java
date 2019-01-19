package jp.springbootreference.smartdategenerator;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class SmartDateGenerator {

    public static DateObject generateDate(){
        CalenderBuilder calenderBuilder = new CalenderBuilder();
        return new DateObject(calenderBuilder);
    }

    public static DateObject generateDate(Date date){
        CalenderBuilder calenderBuilder = new CalenderBuilder(date);
        return new DateObject(calenderBuilder);
    }

    public static DateObject generateDate(String dateString,String format){
        return new DateObject(dateString, format);
    }

    public static DateObject generateDate(Calendar calendar){
        CalenderBuilder calenderBuilder = new CalenderBuilder(calendar);
        return new DateObject(calenderBuilder);
    }

    public static DateObject generateDate(TimeZone timeZone){
        CalenderBuilder calenderBuilder = new CalenderBuilder()
                .setTimezone(timeZone);
        return new DateObject(calenderBuilder);
    }

    public static DateObject generateDate(Date date, TimeZone timeZone){
        CalenderBuilder calenderBuilder = new CalenderBuilder(date)
                .setTimezone(timeZone);
        return new DateObject(calenderBuilder);
    }

    public static DateObject generateDate(Calendar calendar, TimeZone timeZone){
        CalenderBuilder calenderBuilder = new CalenderBuilder(calendar)
                .setTimezone(timeZone);
        return new DateObject(calenderBuilder);
    }

}
