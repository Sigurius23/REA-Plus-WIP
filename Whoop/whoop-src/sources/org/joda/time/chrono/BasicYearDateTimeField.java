package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/* JADX INFO: loaded from: classes5.dex */
class BasicYearDateTimeField extends ImpreciseDateTimeField {
    private static final long serialVersionUID = -98628754872287L;
    protected final BasicChronology iChronology;

    public BasicYearDateTimeField(BasicChronology basicChronology) {
        super(DateTimeFieldType.year(), basicChronology.getAverageMillisPerYear());
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.year();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j7, int i13) {
        return i13 == 0 ? j7 : set(j7, FieldUtils.safeAdd(get(j7), i13));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j7, int i13) {
        return i13 == 0 ? j7 : set(j7, FieldUtils.getWrappedValue(this.iChronology.getYear(j7), i13, this.iChronology.getMinYear(), this.iChronology.getMaxYear()));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j7) {
        return this.iChronology.getYear(j7);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j7, long j13) {
        return j7 < j13 ? -this.iChronology.getYearDifference(j13, j7) : this.iChronology.getYearDifference(j7, j13);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j7) {
        return this.iChronology.isLeapYear(get(j7)) ? 1 : 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.days();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iChronology.getMaxYear();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iChronology.getMinYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return null;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j7) {
        return this.iChronology.isLeapYear(get(j7));
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j7) {
        return j7 - roundFloor(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundCeiling(long j7) {
        int i13 = get(j7);
        return j7 != this.iChronology.getYearMillis(i13) ? this.iChronology.getYearMillis(i13 + 1) : j7;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j7) {
        return this.iChronology.getYearMillis(get(j7));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j7, int i13) {
        FieldUtils.verifyValueBounds(this, i13, this.iChronology.getMinYear(), this.iChronology.getMaxYear());
        return this.iChronology.setYear(j7, i13);
    }

    @Override // org.joda.time.DateTimeField
    public long setExtended(long j7, int i13) {
        FieldUtils.verifyValueBounds(this, i13, this.iChronology.getMinYear() - 1, this.iChronology.getMaxYear() + 1);
        return this.iChronology.setYear(j7, i13);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j7, long j13) {
        return add(j7, FieldUtils.safeToInt(j13));
    }
}
