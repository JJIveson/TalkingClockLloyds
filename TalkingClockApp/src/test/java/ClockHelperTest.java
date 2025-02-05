import lcc.helper.ClockHelper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ClockHelperTest {
    ClockHelper helper;

    @BeforeEach
    public void setUp() {
        helper = new ClockHelper();
    }
    @Test
    void getHourAfterTwelve() {
        assertEquals(1, helper.getHourAfterTwelve(13));
        assertEquals(11, helper.getHourAfterTwelve(23));
    }

    @Test
    void convertToHumanHour() {
        assertEquals("midnight", helper.convertToHumanHour(LocalTime.of(0, 1)));
        assertEquals("one", helper.convertToHumanHour(LocalTime.of(1, 1)));
        assertEquals("two", helper.convertToHumanHour(LocalTime.of(2, 1)));
        assertEquals("three", helper.convertToHumanHour(LocalTime.of(3, 1)));
        assertEquals("four", helper.convertToHumanHour(LocalTime.of(4, 1)));
        assertEquals("five", helper.convertToHumanHour(LocalTime.of(5, 1)));
        assertEquals("six", helper.convertToHumanHour(LocalTime.of(6, 1)));
        assertEquals("seven", helper.convertToHumanHour(LocalTime.of(7, 1)));
        assertEquals("eight", helper.convertToHumanHour(LocalTime.of(8, 1)));
        assertEquals("nine", helper.convertToHumanHour(LocalTime.of(9, 1)));
        assertEquals("ten", helper.convertToHumanHour(LocalTime.of(10, 1)));;
        assertEquals("eleven", helper.convertToHumanHour(LocalTime.of(11, 1)));
        assertEquals("twelve", helper.convertToHumanHour(LocalTime.of(12, 1)));

        assertEquals("one", helper.convertToHumanHour(LocalTime.of(13, 1)));
        assertEquals("two", helper.convertToHumanHour(LocalTime.of(14, 1)));
        assertEquals("three", helper.convertToHumanHour(LocalTime.of(15, 1)));
        assertEquals("four", helper.convertToHumanHour(LocalTime.of(16, 1)));
        assertEquals("five", helper.convertToHumanHour(LocalTime.of(17, 1)));
        assertEquals("six", helper.convertToHumanHour(LocalTime.of(18, 1)));
        assertEquals("seven", helper.convertToHumanHour(LocalTime.of(19, 1)));
        assertEquals("eight", helper.convertToHumanHour(LocalTime.of(20, 1)));
        assertEquals("nine", helper.convertToHumanHour(LocalTime.of(21, 1)));
        assertEquals("ten", helper.convertToHumanHour(LocalTime.of(22, 1)));
        assertEquals("eleven", helper.convertToHumanHour(LocalTime.of(23, 1)));
    }

    @Test
    void convertToHumanMinute() {
        assertEquals("", helper.convertToHumanMinute(LocalTime.of(0, 0)));
        assertEquals("one", helper.convertToHumanMinute(LocalTime.of(0, 1)));
        assertEquals("two", helper.convertToHumanMinute(LocalTime.of(0, 2)));
        assertEquals("three", helper.convertToHumanMinute(LocalTime.of(0, 3)));
        assertEquals("four", helper.convertToHumanMinute(LocalTime.of(0, 4)));
        assertEquals("five", helper.convertToHumanMinute(LocalTime.of(0, 5)));
        assertEquals("six", helper.convertToHumanMinute(LocalTime.of(0, 6)));
        assertEquals("seven", helper.convertToHumanMinute(LocalTime.of(0, 7)));
        assertEquals("eight", helper.convertToHumanMinute(LocalTime.of(0, 8)));
        assertEquals("nine", helper.convertToHumanMinute(LocalTime.of(0, 9)));
        assertEquals("ten", helper.convertToHumanMinute(LocalTime.of(0, 10)));
        assertEquals("eleven", helper.convertToHumanMinute(LocalTime.of(0, 11)));
        assertEquals("twelve", helper.convertToHumanMinute(LocalTime.of(0, 12)));
        assertEquals("thirteen", helper.convertToHumanMinute(LocalTime.of(0, 13)));
        assertEquals("fourteen", helper.convertToHumanMinute(LocalTime.of(0, 14)));
        assertEquals("quarter", helper.convertToHumanMinute(LocalTime.of(0, 15)));
        assertEquals("sixteen", helper.convertToHumanMinute(LocalTime.of(0, 16)));
        assertEquals("seventeen", helper.convertToHumanMinute(LocalTime.of(0, 17)));
        assertEquals("eighteen", helper.convertToHumanMinute(LocalTime.of(0, 18)));
        assertEquals("nineteen", helper.convertToHumanMinute(LocalTime.of(0, 19)));
        assertEquals("twenty", helper.convertToHumanMinute(LocalTime.of(0, 20)));
        assertEquals("twenty-one", helper.convertToHumanMinute(LocalTime.of(0, 21)));
        assertEquals("twenty-two", helper.convertToHumanMinute(LocalTime.of(0, 22)));
        assertEquals("twenty-three", helper.convertToHumanMinute(LocalTime.of(0, 23)));
        assertEquals("twenty-four", helper.convertToHumanMinute(LocalTime.of(0, 24)));
        assertEquals("twenty-five", helper.convertToHumanMinute(LocalTime.of(0, 25)));
        assertEquals("twenty-six", helper.convertToHumanMinute(LocalTime.of(0, 26)));
        assertEquals("twenty-seven", helper.convertToHumanMinute(LocalTime.of(0, 27)));
        assertEquals("twenty-eight", helper.convertToHumanMinute(LocalTime.of(0, 28)));
        assertEquals("twenty-nine", helper.convertToHumanMinute(LocalTime.of(0, 29)));
        assertEquals("half", helper.convertToHumanMinute(LocalTime.of(0, 30)));

        assertEquals("one", helper.convertToHumanMinute(LocalTime.of(0, (60-1))));
        assertEquals("two", helper.convertToHumanMinute(LocalTime.of(0, (60-2))));
        assertEquals("three", helper.convertToHumanMinute(LocalTime.of(0, (60-3))));
        assertEquals("four", helper.convertToHumanMinute(LocalTime.of(0, (60-4))));
        assertEquals("five", helper.convertToHumanMinute(LocalTime.of(0, (60-5))));
        assertEquals("six", helper.convertToHumanMinute(LocalTime.of(0, (60-6))));
        assertEquals("seven", helper.convertToHumanMinute(LocalTime.of(0, (60-7))));
        assertEquals("eight", helper.convertToHumanMinute(LocalTime.of(0, (60-8))));
        assertEquals("nine", helper.convertToHumanMinute(LocalTime.of(0, (60-9))));
        assertEquals("ten", helper.convertToHumanMinute(LocalTime.of(0, (60-10))));
        assertEquals("eleven", helper.convertToHumanMinute(LocalTime.of(0, (60-11))));
        assertEquals("twelve", helper.convertToHumanMinute(LocalTime.of(0, (60-12))));
        assertEquals("thirteen", helper.convertToHumanMinute(LocalTime.of(0, (60-13))));
        assertEquals("fourteen", helper.convertToHumanMinute(LocalTime.of(0, (60-14))));
        assertEquals("quarter", helper.convertToHumanMinute(LocalTime.of(0, (60-15))));
        assertEquals("sixteen", helper.convertToHumanMinute(LocalTime.of(0, (60-16))));
        assertEquals("seventeen", helper.convertToHumanMinute(LocalTime.of(0, (60-17))));
        assertEquals("eighteen", helper.convertToHumanMinute(LocalTime.of(0, (60-18))));
        assertEquals("nineteen", helper.convertToHumanMinute(LocalTime.of(0, (60-19))));
        assertEquals("twenty", helper.convertToHumanMinute(LocalTime.of(0, (60-20))));
        assertEquals("twenty-one", helper.convertToHumanMinute(LocalTime.of(0, (60-21))));
        assertEquals("twenty-two", helper.convertToHumanMinute(LocalTime.of(0, (60-22))));
        assertEquals("twenty-three", helper.convertToHumanMinute(LocalTime.of(0, (60-23))));
        assertEquals("twenty-four", helper.convertToHumanMinute(LocalTime.of(0, (60-24))));
        assertEquals("twenty-five", helper.convertToHumanMinute(LocalTime.of(0, (60-25))));
        assertEquals("twenty-six", helper.convertToHumanMinute(LocalTime.of(0, (60-26))));
        assertEquals("twenty-seven", helper.convertToHumanMinute(LocalTime.of(0, (60-27))));
        assertEquals("twenty-eight", helper.convertToHumanMinute(LocalTime.of(0, (60-28))));
        assertEquals("twenty-nine", helper.convertToHumanMinute(LocalTime.of(0, (60-29))));
    }

    @Test
    void getJoiningWord() {
        assertEquals("past", helper.getJoiningWord(LocalTime.of(0, 1)));
        assertEquals("past", helper.getJoiningWord(LocalTime.of(0, 29)));
        assertEquals("past", helper.getJoiningWord(LocalTime.of(0, 30)));
        assertEquals("to", helper.getJoiningWord(LocalTime.of(0, 31)));
        assertEquals("to", helper.getJoiningWord(LocalTime.of(0, 59)));
    }

    @Test
    void sentenceBuilder() {
        assertEquals("nine past six", helper.sentenceBuilder(LocalTime.of(6, 9)));
        assertEquals("quarter past midnight", helper.sentenceBuilder(LocalTime.of(0, 15)));
        assertEquals("half past one", helper.sentenceBuilder(LocalTime.of(13, 30)));
        assertEquals("twenty-nine to two", helper.sentenceBuilder(LocalTime.of(13, 31)));
        assertEquals("twenty-one to two", helper.sentenceBuilder(LocalTime.of(13, 39)));
        assertEquals("quarter to two", helper.sentenceBuilder(LocalTime.of(13, 45)));
        assertEquals("six to two", helper.sentenceBuilder(LocalTime.of(13, 54)));
        assertEquals("one to two", helper.sentenceBuilder(LocalTime.of(13, 59)));
        assertEquals("one to midnight", helper.sentenceBuilder(LocalTime.of(23, 59)));
        assertEquals("one past midnight", helper.sentenceBuilder(LocalTime.of(0, 1)));
        assertEquals("midnight", helper.sentenceBuilder(LocalTime.of(0, 0)));
        assertEquals("one o'clock", helper.sentenceBuilder(LocalTime.of(1, 0)));
        assertEquals("twelve o'clock", helper.sentenceBuilder(LocalTime.of(12, 0)));
        assertEquals("one o'clock", helper.sentenceBuilder(LocalTime.of(13, 0)));
        assertEquals("eleven o'clock", helper.sentenceBuilder(LocalTime.of(23, 0)));
        assertEquals("half past eleven", helper.sentenceBuilder(LocalTime.of(23, 30)));
        assertEquals("half past midnight", helper.sentenceBuilder(LocalTime.of(0, 30)));
        assertEquals("half past twelve", helper.sentenceBuilder(LocalTime.of(12, 30)));
        assertEquals("twenty-nine to one", helper.sentenceBuilder(LocalTime.of(12, 31)));
        assertEquals("twenty-nine to one", helper.sentenceBuilder(LocalTime.of(0, 31)));
    }

    @Test
    void capitaliseFirstLetter() {
        assertEquals("Half past twelve",helper.capitaliseFirstLetter(helper.sentenceBuilder(LocalTime.of(12, 30))));
    }

    @Test
    void getHumanReadibleTime()
    {
        assertEquals("Half past twelve",helper.getHumanReadibleTime(LocalTime.of(12,30)));
    }
}
