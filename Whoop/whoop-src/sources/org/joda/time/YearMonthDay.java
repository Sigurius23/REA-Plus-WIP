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
public final class YearMonthDay extends BasePartial implements ReadablePartial, Serializable {
    public static final int DAY_OF_MONTH = 2;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
    public static final int MONTH_OF_YEAR = 1;
    public static final int YEAR = 0;
    private static final long serialVersionUID = 797544782896179L;

    public YearMonthDay() {
    }

    public static YearMonthDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new YearMonthDay(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static YearMonthDay fromDateFields(Date date) {
        if (date != null) {
            return new YearMonthDay(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public Property dayOfMonth() {
        return new Property(this, 2);
    }

    public int getDayOfMonth() {
        return getValue(2);
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i13, Chronology chronology) {
        if (i13 == 0) {
            return chronology.year();
        }
        if (i13 == 1) {
            return chronology.monthOfYear();
        }
        if (i13 == 2) {
            return chronology.dayOfMonth();
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

    public int getMonthOfYear() {
        return getValue(1);
    }

    public int getYear() {
        return getValue(0);
    }

    public YearMonthDay minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public YearMonthDay minusDays(int i13) {
        return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(i13));
    }

    public YearMonthDay minusMonths(int i13) {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i13));
    }

    public YearMonthDay minusYears(int i13) {
        return withFieldAdded(DurationFieldType.years(), FieldUtils.safeNegate(i13));
    }

    public Property monthOfYear() {
        return new Property(this, 1);
    }

    public YearMonthDay plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public YearMonthDay plusDays(int i13) {
        return withFieldAdded(DurationFieldType.days(), i13);
    }

    public YearMonthDay plusMonths(int i13) {
        return withFieldAdded(DurationFieldType.months(), i13);
    }

    public YearMonthDay plusYears(int i13) {
        return withFieldAdded(DurationFieldType.years(), i13);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 3;
    }

    public DateMidnight toDateMidnight() {
        return toDateMidnight(null);
    }

    public DateTime toDateTime(TimeOfDay timeOfDay) {
        return toDateTime(timeOfDay, null);
    }

    public DateTime toDateTimeAtCurrentTime() {
        return toDateTimeAtCurrentTime(null);
    }

    public DateTime toDateTimeAtMidnight() {
        return toDateTimeAtMidnight(null);
    }

    public Interval toInterval() {
        return toInterval(null);
    }

    public LocalDate toLocalDate() {
        return new LocalDate(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    public String toString() {
        return ISODateTimeFormat.yearMonthDay().print(this);
    }

    public YearMonthDay withChronologyRetainFields(Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronologyWithUTC == getChronology()) {
            return this;
        }
        YearMonthDay yearMonthDay = new YearMonthDay(this, chronologyWithUTC);
        chronologyWithUTC.validate(yearMonthDay, getValues());
        return yearMonthDay;
    }

    public YearMonthDay withDayOfMonth(int i13) {
        return new YearMonthDay(this, getChronology().dayOfMonth().set(this, 2, getValues(), i13));
    }

    public YearMonthDay withField(DateTimeFieldType dateTimeFieldType, int i13) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i13 == getValue(iIndexOfSupported)) {
            return this;
        }
        return new YearMonthDay(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i13));
    }

    public YearMonthDay withFieldAdded(DurationFieldType durationFieldType, int i13) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i13 == 0) {
            return this;
        }
        return new YearMonthDay(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i13));
    }

    public YearMonthDay withMonthOfYear(int i13) {
        return new YearMonthDay(this, getChronology().monthOfYear().set(this, 1, getValues(), i13));
    }

    public YearMonthDay withPeriodAdded(ReadablePeriod readablePeriod, int i13) {
        if (readablePeriod == null || i13 == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i14 = 0; i14 < readablePeriod.size(); i14++) {
            int iIndexOf = indexOf(readablePeriod.getFieldType(i14));
            if (iIndexOf >= 0) {
                values = getField(iIndexOf).add(this, iIndexOf, values, FieldUtils.safeMultiply(readablePeriod.getValue(i14), i13));
            }
        }
        return new YearMonthDay(this, values);
    }

    public YearMonthDay withYear(int i13) {
        return new YearMonthDay(this, getChronology().year().set(this, 0, getValues(), i13));
    }

    public Property year() {
        return new Property(this, 0);
    }

    public YearMonthDay(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public DateMidnight toDateMidnight(DateTimeZone dateTimeZone) {
        return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology().withZone(dateTimeZone));
    }

    public DateTime toDateTime(TimeOfDay timeOfDay, DateTimeZone dateTimeZone) {
        Chronology chronologyWithZone = getChronology().withZone(dateTimeZone);
        long j7 = chronologyWithZone.set(this, DateTimeUtils.currentTimeMillis());
        if (timeOfDay != null) {
            j7 = chronologyWithZone.set(timeOfDay, j7);
        }
        return new DateTime(j7, chronologyWithZone);
    }

    public DateTime toDateTimeAtCurrentTime(DateTimeZone dateTimeZone) {
        Chronology chronologyWithZone = getChronology().withZone(dateTimeZone);
        return new DateTime(chronologyWithZone.set(this, DateTimeUtils.currentTimeMillis()), chronologyWithZone);
    }

    public DateTime toDateTimeAtMidnight(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, getChronology().withZone(dateTimeZone));
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        return toDateMidnight(DateTimeUtils.getZone(dateTimeZone)).toInterval();
    }

    @Deprecated
    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final int iFieldIndex;
        private final YearMonthDay iYearMonthDay;

        public Property(YearMonthDay yearMonthDay, int i13) {
            this.iYearMonthDay = yearMonthDay;
            this.iFieldIndex = i13;
        }

        public YearMonthDay addToCopy(int i13) {
            return new YearMonthDay(this.iYearMonthDay, getField().add(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i13));
        }

        public YearMonthDay addWrapFieldToCopy(int i13) {
            return new YearMonthDay(this.iYearMonthDay, getField().addWrapField(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i13));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iYearMonthDay.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iYearMonthDay.getField(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iYearMonthDay;
        }

        public YearMonthDay getYearMonthDay() {
            return this.iYearMonthDay;
        }

        public YearMonthDay setCopy(int i13) {
            return new YearMonthDay(this.iYearMonthDay, getField().set(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), i13));
        }

        public YearMonthDay withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public YearMonthDay withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public YearMonthDay setCopy(String str, Locale locale) {
            return new YearMonthDay(this.iYearMonthDay, getField().set(this.iYearMonthDay, this.iFieldIndex, this.iYearMonthDay.getValues(), str, locale));
        }

        public YearMonthDay setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public YearMonthDay(Chronology chronology) {
        super(chronology);
    }

    public YearMonthDay(long j7) {
        super(j7);
    }

    public YearMonthDay(long j7, Chronology chronology) {
        super(j7, chronology);
    }

    public YearMonthDay(Object obj) {
        super(obj, null, ISODateTimeFormat.dateOptionalTimeParser());
    }

    public YearMonthDay(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.dateOptionalTimeParser());
    }

    public YearMonthDay(int i13, int i14, int i15) {
        this(i13, i14, i15, null);
    }

    public YearMonthDay(int i13, int i14, int i15, Chronology chronology) {
        super(new int[]{i13, i14, i15}, chronology);
    }

    public YearMonthDay(YearMonthDay yearMonthDay, int[] iArr) {
        super(yearMonthDay, iArr);
    }

    public YearMonthDay(YearMonthDay yearMonthDay, Chronology chronology) {
        super((BasePartial) yearMonthDay, chronology);
    }
}
