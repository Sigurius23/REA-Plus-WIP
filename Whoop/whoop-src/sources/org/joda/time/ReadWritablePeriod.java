package org.joda.time;

/* JADX INFO: loaded from: classes3.dex */
public interface ReadWritablePeriod extends ReadablePeriod {
    void add(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24);

    void add(DurationFieldType durationFieldType, int i13);

    void add(ReadableInterval readableInterval);

    void add(ReadablePeriod readablePeriod);

    void addDays(int i13);

    void addHours(int i13);

    void addMillis(int i13);

    void addMinutes(int i13);

    void addMonths(int i13);

    void addSeconds(int i13);

    void addWeeks(int i13);

    void addYears(int i13);

    void clear();

    void set(DurationFieldType durationFieldType, int i13);

    void setDays(int i13);

    void setHours(int i13);

    void setMillis(int i13);

    void setMinutes(int i13);

    void setMonths(int i13);

    void setPeriod(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24);

    void setPeriod(ReadableInterval readableInterval);

    void setPeriod(ReadablePeriod readablePeriod);

    void setSeconds(int i13);

    void setValue(int i13, int i14);

    void setWeeks(int i13);

    void setYears(int i13);
}
