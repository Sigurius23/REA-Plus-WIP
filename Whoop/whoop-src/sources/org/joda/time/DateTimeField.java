package org.joda.time;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public abstract class DateTimeField {
    public abstract long add(long j7, int i13);

    public abstract long add(long j7, long j13);

    public abstract int[] add(ReadablePartial readablePartial, int i13, int[] iArr, int i14);

    public abstract long addWrapField(long j7, int i13);

    public abstract int[] addWrapField(ReadablePartial readablePartial, int i13, int[] iArr, int i14);

    public abstract int[] addWrapPartial(ReadablePartial readablePartial, int i13, int[] iArr, int i14);

    public abstract int get(long j7);

    public abstract String getAsShortText(int i13, Locale locale);

    public abstract String getAsShortText(long j7);

    public abstract String getAsShortText(long j7, Locale locale);

    public abstract String getAsShortText(ReadablePartial readablePartial, int i13, Locale locale);

    public abstract String getAsShortText(ReadablePartial readablePartial, Locale locale);

    public abstract String getAsText(int i13, Locale locale);

    public abstract String getAsText(long j7);

    public abstract String getAsText(long j7, Locale locale);

    public abstract String getAsText(ReadablePartial readablePartial, int i13, Locale locale);

    public abstract String getAsText(ReadablePartial readablePartial, Locale locale);

    public abstract int getDifference(long j7, long j13);

    public abstract long getDifferenceAsLong(long j7, long j13);

    public abstract DurationField getDurationField();

    public abstract int getLeapAmount(long j7);

    public abstract DurationField getLeapDurationField();

    public abstract int getMaximumShortTextLength(Locale locale);

    public abstract int getMaximumTextLength(Locale locale);

    public abstract int getMaximumValue();

    public abstract int getMaximumValue(long j7);

    public abstract int getMaximumValue(ReadablePartial readablePartial);

    public abstract int getMaximumValue(ReadablePartial readablePartial, int[] iArr);

    public abstract int getMinimumValue();

    public abstract int getMinimumValue(long j7);

    public abstract int getMinimumValue(ReadablePartial readablePartial);

    public abstract int getMinimumValue(ReadablePartial readablePartial, int[] iArr);

    public abstract String getName();

    public abstract DurationField getRangeDurationField();

    public abstract DateTimeFieldType getType();

    public abstract boolean isLeap(long j7);

    public abstract boolean isLenient();

    public abstract boolean isSupported();

    public abstract long remainder(long j7);

    public abstract long roundCeiling(long j7);

    public abstract long roundFloor(long j7);

    public abstract long roundHalfCeiling(long j7);

    public abstract long roundHalfEven(long j7);

    public abstract long roundHalfFloor(long j7);

    public abstract long set(long j7, int i13);

    public abstract long set(long j7, String str);

    public abstract long set(long j7, String str, Locale locale);

    public abstract int[] set(ReadablePartial readablePartial, int i13, int[] iArr, int i14);

    public abstract int[] set(ReadablePartial readablePartial, int i13, int[] iArr, String str, Locale locale);

    public long setExtended(long j7, int i13) {
        return set(j7, i13);
    }

    public abstract String toString();
}
