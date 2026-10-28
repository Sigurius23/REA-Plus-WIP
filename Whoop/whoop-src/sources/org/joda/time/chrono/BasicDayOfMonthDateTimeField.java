package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.PreciseDurationDateTimeField;

/* JADX INFO: loaded from: classes5.dex */
final class BasicDayOfMonthDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -4677223814028011723L;
    private final BasicChronology iChronology;

    public BasicDayOfMonthDateTimeField(BasicChronology basicChronology, DurationField durationField) {
        super(DateTimeFieldType.dayOfMonth(), durationField);
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.dayOfMonth();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j7) {
        return this.iChronology.getDayOfMonth(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iChronology.getDaysInMonthMax();
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField
    public int getMaximumValueForSet(long j7, int i13) {
        return this.iChronology.getDaysInMonthMaxForSet(j7, i13);
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.months();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j7) {
        return this.iChronology.isLeapDay(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(long j7) {
        return this.iChronology.getDaysInMonthMax(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        if (readablePartial.isSupported(DateTimeFieldType.monthOfYear())) {
            int i13 = readablePartial.get(DateTimeFieldType.monthOfYear());
            if (readablePartial.isSupported(DateTimeFieldType.year())) {
                return this.iChronology.getDaysInYearMonth(readablePartial.get(DateTimeFieldType.year()), i13);
            }
            return this.iChronology.getDaysInMonthMax(i13);
        }
        return getMaximumValue();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (readablePartial.getFieldType(i13) == DateTimeFieldType.monthOfYear()) {
                int i14 = iArr[i13];
                for (int i15 = 0; i15 < size; i15++) {
                    if (readablePartial.getFieldType(i15) == DateTimeFieldType.year()) {
                        return this.iChronology.getDaysInYearMonth(iArr[i15], i14);
                    }
                }
                return this.iChronology.getDaysInMonthMax(i14);
            }
        }
        return getMaximumValue();
    }
}
