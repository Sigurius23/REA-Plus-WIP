package org.joda.time;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes3.dex */
public final class YearMonth extends BasePartial implements ReadablePartial, Serializable {
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
    public static final int MONTH_OF_YEAR = 1;
    public static final int YEAR = 0;
    private static final long serialVersionUID = 797544782896179L;

    public YearMonth() {
    }

    public static YearMonth fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new YearMonth(calendar.get(1), calendar.get(2) + 1);
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static YearMonth fromDateFields(Date date) {
        if (date != null) {
            return new YearMonth(date.getYear() + 1900, date.getMonth() + 1);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static YearMonth now() {
        return new YearMonth();
    }

    @FromString
    public static YearMonth parse(String str) {
        return parse(str, ISODateTimeFormat.localDateParser());
    }

    private Object readResolve() {
        return !DateTimeZone.UTC.equals(getChronology().getZone()) ? new YearMonth(this, getChronology().withUTC()) : this;
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i13, Chronology chronology) {
        if (i13 == 0) {
            return chronology.year();
        }
        if (i13 == 1) {
            return chronology.monthOfYear();
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

    public YearMonth minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public YearMonth minusMonths(int i13) {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i13));
    }

    public YearMonth minusYears(int i13) {
        return withFieldAdded(DurationFieldType.years(), FieldUtils.safeNegate(i13));
    }

    public Property monthOfYear() {
        return new Property(this, 1);
    }

    public YearMonth plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public YearMonth plusMonths(int i13) {
        return withFieldAdded(DurationFieldType.months(), i13);
    }

    public YearMonth plusYears(int i13) {
        return withFieldAdded(DurationFieldType.years(), i13);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 2;
    }

    public Interval toInterval() {
        return toInterval(null);
    }

    public LocalDate toLocalDate(int i13) {
        return new LocalDate(getYear(), getMonthOfYear(), i13, getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    @ToString
    public String toString() {
        return ISODateTimeFormat.yearMonth().print(this);
    }

    public YearMonth withChronologyRetainFields(Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronologyWithUTC == getChronology()) {
            return this;
        }
        YearMonth yearMonth = new YearMonth(this, chronologyWithUTC);
        chronologyWithUTC.validate(yearMonth, getValues());
        return yearMonth;
    }

    public YearMonth withField(DateTimeFieldType dateTimeFieldType, int i13) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i13 == getValue(iIndexOfSupported)) {
            return this;
        }
        return new YearMonth(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i13));
    }

    public YearMonth withFieldAdded(DurationFieldType durationFieldType, int i13) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i13 == 0) {
            return this;
        }
        return new YearMonth(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i13));
    }

    public YearMonth withMonthOfYear(int i13) {
        return new YearMonth(this, getChronology().monthOfYear().set(this, 1, getValues(), i13));
    }

    public YearMonth withPeriodAdded(ReadablePeriod readablePeriod, int i13) {
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
        return new YearMonth(this, values);
    }

    public YearMonth withYear(int i13) {
        return new YearMonth(this, getChronology().year().set(this, 0, getValues(), i13));
    }

    public Property year() {
        return new Property(this, 0);
    }

    public YearMonth(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public static YearMonth now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new YearMonth(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    public static YearMonth parse(String str, DateTimeFormatter dateTimeFormatter) {
        LocalDate localDate = dateTimeFormatter.parseLocalDate(str);
        return new YearMonth(localDate.getYear(), localDate.getMonthOfYear());
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        return new Interval(toLocalDate(1).toDateTimeAtStartOfDay(zone), plusMonths(1).toLocalDate(1).toDateTimeAtStartOfDay(zone));
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).print(this);
    }

    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final YearMonth iBase;
        private final int iFieldIndex;

        public Property(YearMonth yearMonth, int i13) {
            this.iBase = yearMonth;
            this.iFieldIndex = i13;
        }

        public YearMonth addToCopy(int i13) {
            return new YearMonth(this.iBase, getField().add(this.iBase, this.iFieldIndex, this.iBase.getValues(), i13));
        }

        public YearMonth addWrapFieldToCopy(int i13) {
            return new YearMonth(this.iBase, getField().addWrapField(this.iBase, this.iFieldIndex, this.iBase.getValues(), i13));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iBase.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iBase.getField(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iBase;
        }

        public YearMonth getYearMonth() {
            return this.iBase;
        }

        public YearMonth setCopy(int i13) {
            return new YearMonth(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), i13));
        }

        public YearMonth setCopy(String str, Locale locale) {
            return new YearMonth(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), str, locale));
        }

        public YearMonth setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public YearMonth(Chronology chronology) {
        super(chronology);
    }

    public YearMonth(long j7) {
        super(j7);
    }

    public static YearMonth now(Chronology chronology) {
        if (chronology != null) {
            return new YearMonth(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public YearMonth(long j7, Chronology chronology) {
        super(j7, chronology);
    }

    public YearMonth(Object obj) {
        super(obj, null, ISODateTimeFormat.localDateParser());
    }

    public YearMonth(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());
    }

    public YearMonth(int i13, int i14) {
        this(i13, i14, null);
    }

    public YearMonth(int i13, int i14, Chronology chronology) {
        super(new int[]{i13, i14}, chronology);
    }

    public YearMonth(YearMonth yearMonth, int[] iArr) {
        super(yearMonth, iArr);
    }

    public YearMonth(YearMonth yearMonth, Chronology chronology) {
        super((BasePartial) yearMonth, chronology);
    }
}
