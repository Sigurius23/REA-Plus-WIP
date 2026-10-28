package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.field.SkipDateTimeField;
import p031b9.AbstractC2875y;
import p715kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes3.dex */
public final class EthiopicChronology extends BasicFixedMonthChronology {

    /* JADX INFO: renamed from: EE */
    public static final int f114021EE = 1;
    private static final int MAX_YEAR = 292272984;
    private static final int MIN_YEAR = -292269337;
    private static final long serialVersionUID = -5972804258688333942L;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("EE");
    private static final ConcurrentHashMap<DateTimeZone, EthiopicChronology[]> cCache = new ConcurrentHashMap<>();
    private static final EthiopicChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    public EthiopicChronology(Chronology chronology, Object obj, int i13) {
        super(chronology, obj, i13);
    }

    public static EthiopicChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static EthiopicChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        return base == null ? getInstance(DateTimeZone.UTC, getMinimumDaysInFirstWeek()) : getInstance(base.getZone(), getMinimumDaysInFirstWeek());
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        if (getBase() == null) {
            super.assemble(fields);
            fields.year = new SkipDateTimeField(this, fields.year);
            fields.weekyear = new SkipDateTimeField(this, fields.weekyear);
            fields.era = ERA_FIELD;
            BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(this, 13);
            fields.monthOfYear = basicMonthOfYearDateTimeField;
            fields.months = basicMonthOfYearDateTimeField.getDurationField();
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long calculateFirstDayOfYearMillis(int i13) {
        int i14;
        int i15 = i13 - 1963;
        if (i15 <= 0) {
            i14 = (i13 - 1960) >> 2;
        } else {
            int i16 = i15 >> 2;
            i14 = !isLeapYear(i13) ? i16 + 1 : i16;
        }
        return (((((long) i15) * 365) + ((long) i14)) * DurationKt.MILLIS_IN_DAY) + 21859200000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getApproxMillisAtEpochDividedByTwo() {
        return 30962844000000L;
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i13, int i14, int i15, int i16) throws IllegalArgumentException {
        return super.getDateTimeMillis(i13, i14, i15, i16);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMaxYear() {
        return MAX_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMinYear() {
        return MIN_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public /* bridge */ /* synthetic */ int getMinimumDaysInFirstWeek() {
        return super.getMinimumDaysInFirstWeek();
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ DateTimeZone getZone() {
        return super.getZone();
    }

    @Override // org.joda.time.chrono.BasicChronology
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapDay(long j7) {
        return dayOfMonth().get(j7) == 6 && monthOfYear().isLeap(j7);
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

    public static EthiopicChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws IllegalArgumentException {
        return super.getDateTimeMillis(i13, i14, i15, i16, i17, i18, i19);
    }

    public static EthiopicChronology getInstance(DateTimeZone dateTimeZone, int i13) {
        EthiopicChronology ethiopicChronology;
        EthiopicChronology[] ethiopicChronologyArrPutIfAbsent;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, EthiopicChronology[]> concurrentHashMap = cCache;
        EthiopicChronology[] ethiopicChronologyArr = concurrentHashMap.get(dateTimeZone);
        if (ethiopicChronologyArr == null && (ethiopicChronologyArrPutIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, (ethiopicChronologyArr = new EthiopicChronology[7]))) != null) {
            ethiopicChronologyArr = ethiopicChronologyArrPutIfAbsent;
        }
        int i14 = i13 - 1;
        try {
            EthiopicChronology ethiopicChronology2 = ethiopicChronologyArr[i14];
            if (ethiopicChronology2 != null) {
                return ethiopicChronology2;
            }
            synchronized (ethiopicChronologyArr) {
                try {
                    ethiopicChronology = ethiopicChronologyArr[i14];
                    if (ethiopicChronology == null) {
                        DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                        if (dateTimeZone == dateTimeZone2) {
                            EthiopicChronology ethiopicChronology3 = new EthiopicChronology(null, null, i13);
                            ethiopicChronology = new EthiopicChronology(LimitChronology.getInstance(ethiopicChronology3, new DateTime(1, 1, 1, 0, 0, 0, 0, ethiopicChronology3), null), null, i13);
                        } else {
                            ethiopicChronology = new EthiopicChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, i13), dateTimeZone), null, i13);
                        }
                        ethiopicChronologyArr[i14] = ethiopicChronology;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return ethiopicChronology;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Invalid min days in first week: "));
        }
    }
}
