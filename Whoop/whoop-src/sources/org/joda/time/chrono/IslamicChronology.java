package org.joda.time.chrono;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes3.dex */
public final class IslamicChronology extends BasicChronology {

    /* JADX INFO: renamed from: AH */
    public static final int f114022AH = 1;
    private static final int CYCLE = 30;
    private static final int LONG_MONTH_LENGTH = 30;
    private static final int MAX_YEAR = 292271022;
    private static final long MILLIS_PER_CYCLE = 918518400000L;
    private static final long MILLIS_PER_LONG_MONTH = 2592000000L;
    private static final long MILLIS_PER_LONG_YEAR = 30672000000L;
    private static final long MILLIS_PER_MONTH = 2551440384L;
    private static final long MILLIS_PER_MONTH_PAIR = 5097600000L;
    private static final long MILLIS_PER_SHORT_YEAR = 30585600000L;
    private static final long MILLIS_PER_YEAR = 30617280288L;
    private static final long MILLIS_YEAR_1 = -42521587200000L;
    private static final int MIN_YEAR = -292269337;
    private static final int MONTH_PAIR_LENGTH = 59;
    private static final int SHORT_MONTH_LENGTH = 29;
    private static final long serialVersionUID = -3663823829888L;
    private final LeapYearPatternType iLeapYears;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("AH");
    public static final LeapYearPatternType LEAP_YEAR_15_BASED = new LeapYearPatternType(0, 623158436);
    public static final LeapYearPatternType LEAP_YEAR_16_BASED = new LeapYearPatternType(1, 623191204);
    public static final LeapYearPatternType LEAP_YEAR_INDIAN = new LeapYearPatternType(2, 690562340);
    public static final LeapYearPatternType LEAP_YEAR_HABASH_AL_HASIB = new LeapYearPatternType(3, 153692453);
    private static final ConcurrentHashMap<DateTimeZone, IslamicChronology[]> cCache = new ConcurrentHashMap<>();
    private static final IslamicChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    public static class LeapYearPatternType implements Serializable {
        private static final long serialVersionUID = 26581275372698L;
        final byte index;
        final int pattern;

        public LeapYearPatternType(int i13, int i14) {
            this.index = (byte) i13;
            this.pattern = i14;
        }

        private Object readResolve() {
            byte b = this.index;
            if (b == 0) {
                return IslamicChronology.LEAP_YEAR_15_BASED;
            }
            if (b == 1) {
                return IslamicChronology.LEAP_YEAR_16_BASED;
            }
            if (b != 2) {
                return b != 3 ? this : IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
            }
            return IslamicChronology.LEAP_YEAR_INDIAN;
        }

        public boolean equals(Object obj) {
            return (obj instanceof LeapYearPatternType) && this.index == ((LeapYearPatternType) obj).index;
        }

        public int hashCode() {
            return this.index;
        }

        public boolean isLeapYear(int i13) {
            return ((1 << (i13 % 30)) & this.pattern) > 0;
        }
    }

    public IslamicChronology(Chronology chronology, Object obj, LeapYearPatternType leapYearPatternType) {
        super(chronology, obj, 4);
        this.iLeapYears = leapYearPatternType;
    }

