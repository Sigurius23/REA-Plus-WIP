package org.joda.time.chrono;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.DecoratedDateTimeField;
import org.joda.time.field.FieldUtils;

/* JADX INFO: loaded from: classes5.dex */
class ISOYearOfEraDateTimeField extends DecoratedDateTimeField {
    static final DateTimeField INSTANCE = new ISOYearOfEraDateTimeField();
    private static final long serialVersionUID = 7037524068969447317L;

    private ISOYearOfEraDateTimeField() {
        super(GregorianChronology.getInstanceUTC().year(), DateTimeFieldType.yearOfEra());
    }

    private Object readResolve() {
        return INSTANCE;
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
        return i13 < 0 ? -i13 : i13;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j7, long j13) {
        return getWrappedField().getDifference(j7, j13);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j7, long j13) {
        return getWrappedField().getDifferenceAsLong(j7, j13);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return getWrappedField().getMaximumValue();
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 0;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return GregorianChronology.getInstanceUTC().eras();
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

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j7, int i13) {
        FieldUtils.verifyValueBounds(this, i13, 0, getMaximumValue());
        if (getWrappedField().get(j7) < 0) {
            i13 = -i13;
        }
        return super.set(j7, i13);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j7, long j13) {
        return getWrappedField().add(j7, j13);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int[] addWrapField(ReadablePartial readablePartial, int i13, int[] iArr, int i14) {
        return getWrappedField().addWrapField(readablePartial, i13, iArr, i14);
    }
}
