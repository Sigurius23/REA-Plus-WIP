package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import p031b9.AbstractC2875y;
import p715kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes5.dex */
public final class GregorianChronology extends BasicGJChronology {
    private static final int DAYS_0000_TO_1970 = 719527;
    private static final int MAX_YEAR = 292278993;
    private static final long MILLIS_PER_MONTH = 2629746000L;
    private static final long MILLIS_PER_YEAR = 31556952000L;
    private static final int MIN_YEAR = -292275054;
    private static final long serialVersionUID = -861407383323710522L;
    private static final ConcurrentHashMap<DateTimeZone, GregorianChronology[]> cCache = new ConcurrentHashMap<>();
    private static final GregorianChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    private GregorianChronology(Chronology chronology, Object obj, int i13) {
        super(chronology, obj, i13);
    }

    public static GregorianChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static GregorianChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        int minimumDaysInFirstWeek = getMinimumDaysInFirstWeek();
        if (minimumDaysInFirstWeek == 0) {
            minimumDaysInFirstWeek = 4;
        }
        return base == null ? getInstance(DateTimeZone.UTC, minimumDaysInFirstWeek) : getInstance(base.getZone(), minimumDaysInFirstWeek);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        if (getBase() == null) {
            super.assemble(fields);
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long calculateFirstDayOfYearMillis(int i13) {
        int i14;
        int i15 = i13 / 100;
        if (i13 < 0) {
            i14 = ((((i13 + 3) >> 2) - i15) + ((i15 + 3) >> 2)) - 1;
        } else {
            i14 = ((i13 >> 2) - i15) + (i15 >> 2);
            if (isLeapYear(i13)) {
                i14--;
            }
        }
        return ((((long) i13) * 365) + ((long) (i14 - DAYS_0000_TO_1970))) * DurationKt.MILLIS_IN_DAY;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getApproxMillisAtEpochDividedByTwo() {
        return 31083597720000L;
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
        return 15778476000L;
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
    public boolean isLeapYear(int i13) {
        if ((i13 & 3) == 0) {
            return i13 % 100 != 0 || i13 % 400 == 0;
        }
        return false;
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

    public static GregorianChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public /* bridge */ /* synthetic */ long getDateTimeMillis(int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws IllegalArgumentException {
        return super.getDateTimeMillis(i13, i14, i15, i16, i17, i18, i19);
    }

    public static GregorianChronology getInstance(DateTimeZone dateTimeZone, int i13) {
        GregorianChronology gregorianChronology;
        GregorianChronology[] gregorianChronologyArrPutIfAbsent;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, GregorianChronology[]> concurrentHashMap = cCache;
        GregorianChronology[] gregorianChronologyArr = concurrentHashMap.get(dateTimeZone);
        if (gregorianChronologyArr == null && (gregorianChronologyArrPutIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, (gregorianChronologyArr = new GregorianChronology[7]))) != null) {
            gregorianChronologyArr = gregorianChronologyArrPutIfAbsent;
        }
        int i14 = i13 - 1;
        try {
            GregorianChronology gregorianChronology2 = gregorianChronologyArr[i14];
            if (gregorianChronology2 != null) {
                return gregorianChronology2;
            }
            synchronized (gregorianChronologyArr) {
                try {
                    gregorianChronology = gregorianChronologyArr[i14];
                    if (gregorianChronology == null) {
                        DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
                        if (dateTimeZone == dateTimeZone2) {
                            gregorianChronology = new GregorianChronology(null, null, i13);
                        } else {
                            gregorianChronology = new GregorianChronology(ZonedChronology.getInstance(getInstance(dateTimeZone2, i13), dateTimeZone), null, i13);
                        }
                        gregorianChronologyArr[i14] = gregorianChronology;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return gregorianChronology;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Invalid min days in first week: "));
        }
    }
}
