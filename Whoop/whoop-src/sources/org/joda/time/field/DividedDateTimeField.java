package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* JADX INFO: loaded from: classes5.dex */
public class DividedDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 8318475124230605365L;
    final int iDivisor;
    final DurationField iDurationField;
    private final int iMax;
    private final int iMin;
    final DurationField iRangeDurationField;

    public DividedDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i13) {
        this(dateTimeField, dateTimeField.getRangeDurationField(), dateTimeFieldType, i13);
    }

    private int getRemainder(int i13) {
        if (i13 >= 0) {
            return i13 % this.iDivisor;
        }
        int i14 = this.iDivisor;
        return ((i13 + 1) % i14) + (i14 - 1);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j7, int i13) {
        return getWrappedField().add(j7, i13 * this.iDivisor);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j7, int i13) {
        return set(j7, FieldUtils.getWrappedValue(get(j7), i13, this.iMin, this.iMax));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j7) {
        int i13 = getWrappedField().get(j7);
        return i13 >= 0 ? i13 / this.iDivisor : ((i13 + 1) / this.iDivisor) - 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j7, long j13) {
        return getWrappedField().getDifference(j7, j13) / this.iDivisor;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j7, long j13) {
        return getWrappedField().getDifferenceAsLong(j7, j13) / ((long) this.iDivisor);
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
        return this.iMax;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMin;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        DurationField durationField = this.iRangeDurationField;
        return durationField != null ? durationField : super.getRangeDurationField();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j7) {
        return set(j7, get(getWrappedField().remainder(j7)));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j7) {
        DateTimeField wrappedField = getWrappedField();
        return wrappedField.roundFloor(wrappedField.set(j7, get(j7) * this.iDivisor));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j7, int i13) {
        FieldUtils.verifyValueBounds(this, i13, this.iMin, this.iMax);
        return getWrappedField().set(j7, (i13 * this.iDivisor) + getRemainder(getWrappedField().get(j7)));
    }

    public DividedDateTimeField(DateTimeField dateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType, int i13) {
        super(dateTimeField, dateTimeFieldType);
        if (i13 < 2) {
            throw new IllegalArgumentException("The divisor must be at least 2");
        }
        DurationField durationField2 = dateTimeField.getDurationField();
        if (durationField2 == null) {
            this.iDurationField = null;
        } else {
            this.iDurationField = new ScaledDurationField(durationField2, dateTimeFieldType.getDurationType(), i13);
        }
        this.iRangeDurationField = durationField;
        this.iDivisor = i13;
        int minimumValue = dateTimeField.getMinimumValue();
        int i14 = minimumValue >= 0 ? minimumValue / i13 : ((minimumValue + 1) / i13) - 1;
        int maximumValue = dateTimeField.getMaximumValue();
        int i15 = maximumValue >= 0 ? maximumValue / i13 : ((maximumValue + 1) / i13) - 1;
        this.iMin = i14;
        this.iMax = i15;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j7, long j13) {
        return getWrappedField().add(j7, j13 * ((long) this.iDivisor));
    }

    public DividedDateTimeField(RemainderDateTimeField remainderDateTimeField, DateTimeFieldType dateTimeFieldType) {
        this(remainderDateTimeField, (DurationField) null, dateTimeFieldType);
    }

    public DividedDateTimeField(RemainderDateTimeField remainderDateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType) {
        super(remainderDateTimeField.getWrappedField(), dateTimeFieldType);
        int i13 = remainderDateTimeField.iDivisor;
        this.iDivisor = i13;
        this.iDurationField = remainderDateTimeField.iRangeField;
        this.iRangeDurationField = durationField;
        DateTimeField wrappedField = getWrappedField();
        int minimumValue = wrappedField.getMinimumValue();
        int i14 = minimumValue >= 0 ? minimumValue / i13 : ((minimumValue + 1) / i13) - 1;
        int maximumValue = wrappedField.getMaximumValue();
        int i15 = maximumValue >= 0 ? maximumValue / i13 : ((maximumValue + 1) / i13) - 1;
        this.iMin = i14;
        this.iMax = i15;
    }
}
