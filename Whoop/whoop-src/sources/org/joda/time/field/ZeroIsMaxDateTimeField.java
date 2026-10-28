package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes5.dex */
public final class ZeroIsMaxDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 961749798233026866L;

    public ZeroIsMaxDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType) {
        super(dateTimeField, dateTimeFieldType);
        if (dateTimeField.getMinimumValue() != 0) {
            throw new IllegalArgumentException("Wrapped field's minumum value must be zero");
        }
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j7, int i13) {
        return getWrappedField().add(j7, i13);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j7, int i13) {
        return getWrappedField().addWrapField(j7, i13);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j7) {
        int i13 = getWrappedField().get(j7);
        return i13 == 0 ? getMaximumValue() : i13;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j7, long j13) {
        return getWrappedField().getDifference(j7, j13);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j7, long j13) {
        return getWrappedField().getDifferenceAsLong(j7, j13);
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
        return getWrappedField().getMaximumValue() + 1;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
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
        int maximumValue = getMaximumValue();
        FieldUtils.verifyValueBounds(this, i13, 1, maximumValue);
        if (i13 == maximumValue) {
            i13 = 0;
        }
        return getWrappedField().set(j7, i13);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j7, long j13) {
        return getWrappedField().add(j7, j13);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int[] addWrapField(ReadablePartial readablePartial, int i13, int[] iArr, int i14) {
        return getWrappedField().addWrapField(readablePartial, i13, iArr, i14);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(long j7) {
        return getWrappedField().getMaximumValue(j7) + 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue(long j7) {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        return getWrappedField().getMaximumValue(readablePartial) + 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial) {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        return getWrappedField().getMaximumValue(readablePartial, iArr) + 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        return 1;
    }
}
