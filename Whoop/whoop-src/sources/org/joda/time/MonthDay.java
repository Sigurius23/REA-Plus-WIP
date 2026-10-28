package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
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
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes3.dex */
public final class MonthDay extends BasePartial implements ReadablePartial, Serializable {
    public static final int DAY_OF_MONTH = 1;
    public static final int MONTH_OF_YEAR = 0;
    private static final long serialVersionUID = 2954560699050434609L;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
    private static final DateTimeFormatter PARSER = new DateTimeFormatterBuilder().appendOptional(ISODateTimeFormat.localDateParser().getParser()).appendOptional(DateTimeFormat.forPattern("--MM-dd").getParser()).toFormatter();

    public MonthDay() {
    }

    public static MonthDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new MonthDay(calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static MonthDay fromDateFields(Date date) {
        if (date != null) {
            return new MonthDay(date.getMonth() + 1, date.getDate());
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static MonthDay now() {
        return new MonthDay();
    }

    @FromString
    public static MonthDay parse(String str) {
        return parse(str, PARSER);
    }

    private Object readResolve() {
        return !DateTimeZone.UTC.equals(getChronology().getZone()) ? new MonthDay(this, getChronology().withUTC()) : this;
    }

    public Property dayOfMonth() {
        return new Property(this, 1);
    }

    public int getDayOfMonth() {
        return getValue(1);
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i13, Chronology chronology) {
        if (i13 == 0) {
            return chronology.monthOfYear();
        }
        if (i13 == 1) {
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
        return getValue(0);
    }

    public MonthDay minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public MonthDay minusDays(int i13) {
        return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(i13));
    }

    public MonthDay minusMonths(int i13) {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i13));
    }

    public Property monthOfYear() {
        return new Property(this, 0);
    }

    public MonthDay plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public MonthDay plusDays(int i13) {
        return withFieldAdded(DurationFieldType.days(), i13);
    }

    public MonthDay plusMonths(int i13) {
        return withFieldAdded(DurationFieldType.months(), i13);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 2;
    }

    public LocalDate toLocalDate(int i13) {
        return new LocalDate(i13, getMonthOfYear(), getDayOfMonth(), getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    @ToString
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DateTimeFieldType.monthOfYear());
        arrayList.add(DateTimeFieldType.dayOfMonth());
        return ISODateTimeFormat.forFields(arrayList, true, true).print(this);
    }

    public MonthDay withChronologyRetainFields(Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronologyWithUTC == getChronology()) {
            return this;
        }
        MonthDay monthDay = new MonthDay(this, chronologyWithUTC);
        chronologyWithUTC.validate(monthDay, getValues());
        return monthDay;
    }

    public MonthDay withDayOfMonth(int i13) {
        return new MonthDay(this, getChronology().dayOfMonth().set(this, 1, getValues(), i13));
    }

    public MonthDay withField(DateTimeFieldType dateTimeFieldType, int i13) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i13 == getValue(iIndexOfSupported)) {
            return this;
        }
        return new MonthDay(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i13));
    }

    public MonthDay withFieldAdded(DurationFieldType durationFieldType, int i13) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i13 == 0) {
            return this;
        }
        return new MonthDay(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i13));
    }

    public MonthDay withMonthOfYear(int i13) {
        return new MonthDay(this, getChronology().monthOfYear().set(this, 0, getValues(), i13));
    }

    public MonthDay withPeriodAdded(ReadablePeriod readablePeriod, int i13) {
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
        return new MonthDay(this, values);
    }

    public MonthDay(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public static MonthDay now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new MonthDay(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    public static MonthDay parse(String str, DateTimeFormatter dateTimeFormatter) {
        LocalDate localDate = dateTimeFormatter.parseLocalDate(str);
        return new MonthDay(localDate.getMonthOfYear(), localDate.getDayOfMonth());
    }

    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final MonthDay iBase;
        private final int iFieldIndex;

        public Property(MonthDay monthDay, int i13) {
            this.iBase = monthDay;
            this.iFieldIndex = i13;
        }

        public MonthDay addToCopy(int i13) {
            return new MonthDay(this.iBase, getField().add(this.iBase, this.iFieldIndex, this.iBase.getValues(), i13));
        }

        public MonthDay addWrapFieldToCopy(int i13) {
            return new MonthDay(this.iBase, getField().addWrapField(this.iBase, this.iFieldIndex, this.iBase.getValues(), i13));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iBase.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iBase.getField(this.iFieldIndex);
        }

        public MonthDay getMonthDay() {
            return this.iBase;
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iBase;
        }

        public MonthDay setCopy(int i13) {
            return new MonthDay(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), i13));
        }

        public MonthDay setCopy(String str, Locale locale) {
            return new MonthDay(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), str, locale));
        }

        public MonthDay setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public MonthDay(Chronology chronology) {
        super(chronology);
    }

    public MonthDay(long j7) {
        super(j7);
    }

    public static MonthDay now(Chronology chronology) {
        if (chronology != null) {
            return new MonthDay(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    public MonthDay(long j7, Chronology chronology) {
        super(j7, chronology);
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str) {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).print(this);
    }

    public MonthDay(Object obj) {
        super(obj, null, ISODateTimeFormat.localDateParser());
    }

    public MonthDay(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public MonthDay(int i13, int i14) {
        this(i13, i14, null);
    }

    public MonthDay(int i13, int i14, Chronology chronology) {
        super(new int[]{i13, i14}, chronology);
    }

    public MonthDay(MonthDay monthDay, int[] iArr) {
        super(monthDay, iArr);
    }

    public MonthDay(MonthDay monthDay, Chronology chronology) {
        super((BasePartial) monthDay, chronology);
    }
}
