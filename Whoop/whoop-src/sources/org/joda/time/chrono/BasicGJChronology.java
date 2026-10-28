package org.joda.time.chrono;

import org.joda.time.Chronology;
import p715kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes5.dex */
abstract class BasicGJChronology extends BasicChronology {
    private static final long FEB_29 = 5097600000L;
    private static final long serialVersionUID = 538276888268L;
    private static final int[] MIN_DAYS_PER_MONTH_ARRAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] MAX_DAYS_PER_MONTH_ARRAY = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] MIN_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];
    private static final long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];

    static {
        long j7 = 0;
        int i13 = 0;
        long j13 = 0;
        while (i13 < 11) {
            j7 += ((long) MIN_DAYS_PER_MONTH_ARRAY[i13]) * DurationKt.MILLIS_IN_DAY;
            int i14 = i13 + 1;
            MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i14] = j7;
            j13 += ((long) MAX_DAYS_PER_MONTH_ARRAY[i13]) * DurationKt.MILLIS_IN_DAY;
            MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i14] = j13;
            i13 = i14;
        }
    }

    public BasicGJChronology(Chronology chronology, Object obj, int i13) {
        super(chronology, obj, i13);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax(int i13) {
        return MAX_DAYS_PER_MONTH_ARRAY[i13 - 1];
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMaxForSet(long j7, int i13) {
        if (i13 > 28 || i13 < 1) {
            return getDaysInMonthMax(j7);
        }
        return 28;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYearMonth(int i13, int i14) {
        return isLeapYear(i13) ? MAX_DAYS_PER_MONTH_ARRAY[i14 - 1] : MIN_DAYS_PER_MONTH_ARRAY[i14 - 1];
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMonthOfYear(long j7, int i13) {
        int yearMillis = (int) ((j7 - getYearMillis(i13)) >> 10);
        if (isLeapYear(i13)) {
            if (yearMillis < 15356250) {
                if (yearMillis < 7678125) {
                    if (yearMillis < 2615625) {
                        return 1;
                    }
                    return yearMillis < 5062500 ? 2 : 3;
                }
                if (yearMillis < 10209375) {
                    return 4;
                }
                return yearMillis < 12825000 ? 5 : 6;
            }
            if (yearMillis < 23118750) {
                if (yearMillis < 17971875) {
                    return 7;
                }
                return yearMillis < 20587500 ? 8 : 9;
            }
            if (yearMillis < 25734375) {
                return 10;
            }
            return yearMillis < 28265625 ? 11 : 12;
        }
        if (yearMillis < 15271875) {
            if (yearMillis < 7593750) {
                if (yearMillis < 2615625) {
                    return 1;
                }
                return yearMillis < 4978125 ? 2 : 3;
            }
            if (yearMillis < 10125000) {
                return 4;
            }
            return yearMillis < 12740625 ? 5 : 6;
        }
        if (yearMillis < 23034375) {
            if (yearMillis < 17887500) {
                return 7;
            }
            return yearMillis < 20503125 ? 8 : 9;
        }
        if (yearMillis < 25650000) {
            return 10;
        }
        return yearMillis < 28181250 ? 11 : 12;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getTotalMillisByYearMonth(int i13, int i14) {
        return isLeapYear(i13) ? MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i14 - 1] : MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i14 - 1];
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getYearDifference(long j7, long j13) {
        int year = getYear(j7);
        int year2 = getYear(j13);
        long yearMillis = j7 - getYearMillis(year);
        long yearMillis2 = j13 - getYearMillis(year2);
        if (yearMillis2 >= FEB_29) {
            if (isLeapYear(year2)) {
                if (!isLeapYear(year)) {
                    yearMillis2 -= DurationKt.MILLIS_IN_DAY;
                }
            } else if (yearMillis >= FEB_29 && isLeapYear(year)) {
                yearMillis -= DurationKt.MILLIS_IN_DAY;
            }
        }
        int i13 = year - year2;
        if (yearMillis < yearMillis2) {
            i13--;
        }
        return i13;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapDay(long j7) {
        return dayOfMonth().get(j7) == 29 && monthOfYear().isLeap(j7);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long setYear(long j7, int i13) {
        int year = getYear(j7);
        int dayOfYear = getDayOfYear(j7, year);
        int millisOfDay = getMillisOfDay(j7);
        if (dayOfYear > 59) {
            if (isLeapYear(year)) {
                if (!isLeapYear(i13)) {
                    dayOfYear--;
                }
            } else if (isLeapYear(i13)) {
                dayOfYear++;
            }
        }
        return getYearMonthDayMillis(i13, 1, dayOfYear) + ((long) millisOfDay);
    }
}
