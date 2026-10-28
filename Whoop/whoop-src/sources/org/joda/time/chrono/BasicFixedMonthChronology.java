package org.joda.time.chrono;

import org.joda.time.Chronology;

/* JADX INFO: loaded from: classes3.dex */
abstract class BasicFixedMonthChronology extends BasicChronology {
    static final long MILLIS_PER_MONTH = 2592000000L;
    static final long MILLIS_PER_YEAR = 31557600000L;
    static final int MONTH_LENGTH = 30;
    private static final long serialVersionUID = 261387371998L;

    public BasicFixedMonthChronology(Chronology chronology, Object obj, int i13) {
        super(chronology, obj, i13);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYearDividedByTwo() {
        return 15778800000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDayOfMonth(long j7) {
        return ((getDayOfYear(j7) - 1) % 30) + 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax() {
        return 30;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYearMonth(int i13, int i14) {
        if (i14 != 13) {
            return 30;
        }
        return isLeapYear(i13) ? 6 : 5;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMaxMonth() {
        return 13;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMonthOfYear(long j7) {
        return ((getDayOfYear(j7) - 1) / 30) + 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getTotalMillisByYearMonth(int i13, int i14) {
        return ((long) (i14 - 1)) * MILLIS_PER_MONTH;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getYearDifference(long j7, long j13) {
        int year = getYear(j7);
        int year2 = getYear(j13);
        long yearMillis = j7 - getYearMillis(year);
        int i13 = year - year2;
        if (yearMillis < j13 - getYearMillis(year2)) {
            i13--;
        }
        return i13;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapYear(int i13) {
        return (i13 & 3) == 3;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long setYear(long j7, int i13) {
        int dayOfYear = getDayOfYear(j7, getYear(j7));
        int millisOfDay = getMillisOfDay(j7);
        if (dayOfYear > 365 && !isLeapYear(i13)) {
            dayOfYear--;
        }
        return getYearMonthDayMillis(i13, 1, dayOfYear) + ((long) millisOfDay);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax(int i13) {
        return i13 != 13 ? 30 : 6;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMonthOfYear(long j7, int i13) {
        return ((int) ((j7 - getYearMillis(i13)) / MILLIS_PER_MONTH)) + 1;
    }
}
