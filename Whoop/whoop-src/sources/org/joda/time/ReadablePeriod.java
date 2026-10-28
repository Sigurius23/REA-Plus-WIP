package org.joda.time;

/* JADX INFO: loaded from: classes5.dex */
public interface ReadablePeriod {
    boolean equals(Object obj);

    int get(DurationFieldType durationFieldType);

    DurationFieldType getFieldType(int i13);

    PeriodType getPeriodType();

    int getValue(int i13);

    int hashCode();

    boolean isSupported(DurationFieldType durationFieldType);

    int size();

    MutablePeriod toMutablePeriod();

    Period toPeriod();

    String toString();
}
