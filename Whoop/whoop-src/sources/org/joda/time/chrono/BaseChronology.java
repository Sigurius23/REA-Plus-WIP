package org.joda.time.chrono;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseChronology extends Chronology implements Serializable {
    private static final long serialVersionUID = -7310865996721419676L;

    @Override // org.joda.time.Chronology
    public long add(ReadablePeriod readablePeriod, long j7, int i13) {
        if (i13 != 0 && readablePeriod != null) {
            int size = readablePeriod.size();
            for (int i14 = 0; i14 < size; i14++) {
                long value = readablePeriod.getValue(i14);
                if (value != 0) {
                    j7 = readablePeriod.getFieldType(i14).getField(this).add(j7, value * ((long) i13));
                }
            }
        }
        return j7;
    }

    @Override // org.joda.time.Chronology
    public DurationField centuries() {
        return UnsupportedDurationField.getInstance(DurationFieldType.centuries());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField centuryOfEra() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.centuryOfEra(), centuries());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField clockhourOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfDay(), hours());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField clockhourOfHalfday() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfHalfday(), hours());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField dayOfMonth() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfMonth(), days());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField dayOfWeek() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfWeek(), days());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField dayOfYear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfYear(), days());
    }

    @Override // org.joda.time.Chronology
    public DurationField days() {
        return UnsupportedDurationField.getInstance(DurationFieldType.days());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField era() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.era(), eras());
    }

    @Override // org.joda.time.Chronology
    public DurationField eras() {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    @Override // org.joda.time.Chronology
    public int[] get(ReadablePartial readablePartial, long j7) {
        int size = readablePartial.size();
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = readablePartial.getFieldType(i13).getField(this).get(j7);
        }
        return iArr;
    }

    @Override // org.joda.time.Chronology
    public long getDateTimeMillis(int i13, int i14, int i15, int i16) throws IllegalArgumentException {
        return millisOfDay().set(dayOfMonth().set(monthOfYear().set(year().set(0L, i13), i14), i15), i16);
    }

    @Override // org.joda.time.Chronology
    public abstract DateTimeZone getZone();

    @Override // org.joda.time.Chronology
    public DateTimeField halfdayOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.halfdayOfDay(), halfdays());
    }

    @Override // org.joda.time.Chronology
    public DurationField halfdays() {
        return UnsupportedDurationField.getInstance(DurationFieldType.halfdays());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField hourOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfDay(), hours());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField hourOfHalfday() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfHalfday(), hours());
    }

    @Override // org.joda.time.Chronology
    public DurationField hours() {
        return UnsupportedDurationField.getInstance(DurationFieldType.hours());
    }

    @Override // org.joda.time.Chronology
    public DurationField millis() {
        return UnsupportedDurationField.getInstance(DurationFieldType.millis());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField millisOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfDay(), millis());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField millisOfSecond() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfSecond(), millis());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField minuteOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfDay(), minutes());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField minuteOfHour() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfHour(), minutes());
    }

    @Override // org.joda.time.Chronology
    public DurationField minutes() {
        return UnsupportedDurationField.getInstance(DurationFieldType.minutes());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField monthOfYear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.monthOfYear(), months());
    }

    @Override // org.joda.time.Chronology
    public DurationField months() {
        return UnsupportedDurationField.getInstance(DurationFieldType.months());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField secondOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfDay(), seconds());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField secondOfMinute() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfMinute(), seconds());
    }

    @Override // org.joda.time.Chronology
    public DurationField seconds() {
        return UnsupportedDurationField.getInstance(DurationFieldType.seconds());
    }

    @Override // org.joda.time.Chronology
    public long set(ReadablePartial readablePartial, long j7) {
        int size = readablePartial.size();
        for (int i13 = 0; i13 < size; i13++) {
            j7 = readablePartial.getFieldType(i13).getField(this).set(j7, readablePartial.getValue(i13));
        }
        return j7;
    }

    @Override // org.joda.time.Chronology
    public abstract String toString();

    @Override // org.joda.time.Chronology
    public void validate(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        for (int i13 = 0; i13 < size; i13++) {
            int i14 = iArr[i13];
            DateTimeField field = readablePartial.getField(i13);
            if (i14 < field.getMinimumValue()) {
                throw new IllegalFieldValueException(field.getType(), Integer.valueOf(i14), Integer.valueOf(field.getMinimumValue()), (Number) null);
            }
            if (i14 > field.getMaximumValue()) {
                throw new IllegalFieldValueException(field.getType(), Integer.valueOf(i14), (Number) null, Integer.valueOf(field.getMaximumValue()));
            }
        }
        for (int i15 = 0; i15 < size; i15++) {
            int i16 = iArr[i15];
            DateTimeField field2 = readablePartial.getField(i15);
            if (i16 < field2.getMinimumValue(readablePartial, iArr)) {
                throw new IllegalFieldValueException(field2.getType(), Integer.valueOf(i16), Integer.valueOf(field2.getMinimumValue(readablePartial, iArr)), (Number) null);
            }
            if (i16 > field2.getMaximumValue(readablePartial, iArr)) {
                throw new IllegalFieldValueException(field2.getType(), Integer.valueOf(i16), (Number) null, Integer.valueOf(field2.getMaximumValue(readablePartial, iArr)));
            }
        }
    }

    @Override // org.joda.time.Chronology
    public DateTimeField weekOfWeekyear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekOfWeekyear(), weeks());
    }

    @Override // org.joda.time.Chronology
    public DurationField weeks() {
        return UnsupportedDurationField.getInstance(DurationFieldType.weeks());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField weekyear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyear(), weekyears());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField weekyearOfCentury() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyearOfCentury(), weekyears());
    }

    @Override // org.joda.time.Chronology
    public DurationField weekyears() {
        return UnsupportedDurationField.getInstance(DurationFieldType.weekyears());
    }

    @Override // org.joda.time.Chronology
    public abstract Chronology withUTC();

    @Override // org.joda.time.Chronology
    public abstract Chronology withZone(DateTimeZone dateTimeZone);

    @Override // org.joda.time.Chronology
    public DateTimeField year() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), years());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField yearOfCentury() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfCentury(), years());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField yearOfEra() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfEra(), years());
    }

    @Override // org.joda.time.Chronology
    public DurationField years() {
        return UnsupportedDurationField.getInstance(DurationFieldType.years());
    }

    @Override // org.joda.time.Chronology
    public long add(long j7, long j13, int i13) {
        return (j13 == 0 || i13 == 0) ? j7 : FieldUtils.safeAdd(j7, FieldUtils.safeMultiply(j13, i13));
    }

    @Override // org.joda.time.Chronology
    public int[] get(ReadablePeriod readablePeriod, long j7, long j13) {
        int size = readablePeriod.size();
        int[] iArr = new int[size];
        if (j7 != j13) {
            for (int i13 = 0; i13 < size; i13++) {
                DurationField field = readablePeriod.getFieldType(i13).getField(this);
                int difference = field.getDifference(j13, j7);
                if (difference != 0) {
                    j7 = field.add(j7, difference);
                }
                iArr[i13] = difference;
            }
        }
        return iArr;
    }

    @Override // org.joda.time.Chronology
    public long getDateTimeMillis(int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws IllegalArgumentException {
        return millisOfSecond().set(secondOfMinute().set(minuteOfHour().set(hourOfDay().set(dayOfMonth().set(monthOfYear().set(year().set(0L, i13), i14), i15), i16), i17), i18), i19);
    }

    @Override // org.joda.time.Chronology
    public int[] get(ReadablePeriod readablePeriod, long j7) {
        int size = readablePeriod.size();
        int[] iArr = new int[size];
        long jAdd = 0;
        if (j7 != 0) {
            for (int i13 = 0; i13 < size; i13++) {
                DurationField field = readablePeriod.getFieldType(i13).getField(this);
                if (field.isPrecise()) {
                    int difference = field.getDifference(j7, jAdd);
                    jAdd = field.add(jAdd, difference);
                    iArr[i13] = difference;
                }
            }
        }
        return iArr;
    }

    @Override // org.joda.time.Chronology
    public long getDateTimeMillis(long j7, int i13, int i14, int i15, int i16) throws IllegalArgumentException {
        return millisOfSecond().set(secondOfMinute().set(minuteOfHour().set(hourOfDay().set(j7, i13), i14), i15), i16);
    }
}
