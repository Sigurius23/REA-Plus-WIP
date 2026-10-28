package p516u8;

import android.util.Pair;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: u8.o0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34609o0 {

    /* JADX INFO: renamed from: a */
    public static final C34603l0 f145755a = new C34603l0();

    static {
        AbstractC38065t.m121892F(0);
        AbstractC38065t.m121892F(1);
        AbstractC38065t.m121892F(2);
    }

    /* JADX INFO: renamed from: a */
    public int mo8131a(boolean z4) {
        return m109408p() ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo8132b(Object obj);

    /* JADX INFO: renamed from: c */
    public int mo8133c(boolean z4) {
        if (m109408p()) {
            return -1;
        }
        return mo8139o() - 1;
    }

    /* JADX INFO: renamed from: d */
    public final int m109404d(int i13, C34605m0 c34605m0, C34607n0 c34607n0, int i14, boolean z4) {
        int i15 = mo8128f(i13, c34605m0, false).f145693c;
        if (mo8129m(i15, c34607n0, 0L).f145715o != i13) {
            return i13 + 1;
        }
        int iMo8134e = mo8134e(i15, i14, z4);
        if (iMo8134e == -1) {
            return -1;
        }
        return mo8129m(iMo8134e, c34607n0, 0L).f145714n;
    }

    /* JADX INFO: renamed from: e */
    public int mo8134e(int i13, int i14, boolean z4) {
        if (i14 == 0) {
            if (i13 == mo8133c(z4)) {
                return -1;
            }
            return i13 + 1;
        }
        if (i14 == 1) {
            return i13;
        }
        if (i14 == 2) {
            return i13 == mo8133c(z4) ? mo8131a(z4) : i13 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iMo8133c;
        if (this != obj) {
            if (obj instanceof AbstractC34609o0) {
                AbstractC34609o0 abstractC34609o0 = (AbstractC34609o0) obj;
                if (abstractC34609o0.mo8139o() == mo8139o() && abstractC34609o0.mo8136h() == mo8136h()) {
                    C34607n0 c34607n0 = new C34607n0();
                    C34605m0 c34605m0 = new C34605m0();
                    C34607n0 c34607n1 = new C34607n0();
                    C34605m0 c34605m1 = new C34605m0();
                    for (int i13 = 0; i13 < mo8139o(); i13++) {
                        if (mo8129m(i13, c34607n0, 0L).equals(abstractC34609o0.mo8129m(i13, c34607n1, 0L))) {
                        }
                    }
                    for (int i14 = 0; i14 < mo8136h(); i14++) {
                        if (mo8128f(i14, c34605m0, true).equals(abstractC34609o0.mo8128f(i14, c34605m1, true))) {
                        }
                    }
                    int iMo8131a = mo8131a(true);
                    if (iMo8131a == abstractC34609o0.mo8131a(true) && (iMo8133c = mo8133c(true)) == abstractC34609o0.mo8133c(true)) {
                        while (iMo8131a != iMo8133c) {
                            int iMo8134e = mo8134e(iMo8131a, 0, true);
                            if (iMo8134e == abstractC34609o0.mo8134e(iMo8131a, 0, true)) {
                                iMo8131a = iMo8134e;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract C34605m0 mo8128f(int i13, C34605m0 c34605m0, boolean z4);

    /* JADX INFO: renamed from: g */
    public C34605m0 mo8135g(Object obj, C34605m0 c34605m0) {
        return mo8128f(mo8132b(obj), c34605m0, true);
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo8136h();

    public int hashCode() {
        C34607n0 c34607n0 = new C34607n0();
        C34605m0 c34605m0 = new C34605m0();
        int iMo8139o = mo8139o() + 217;
        for (int i13 = 0; i13 < mo8139o(); i13++) {
            iMo8139o = (iMo8139o * 31) + mo8129m(i13, c34607n0, 0L).hashCode();
        }
        int iMo8136h = mo8136h() + (iMo8139o * 31);
        for (int i14 = 0; i14 < mo8136h(); i14++) {
            iMo8136h = (iMo8136h * 31) + mo8128f(i14, c34605m0, true).hashCode();
        }
        int iMo8131a = mo8131a(true);
        while (iMo8131a != -1) {
            iMo8136h = (iMo8136h * 31) + iMo8131a;
            iMo8131a = mo8134e(iMo8131a, 0, true);
        }
        return iMo8136h;
    }

    /* JADX INFO: renamed from: i */
    public final Pair m109405i(C34607n0 c34607n0, C34605m0 c34605m0, int i13, long j7) {
        Pair pairM109406j = m109406j(c34607n0, c34605m0, i13, j7, 0L);
        pairM109406j.getClass();
        return pairM109406j;
    }

    /* JADX INFO: renamed from: j */
    public final Pair m109406j(C34607n0 c34607n0, C34605m0 c34605m0, int i13, long j7, long j13) {
        AbstractC35849g.m113804f(i13, mo8139o());
        mo8129m(i13, c34607n0, j13);
        if (j7 == -9223372036854775807L) {
            j7 = c34607n0.f145712l;
            if (j7 == -9223372036854775807L) {
                return null;
            }
        }
        int i14 = c34607n0.f145714n;
        mo8128f(i14, c34605m0, false);
        while (i14 < c34607n0.f145715o && c34605m0.f145695e != j7) {
            int i15 = i14 + 1;
            if (mo8128f(i15, c34605m0, false).f145695e > j7) {
                break;
            }
            i14 = i15;
        }
        mo8128f(i14, c34605m0, true);
        long jMin = j7 - c34605m0.f145695e;
        long j14 = c34605m0.f145694d;
        if (j14 != -9223372036854775807L) {
            jMin = Math.min(jMin, j14 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c34605m0.f145692b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: k */
    public int mo8137k(int i13, int i14, boolean z4) {
        if (i14 == 0) {
            if (i13 == mo8131a(z4)) {
                return -1;
            }
            return i13 - 1;
        }
        if (i14 == 1) {
            return i13;
        }
        if (i14 == 2) {
            return i13 == mo8131a(z4) ? mo8133c(z4) : i13 - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo8138l(int i13);

    /* JADX INFO: renamed from: m */
    public abstract C34607n0 mo8129m(int i13, C34607n0 c34607n0, long j7);

    /* JADX INFO: renamed from: n */
    public final void m109407n(int i13, C34607n0 c34607n0) {
        mo8129m(i13, c34607n0, 0L);
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo8139o();

    /* JADX INFO: renamed from: p */
    public final boolean m109408p() {
        return mo8139o() == 0;
    }
}
