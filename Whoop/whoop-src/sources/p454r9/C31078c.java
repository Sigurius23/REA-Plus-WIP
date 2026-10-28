package p454r9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p309lo.C24565w;
import p320m5.ExecutorC25061e;
import p412q3.C29875i;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.C38061p;

/* JADX INFO: renamed from: r9.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C31078c {

    /* JADX INFO: renamed from: a */
    public final C31089n f128125a;

    /* JADX INFO: renamed from: b */
    public final C38061p f128126b;

    /* JADX INFO: renamed from: c */
    public final C31091p f128127c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f128128d;

    /* JADX INFO: renamed from: e */
    public final C34610p f128129e;

    /* JADX INFO: renamed from: f */
    public long f128130f;

    /* JADX INFO: renamed from: g */
    public final C31093r f128131g;

    /* JADX INFO: renamed from: h */
    public final Executor f128132h;

    /* JADX INFO: renamed from: i */
    public InterfaceC31088m f128133i;

    public C31078c(C31089n c31089n, C38061p c38061p) {
        this.f128125a = c31089n;
        c31089n.f128227l = c38061p;
        this.f128126b = c38061p;
        this.f128127c = new C31091p(new C29875i(this), c31089n);
        this.f128128d = new ArrayDeque();
        this.f128129e = new C34610p(new C34608o());
        this.f128130f = -9223372036854775807L;
        this.f128131g = C31093r.f128246a;
        this.f128132h = new ExecutorC25061e(1);
        this.f128133i = new C31076a();
    }

    /* JADX INFO: renamed from: a */
    public final void m95722a(long j7, long j13) {
        if (j7 != this.f128130f) {
            C31091p c31091p = this.f128127c;
            C24565w c24565w = c31091p.f128239e;
            long j14 = c31091p.f128241g;
            c24565w.m71651a(j14 == -9223372036854775807L ? 0L : j14 + 1, Long.valueOf(j7));
            this.f128130f = j7;
        }
    }
}
