package gn;

import bb.C2918e;
import p309lo.AbstractC24567y;
import p588wm.C37373o;
import p588wm.C37375q;
import p588wm.InterfaceC37374p;

/* JADX INFO: renamed from: gn.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C16003d implements InterfaceC37374p {

    /* JADX INFO: renamed from: a */
    public final C2918e f60576a;

    /* JADX INFO: renamed from: b */
    public final int f60577b;

    /* JADX INFO: renamed from: c */
    public final long f60578c;

    /* JADX INFO: renamed from: d */
    public final long f60579d;

    /* JADX INFO: renamed from: e */
    public final long f60580e;

    public C16003d(C2918e c2918e, int i13, long j7, long j13) {
        this.f60576a = c2918e;
        this.f60577b = i13;
        this.f60578c = j7;
        long j14 = (j13 - j7) / ((long) c2918e.f11737c);
        this.f60579d = j14;
        this.f60580e = AbstractC24567y.m71666D(j14 * ((long) i13), 1000000L, c2918e.f11736b);
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: c */
    public final C37373o mo3112c(long j7) {
        C2918e c2918e = this.f60576a;
        long j13 = ((long) c2918e.f11736b) * j7;
        int i13 = this.f60577b;
        long j14 = this.f60579d - 1;
        long jM71678i = AbstractC24567y.m71678i(j13 / (((long) i13) * 1000000), 0L, j14);
        int i14 = c2918e.f11737c;
        long j15 = this.f60578c;
        long jM71666D = AbstractC24567y.m71666D(jM71678i * ((long) i13), 1000000L, c2918e.f11736b);
        C37375q c37375q = new C37375q(jM71666D, (((long) i14) * jM71678i) + j15);
        if (jM71666D >= j7 || jM71678i == j14) {
            return new C37373o(c37375q, c37375q);
        }
        long j16 = jM71678i + 1;
        return new C37373o(c37375q, new C37375q(AbstractC24567y.m71666D(j16 * ((long) i13), 1000000L, c2918e.f11736b), (((long) i14) * j16) + j15));
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: e */
    public final boolean mo3113e() {
        return true;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: f */
    public final long mo3114f() {
        return this.f60580e;
    }
}
