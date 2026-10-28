package p148fg;

import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: renamed from: fg.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C14431a implements InterfaceC14442l {

    /* JADX INFO: renamed from: a */
    public long f52670a;

    /* JADX INFO: renamed from: b */
    public double f52671b;

    /* JADX INFO: renamed from: c */
    public double f52672c;

    /* JADX INFO: renamed from: d */
    public double f52673d;

    /* JADX INFO: renamed from: e */
    public double f52674e;

    public C14431a() {
        Duration.Companion companion = Duration.INSTANCE;
        this.f52670a = DurationKt.toDuration(0.5d, DurationUnit.SECONDS);
        this.f52671b = 1.0d;
        this.f52672c = 0.5d;
        this.f52673d = 0.4d;
        this.f52674e = 0.8d;
    }
}
