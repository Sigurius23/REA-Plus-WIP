package bb;

import java.math.RoundingMode;
import p499t9.C33625d0;
import p499t9.C33629f0;
import p499t9.InterfaceC33627e0;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: bb.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C2920g implements InterfaceC33627e0 {

    /* JADX INFO: renamed from: a */
    public final C2918e f11742a;

    /* JADX INFO: renamed from: b */
    public final int f11743b;

    /* JADX INFO: renamed from: c */
    public final long f11744c;

    /* JADX INFO: renamed from: d */
    public final long f11745d;

    /* JADX INFO: renamed from: e */
    public final long f11746e;

    public C2920g(C2918e c2918e, int i13, long j7, long j13) {
        this.f11742a = c2918e;
        this.f11743b = i13;
        this.f11744c = j7;
        long j14 = (j13 - j7) / ((long) c2918e.f11737c);
        this.f11745d = j14;
        this.f11746e = m8508b(j14);
    }

    /* JADX INFO: renamed from: b */
    public final long m8508b(long j7) {
        long j13 = j7 * ((long) this.f11743b);
        long j14 = this.f11742a.f11736b;
        int i13 = AbstractC38065t.f163031a;
        return AbstractC38065t.m121903Q(j13, 1000000L, j14, RoundingMode.DOWN);
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: c */
    public final C33625d0 mo8456c(long j7) {
        C2918e c2918e = this.f11742a;
        long j13 = (((long) c2918e.f11736b) * j7) / (((long) this.f11743b) * 1000000);
        long j14 = this.f11745d;
        long jM121915h = AbstractC38065t.m121915h(j13, 0L, j14 - 1);
        long j15 = ((long) c2918e.f11737c) * jM121915h;
        long j16 = this.f11744c;
        long jM8508b = m8508b(jM121915h);
        C33629f0 c33629f0 = new C33629f0(jM8508b, j15 + j16);
        if (jM8508b >= j7 || jM121915h == j14 - 1) {
            return new C33625d0(c33629f0, c33629f0);
        }
        long j17 = jM121915h + 1;
        return new C33625d0(c33629f0, new C33629f0(m8508b(j17), (((long) c2918e.f11737c) * j17) + j16));
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: e */
    public final boolean mo8509e() {
        return true;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: f */
    public final long mo8510f() {
        return this.f11746e;
    }
}
