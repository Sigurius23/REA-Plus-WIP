package p465rm;

import android.util.Pair;
import p309lo.AbstractC24543a;

/* JADX INFO: renamed from: rm.o1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC31558o1 implements InterfaceC31529f {

    /* JADX INFO: renamed from: w */
    public static final C31549l1 f130335w = new C31549l1();

    /* JADX INFO: renamed from: a */
    public int mo97127a(boolean z4) {
        return m97175p() ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo97128b(Object obj);

    /* JADX INFO: renamed from: c */
    public int mo97129c(boolean z4) {
        if (m97175p()) {
            return -1;
        }
        return mo97137o() - 1;
    }

    /* JADX INFO: renamed from: d */
    public final int m97171d(int i13, C31552m1 c31552m1, C31555n1 c31555n1, int i14, boolean z4) {
        int i15 = mo97131f(i13, c31552m1, false).f130286y;
        if (mo97136m(i15, c31555n1, 0L).f130320P != i13) {
            return i13 + 1;
        }
        int iMo97130e = mo97130e(i15, i14, z4);
        if (iMo97130e == -1) {
            return -1;
        }
        return mo97136m(iMo97130e, c31555n1, 0L).f130319O;
    }

    /* JADX INFO: renamed from: e */
    public int mo97130e(int i13, int i14, boolean z4) {
        if (i14 == 0) {
            if (i13 == mo97129c(z4)) {
                return -1;
            }
            return i13 + 1;
        }
        if (i14 == 1) {
            return i13;
        }
        if (i14 == 2) {
            return i13 == mo97129c(z4) ? mo97127a(z4) : i13 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AbstractC31558o1) {
                AbstractC31558o1 abstractC31558o1 = (AbstractC31558o1) obj;
                if (abstractC31558o1.mo97137o() == mo97137o() && abstractC31558o1.mo97133h() == mo97133h()) {
                    C31555n1 c31555n1 = new C31555n1();
                    C31552m1 c31552m1 = new C31552m1();
                    C31555n1 c31555n2 = new C31555n1();
                    C31552m1 c31552m2 = new C31552m1();
                    for (int i13 = 0; i13 < mo97137o(); i13++) {
                        if (mo97136m(i13, c31555n1, 0L).equals(abstractC31558o1.mo97136m(i13, c31555n2, 0L))) {
                        }
                    }
                    for (int i14 = 0; i14 < mo97133h(); i14++) {
                        if (mo97131f(i14, c31552m1, true).equals(abstractC31558o1.mo97131f(i14, c31552m2, true))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract C31552m1 mo97131f(int i13, C31552m1 c31552m1, boolean z4);

    /* JADX INFO: renamed from: g */
    public C31552m1 mo97132g(Object obj, C31552m1 c31552m1) {
        return mo97131f(mo97128b(obj), c31552m1, true);
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo97133h();

    public final int hashCode() {
        C31555n1 c31555n1 = new C31555n1();
        C31552m1 c31552m1 = new C31552m1();
        int iMo97137o = mo97137o() + 217;
        for (int i13 = 0; i13 < mo97137o(); i13++) {
            iMo97137o = (iMo97137o * 31) + mo97136m(i13, c31555n1, 0L).hashCode();
        }
        int iMo97133h = mo97133h() + (iMo97137o * 31);
        for (int i14 = 0; i14 < mo97133h(); i14++) {
            iMo97133h = (iMo97133h * 31) + mo97131f(i14, c31552m1, true).hashCode();
        }
        return iMo97133h;
    }

    /* JADX INFO: renamed from: i */
    public final Pair m97172i(C31555n1 c31555n1, C31552m1 c31552m1, int i13, long j7) {
        Pair pairM97173j = m97173j(c31555n1, c31552m1, i13, j7, 0L);
        pairM97173j.getClass();
        return pairM97173j;
    }

    /* JADX INFO: renamed from: j */
    public final Pair m97173j(C31555n1 c31555n1, C31552m1 c31552m1, int i13, long j7, long j13) {
        AbstractC24543a.m71572h(i13, mo97137o());
        mo97136m(i13, c31555n1, j13);
        if (j7 == -9223372036854775807L) {
            j7 = c31555n1.f130317M;
            if (j7 == -9223372036854775807L) {
                return null;
            }
        }
        int i14 = c31555n1.f130319O;
        mo97131f(i14, c31552m1, false);
        while (i14 < c31555n1.f130320P && c31552m1.f130281E != j7) {
            int i15 = i14 + 1;
            if (mo97131f(i15, c31552m1, false).f130281E > j7) {
                break;
            }
            i14 = i15;
        }
        mo97131f(i14, c31552m1, true);
        long jMin = j7 - c31552m1.f130281E;
        long j14 = c31552m1.f130287z;
        if (j14 != -9223372036854775807L) {
            jMin = Math.min(jMin, j14 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c31552m1.f130285x;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: k */
    public int mo97134k(int i13, int i14, boolean z4) {
        if (i14 == 0) {
            if (i13 == mo97127a(z4)) {
                return -1;
            }
            return i13 - 1;
        }
        if (i14 == 1) {
            return i13;
        }
        if (i14 == 2) {
            return i13 == mo97127a(z4) ? mo97129c(z4) : i13 - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo97135l(int i13);

    /* JADX INFO: renamed from: m */
    public abstract C31555n1 mo97136m(int i13, C31555n1 c31555n1, long j7);

    /* JADX INFO: renamed from: n */
    public final void m97174n(int i13, C31555n1 c31555n1) {
        mo97136m(i13, c31555n1, 0L);
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo97137o();

    /* JADX INFO: renamed from: p */
    public final boolean m97175p() {
        return mo97137o() == 0;
    }
}
