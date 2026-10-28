package p291l0;

import p002a0.C0046q;
import p636y3.C39169a;

/* JADX INFO: renamed from: l0.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22975l0 {

    /* JADX INFO: renamed from: a */
    public final int f90641a;

    /* JADX INFO: renamed from: b */
    public final C22984o0 f90642b;

    /* JADX INFO: renamed from: c */
    public final long f90643c;

    /* JADX INFO: renamed from: d */
    public final int f90644d;

    /* JADX INFO: renamed from: e */
    public final int f90645e;

    public C22975l0(int i13, C22984o0 c22984o0, long j7, int i14, int i15) {
        this.f90641a = i13;
        this.f90642b = c22984o0;
        this.f90643c = j7;
        this.f90644d = i14;
        this.f90645e = i15;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC22960g2 m66736a(C22972k0 c22972k0, boolean z4, int i13, int i14, int i15, int i16) {
        if (!c22972k0.f90640b) {
            return null;
        }
        this.f90642b.getClass();
        EnumC22981n0 enumC22981n0 = EnumC22981n0.f90670w;
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final C22972k0 m66737b(boolean z4, int i13, long j7, C0046q c0046q, int i14, int i15, int i16, boolean z13, boolean z14) {
        int i17 = i15 + i16;
        if (c0046q == null) {
            return new C22972k0(true, true);
        }
        long j13 = c0046q.f135a;
        this.f90642b.getClass();
        EnumC22981n0 enumC22981n0 = EnumC22981n0.f90670w;
        EnumC22981n0 enumC22981n1 = EnumC22981n0.f90670w;
        if (i14 >= Integer.MAX_VALUE || ((int) (j7 & 4294967295L)) - ((int) (j13 & 4294967295L)) < 0) {
            return new C22972k0(true, true);
        }
        if (i13 != 0 && (i13 >= this.f90641a || ((int) (j7 >> 32)) - ((int) (j13 >> 32)) < 0)) {
            return z13 ? new C22972k0(true, true) : new C22972k0(true, m66737b(z4, 0, C0046q.m97a(C39169a.m124765i(this.f90643c), (((int) (j7 & 4294967295L)) - this.f90645e) - i16), new C0046q(C0046q.m97a(((int) (j13 >> 32)) - this.f90644d, (int) (j13 & 4294967295L))), i14 + 1, i17, 0, true, false).f90640b);
        }
        Math.max(i16, (int) (j13 & 4294967295L));
        return new C22972k0(false, false);
    }
}
