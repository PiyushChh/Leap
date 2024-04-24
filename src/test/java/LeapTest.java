import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapTest {
    private Leap leap;

    @BeforeEach
    public void setup() {
        leap = new Leap();
    }

    @Test
    public void testYearNotDivBy4InCommonYear() {
        boolean actual=leap.isLeapYear(2015);

        assertThat(actual).isFalse();
    }

    @Test
    public void testYearDivBy2NotDivBy4InCommonYear() {
        boolean actual=leap.isLeapYear(1970);

        assertThat(actual).isFalse();
    }

    @Test
    public void testYearDivBy4NotDivBy100InLeapYear() {
        boolean actual=leap.isLeapYear(1996);

        assertThat(actual).isTrue();
    }

    @Test
    public void testYearDivBy4And5InLeapYear() {
        boolean actual=leap.isLeapYear(1960);

        assertThat(actual).isTrue();
    }

    @Test
    public void testYearDivBy100NotDivBy400InCommonYear() {
        boolean actual=leap.isLeapYear(2100);

        assertThat(actual).isFalse();
    }

    @Test
    public void testYearDivBy100NotDivBy3IsNotLeapYear() {
        boolean actual=leap.isLeapYear(1900);

        assertThat(actual).isFalse();
    }

    @Test
    public void testYearDivBy400InLeapYear() {
        boolean actual=leap.isLeapYear(2000);

        assertThat(actual).isTrue();
    }

    @Test
    public void testYearDivBy400NotDivBy125IsLeapYear() {
        boolean actual=leap.isLeapYear(2400);

        assertThat(actual).isTrue();
    }

    @Test
    public void testYearDivBy200NotDivBy400InCommonYear() {
        boolean actual=leap.isLeapYear(1800);

        assertThat(actual).isFalse();
    }
}

