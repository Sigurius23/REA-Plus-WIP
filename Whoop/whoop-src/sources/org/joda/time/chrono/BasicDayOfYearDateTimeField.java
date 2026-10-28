package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.PreciseDurationDateTimeField;

/* JADX INFO: loaded from: classes5.dex */
final class BasicDayOfYearDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -6821236822336841037L;
    private final BasicChronology iChronology;

    public BasicDayOfYearDateTimeField(BasicChronology basicChronology, DurationField durationField) {
        super(DateTimeFieldType.dayOfYear(), durationField);
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.dayOfYear();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j7) {
        return this.iChronology.getDayOfYear(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iChronology.getDaysInYearMax();
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField
    public int getMaximumValueForSet(long j7, int i13) {
        int daysInYearMax = this.iChronology.getDaysInYearMax() - 1;
        return (i13 > daysInYearMax || i13 < 1) ? getMaximumValue(j7) : daysInYearMax;
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.years();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j7) {
        return this.iChronology.isLeapDay(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(long j7) {
        return this.iChronology.getDaysInYear(this.iChronology.getYear(j7));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        if (readablePartial.isSupported(DateTimeFieldType.year())) {
            return this.iChronology.getDaysInYear(readablePartial.get(DateTimeFieldType.year()));
        }
        return this.iChronology.getDaysInYearMax();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (readablePartial.getFieldType(i13) == DateTimeFieldType.year()) {
                return this.iChronology.getDaysInYear(iArr[i13]);
            }
        }
        return this.iChronology.getDaysInYearMax();
    }
}
