package p148fg;

import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: renamed from: fg.j */
/* JADX INFO: loaded from: classes.dex */
public final class C14440j {

    /* JADX INFO: renamed from: a */
    public final long f52716a;

    /* JADX INFO: renamed from: b */
    public final double f52717b;

    /* JADX INFO: renamed from: c */
    public final double f52718c;

    /* JADX INFO: renamed from: d */
    public final long f52719d;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        DurationKt.toDuration(10, DurationUnit.MILLISECONDS);
        DurationKt.toDuration(20, DurationUnit.SECONDS);
    }

    public C14440j(C14439i c14439i) {
        this.f52716a = c14439i.f52712a;
        this.f52717b = c14439i.f52713b;
        this.f52718c = c14439i.f52714c;
        this.f52719d = c14439i.f52715d;
    }
}
