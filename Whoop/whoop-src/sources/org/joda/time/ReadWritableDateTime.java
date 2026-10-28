package org.joda.time;

/* JADX INFO: loaded from: classes3.dex */
public interface ReadWritableDateTime extends ReadableDateTime, ReadWritableInstant {
    void addDays(int i13);

    void addHours(int i13);

    void addMillis(int i13);

    void addMinutes(int i13);

    void addMonths(int i13);

    void addSeconds(int i13);

    void addWeeks(int i13);

    void addWeekyears(int i13);

    void addYears(int i13);

    void setDate(int i13, int i14, int i15);

    void setDateTime(int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    void setDayOfMonth(int i13);

    void setDayOfWeek(int i13);

    void setDayOfYear(int i13);

    void setHourOfDay(int i13);

    void setMillisOfDay(int i13);

    void setMillisOfSecond(int i13);

    void setMinuteOfDay(int i13);

    void setMinuteOfHour(int i13);

    void setMonthOfYear(int i13);

    void setSecondOfDay(int i13);

    void setSecondOfMinute(int i13);

    void setTime(int i13, int i14, int i15, int i16);

    void setWeekOfWeekyear(int i13);

    void setWeekyear(int i13);

    void setYear(int i13);
}
