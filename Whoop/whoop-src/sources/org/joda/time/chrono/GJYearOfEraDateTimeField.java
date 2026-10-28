package org.joda.time.chrono;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.DecoratedDateTimeField;
import org.joda.time.field.FieldUtils;

/* JADX INFO: loaded from: classes5.dex */
final class GJYearOfEraDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = -5961050944769862059L;
    private final BasicChronology iChronology;

    public GJYearOfEraDateTimeField(DateTimeField dateTimeField, BasicChronology basicChronology) {
        super(dateTimeField, DateTimeFieldType.yearOfEra());
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.yearOfEra();
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
        return i13 <= 0 ? 1 - i13 : i13;
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
        return 1;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.eras();
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
        FieldUtils.verifyValueBounds(this, i13, 1, getMaximumValue());
        if (this.iChronology.getYear(j7) <= 0) {
            i13 = 1 - i13;
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
