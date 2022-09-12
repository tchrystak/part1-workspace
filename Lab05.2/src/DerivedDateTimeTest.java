/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.DayOfWeek.MONDAY;
import static java.time.temporal.TemporalAdjusters.*;

class DerivedDateTimeTest {

    /**
     * main() calls each of the test methods in turn (currently commented out).
     * To run one test method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
         testPresidentsFirst100Days();
         testPopularBirthdays();
         testEarlyRetirement();
         testLaborDay();
         testElectionDay();
         testAnniversary();
    }

    /**
     * TASK: new American presidents are often measured by their performance during the first 100 days in office.
     * Inauguration Day 2017 is Jan 20.  When is this president's 100-day deadline?
     *
     * RESULT:
     */
    public static void testPresidentsFirst100Days() {
        // TODO
        LocalDate today = LocalDate.of(2017, Month.JANUARY, 20);
        LocalDate date100 = today.plusDays(100);
        System.out.println(date100);
    }

    /**
     * TASK: Certain times of the year seem to have more birthdays than other times.
     * Some believe that this is because more babies are conceived during certain times of year.
     * Below, assume a due date 38 weeks after conception, during a non-leap-year.
     *
     * RESULT:
     */
    public static void testPopularBirthdays() {
        // TODO: what is the average birthday of someone conceived on Valentine's Day?
        LocalDate valentines = LocalDate.of(2022, Month.FEBRUARY, 14);
        System.out.println(valentines);
        // TODO: what is the average birthday of someone conceived on New Year's Eve (after midnight)?
        LocalDate newyears = LocalDate.of(2022, Month.JANUARY, 1);
        System.out.println(newyears);
    }

    /**
     * TASK: you've saved diligently your whole life and plan to retire as soon as
     * you can take distributions from your 401(k) penalty-free, which is when you turn 59 1/2.
     * When will / did you retire?
     *
     * RESULT:
     */
    public static void testEarlyRetirement() {
        // TODO
        LocalDate today = LocalDate.of(2022, 11,8);
        LocalDate retire = today.plusYears((long) 34.5);
        System.out.println(retire);
    }

    /**
     * TASK: when was Labor Day during the year you were born?
     * Note: start with a LocalDate equal to your birthday.
     * Note: Labor Day is the first Monday in Sept.
     *
     * RESULT:
     */
    public static void testLaborDay() {
        // TODO
        LocalDate bday = LocalDate.of(1996, 11, 8);
        LocalDate sept1 = bday.withMonth(9).withDayOfMonth(1);
        LocalDate laborDay = sept1.with(firstInMonth(MONDAY));
        System.out.println(laborDay);
        System.out.println(laborDay.getDayOfWeek());
    }

    /**
     * TASK: Election Day in the United States is defined as the Tuesday immediately after the 1st Monday in November.
     * When is Election Day 2024?
     *
     * RESULT:
     */
    public static void testElectionDay() {
        // TODO
        LocalDate nov1 = LocalDate.of(2024, 11, 1);
        LocalDate electionDay = nov1.with(firstInMonth(MONDAY)).plusDays(1);
        System.out.println(electionDay);
        System.out.println(electionDay.getDayOfWeek());
    }

    /**
     * TASK: Akesh and Samanta were married on 6/6/1969.
     * They are planning their 50th wedding anniversary, and would like to throw a big party.
     * If their anniversary does not fall on a Saturday, they'd like to have their party the following Saturday.
     * What is the date of the party?
     *
     * RESULT:
     */
    public static void testAnniversary() {
        // TODO
        LocalDate wedding = LocalDate.of(1969, 6, 6);
        LocalDate anniversary = wedding
            .plusYears(50)
            .with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        System.out.println(anniversary);
    }
}