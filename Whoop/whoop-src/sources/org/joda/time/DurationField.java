package org.joda.time;

/* JADX INFO: loaded from: classes5.dex */
public abstract class DurationField implements Comparable<DurationField> {
    public abstract long add(long j7, int i13);

    public abstract long add(long j7, long j13);

    public abstract int getDifference(long j7, long j13);

    public abstract long getDifferenceAsLong(long j7, long j13);

    public abstract long getMillis(int i13);

    public abstract long getMillis(int i13, long j7);

    public abstract long getMillis(long j7);

    public abstract long getMillis(long j7, long j13);

    public abstract String getName();

    public abstract DurationFieldType getType();

    public abstract long getUnitMillis();

    public abstract int getValue(long j7);

    public abstract int getValue(long j7, long j13);

    public abstract long getValueAsLong(long j7);

    public abstract long getValueAsLong(long j7, long j13);

    public abstract boolean isPrecise();

    public abstract boolean isSupported();

    public long subtract(long j7, int i13) {
        return i13 == Integer.MIN_VALUE ? subtract(j7, i13) : add(j7, -i13);
    }

    public abstract String toString();

    public long subtract(long j7, long j13) {
        if (j13 != Long.MIN_VALUE) {
            return add(j7, -j13);
        }
        throw new ArithmeticException("Long.MIN_VALUE cannot be negated");
    }
}
