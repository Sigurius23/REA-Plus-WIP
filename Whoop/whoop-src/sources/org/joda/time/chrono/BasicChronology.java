package org.joda.time.chrono;

import androidx.room.AbstractC1848z0;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;
import p031b9.AbstractC2875y;
import p715kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes5.dex */
abstract class BasicChronology extends AssembledChronology {
    private static final int CACHE_MASK = 1023;
    private static final int CACHE_SIZE = 1024;
    private static final DateTimeField cClockhourOfDayField;
    private static final DateTimeField cClockhourOfHalfdayField;
    private static final DurationField cDaysField;
    private static final DateTimeField cHalfdayOfDayField;
    private static final DurationField cHalfdaysField;
    private static final DateTimeField cHourOfDayField;
    private static final DateTimeField cHourOfHalfdayField;
    private static final DurationField cHoursField;
    private static final DurationField cMillisField;
    private static final DateTimeField cMillisOfDayField;
    private static final DateTimeField cMillisOfSecondField;
    private static final DateTimeField cMinuteOfDayField;
    private static final DateTimeField cMinuteOfHourField;
    private static final DurationField cMinutesField;
    private static final DateTimeField cSecondOfDayField;
    private static final DateTimeField cSecondOfMinuteField;
    private static final DurationField cSecondsField;
    private static final DurationField cWeeksField;
    private static final long serialVersionUID = 8283225332206808863L;
    private final int iMinDaysInFirstWeek;
    private final transient YearInfo[] iYearInfoCache;

    public static class HalfdayField extends PreciseDateTimeField {
        private static final long serialVersionUID = 581601443656929254L;

        public HalfdayField() {
            super(DateTimeFieldType.halfdayOfDay(), BasicChronology.cHalfdaysField, BasicChronology.cDaysField);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i13, Locale locale) {
            return GJLocaleSymbols.forLocale(locale).halfdayValueToText(i13);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return GJLocaleSymbols.forLocale(locale).getHalfdayMaxTextLength();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j7, String str, Locale locale) {
            return set(j7, GJLocaleSymbols.forLocale(locale).halfdayTextToValue(str));
        }
    }

    public static class YearInfo {
        public final long iFirstDayMillis;
        public final int iYear;

        public YearInfo(int i13, long j7) {
            this.iYear = i13;
            this.iFirstDayMillis = j7;
        }
    }