    public static IslamicChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), LEAP_YEAR_16_BASED);
    }

    public static IslamicChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        return base == null ? getInstanceUTC() : getInstance(base.getZone());
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        if (getBase() == null) {
            super.assemble(fields);
            fields.era = ERA_FIELD;
            BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(this, 12);
            fields.monthOfYear = basicMonthOfYearDateTimeField;
            fields.months = basicMonthOfYearDateTimeField.getDurationField();
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long calculateFirstDayOfYearMillis(int i13) {
        if (i13 > MAX_YEAR) {
            throw new ArithmeticException(AbstractC2875y.m8296i(i13, "Year is too large: ", " > 292271022"));
        }
        if (i13 < MIN_YEAR) {
            throw new ArithmeticException(AbstractC2875y.m8296i(i13, "Year is too small: ", " < -292269337"));
        }
        int i14 = i13 - 1;
        long j7 = (((long) (i14 / 30)) * MILLIS_PER_CYCLE) + MILLIS_YEAR_1;
        int i15 = (i14 % 30) + 1;
        for (int i16 = 1; i16 < i15; i16++) {
            j7 += isLeapYear(i16) ? MILLIS_PER_LONG_YEAR : MILLIS_PER_SHORT_YEAR;
        }
        return j7;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IslamicChronology) && getLeapYearPatternType().index == ((IslamicChronology) obj).getLeapYearPatternType().index && super.equals(obj);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getApproxMillisAtEpochDividedByTwo() {
        return 21260793600000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYearDividedByTwo() {
        return 15308640144L;
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i13, int i14, int i15, int i16) throws IllegalArgumentException {
        return super.getDateTimeMillis(i13, i14, i15, i16);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDayOfMonth(long j7) {
        int dayOfYear = getDayOfYear(j7) - 1;
        if (dayOfYear == 354) {
            return 30;
        }
        return ((dayOfYear % MONTH_PAIR_LENGTH) % 30) + 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax() {
        return 30;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYear(int i13) {
        return isLeapYear(i13) ? 355 : 354;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYearMax() {
        return 355;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYearMonth(int i13, int i14) {
        if ((i14 == 12 && isLeapYear(i13)) || (i14 - 1) % 2 == 0) {
            return 30;
        }
        return SHORT_MONTH_LENGTH;
    }

    public LeapYearPatternType getLeapYearPatternType() {
        return this.iLeapYears;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMaxYear() {
        return MAX_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMinYear() {
        return 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public /* bridge */ /* synthetic */ int getMinimumDaysInFirstWeek() {
        return super.getMinimumDaysInFirstWeek();
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMonthOfYear(long j7, int i13) {
        int yearMillis = (int) ((j7 - getYearMillis(i13)) / DurationKt.MILLIS_IN_DAY);
        if (yearMillis == 354) {
            return 12;
        }
        return AbstractC11266d.m30446D(yearMillis, 2, MONTH_PAIR_LENGTH, 1);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getTotalMillisByYearMonth(int i13, int i14) {
        int i15 = i14 - 1;
        return i15 % 2 == 1 ? (((long) (i15 / 2)) * MILLIS_PER_MONTH_PAIR) + MILLIS_PER_LONG_MONTH : ((long) (i15 / 2)) * MILLIS_PER_MONTH_PAIR;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:5:0x0027 A[LOOP:0: B:6:0x0028->B:5:0x0027, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0033 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:8:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // org.joda.time.chrono.BasicChronology
    public int getYear(long r9) {
        /*
            r8 = this;
            r0 = -42521587200000(0xffffd953abe65000, double:NaN)
            long r9 = r9 - r0
            r0 = 918518400000(0xd5dbf68400, double:4.53808386513E-312)
            long r2 = r9 / r0
            long r9 = r9 % r0
            r0 = 30
            long r2 = r2 * r0
            r0 = 1
            long r2 = r2 + r0
            int r0 = (int) r2
            boolean r1 = r8.isLeapYear(r0)
            r2 = 30585600000(0x71f0b3800, double:1.51112942174E-313)
            r4 = 30672000000(0x724319400, double:1.5153981489E-313)
            if (r1 == 0) goto L27
        L25:
            r6 = r4
            goto L28
        L27:
            r6 = r2
        L28:
            int r1 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r1 < 0) goto L36
            long r9 = r9 - r6
            int r0 = r0 + 1
            boolean r1 = r8.isLeapYear(r0)
            if (r1 == 0) goto L27
            goto L25
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.IslamicChronology.getYear(long):int");
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getYearDifference(long j7, long j13) {
        int year = getYear(j7);
        int year2 = getYear(j13);
        long yearMillis = j7 - getYearMillis(year);
        int i13 = year - year2;
        if (yearMillis < j13 - getYearMillis(year2)) {
            i13--;
        }
        return i13;
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ DateTimeZone getZone() {
        return super.getZone();
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int hashCode() {
        return getLeapYearPatternType().hashCode() + (super.hashCode() * 13);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapYear(int i13) {
        return this.iLeapYears.isLeapYear(i13);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long setYear(long j7, int i13) {
        int dayOfYear = getDayOfYear(j7, getYear(j7));
        int millisOfDay = getMillisOfDay(j7);
        if (dayOfYear > 354 && !isLeapYear(i13)) {
            dayOfYear--;
        }
        return getYearMonthDayMillis(i13, 1, dayOfYear) + ((long) millisOfDay);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return INSTANCE_UTC;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone);
    }

    public static IslamicChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, LEAP_YEAR_16_BASED);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws IllegalArgumentException {
        return super.getDateTimeMillis(i13, i14, i15, i16, i17, i18, i19);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax(int i13) {
        if (i13 == 12 || (i13 - 1) % 2 == 0) {
            return 30;
        }
        return SHORT_MONTH_LENGTH;
    }

    public static IslamicChronology getInstance(DateTimeZone dateTimeZone, LeapYearPatternType leapYearPatternType) {
        IslamicChronology islamicChronology;
        IslamicChronology[] islamicChronologyArrPutIfAbsent;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, IslamicChronology[]> concurrentHashMap = cCache;
        IslamicChronology[] islamicChronologyArr = concurrentHashMap.get(dateTimeZone);
        if (islamicChronologyArr == null && (islamicChronologyArrPutIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, (islamicChronologyArr = new IslamicChronology[4]))) != null) {
            islamicChronologyArr = islamicChronologyArrPutIfAbsent;
        }
        IslamicChronology islamicChronology2 = islamicChronologyArr[leapYearPatternType.index];
        if (islamicChronology2 != null) {
            return islamicChronology2;
        }
        synchronized (islamicChronologyArr) {
            try {
                islamicChronology = islamicChronologyArr[leapYearPatternType.index];
                if (islamicChronology == null) {
                    DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                    if (dateTimeZone == dateTimeZone2) {
                        IslamicChronology islamicChronology3 = new IslamicChronology(null, null, leapYearPatternType);
                        islamicChronology = new IslamicChronology(LimitChronology.getInstance(islamicChronology3, new DateTime(1, 1, 1, 0, 0, 0, 0, islamicChronology3), null), null, leapYearPatternType);
                    } else {
                        islamicChronology = new IslamicChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, leapYearPatternType), dateTimeZone), null, leapYearPatternType);
                    }
                    islamicChronologyArr[leapYearPatternType.index] = islamicChronology;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return islamicChronology;
    }
}
