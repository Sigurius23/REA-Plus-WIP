package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* JADX INFO: loaded from: classes5.dex */
public class PreciseDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -5586801265774496376L;
    private final int iRange;
    private final DurationField iRangeField;

    public PreciseDateTimeField(DateTimeFieldType dateTimeFieldType, DurationField durationField, DurationField durationField2) {
        super(dateTimeFieldType, durationField);
        if (!durationField2.isPrecise()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        int unitMillis = (int) (durationField2.getUnitMillis() / getUnitMillis());
        this.iRange = unitMillis;
        if (unitMillis < 2) {
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        this.iRangeField = durationField2;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j7, int i13) {
        int i14 = get(j7);
        return (getUnitMillis() * ((long) (FieldUtils.getWrappedValue(i14, i13, getMinimumValue(), getMaximumValue()) - i14))) + j7;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j7) {
        return j7 >= 0 ? (int) ((j7 / getUnitMillis()) % ((long) this.iRange)) : (this.iRange - 1) + ((int) (((j7 + 1) / getUnitMillis()) % ((long) this.iRange)));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iRange - 1;
    }

    public int getRange() {
        return this.iRange;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iRangeField;
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j7, int i13) {
        FieldUtils.verifyValueBounds(this, i13, getMinimumValue(), getMaximumValue());
        return (((long) (i13 - get(j7))) * this.iUnitMillis) + j7;
    }
}
