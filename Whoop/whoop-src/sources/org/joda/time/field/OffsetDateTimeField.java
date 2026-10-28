package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* JADX INFO: loaded from: classes5.dex */
public class OffsetDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 3145790132623583142L;
    private final int iMax;
    private final int iMin;
    private final int iOffset;

    public OffsetDateTimeField(DateTimeField dateTimeField, int i13) {
        this(dateTimeField, dateTimeField == null ? null : dateTimeField.getType(), i13, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j7, int i13) {
        long jAdd = super.add(j7, i13);
        FieldUtils.verifyValueBounds(this, get(jAdd), this.iMin, this.iMax);
        return jAdd;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j7, int i13) {
        return set(j7, FieldUtils.getWrappedValue(get(j7), i13, this.iMin, this.iMax));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j7) {
        return super.get(j7) + this.iOffset;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j7) {
        return getWrappedField().getLeapAmount(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return getWrappedField().getLeapDurationField();
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMin;
    }

    public int getOffset() {
        return this.iOffset;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j7) {
        return getWrappedField().isLeap(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j7) {
        return getWrappedField().remainder(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundCeiling(long j7) {
        return getWrappedField().roundCeiling(j7);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j7) {
        return getWrappedField().roundFloor(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfCeiling(long j7) {
        return getWrappedField().roundHalfCeiling(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfEven(long j7) {
        return getWrappedField().roundHalfEven(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfFloor(long j7) {
        return getWrappedField().roundHalfFloor(j7);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j7, int i13) {
        FieldUtils.verifyValueBounds(this, i13, this.iMin, this.iMax);
        return super.set(j7, i13 - this.iOffset);
    }

    public OffsetDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i13) {
        this(dateTimeField, dateTimeFieldType, i13, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public OffsetDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i13, int i14, int i15) {
        super(dateTimeField, dateTimeFieldType);
        if (i13 != 0) {
            this.iOffset = i13;
            if (i14 < dateTimeField.getMinimumValue() + i13) {
                this.iMin = dateTimeField.getMinimumValue() + i13;
            } else {
                this.iMin = i14;
            }
            if (i15 > dateTimeField.getMaximumValue() + i13) {
                this.iMax = dateTimeField.getMaximumValue() + i13;
                return;
            } else {
                this.iMax = i15;
                return;
            }
        }
        throw new IllegalArgumentException("The offset cannot be zero");
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j7, long j13) {
        long jAdd = super.add(j7, j13);
        FieldUtils.verifyValueBounds(this, get(jAdd), this.iMin, this.iMax);
        return jAdd;
    }
}
