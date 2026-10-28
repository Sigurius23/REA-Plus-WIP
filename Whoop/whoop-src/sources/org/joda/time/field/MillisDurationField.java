package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes5.dex */
public final class MillisDurationField extends DurationField implements Serializable {
    public static final DurationField INSTANCE = new MillisDurationField();
    private static final long serialVersionUID = 2656707858124633367L;

    private MillisDurationField() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // org.joda.time.DurationField
    public long add(long j7, int i13) {
        return FieldUtils.safeAdd(j7, i13);
    }

    public boolean equals(Object obj) {
        return (obj instanceof MillisDurationField) && getUnitMillis() == ((MillisDurationField) obj).getUnitMillis();
    }

    @Override // org.joda.time.DurationField
    public int getDifference(long j7, long j13) {
        return FieldUtils.safeToInt(FieldUtils.safeSubtract(j7, j13));
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j7, long j13) {
        return FieldUtils.safeSubtract(j7, j13);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i13) {
        return i13;
    }

    @Override // org.joda.time.DurationField
    public String getName() {
        return "millis";
    }

    @Override // org.joda.time.DurationField
    public DurationFieldType getType() {
        return DurationFieldType.millis();
    }

    @Override // org.joda.time.DurationField
    public final long getUnitMillis() {
        return 1L;
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j7) {
        return FieldUtils.safeToInt(j7);
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j7) {
        return j7;
    }

    public int hashCode() {
        return (int) getUnitMillis();
    }

    @Override // org.joda.time.DurationField
    public final boolean isPrecise() {
        return true;
    }

    @Override // org.joda.time.DurationField
    public boolean isSupported() {
        return true;
    }

    @Override // org.joda.time.DurationField
    public String toString() {
        return "DurationField[millis]";
    }

    @Override // org.joda.time.DurationField
    public long add(long j7, long j13) {
        return FieldUtils.safeAdd(j7, j13);
    }

    @Override // java.lang.Comparable
    public int compareTo(DurationField durationField) {
        long unitMillis = durationField.getUnitMillis();
        long unitMillis2 = getUnitMillis();
        if (unitMillis2 == unitMillis) {
            return 0;
        }
        return unitMillis2 < unitMillis ? -1 : 1;
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i13, long j7) {
        return i13;
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j7, long j13) {
        return FieldUtils.safeToInt(j7);
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j7, long j13) {
        return j7;
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j7) {
        return j7;
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j7, long j13) {
        return j7;
    }
}
