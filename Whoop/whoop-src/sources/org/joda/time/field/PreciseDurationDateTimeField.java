package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PreciseDurationDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID = 5004523158306266035L;
    private final DurationField iUnitField;
    final long iUnitMillis;

    public PreciseDurationDateTimeField(DateTimeFieldType dateTimeFieldType, DurationField durationField) {
        super(dateTimeFieldType);
        if (!durationField.isPrecise()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long unitMillis = durationField.getUnitMillis();
        this.iUnitMillis = unitMillis;
        if (unitMillis < 1) {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        this.iUnitField = durationField;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.iUnitField;
    }

    public int getMaximumValueForSet(long j7, int i13) {
        return getMaximumValue(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 0;
    }

    public final long getUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j7) {
        if (j7 >= 0) {
            return j7 % this.iUnitMillis;
        }
        long j13 = this.iUnitMillis;
        return (((j7 + 1) % j13) + j13) - 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundCeiling(long j7) {
        if (j7 <= 0) {
            return j7 - (j7 % this.iUnitMillis);
        }
        long j13 = j7 - 1;
        long j14 = this.iUnitMillis;
        return (j13 - (j13 % j14)) + j14;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j7) {
        long j13;
        if (j7 >= 0) {
            j13 = j7 % this.iUnitMillis;
        } else {
            long j14 = j7 + 1;
            j13 = this.iUnitMillis;
            j7 = j14 - (j14 % j13);
        }
        return j7 - j13;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j7, int i13) {
        FieldUtils.verifyValueBounds(this, i13, getMinimumValue(), getMaximumValueForSet(j7, i13));
        return (((long) (i13 - get(j7))) * this.iUnitMillis) + j7;
    }
}
