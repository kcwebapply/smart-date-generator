# smart-date-generator

![apache licensed](https://img.shields.io/badge/License-Apache_2.0-d94c32.svg)
![Java](https://img.shields.io/badge/Language-Java-f88909.svg)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/jp.spring-boot-reference/smart-date-generator/badge.svg)](https://maven-badges.herokuapp.com/maven-central/jp.spring-boot-reference/smart-date-generator)

https://search.maven.org/artifact/jp.spring-boot-reference/smart-date-generator/1.0/jar
https://oss.sonatype.org/content/repositories/releases/jp/spring-boot-reference/smart-date-generator/

## SmartDateGenerator

**SmartDateGenerator** convert `Date/Calendar/String` object  to another object simply ( __by one-liner__ ).


This library also help you to do _date-caliculation_ with simple _method-chain_ .

## Usage

### Generate Data from `Date` or `Calender` Object.
```Java
/* 2019/01/20 */ 


// generate CalenderObject from dateObject.
SmartDateGenerator.generateDate(new Date()).toCalender() // -> Calender Object.

// generate DateObject from CalenderObject.
SmartDateGenerator.generateDate(Calender.getInstance()).toDate() // -> Date Object.

// generate String from Object and given format.
SmartDateGenerator.generateDate(new Date()).toString("yyyy/MM/dd") -> "2019/01/20"

```

###  GenerateData from `DateString` and `format`
You can get _date-Data_ easily from dateString and it's format.


```Java

SmartDateGenerator.generateDate("2017/05/04 11:22", "yyyy/MM/dd").toDate() 
// -> Thu May 04 00:00:00 JST 2017

SmartDateGenerator.generateDate("2017/05/04 11:22", "yyyy/MM/dd").toCalender()
// -> CalenderObject (2017/05/04)

```

### date-caliculation
you can caliculate date with method-chain
```java
// 90 days after .
SmartDateGenerator.generateDate(new Date()).dayChange(90).toString("yyyy/MM/dd") // -> 2019/04/20

// 90 days before.
SmartDateGenerator.generateDate(new Date()).dayChange(-90).toString("yyyy/MM/dd") // -> 2018/10/22

```

calicate result can also be  `Date`,`Calender` of cource.
```java
// 90 days after .
SmartDateGenerator.generateDate(new Date()).dayChange(90).toDate() // -> DateObject()

// 90 days before.
SmartDateGenerator.generateDate(new Date()).dayChange(-90).toCalender() // -> CalenderObject

```

## set timezone
```java
SmartDateGenerator.generateDate(testDate()).dayChange(-30).setTimeZone(TimeZone.getTimeZone("US/Alaska")).toString("yyyy/MM/dd")
// -> 2018/12/21
```

### simple usage.

```java
// this return DateObject (time is now).
SmartDateGenerator.generateDate().toDate() // -> Date (date:Sun Jan 20 22:33:22 JST 2019 )
```



## Dependency
**Maven**
```xml
<dependency>
    <groupId>jp.spring-boot-reference</groupId>
    <artifactId>smart-date-generator</artifactId>
    <version>1.0</version>
</dependency>
```

**Gradle**
```gradle
compile 'jp.spring-boot-reference:smart-date-generator:1.0'
```
