package p465rm;

import android.os.Handler;
import android.util.Pair;
import androidx.fragment.app.RunnableC1283d;
import p309lo.AbstractC24543a;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import sm.C32711d;
import sn.C32763v;
import tn.C33955a;
import tn.C33956b;

/* JADX INFO: renamed from: rm.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31560p0 {

    /* JADX INFO: renamed from: a */
    public final C31552m1 f130338a = new C31552m1();

    /* JADX INFO: renamed from: b */
    public final C31555n1 f130339b = new C31555n1();

    /* JADX INFO: renamed from: c */
    public final C32711d f130340c;

    /* JADX INFO: renamed from: d */
    public final Handler f130341d;

    /* JADX INFO: renamed from: e */
    public long f130342e;

    /* JADX INFO: renamed from: f */
    public int f130343f;

    /* JADX INFO: renamed from: g */
    public boolean f130344g;

    /* JADX INFO: renamed from: h */
    public C31554n0 f130345h;

    /* JADX INFO: renamed from: i */
    public C31554n0 f130346i;

    /* JADX INFO: renamed from: j */
    public C31554n0 f130347j;

    /* JADX INFO: renamed from: k */
    public int f130348k;

    /* JADX INFO: renamed from: l */
    public Object f130349l;

    /* JADX INFO: renamed from: m */
    public long f130350m;

    public C31560p0(Handler handler, C32711d c32711d) {
        this.f130340c = c32711d;
        this.f130341d = handler;
    }

    /* JADX INFO: renamed from: l */
    public static C32763v m97176l(AbstractC31558o1 abstractC31558o1, Object obj, long j7, long j13, C31555n1 c31555n1, C31552m1 c31552m1) {
        abstractC31558o1.mo97132g(obj, c31552m1);
        abstractC31558o1.m97174n(c31552m1.f130286y, c31555n1);
        int iMo97128b = abstractC31558o1.mo97128b(obj);
        while (c31552m1.f130287z == 0) {
            C33956b c33956b = c31552m1.f130283G;
            if (c33956b.f142382w <= 0 || !c31552m1.m97156g(c33956b.f142385z) || c31552m1.m97152c(0L) != -1) {
                break;
            }
            int i13 = iMo97128b + 1;
            if (iMo97128b >= c31555n1.f130320P) {
                break;
            }
            abstractC31558o1.mo97131f(i13, c31552m1, true);
            obj = c31552m1.f130285x;
            obj.getClass();
            iMo97128b = i13;
        }
        abstractC31558o1.mo97132g(obj, c31552m1);
        Object obj2 = obj;
        int iM97152c = c31552m1.m97152c(j7);
        return iM97152c == -1 ? new C32763v(obj2, j13, c31552m1.m97151b(j7)) : new C32763v(iM97152c, c31552m1.m97155f(iM97152c), -1, j13, obj2);
    }

    /* JADX INFO: renamed from: a */
    public final C31554n0 m97177a() {
        C31554n0 c31554n0 = this.f130345h;
        if (c31554n0 == null) {
            return null;
        }
        if (c31554n0 == this.f130346i) {
            this.f130346i = c31554n0.f130302l;
        }
        c31554n0.m97163f();
        int i13 = this.f130348k - 1;
        this.f130348k = i13;
        if (i13 == 0) {
            this.f130347j = null;
            C31554n0 c31554n1 = this.f130345h;
            this.f130349l = c31554n1.f130292b;
            this.f130350m = c31554n1.f130296f.f130326a.f136241d;
        }
        this.f130345h = this.f130345h.f130302l;
        m97186j();
        return this.f130345h;
    }

    /* JADX INFO: renamed from: b */
    public final void m97178b() {
        if (this.f130348k == 0) {
            return;
        }
        C31554n0 c31554n0 = this.f130345h;
        AbstractC24543a.m71574j(c31554n0);
        this.f130349l = c31554n0.f130292b;
        this.f130350m = c31554n0.f130296f.f130326a.f136241d;
        while (c31554n0 != null) {
            c31554n0.m97163f();
            c31554n0 = c31554n0.f130302l;
        }
        this.f130345h = null;
        this.f130347j = null;
        this.f130346i = null;
        this.f130348k = 0;
        m97186j();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
    /* JADX INFO: renamed from: c */
    public final C31557o0 m97179c(AbstractC31558o1 abstractC31558o1, C31554n0 c31554n0, long j7) {
        AbstractC31558o1 abstractC31558o2;
        long jLongValue;
        boolean z4;
        Object obj;
        long j13;
        long j14;
        long j15;
        long j16;
        C31557o0 c31557o0 = c31554n0.f130296f;
        long j17 = c31554n0.f130305o;
        long j18 = c31557o0.f130330e;
        long j19 = c31557o0.f130328c;
        C32763v c32763v = c31557o0.f130326a;
        long j24 = (j17 + j18) - j7;
        boolean z13 = c31557o0.f130332g;
        C31552m1 c31552m1 = this.f130338a;
        if (!z13) {
            boolean z14 = true;
            Object obj2 = c32763v.f136238a;
            int i13 = c32763v.f136242e;
            abstractC31558o1.mo97132g(obj2, c31552m1);
            if (!c32763v.m102753a()) {
                int iM97155f = c31552m1.m97155f(i13);
                if (!c31552m1.m97156g(i13) || c31552m1.m97154e(i13, iM97155f) != 3) {
                    z14 = false;
                }
                if (iM97155f != c31552m1.f130283G.m107404a(i13).f142375x && !z14) {
                    return m97181e(abstractC31558o1, c32763v.f136238a, c32763v.f136242e, iM97155f, c31557o0.f130330e, c32763v.f136241d);
                }
                abstractC31558o1.mo97132g(obj2, c31552m1);
                long jM97153d = c31552m1.m97153d(i13);
                return m97182f(abstractC31558o1, c32763v.f136238a, jM97153d == Long.MIN_VALUE ? c31552m1.f130287z : jM97153d + c31552m1.f130283G.m107404a(i13).f142372F, c31557o0.f130330e, c32763v.f136241d);
            }
            int i14 = c32763v.f136239b;
            int i15 = c31552m1.f130283G.m107404a(i14).f142375x;
            if (i15 == -1) {
                return null;
            }
            int iM107403a = c31552m1.f130283G.m107404a(i14).m107403a(c32763v.f136240c);
            if (iM107403a < i15) {
                return m97181e(abstractC31558o1, c32763v.f136238a, i14, iM107403a, c31557o0.f130328c, c32763v.f136241d);
            }
            if (j19 == -9223372036854775807L) {
                abstractC31558o2 = abstractC31558o1;
                Pair pairM97173j = abstractC31558o2.m97173j(this.f130339b, c31552m1, c31552m1.f130286y, -9223372036854775807L, Math.max(0L, j24));
                if (pairM97173j == null) {
                    return null;
                }
                jLongValue = ((Long) pairM97173j.second).longValue();
            } else {
                abstractC31558o2 = abstractC31558o1;
                jLongValue = j19;
            }
            int i16 = c32763v.f136239b;
            abstractC31558o2.mo97132g(obj2, c31552m1);
            long jM97153d2 = c31552m1.m97153d(i16);
            return m97182f(abstractC31558o2, c32763v.f136238a, Math.max(jM97153d2 == Long.MIN_VALUE ? c31552m1.f130287z : jM97153d2 + c31552m1.f130283G.m107404a(i16).f142372F, jLongValue), c31557o0.f130328c, c32763v.f136241d);
        }
        long j25 = 0;
        int iM97171d = abstractC31558o1.m97171d(abstractC31558o1.mo97128b(c32763v.f136238a), this.f130338a, this.f130339b, this.f130343f, this.f130344g);
        if (iM97171d == -1) {
            return null;
        }
        int i17 = abstractC31558o1.mo97131f(iM97171d, c31552m1, true).f130286y;
        Object obj3 = c31552m1.f130285x;
        obj3.getClass();
        long j26 = c32763v.f136241d;
        if (abstractC31558o1.mo97136m(i17, this.f130339b, 0L).f130319O == iM97171d) {
            z4 = true;
            Pair pairM97173j2 = abstractC31558o1.m97173j(this.f130339b, this.f130338a, i17, -9223372036854775807L, Math.max(0L, j24));
            if (pairM97173j2 == null) {
                return null;
            }
            Object obj4 = pairM97173j2.first;
            long jLongValue2 = ((Long) pairM97173j2.second).longValue();
            C31554n0 c31554n1 = c31554n0.f130302l;
            if (c31554n1 == null || !c31554n1.f130292b.equals(obj4)) {
                j16 = this.f130342e;
                this.f130342e = 1 + j16;
            } else {
                j16 = c31554n1.f130296f.f130326a.f136241d;
            }
            obj = obj4;
            j13 = jLongValue2;
            j26 = j16;
            j25 = -9223372036854775807L;
        } else {
            z4 = true;
            obj = obj3;
            j13 = 0;
        }
        C32763v c32763vM97176l = m97176l(abstractC31558o1, obj, j13, j26, this.f130339b, this.f130338a);
        if (j25 == -9223372036854775807L || j19 == -9223372036854775807L) {
            j14 = j13;
            j15 = j25;
        } else {
            boolean z15 = (abstractC31558o1.mo97132g(c32763v.f136238a, c31552m1).f130283G.f142382w <= 0 || !c31552m1.m97156g(c31552m1.f130283G.f142385z)) ? false : z4;
            if (c32763vM97176l.m102753a() && z15) {
                j14 = j13;
                j15 = j19;
            } else if (z15) {
                j15 = j25;
                j14 = j19;
            } else {
                j14 = j13;
                j15 = j25;
            }
        }
        return m97180d(abstractC31558o1, c32763vM97176l, j15, j14);
    }

    /* JADX INFO: renamed from: d */
    public final C31557o0 m97180d(AbstractC31558o1 abstractC31558o1, C32763v c32763v, long j7, long j13) {
        abstractC31558o1.mo97132g(c32763v.f136238a, this.f130338a);
        return c32763v.m102753a() ? m97181e(abstractC31558o1, c32763v.f136238a, c32763v.f136239b, c32763v.f136240c, j7, c32763v.f136241d) : m97182f(abstractC31558o1, c32763v.f136238a, j13, j7, c32763v.f136241d);
    }

    /* JADX INFO: renamed from: e */
    public final C31557o0 m97181e(AbstractC31558o1 abstractC31558o1, Object obj, int i13, int i14, long j7, long j13) {
        C32763v c32763v = new C32763v(i13, i14, -1, j13, obj);
        C31552m1 c31552m1 = this.f130338a;
        long jM97150a = abstractC31558o1.mo97132g(obj, c31552m1).m97150a(i13, i14);
        long jMax = i14 == c31552m1.m97155f(i13) ? c31552m1.f130283G.f142383x : 0L;
        boolean zM97156g = c31552m1.m97156g(i13);
        if (jM97150a != -9223372036854775807L && jMax >= jM97150a) {
            jMax = Math.max(0L, jM97150a - 1);
        }
        return new C31557o0(c32763v, jMax, j7, -9223372036854775807L, jM97150a, zM97156g, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX INFO: renamed from: f */
    public final C31557o0 m97182f(AbstractC31558o1 abstractC31558o1, Object obj, long j7, long j13, long j14) {
        boolean z4;
        boolean z13;
        long j15;
        long jM97153d;
        long j16;
        long jMax = j7;
        C31552m1 c31552m1 = this.f130338a;
        abstractC31558o1.mo97132g(obj, c31552m1);
        int iM97151b = c31552m1.m97151b(jMax);
        if (iM97151b == -1) {
            C33956b c33956b = c31552m1.f130283G;
            if (c33956b.f142382w <= 0 || !c31552m1.m97156g(c33956b.f142385z)) {
                z13 = false;
            } else {
                z13 = true;
            }
        } else if (c31552m1.m97156g(iM97151b) && c31552m1.m97153d(iM97151b) == c31552m1.f130287z) {
            C33955a c33955aM107404a = c31552m1.f130283G.m107404a(iM97151b);
            int i13 = c33955aM107404a.f142375x;
            if (i13 == -1) {
                z4 = true;
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    z4 = false;
                    break;
                }
                int i15 = c33955aM107404a.f142377z[i14];
                if (i15 == 0 || i15 == 1) {
                    z4 = true;
                    break;
                }
                i14++;
            }
            if (z4) {
                z13 = false;
            } else {
                z13 = true;
                iM97151b = -1;
            }
        } else {
            z13 = false;
        }
        C32763v c32763v = new C32763v(obj, j14, iM97151b);
        boolean z14 = !c32763v.m102753a() && iM97151b == -1;
        boolean zM97185i = m97185i(abstractC31558o1, c32763v);
        boolean zM97184h = m97184h(abstractC31558o1, c32763v, z14);
        boolean z15 = iM97151b != -1 && c31552m1.m97156g(iM97151b);
        if (iM97151b == -1) {
            if (z13) {
                jM97153d = c31552m1.f130287z;
            } else {
                j15 = -9223372036854775807L;
            }
            if (j15 != -9223372036854775807L || j15 == Long.MIN_VALUE) {
                j16 = c31552m1.f130287z;
            } else {
                j16 = j15;
            }
            if (j16 != -9223372036854775807L && jMax >= j16) {
                jMax = Math.max(0L, j16 - 1);
            }
            return new C31557o0(c32763v, jMax, j13, j15, j16, z15, z14, zM97185i, zM97184h);
        }
        jM97153d = c31552m1.m97153d(iM97151b);
        j15 = jM97153d;
        if (j15 != -9223372036854775807L) {
            j16 = c31552m1.f130287z;
        } else {
            j16 = c31552m1.f130287z;
        }
        if (j16 != -9223372036854775807L) {
            jMax = Math.max(0L, j16 - 1);
        }
        return new C31557o0(c32763v, jMax, j13, j15, j16, z15, z14, zM97185i, zM97184h);
    }

    /* JADX INFO: renamed from: g */
    public final C31557o0 m97183g(AbstractC31558o1 abstractC31558o1, C31557o0 c31557o0) {
        long jM97150a;
        boolean zM97156g;
        C32763v c32763v = c31557o0.f130326a;
        boolean zM102753a = c32763v.m102753a();
        int i13 = c32763v.f136242e;
        boolean z4 = !zM102753a && i13 == -1;
        int i14 = c32763v.f136239b;
        boolean zM97185i = m97185i(abstractC31558o1, c32763v);
        boolean zM97184h = m97184h(abstractC31558o1, c32763v, z4);
        Object obj = c32763v.f136238a;
        C31552m1 c31552m1 = this.f130338a;
        abstractC31558o1.mo97132g(obj, c31552m1);
        long jM97153d = (c32763v.m102753a() || i13 == -1) ? -9223372036854775807L : c31552m1.m97153d(i13);
        if (c32763v.m102753a()) {
            jM97150a = c31552m1.m97150a(i14, c32763v.f136240c);
        } else {
            jM97150a = (jM97153d == -9223372036854775807L || jM97153d == Long.MIN_VALUE) ? c31552m1.f130287z : jM97153d;
        }
        if (c32763v.m102753a()) {
            zM97156g = c31552m1.m97156g(i14);
        } else {
            zM97156g = i13 != -1 && c31552m1.m97156g(i13);
        }
        return new C31557o0(c32763v, c31557o0.f130327b, c31557o0.f130328c, jM97153d, jM97150a, zM97156g, z4, zM97185i, zM97184h);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m97184h(AbstractC31558o1 abstractC31558o1, C32763v c32763v, boolean z4) {
        int iMo97128b = abstractC31558o1.mo97128b(c32763v.f136238a);
        if (!abstractC31558o1.mo97136m(abstractC31558o1.mo97131f(iMo97128b, this.f130338a, false).f130286y, this.f130339b, 0L).f130313I) {
            if (abstractC31558o1.m97171d(iMo97128b, this.f130338a, this.f130339b, this.f130343f, this.f130344g) == -1 && z4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m97185i(AbstractC31558o1 abstractC31558o1, C32763v c32763v) {
        boolean z4 = !c32763v.m102753a() && c32763v.f136242e == -1;
        Object obj = c32763v.f136238a;
        if (z4) {
            if (abstractC31558o1.mo97136m(abstractC31558o1.mo97132g(obj, this.f130338a).f130286y, this.f130339b, 0L).f130320P == abstractC31558o1.mo97128b(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m97186j() {
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        for (C31554n0 c31554n0 = this.f130345h; c31554n0 != null; c31554n0 = c31554n0.f130302l) {
            c41014d0M133251l.m133222a(c31554n0.f130296f.f130326a);
        }
        C31554n0 c31554n1 = this.f130346i;
        this.f130341d.post(new RunnableC1283d(this, c41014d0M133251l, c31554n1 == null ? null : c31554n1.f130296f.f130326a, 20));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m97187k(C31554n0 c31554n0) {
        boolean z4 = false;
        AbstractC24543a.m71573i(c31554n0 != null);
        if (c31554n0.equals(this.f130347j)) {
            return false;
        }
        this.f130347j = c31554n0;
        while (true) {
            c31554n0 = c31554n0.f130302l;
            if (c31554n0 == null) {
                break;
            }
            if (c31554n0 == this.f130346i) {
                this.f130346i = this.f130345h;
                z4 = true;
            }
            c31554n0.m97163f();
            this.f130348k--;
        }
        C31554n0 c31554n1 = this.f130347j;
        if (c31554n1.f130302l != null) {
            c31554n1.m97159b();
            c31554n1.f130302l = null;
            c31554n1.m97160c();
        }
        m97186j();
        return z4;
    }

    /* JADX INFO: renamed from: m */
    public final C32763v m97188m(AbstractC31558o1 abstractC31558o1, Object obj, long j7) {
        long j13;
        int iMo97128b;
        Object obj2 = obj;
        C31552m1 c31552m1 = this.f130338a;
        int i13 = abstractC31558o1.mo97132g(obj2, c31552m1).f130286y;
        Object obj3 = this.f130349l;
        if (obj3 == null || (iMo97128b = abstractC31558o1.mo97128b(obj3)) == -1 || abstractC31558o1.mo97131f(iMo97128b, c31552m1, false).f130286y != i13) {
            C31554n0 c31554n0 = this.f130345h;
            while (true) {
                if (c31554n0 == null) {
                    C31554n0 c31554n1 = this.f130345h;
                    while (true) {
                        if (c31554n1 == null) {
                            j13 = this.f130342e;
                            this.f130342e = 1 + j13;
                            if (this.f130345h != null) {
                                break;
                            }
                            this.f130349l = obj2;
                            this.f130350m = j13;
                            break;
                        }
                        int iMo97128b2 = abstractC31558o1.mo97128b(c31554n1.f130292b);
                        if (iMo97128b2 != -1 && abstractC31558o1.mo97131f(iMo97128b2, c31552m1, false).f130286y == i13) {
                            j13 = c31554n1.f130296f.f130326a.f136241d;
                            break;
                        }
                        c31554n1 = c31554n1.f130302l;
                    }
                } else {
                    if (c31554n0.f130292b.equals(obj2)) {
                        j13 = c31554n0.f130296f.f130326a.f136241d;
                        break;
                    }
                    c31554n0 = c31554n0.f130302l;
                }
            }
        } else {
            j13 = this.f130350m;
        }
        abstractC31558o1.mo97132g(obj2, c31552m1);
        int i14 = c31552m1.f130286y;
        C31555n1 c31555n1 = this.f130339b;
        abstractC31558o1.m97174n(i14, c31555n1);
        boolean z4 = false;
        for (int iMo97128b3 = abstractC31558o1.mo97128b(obj); iMo97128b3 >= c31555n1.f130319O; iMo97128b3--) {
            abstractC31558o1.mo97131f(iMo97128b3, c31552m1, true);
            boolean z13 = c31552m1.f130283G.f142382w > 0;
            z4 |= z13;
            if (c31552m1.m97152c(c31552m1.f130287z) != -1) {
                obj2 = c31552m1.f130285x;
                obj2.getClass();
            }
            if (z4 && (!z13 || c31552m1.f130287z != 0)) {
                break;
            }
        }
        return m97176l(abstractC31558o1, obj2, j7, j13, this.f130339b, this.f130338a);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m97189n(AbstractC31558o1 abstractC31558o1) {
        AbstractC31558o1 abstractC31558o2;
        C31554n0 c31554n0;
        C31554n0 c31554n1 = this.f130345h;
        if (c31554n1 == null) {
            return true;
        }
        int iMo97128b = abstractC31558o1.mo97128b(c31554n1.f130292b);
        while (true) {
            abstractC31558o2 = abstractC31558o1;
            iMo97128b = abstractC31558o2.m97171d(iMo97128b, this.f130338a, this.f130339b, this.f130343f, this.f130344g);
            while (true) {
                c31554n0 = c31554n1.f130302l;
                if (c31554n0 == null || c31554n1.f130296f.f130332g) {
                    break;
                }
                c31554n1 = c31554n0;
            }
            if (iMo97128b == -1 || c31554n0 == null || abstractC31558o2.mo97128b(c31554n0.f130292b) != iMo97128b) {
                break;
            }
            c31554n1 = c31554n0;
            abstractC31558o1 = abstractC31558o2;
        }
        boolean zM97187k = m97187k(c31554n1);
        c31554n1.f130296f = m97183g(abstractC31558o2, c31554n1.f130296f);
        return !zM97187k;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m97190o(AbstractC31558o1 abstractC31558o1, long j7, long j13) {
        boolean zM97187k;
        C31557o0 c31557o0M97183g;
        C31554n0 c31554n0 = this.f130345h;
        C31554n0 c31554n1 = null;
        while (c31554n0 != null) {
            C31557o0 c31557o0 = c31554n0.f130296f;
            if (c31554n1 != null) {
                C31557o0 c31557o0M97179c = m97179c(abstractC31558o1, c31554n1, j7);
                if (c31557o0M97179c == null) {
                    zM97187k = m97187k(c31554n1);
                } else if (c31557o0.f130327b == c31557o0M97179c.f130327b && c31557o0.f130326a.equals(c31557o0M97179c.f130326a)) {
                    c31557o0M97183g = c31557o0M97179c;
                } else {
                    zM97187k = m97187k(c31554n1);
                }
                return !zM97187k;
            }
            c31557o0M97183g = m97183g(abstractC31558o1, c31557o0);
            long j14 = c31557o0M97183g.f130330e;
            c31554n0.f130296f = c31557o0M97183g.m97169a(c31557o0.f130328c);
            long j15 = c31557o0.f130330e;
            if (j15 == -9223372036854775807L || j15 == j14) {
                c31554n1 = c31554n0;
                c31554n0 = c31554n0.f130302l;
            } else {
                c31554n0.m97165h();
                boolean z4 = c31554n0 == this.f130346i && !c31554n0.f130296f.f130331f && (j13 == Long.MIN_VALUE || j13 >= ((j14 > (-9223372036854775807L) ? 1 : (j14 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c31554n0.f130305o + j14));
                if (m97187k(c31554n0) || z4) {
                    return false;
                }
            }
        }
        return true;
    }
}
