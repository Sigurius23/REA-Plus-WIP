package org.joda.time;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISODateTimeFormat;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class TimeOfDay extends BasePartial implements ReadablePartial, Serializable {
    public static final int HOUR_OF_DAY = 0;
    public static final int MILLIS_OF_SECOND = 3;
    public static final int MINUTE_OF_HOUR = 1;
    public static final int SECOND_OF_MINUTE = 2;
    private static final long serialVersionUID = 3633353405803318660L;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()};
    public static final TimeOfDay MIDNIGHT = new TimeOfDay(0, 0, 0, 0);

    public TimeOfDay() {
    }

    public static TimeOfDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new TimeOfDay(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static TimeOfDay fromDateFields(Date date) {
        if (date != null) {
            return new TimeOfDay(date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static TimeOfDay fromMillisOfDay(long j7) {
        return fromMillisOfDay(j7, null);
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i13, Chronology chronology) {
        if (i13 == 0) {
            return chronology.hourOfDay();
        }
        if (i13 == 1) {
            return chronology.minuteOfHour();
        }
        if (i13 == 2) {
            return chronology.secondOfMinute();
        }
        if (i13 == 3) {
            return chronology.millisOfSecond();
        }
        throw new IndexOutOfBoundsException(AbstractC2875y.m8295h(i13, "Invalid index: "));
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public DateTimeFieldType getFieldType(int i13) {
        return FIELD_TYPES[i13];
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }

    public int getHourOfDay() {
        return getValue(0);
    }

    public int getMillisOfSecond() {
        return getValue(3);
    }

    public int getMinuteOfHour() {
        return getValue(1);
    }

    public int getSecondOfMinute() {
        return getValue(2);
    }

    public Property hourOfDay() {
        return new Property(this, 0);
    }

    public Property millisOfSecond() {
        return new Property(this, 3);
    }

    public TimeOfDay minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public TimeOfDay minusHours(int i13) {
        return withFieldAdded(DurationFieldType.hours(), FieldUtils.safeNegate(i13));
    }

    public TimeOfDay minusMillis(int i13) {
        return withFieldAdded(DurationFieldType.millis(), FieldUtils.safeNegate(i13));
    }

    public TimeOfDay minusMinutes(int i13) {
        return withFieldAdded(DurationFieldType.minutes(), FieldUtils.safeNegate(i13));
    }

    public TimeOfDay minusSeconds(int i13) {
        return withFieldAdded(DurationFieldType.seconds(), FieldUtils.safeNegate(i13));
    }

    public Property minuteOfHour() {
        return new Property(this, 1);
    }

    public TimeOfDay plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public TimeOfDay plusHours(int i13) {
        return withFieldAdded(DurationFieldType.hours(), i13);
    }

    public TimeOfDay plusMillis(int i13) {
        return withFieldAdded(DurationFieldType.millis(), i13);
    }

    public TimeOfDay plusMinutes(int i13) {
        return withFieldAdded(DurationFieldType.minutes(), i13);
    }

    public TimeOfDay plusSeconds(int i13) {
        return withFieldAdded(DurationFieldType.seconds(), i13);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    public Property secondOfMinute() {
        return new Property(this, 2);
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 4;
    }

    public DateTime toDateTimeToday() {
        return toDateTimeToday(null);
    }

    public LocalTime toLocalTime() {
        return new LocalTime(getHourOfDay(), getMinuteOfHour(), getSecondOfMinute(), getMillisOfSecond(), getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    public String toString() {
        return ISODateTimeFormat.tTime().print(this);
    }

    public TimeOfDay withChronologyRetainFields(Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronologyWithUTC == getChronology()) {
            return this;
        }
        TimeOfDay timeOfDay = new TimeOfDay(this, chronologyWithUTC);
        chronologyWithUTC.validate(timeOfDay, getValues());
        return timeOfDay;
    }

    public TimeOfDay withField(DateTimeFieldType dateTimeFieldType, int i13) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i13 == getValue(iIndexOfSupported)) {
            return this;
        }
        return new TimeOfDay(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i13));
    }

    public TimeOfDay withFieldAdded(DurationFieldType durationFieldType, int i13) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i13 == 0) {
            return this;
        }
        return new TimeOfDay(this, getField(iIndexOfSupported).addWrapPartial(this, iIndexOfSupported, getValues(), i13));
    }

    public TimeOfDay withHourOfDay(int i13) {
        return new TimeOfDay(this, getChronology().hourOfDay().set(this, 0, getValues(), i13));
    }

    public TimeOfDay withMillisOfSecond(int i13) {
        return new TimeOfDay(this, getChronology().millisOfSecond().set(this, 3, getValues(), i13));
    }

    public TimeOfDay withMinuteOfHour(int i13) {
        return new TimeOfDay(this, getChronology().minuteOfHour().set(this, 1, getValues(), i13));
    }

    public TimeOfDay withPeriodAdded(ReadablePeriod readablePeriod, int i13) {
        if (readablePeriod == null || i13 == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i14 = 0; i14 < readablePeriod.size(); i14++) {
            int iIndexOf = indexOf(readablePeriod.getFieldType(i14));
            if (iIndexOf >= 0) {
                values = getField(iIndexOf).addWrapPartial(this, iIndexOf, values, FieldUtils.safeMultiply(readablePeriod.getValue(i14), i13));
            }
        }
        return new TimeOfDay(this, values);
    }

    public TimeOfDay withSecondOfMinute(int i13) {
        return new TimeOfDay(this, getChronology().secondOfMinute().set(this, 2, getValues(), i13));
    }

    public TimeOfDay(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public static TimeOfDay fromMillisOfDay(long j7, Chronology chronology) {
        return new TimeOfDay(j7, DateTimeUtils.getChronology(chronology).withUTC());
    }

    public DateTime toDateTimeToday(DateTimeZone dateTimeZone) {
        Chronology chronologyWithZone = getChronology().withZone(dateTimeZone);
        return new DateTime(chronologyWithZone.set(this, DateTimeUtils.currentTimeMillis()), chronologyWithZone);
    }

    @Deprecated
    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5598459141741063833L;
        private final int iFieldIndex;
        private final TimeOfDay iTimeOfDay;

        public Property(TimeOfDay timeOfDay, int i13) {
            this.iTimeOfDay = timeOfDay;
            this.iFieldIndex = i13;
        }

        public TimeOfDay addNoWrapToCopy(int i13) {
            return new TimeOfDay(this.iTimeOfDay, getField().add(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i13));
        }

        public TimeOfDay addToCopy(int i13) {
            return new TimeOfDay(this.iTimeOfDay, getField().addWrapPartial(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i13));
        }

        public TimeOfDay addWrapFieldToCopy(int i13) {
            return new TimeOfDay(this.iTimeOfDay, getField().addWrapField(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i13));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iTimeOfDay.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iTimeOfDay.getField(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iTimeOfDay;
        }

        public TimeOfDay getTimeOfDay() {
            return this.iTimeOfDay;
        }

        public TimeOfDay setCopy(int i13) {
            return new TimeOfDay(this.iTimeOfDay, getField().set(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), i13));
        }

        public TimeOfDay withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public TimeOfDay withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public TimeOfDay setCopy(String str, Locale locale) {
            return new TimeOfDay(this.iTimeOfDay, getField().set(this.iTimeOfDay, this.iFieldIndex, this.iTimeOfDay.getValues(), str, locale));
        }

        public TimeOfDay setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public TimeOfDay(Chronology chronology) {
        super(chronology);
    }

    public TimeOfDay(long j7) {
        super(j7);
    }

    public TimeOfDay(long j7, Chronology chronology) {
        super(j7, chronology);
    }

    public TimeOfDay(Object obj) {
        super(obj, null, ISODateTimeFormat.timeParser());
    }

    public TimeOfDay(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.timeParser());
    }

    public TimeOfDay(int i13, int i14) {
        this(i13, i14, 0, 0, null);
    }

    public TimeOfDay(int i13, int i14, Chronology chronology) {
        this(i13, i14, 0, 0, chronology);
    }

    public TimeOfDay(int i13, int i14, int i15) {
        this(i13, i14, i15, 0, null);
    }

    public TimeOfDay(int i13, int i14, int i15, Chronology chronology) {
        this(i13, i14, i15, 0, chronology);
    }

    public TimeOfDay(int i13, int i14, int i15, int i16) {
        this(i13, i14, i15, i16, null);
    }

    public TimeOfDay(int i13, int i14, int i15, int i16, Chronology chronology) {
        super(new int[]{i13, i14, i15, i16}, chronology);
    }

    public TimeOfDay(TimeOfDay timeOfDay, int[] iArr) {
        super(timeOfDay, iArr);
    }

    public TimeOfDay(TimeOfDay timeOfDay, Chronology chronology) {
        super((BasePartial) timeOfDay, chronology);
    }
}
