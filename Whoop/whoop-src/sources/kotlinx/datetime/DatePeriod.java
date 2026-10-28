package kotlinx.datetime;

import p477s2.AbstractC32073e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pc3.C29079a;
import vc3.C35884c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\r¨\u0006\u001d"}, m65681d2 = {"Lkotlinx/datetime/DatePeriod;", "Lkotlinx/datetime/DateTimePeriod;", "", "totalMonths", "", "days", "<init>", "(JI)V", "years", "months", "(III)V", "J", "getTotalMonths$kotlinx_datetime", "()J", "I", "getDays", "()I", "getHours", "hours", "getMinutes", "minutes", "getSeconds", "seconds", "getNanoseconds", "nanoseconds", "getTotalNanoseconds$kotlinx_datetime", "totalNanoseconds", "Companion", "pc3/a", "kotlinx-datetime"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i(with = C35884c.class)
public final class DatePeriod extends DateTimePeriod {
    public static final C29079a Companion = new C29079a();
    private final int days;
    private final long totalMonths;

    public DatePeriod(int i13, int i14, int i15) {
        this(AbstractC32073e.m99748h0(i13, i14), i15);
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public int getDays() {
        return this.days;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public int getHours() {
        return 0;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public int getMinutes() {
        return 0;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public int getNanoseconds() {
        return 0;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public int getSeconds() {
        return 0;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    /* JADX INFO: renamed from: getTotalMonths$kotlinx_datetime, reason: from getter */
    public long getTotalMonths() {
        return this.totalMonths;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public long getTotalNanoseconds$kotlinx_datetime() {
        return 0L;
    }

    public DatePeriod(long j7, int i13) {
        super(null);
        this.totalMonths = j7;
        this.days = i13;
    }

    public /* synthetic */ DatePeriod(int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i13, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) != 0 ? 0 : i15);
    }
}
