package pc3;

import kotlinx.datetime.DateTimePeriod;

/* JADX INFO: renamed from: pc3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C29081c extends DateTimePeriod {

    /* JADX INFO: renamed from: a */
    public final long f117672a;

    /* JADX INFO: renamed from: b */
    public final int f117673b;

    /* JADX INFO: renamed from: c */
    public final long f117674c;

    public C29081c(int i13, long j7, long j13) {
        super(null);
        this.f117672a = j7;
        this.f117673b = i13;
        this.f117674c = j13;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public final int getDays() {
        return this.f117673b;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public final long getTotalMonths$kotlinx_datetime() {
        return this.f117672a;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public final long getTotalNanoseconds$kotlinx_datetime() {
        return this.f117674c;
    }
}
