package jp.springbootreference.smartdategenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@SpringBootApplication
public class SmartDateGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartDateGeneratorApplication.class, args);

		System.out.println("date:"+SmartDateGenerator.generateDate().toDate());

		System.out.println("date:"+SmartDateGenerator.generateDate().toString("yyyy/MM/dd"));

		System.out.println("date:"+SmartDateGenerator.generateDate().dayChange(-90).toString("yyyy/MM/dd"));

		System.out.println("date:"+SmartDateGenerator.generateDate().dayChange(90).toString("yyyy/MM/dd"));

		System.out.println("date:"+SmartDateGenerator.generateDate(testDate()).dayChange(-30).toString("yyyy/MM/dd"));

		System.out.println("date:"+SmartDateGenerator.generateDate(testDate()).dayChange(-30).setTimeZone(TimeZone.getTimeZone("US/Alaska")).toString("yyyy/MM/dd"));

		System.out.println("date:"+SmartDateGenerator.generateDate("2017/05/04 11:22","yyyy/MM/dd").dayChange(90).toDate());
	}

	private static Date testDate(){
		Calendar calendar = Calendar.getInstance();
		calendar.set(2018,Calendar.APRIL,5);
		return calendar.getTime();
	}

}

