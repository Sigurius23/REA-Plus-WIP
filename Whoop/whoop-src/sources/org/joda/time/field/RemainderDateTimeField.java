package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* JADX INFO: loaded from: classes5.dex */
public class RemainderDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 5708241235177666790L;
    final int iDivisor;
    final DurationField iDurationField;
    final DurationField iRangeField;

    public RemainderDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i13) {
        super(dateTimeField, dateTimeFieldType);
        if (i13 < 2) {
            throw new IllegalArgumentException("The divisor must be at least 2");
        }
        DurationField durationField = dateTimeField.getDurationField();
        if (durationField == null) {
            this.iRangeField = null;
        } else {
            this.iRangeField = new ScaledDurationField(durationField, dateTimeFieldType.getRangeDurationType(), i13);
        }
        this.iDurationField = dateTimeField.getDurationField();
        this.iDivisor = i13;
    }

    private int getDivided(int i13) {
        return i13 >= 0 ? i13 / this.iDivisor : ((i13 + 1) / this.iDivisor) - 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j7, int i13) {
        return set(j7, FieldUtils.getWrappedValue(get(j7), i13, 0, this.iDivisor - 1));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j7) {
        int i13 = getWrappedField().get(j7);
        if (i13 >= 0) {
            return i13 % this.iDivisor;
        }
        int i14 = this.iDivisor;
        return ((i13 + 1) % i14) + (i14 - 1);
    }

    public int getDivisor() {
        return this.iDivisor;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.iDurationField;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iDivisor - 1;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 0;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iRangeField;
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
        FieldUtils.verifyValueBounds(this, i13, 0, this.iDivisor - 1);
        return getWrappedField().set(j7, (getDivided(getWrappedField().get(j7)) * this.iDivisor) + i13);
    }

    public RemainderDateTimeField(DateTimeField dateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType, int i13) {
        super(dateTimeField, dateTimeFieldType);
        if (i13 >= 2) {
            this.iRangeField = durationField;
            this.iDurationField = dateTimeField.getDurationField();
            this.iDivisor = i13;
            return;
        }
        throw new IllegalArgumentException("The divisor must be at least 2");
    }

    public RemainderDateTimeField(DividedDateTimeField dividedDateTimeField) {
        this(dividedDateTimeField, dividedDateTimeField.getType());
    }

    public RemainderDateTimeField(DividedDateTimeField dividedDateTimeField, DateTimeFieldType dateTimeFieldType) {
        this(dividedDateTimeField, dividedDateTimeField.getWrappedField().getDurationField(), dateTimeFieldType);
    }

    public RemainderDateTimeField(DividedDateTimeField dividedDateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType) {
        super(dividedDateTimeField.getWrappedField(), dateTimeFieldType);
        this.iDivisor = dividedDateTimeField.iDivisor;
        this.iDurationField = durationField;
        this.iRangeField = dividedDateTimeField.iDurationField;
    }
}
