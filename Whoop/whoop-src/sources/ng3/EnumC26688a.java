package ng3;

import java.util.HashMap;
import lg3.EnumC24059u;

/* JADX INFO: renamed from: ng3.a */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC26688a implements InterfaceC26700m {
    NANO_OF_SECOND("NanoOfSecond", C26706s.m79418c(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", C26706s.m79418c(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", C26706s.m79418c(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", C26706s.m79418c(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", C26706s.m79418c(0, 999)),
    MILLI_OF_DAY("MilliOfDay", C26706s.m79418c(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", C26706s.m79418c(0, 59)),
    SECOND_OF_DAY("SecondOfDay", C26706s.m79418c(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", C26706s.m79418c(0, 59)),
    MINUTE_OF_DAY("MinuteOfDay", C26706s.m79418c(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", C26706s.m79418c(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", C26706s.m79418c(1, 12)),
    HOUR_OF_DAY("HourOfDay", C26706s.m79418c(0, 23)),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", C26706s.m79418c(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", C26706s.m79418c(0, 1)),
    DAY_OF_WEEK("DayOfWeek", C26706s.m79418c(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", C26706s.m79418c(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", C26706s.m79418c(1, 7)),
    DAY_OF_MONTH("DayOfMonth", C26706s.m79419d(28, 31)),
    DAY_OF_YEAR("DayOfYear", C26706s.m79419d(365, 366)),
    EPOCH_DAY("EpochDay", C26706s.m79418c(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", C26706s.m79419d(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", C26706s.m79418c(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", C26706s.m79418c(1, 12)),
    PROLEPTIC_MONTH("ProlepticMonth", C26706s.m79418c(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", C26706s.m79419d(999999999, 1000000000)),
    YEAR("Year", C26706s.m79418c(-999999999, 999999999)),
    ERA("Era", C26706s.m79418c(0, 1)),
    INSTANT_SECONDS("InstantSeconds", C26706s.m79418c(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", C26706s.m79418c(-64800, 64800));


    /* JADX INFO: renamed from: w */
    public final String f106173w;

    /* JADX INFO: renamed from: x */
    public final C26706s f106174x;

    static {
        EnumC26689b enumC26689b = EnumC26689b.NANOS;
    }

    EnumC26688a(String str, C26706s c26706s) {
        this.f106173w = str;
        this.f106174x = c26706s;
    }

    @Override // ng3.InterfaceC26700m
    /* JADX INFO: renamed from: a */
    public final C26706s mo79389a(InterfaceC26698k interfaceC26698k) {
        return interfaceC26698k.mo14017d(this);
    }

    @Override // ng3.InterfaceC26700m
    /* JADX INFO: renamed from: b */
    public final boolean mo79390b(InterfaceC26698k interfaceC26698k) {
        return interfaceC26698k.mo60986a(this);
    }

    @Override // ng3.InterfaceC26700m
    /* JADX INFO: renamed from: c */
    public final InterfaceC26697j mo79391c(InterfaceC26697j interfaceC26697j, long j7) {
        return interfaceC26697j.mo60993b(j7, this);
    }

    @Override // ng3.InterfaceC26700m
    /* JADX INFO: renamed from: d */
    public final InterfaceC26698k mo79392d(HashMap map, EnumC24059u enumC24059u) {
        return null;
    }

    @Override // ng3.InterfaceC26700m
    /* JADX INFO: renamed from: e */
    public final long mo79393e(InterfaceC26698k interfaceC26698k) {
        return interfaceC26698k.mo60987h(this);
    }

    /* JADX INFO: renamed from: f */
    public final void m79394f(long j7) {
        this.f106174x.m79421b(j7, this);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m79395g() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // ng3.InterfaceC26700m
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // ng3.InterfaceC26700m
    public final C26706s range() {
        return this.f106174x;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f106173w;
    }
}
