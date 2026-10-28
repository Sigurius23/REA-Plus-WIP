package org.joda.time;

/* JADX INFO: loaded from: classes5.dex */
public interface ReadablePartial extends Comparable<ReadablePartial> {
    boolean equals(Object obj);

    int get(DateTimeFieldType dateTimeFieldType);

    Chronology getChronology();

    DateTimeField getField(int i13);

    DateTimeFieldType getFieldType(int i13);

    int getValue(int i13);

    int hashCode();

    boolean isSupported(DateTimeFieldType dateTimeFieldType);

    int size();

    DateTime toDateTime(ReadableInstant readableInstant);

    String toString();
}