    static {
        DurationField durationField = MillisDurationField.INSTANCE;
        cMillisField = durationField;
        PreciseDurationField preciseDurationField = new PreciseDurationField(DurationFieldType.seconds(), 1000L);
        cSecondsField = preciseDurationField;
        PreciseDurationField preciseDurationField2 = new PreciseDurationField(DurationFieldType.minutes(), 60000L);
        cMinutesField = preciseDurationField2;
        PreciseDurationField preciseDurationField3 = new PreciseDurationField(DurationFieldType.hours(), 3600000L);
        cHoursField = preciseDurationField3;
        PreciseDurationField preciseDurationField4 = new PreciseDurationField(DurationFieldType.halfdays(), 43200000L);
        cHalfdaysField = preciseDurationField4;
        PreciseDurationField preciseDurationField5 = new PreciseDurationField(DurationFieldType.days(), DurationKt.MILLIS_IN_DAY);
        cDaysField = preciseDurationField5;
        cWeeksField = new PreciseDurationField(DurationFieldType.weeks(), 604800000L);
        cMillisOfSecondField = new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), durationField, preciseDurationField);
        cMillisOfDayField = new PreciseDateTimeField(DateTimeFieldType.millisOfDay(), durationField, preciseDurationField5);
        cSecondOfMinuteField = new PreciseDateTimeField(DateTimeFieldType.secondOfMinute(), preciseDurationField, preciseDurationField2);
        cSecondOfDayField = new PreciseDateTimeField(DateTimeFieldType.secondOfDay(), preciseDurationField, preciseDurationField5);
        cMinuteOfHourField = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), preciseDurationField2, preciseDurationField3);
        cMinuteOfDayField = new PreciseDateTimeField(DateTimeFieldType.minuteOfDay(), preciseDurationField2, preciseDurationField5);
        PreciseDateTimeField preciseDateTimeField = new PreciseDateTimeField(DateTimeFieldType.hourOfDay(), preciseDurationField3, preciseDurationField5);
        cHourOfDayField = preciseDateTimeField;
        PreciseDateTimeField preciseDateTimeField2 = new PreciseDateTimeField(DateTimeFieldType.hourOfHalfday(), preciseDurationField3, preciseDurationField4);
        cHourOfHalfdayField = preciseDateTimeField2;
        cClockhourOfDayField = new ZeroIsMaxDateTimeField(preciseDateTimeField, DateTimeFieldType.clockhourOfDay());
        cClockhourOfHalfdayField = new ZeroIsMaxDateTimeField(preciseDateTimeField2, DateTimeFieldType.clockhourOfHalfday());
        cHalfdayOfDayField = new HalfdayField();
    }

    public BasicChronology(Chronology chronology, Object obj, int i13) {
        super(chronology, obj);
        this.iYearInfoCache = new YearInfo[1024];
        if (i13 < 1 || i13 > 7) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Invalid min days in first week: "));
        }
        this.iMinDaysInFirstWeek = i13;
    }

    private long getDateTimeMillis0(int i13, int i14, int i15, int i16) {
        long dateMidnightMillis = getDateMidnightMillis(i13, i14, i15);
        if (dateMidnightMillis == Long.MIN_VALUE) {
            dateMidnightMillis = getDateMidnightMillis(i13, i14, i15 + 1);
            i16 -= DateTimeConstants.MILLIS_PER_DAY;
        }
        long j7 = ((long) i16) + dateMidnightMillis;
        if (j7 < 0 && dateMidnightMillis > 0) {
            return Long.MAX_VALUE;
        }
        if (j7 <= 0 || dateMidnightMillis >= 0) {
            return j7;
        }
        return Long.MIN_VALUE;
    }

    private YearInfo getYearInfo(int i13) {
        YearInfo[] yearInfoArr = this.iYearInfoCache;
        int i14 = i13 & CACHE_MASK;
        YearInfo yearInfo = yearInfoArr[i14];
        if (yearInfo != null && yearInfo.iYear == i13) {
            return yearInfo;
        }
        YearInfo yearInfo2 = new YearInfo(i13, calculateFirstDayOfYearMillis(i13));
        this.iYearInfoCache[i14] = yearInfo2;
        return yearInfo2;
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        fields.millis = cMillisField;
        fields.seconds = cSecondsField;
        fields.minutes = cMinutesField;
        fields.hours = cHoursField;
        fields.halfdays = cHalfdaysField;
        fields.days = cDaysField;
        fields.weeks = cWeeksField;
        fields.millisOfSecond = cMillisOfSecondField;
        fields.millisOfDay = cMillisOfDayField;
        fields.secondOfMinute = cSecondOfMinuteField;
        fields.secondOfDay = cSecondOfDayField;
        fields.minuteOfHour = cMinuteOfHourField;
        fields.minuteOfDay = cMinuteOfDayField;
        fields.hourOfDay = cHourOfDayField;
        fields.hourOfHalfday = cHourOfHalfdayField;
        fields.clockhourOfDay = cClockhourOfDayField;
        fields.clockhourOfHalfday = cClockhourOfHalfdayField;
        fields.halfdayOfDay = cHalfdayOfDayField;
        BasicYearDateTimeField basicYearDateTimeField = new BasicYearDateTimeField(this);
        fields.year = basicYearDateTimeField;
        GJYearOfEraDateTimeField gJYearOfEraDateTimeField = new GJYearOfEraDateTimeField(basicYearDateTimeField, this);
        fields.yearOfEra = gJYearOfEraDateTimeField;
        DividedDateTimeField dividedDateTimeField = new DividedDateTimeField(new OffsetDateTimeField(gJYearOfEraDateTimeField, 99), DateTimeFieldType.centuryOfEra(), 100);
        fields.centuryOfEra = dividedDateTimeField;
        fields.centuries = dividedDateTimeField.getDurationField();
        fields.yearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField((DividedDateTimeField) fields.centuryOfEra), DateTimeFieldType.yearOfCentury(), 1);
        fields.era = new GJEraDateTimeField(this);
        fields.dayOfWeek = new GJDayOfWeekDateTimeField(this, fields.days);
        fields.dayOfMonth = new BasicDayOfMonthDateTimeField(this, fields.days);
        fields.dayOfYear = new BasicDayOfYearDateTimeField(this, fields.days);
        fields.monthOfYear = new GJMonthOfYearDateTimeField(this);
        fields.weekyear = new BasicWeekyearDateTimeField(this);
        fields.weekOfWeekyear = new BasicWeekOfWeekyearDateTimeField(this, fields.weeks);
        fields.weekyearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField(fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
        fields.years = fields.year.getDurationField();
        fields.months = fields.monthOfYear.getDurationField();
        fields.weekyears = fields.weekyear.getDurationField();
    }

    public abstract long calculateFirstDayOfYearMillis(int i13);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BasicChronology basicChronology = (BasicChronology) obj;
            if (getMinimumDaysInFirstWeek() == basicChronology.getMinimumDaysInFirstWeek() && getZone().equals(basicChronology.getZone())) {
                return true;
            }
        }
        return false;
    }

    public abstract long getApproxMillisAtEpochDividedByTwo();

    public abstract long getAverageMillisPerMonth();

    public abstract long getAverageMillisPerYear();

    public abstract long getAverageMillisPerYearDividedByTwo();

    public long getDateMidnightMillis(int i13, int i14, int i15) {
        FieldUtils.verifyValueBounds(DateTimeFieldType.year(), i13, getMinYear() - 1, getMaxYear() + 1);
        FieldUtils.verifyValueBounds(DateTimeFieldType.monthOfYear(), i14, 1, getMaxMonth(i13));
        int daysInYearMonth = getDaysInYearMonth(i13, i14);
        if (i15 < 1 || i15 > daysInYearMonth) {
            throw new IllegalFieldValueException(DateTimeFieldType.dayOfMonth(), Integer.valueOf(i15), 1, Integer.valueOf(daysInYearMonth), AbstractC2875y.m8294g(i13, i14, "year: ", " month: "));
        }
        long yearMonthDayMillis = getYearMonthDayMillis(i13, i14, i15);
        if (yearMonthDayMillis < 0 && i13 == getMaxYear() + 1) {
            return Long.MAX_VALUE;
        }
        if (yearMonthDayMillis <= 0 || i13 != getMinYear() - 1) {
            return yearMonthDayMillis;
        }
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i13, int i14, int i15, int i16) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i13, i14, i15, i16);
        }
        FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfDay(), i16, 0, 86399999);
        return getDateTimeMillis0(i13, i14, i15, i16);
    }

    public int getDayOfMonth(long j7) {
        int year = getYear(j7);
        return getDayOfMonth(j7, year, getMonthOfYear(j7, year));
    }

    public int getDayOfWeek(long j7) {
        long j13;
        if (j7 >= 0) {
            j13 = j7 / DurationKt.MILLIS_IN_DAY;
        } else {
            j13 = (j7 - 86399999) / DurationKt.MILLIS_IN_DAY;
            if (j13 < -3) {
                return ((int) ((j13 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j13 + 3) % 7)) + 1;
    }

    public int getDayOfYear(long j7) {
        return getDayOfYear(j7, getYear(j7));
    }

    public int getDaysInMonthMax() {
        return 31;
    }

    public abstract int getDaysInMonthMax(int i13);

    public int getDaysInMonthMaxForSet(long j7, int i13) {
        return getDaysInMonthMax(j7);
    }

    public int getDaysInYear(int i13) {
        return isLeapYear(i13) ? 366 : 365;
    }

    public int getDaysInYearMax() {
        return 366;
    }

    public abstract int getDaysInYearMonth(int i13, int i14);

    public long getFirstWeekOfYearMillis(int i13) {
        long yearMillis = getYearMillis(i13);
        int dayOfWeek = getDayOfWeek(yearMillis);
        return dayOfWeek > 8 - this.iMinDaysInFirstWeek ? (((long) (8 - dayOfWeek)) * DurationKt.MILLIS_IN_DAY) + yearMillis : yearMillis - (((long) (dayOfWeek - 1)) * DurationKt.MILLIS_IN_DAY);
    }

    public int getMaxMonth() {
        return 12;
    }

    public abstract int getMaxYear();

    public int getMillisOfDay(long j7) {
        return j7 >= 0 ? (int) (j7 % DurationKt.MILLIS_IN_DAY) : ((int) ((j7 + 1) % DurationKt.MILLIS_IN_DAY)) + 86399999;
    }

    public abstract int getMinYear();

    public int getMinimumDaysInFirstWeek() {
        return this.iMinDaysInFirstWeek;
    }

    public int getMonthOfYear(long j7) {
        return getMonthOfYear(j7, getYear(j7));
    }

    public abstract int getMonthOfYear(long j7, int i13);

    public abstract long getTotalMillisByYearMonth(int i13, int i14);

    public int getWeekOfWeekyear(long j7) {
        return getWeekOfWeekyear(j7, getYear(j7));
    }

    public int getWeeksInYear(int i13) {
        return (int) ((getFirstWeekOfYearMillis(i13 + 1) - getFirstWeekOfYearMillis(i13)) / 604800000);
    }

    public int getWeekyear(long j7) {
        int year = getYear(j7);
        int weekOfWeekyear = getWeekOfWeekyear(j7, year);
        if (weekOfWeekyear == 1) {
            return getYear(j7 + 604800000);
        }
        return weekOfWeekyear > 51 ? getYear(j7 - 1209600000) : year;
    }

    public int getYear(long j7) {
        long averageMillisPerYearDividedByTwo = getAverageMillisPerYearDividedByTwo();
        long approxMillisAtEpochDividedByTwo = (j7 >> 1) + getApproxMillisAtEpochDividedByTwo();
        if (approxMillisAtEpochDividedByTwo < 0) {
            approxMillisAtEpochDividedByTwo = (approxMillisAtEpochDividedByTwo - averageMillisPerYearDividedByTwo) + 1;
        }
        int i13 = (int) (approxMillisAtEpochDividedByTwo / averageMillisPerYearDividedByTwo);
        long yearMillis = getYearMillis(i13);
        long j13 = j7 - yearMillis;
        if (j13 < 0) {
            return i13 - 1;
        }
        if (j13 >= 31536000000L) {
            return yearMillis + (isLeapYear(i13) ? 31622400000L : 31536000000L) <= j7 ? i13 + 1 : i13;
        }
        return i13;
    }

    public abstract long getYearDifference(long j7, long j13);

    public long getYearMillis(int i13) {
        return getYearInfo(i13).iFirstDayMillis;
    }

    public long getYearMonthDayMillis(int i13, int i14, int i15) {
        return (((long) (i15 - 1)) * DurationKt.MILLIS_IN_DAY) + getYearMillis(i13) + getTotalMillisByYearMonth(i13, i14);
    }

    public long getYearMonthMillis(int i13, int i14) {
        return getYearMillis(i13) + getTotalMillisByYearMonth(i13, i14);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    public int hashCode() {
        return getZone().hashCode() + (getClass().getName().hashCode() * 11) + getMinimumDaysInFirstWeek();
    }

    public boolean isLeapDay(long j7) {
        return false;
    }

    public abstract boolean isLeapYear(int i13);

    public abstract long setYear(long j7, int i13);

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        StringBuilder sb4 = new StringBuilder(60);
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        sb4.append(name);
        sb4.append('[');
        DateTimeZone zone = getZone();
        if (zone != null) {
            sb4.append(zone.getID());
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            sb4.append(",mdfw=");
            sb4.append(getMinimumDaysInFirstWeek());
        }
        sb4.append(']');
        return sb4.toString();
    }

    public int getDayOfYear(long j7, int i13) {
        return ((int) ((j7 - getYearMillis(i13)) / DurationKt.MILLIS_IN_DAY)) + 1;
    }

    public int getDaysInMonthMax(long j7) {
        int year = getYear(j7);
        return getDaysInYearMonth(year, getMonthOfYear(j7, year));
    }

    public int getMaxMonth(int i13) {
        return getMaxMonth();
    }

    public int getWeekOfWeekyear(long j7, int i13) {
        long firstWeekOfYearMillis = getFirstWeekOfYearMillis(i13);
        if (j7 < firstWeekOfYearMillis) {
            return getWeeksInYear(i13 - 1);
        }
        if (j7 >= getFirstWeekOfYearMillis(i13 + 1)) {
            return 1;
        }
        return ((int) ((j7 - firstWeekOfYearMillis) / 604800000)) + 1;
    }

    public int getDayOfMonth(long j7, int i13) {
        return getDayOfMonth(j7, i13, getMonthOfYear(j7, i13));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i13, i14, i15, i16, i17, i18, i19);
        }
        FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), i16, 0, 23);
        FieldUtils.verifyValueBounds(DateTimeFieldType.minuteOfHour(), i17, 0, 59);
        FieldUtils.verifyValueBounds(DateTimeFieldType.secondOfMinute(), i18, 0, 59);
        FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfSecond(), i19, 0, AbstractC1848z0.MAX_BIND_PARAMETER_CNT);
        return getDateTimeMillis0(i13, i14, i15, (int) ((((long) i18) * 1000) + (((long) i17) * 60000) + (((long) i16) * 3600000) + ((long) i19)));
    }

    public int getDayOfMonth(long j7, int i13, int i14) {
        return ((int) ((j7 - (getYearMillis(i13) + getTotalMillisByYearMonth(i13, i14))) / DurationKt.MILLIS_IN_DAY)) + 1;
    }
}
