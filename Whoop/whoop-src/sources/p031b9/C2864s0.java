package p031b9;

import android.util.Pair;
import androidx.fragment.app.RunnableC1283d;
import java.util.ArrayList;
import p012ab.C0680g0;
import p047c9.C4317h;
import p299l9.C23488c0;
import p516u8.AbstractC34609o0;
import p516u8.C34605m0;
import p516u8.C34607n0;
import p607x8.C38063r;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: b9.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2864s0 {

    /* JADX INFO: renamed from: c */
    public final C4317h f11386c;

    /* JADX INFO: renamed from: d */
    public final C38063r f11387d;

    /* JADX INFO: renamed from: e */
    public final C0680g0 f11388e;

    /* JADX INFO: renamed from: f */
    public long f11389f;

    /* JADX INFO: renamed from: g */
    public int f11390g;

    /* JADX INFO: renamed from: h */
    public boolean f11391h;

    /* JADX INFO: renamed from: i */
    public C2860q0 f11392i;

    /* JADX INFO: renamed from: j */
    public C2860q0 f11393j;

    /* JADX INFO: renamed from: k */
    public C2860q0 f11394k;

    /* JADX INFO: renamed from: l */
    public C2860q0 f11395l;

    /* JADX INFO: renamed from: m */
    public C2860q0 f11396m;

    /* JADX INFO: renamed from: n */
    public int f11397n;

    /* JADX INFO: renamed from: o */
    public Object f11398o;

    /* JADX INFO: renamed from: p */
    public long f11399p;

    /* JADX INFO: renamed from: a */
    public final C34605m0 f11384a = new C34605m0();

    /* JADX INFO: renamed from: b */
    public final C34607n0 f11385b = new C34607n0();

    /* JADX INFO: renamed from: q */
    public ArrayList f11400q = new ArrayList();

    public C2864s0(C4317h c4317h, C38063r c38063r, C0680g0 c0680g0, C2859q c2859q) {
        this.f11386c = c4317h;
        this.f11387d = c38063r;
        this.f11388e = c0680g0;
    }

    /* JADX INFO: renamed from: o */
    public static C23488c0 m8265o(AbstractC34609o0 abstractC34609o0, Object obj, long j7, long j13, C34607n0 c34607n0, C34605m0 c34605m0) {
        abstractC34609o0.mo8135g(obj, c34605m0);
        abstractC34609o0.m109407n(c34605m0.f145693c, c34607n0);
        abstractC34609o0.mo8132b(obj);
        int i13 = c34605m0.f145697g.f145638a;
        if (i13 != 0) {
            if (i13 == 1) {
                c34605m0.m109397f(0);
            }
            c34605m0.f145697g.getClass();
            c34605m0.m109398g(0);
        }
        abstractC34609o0.mo8135g(obj, c34605m0);
        int iM109394c = c34605m0.m109394c(j7);
        return iM109394c == -1 ? new C23488c0(obj, j13, c34605m0.m109393b(j7)) : new C23488c0(iM109394c, c34605m0.m109396e(iM109394c), -1, j13, obj);
    }

    /* JADX INFO: renamed from: a */
    public final C2860q0 m8266a() {
        C2860q0 c2860q0 = this.f11392i;
        if (c2860q0 == null) {
            return null;
        }
        if (c2860q0 == this.f11393j) {
            this.f11393j = c2860q0.f11365m;
        }
        if (c2860q0 == this.f11394k) {
            this.f11394k = c2860q0.f11365m;
        }
        c2860q0.m8260i();
        int i13 = this.f11397n - 1;
        this.f11397n = i13;
        if (i13 == 0) {
            this.f11395l = null;
            C2860q0 c2860q1 = this.f11392i;
            this.f11398o = c2860q1.f11354b;
            this.f11399p = c2860q1.f11359g.f11371a.f92979d;
        }
        this.f11392i = this.f11392i.f11365m;
        m8277l();
        return this.f11392i;
    }

    /* JADX INFO: renamed from: b */
    public final void m8267b() {
        if (this.f11397n == 0) {
            return;
        }
        C2860q0 c2860q0 = this.f11392i;
        AbstractC35849g.m113808j(c2860q0);
        this.f11398o = c2860q0.f11354b;
        this.f11399p = c2860q0.f11359g.f11371a.f92979d;
        while (c2860q0 != null) {
            c2860q0.m8260i();
            c2860q0 = c2860q0.f11365m;
        }
        this.f11392i = null;
        this.f11395l = null;
        this.f11393j = null;
        this.f11394k = null;
        this.f11397n = 0;
        m8277l();
    }

    /* JADX INFO: renamed from: c */
    public final C2862r0 m8268c(AbstractC34609o0 abstractC34609o0, C2860q0 c2860q0, long j7) {
        AbstractC34609o0 abstractC34609o1;
        Object obj;
        long j13;
        long j14;
        long j15;
        long jM8281q;
        C2862r0 c2862r0 = c2860q0.f11359g;
        long j16 = (c2860q0.f11368p + c2862r0.f11375e) - j7;
        if (!c2862r0.f11378h) {
            C23488c0 c23488c0 = c2862r0.f11371a;
            Object obj2 = c23488c0.f92976a;
            int i13 = c23488c0.f92980e;
            C34605m0 c34605m0 = this.f11384a;
            abstractC34609o0.mo8135g(obj2, c34605m0);
            boolean z4 = c2862r0.f11377g;
            if (!c23488c0.m68054b()) {
                if (i13 != -1) {
                    c34605m0.m109397f(i13);
                }
                int iM109396e = c34605m0.m109396e(i13);
                c34605m0.m109398g(i13);
                if (iM109396e != c34605m0.f145697g.m109363a(i13).f145601a) {
                    return m8270e(abstractC34609o0, c23488c0.f92976a, c23488c0.f92980e, iM109396e, c2862r0.f11375e, c23488c0.f92979d, z4);
                }
                abstractC34609o0.mo8135g(obj2, c34605m0);
                c34605m0.m109395d(i13);
                c34605m0.f145697g.m109363a(i13).getClass();
                return m8271f(abstractC34609o0, c23488c0.f92976a, 0L, c2862r0.f11375e, c23488c0.f92979d, false);
            }
            int i14 = c23488c0.f92977b;
            int i15 = c34605m0.f145697g.m109363a(i14).f145601a;
            if (i15 == -1) {
                return null;
            }
            int iM109361a = c34605m0.f145697g.m109363a(i14).m109361a(c23488c0.f92978c);
            if (iM109361a < i15) {
                return m8270e(abstractC34609o0, c23488c0.f92976a, i14, iM109361a, c2862r0.f11373c, c23488c0.f92979d, z4);
            }
            long jLongValue = c2862r0.f11373c;
            if (jLongValue == -9223372036854775807L) {
                Pair pairM109406j = abstractC34609o0.m109406j(this.f11385b, c34605m0, c34605m0.f145693c, -9223372036854775807L, Math.max(0L, j16));
                abstractC34609o1 = abstractC34609o0;
                if (pairM109406j == null) {
                    return null;
                }
                jLongValue = ((Long) pairM109406j.second).longValue();
            } else {
                abstractC34609o1 = abstractC34609o0;
            }
            int i16 = c23488c0.f92977b;
            abstractC34609o1.mo8135g(obj2, c34605m0);
            c34605m0.m109395d(i16);
            c34605m0.f145697g.m109363a(i16).getClass();
            return m8271f(abstractC34609o0, c23488c0.f92976a, Math.max(0L, jLongValue), c2862r0.f11373c, c23488c0.f92979d, z4);
        }
        C2862r0 c2862r1 = c2860q0.f11359g;
        C23488c0 c23488c1 = c2862r1.f11371a;
        long j17 = c2862r1.f11373c;
        int iM109404d = abstractC34609o0.m109404d(abstractC34609o0.mo8132b(c23488c1.f92976a), this.f11384a, this.f11385b, this.f11390g, this.f11391h);
        if (iM109404d != -1) {
            C34605m0 c34605m1 = this.f11384a;
            int i17 = abstractC34609o0.mo8128f(iM109404d, c34605m1, true).f145693c;
            Object obj3 = c34605m1.f145692b;
            obj3.getClass();
            long j18 = c23488c1.f92979d;
            if (abstractC34609o0.mo8129m(i17, this.f11385b, 0L).f145714n == iM109404d) {
                Pair pairM109406j2 = abstractC34609o0.m109406j(this.f11385b, this.f11384a, i17, -9223372036854775807L, Math.max(0L, j16));
                if (pairM109406j2 != null) {
                    Object obj4 = pairM109406j2.first;
                    long jLongValue2 = ((Long) pairM109406j2.second).longValue();
                    C2860q0 c2860q1 = c2860q0.f11365m;
                    if (c2860q1 == null || !c2860q1.f11354b.equals(obj4)) {
                        jM8281q = m8281q(obj4);
                        if (jM8281q == -1) {
                            jM8281q = this.f11389f;
                            this.f11389f = 1 + jM8281q;
                        }
                    } else {
                        jM8281q = c2860q1.f11359g.f11371a.f92979d;
                    }
                    obj = obj4;
                    j13 = jLongValue2;
                    j15 = jM8281q;
                    j14 = -9223372036854775807L;
                }
            } else {
                obj = obj3;
                j13 = 0;
                j14 = 0;
                j15 = j18;
            }
            C23488c0 c23488c0M8265o = m8265o(abstractC34609o0, obj, j13, j15, this.f11385b, this.f11384a);
            if (j14 != -9223372036854775807L && j17 != -9223372036854775807L) {
                int i18 = abstractC34609o0.mo8135g(c23488c1.f92976a, c34605m1).f145697g.f145638a;
                c34605m1.f145697g.getClass();
                if (i18 > 0) {
                    c34605m1.m109398g(0);
                }
            }
            return m8269d(abstractC34609o0, c23488c0M8265o, j14, j13);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final C2862r0 m8269d(AbstractC34609o0 abstractC34609o0, C23488c0 c23488c0, long j7, long j13) {
        abstractC34609o0.mo8135g(c23488c0.f92976a, this.f11384a);
        return c23488c0.m68054b() ? m8270e(abstractC34609o0, c23488c0.f92976a, c23488c0.f92977b, c23488c0.f92978c, j7, c23488c0.f92979d, false) : m8271f(abstractC34609o0, c23488c0.f92976a, j13, j7, c23488c0.f92979d, false);
    }

    /* JADX INFO: renamed from: e */
    public final C2862r0 m8270e(AbstractC34609o0 abstractC34609o0, Object obj, int i13, int i14, long j7, long j13, boolean z4) {
        C23488c0 c23488c0 = new C23488c0(i13, i14, -1, j13, obj);
        C34605m0 c34605m0 = this.f11384a;
        long jM109392a = abstractC34609o0.mo8135g(obj, c34605m0).m109392a(i13, i14);
        if (i14 == c34605m0.m109396e(i13)) {
            c34605m0.f145697g.getClass();
        }
        c34605m0.m109398g(i13);
        long jMax = 0;
        if (jM109392a != -9223372036854775807L && 0 >= jM109392a) {
            jMax = Math.max(0L, jM109392a - 1);
        }
        return new C2862r0(c23488c0, jMax, j7, -9223372036854775807L, jM109392a, z4, false, false, false, false);
    }

    /* JADX INFO: renamed from: f */
    public final C2862r0 m8271f(AbstractC34609o0 abstractC34609o0, Object obj, long j7, long j13, long j14, boolean z4) {
        long j15;
        C34605m0 c34605m0 = this.f11384a;
        abstractC34609o0.mo8135g(obj, c34605m0);
        int iM109393b = c34605m0.m109393b(j7);
        if (iM109393b != -1) {
            c34605m0.m109397f(iM109393b);
        }
        boolean z13 = false;
        if (iM109393b != -1) {
            c34605m0.m109398g(iM109393b);
        } else if (c34605m0.f145697g.f145638a > 0) {
            c34605m0.m109398g(0);
        }
        C23488c0 c23488c0 = new C23488c0(obj, j14, iM109393b);
        if (!c23488c0.m68054b() && iM109393b == -1) {
            z13 = true;
        }
        boolean zM8275j = m8275j(abstractC34609o0, c23488c0);
        boolean zM8274i = m8274i(abstractC34609o0, c23488c0, z13);
        if (iM109393b != -1) {
            c34605m0.m109398g(iM109393b);
        }
        if (iM109393b != -1) {
            c34605m0.m109395d(iM109393b);
            j15 = 0;
        } else {
            j15 = -9223372036854775807L;
        }
        long j16 = (j15 == -9223372036854775807L || j15 == Long.MIN_VALUE) ? c34605m0.f145694d : j15;
        return new C2862r0(c23488c0, (j16 == -9223372036854775807L || j7 < j16) ? j7 : Math.max(0L, j16 - ((long) 1)), j13, j15, j16, z4, false, z13, zM8275j, zM8274i);
    }

    /* JADX INFO: renamed from: g */
    public final C2860q0 m8272g() {
        return this.f11394k;
    }

    /* JADX INFO: renamed from: h */
    public final C2862r0 m8273h(AbstractC34609o0 abstractC34609o0, C2862r0 c2862r0) {
        long j7;
        long jM109392a;
        C23488c0 c23488c0 = c2862r0.f11371a;
        boolean zM68054b = c23488c0.m68054b();
        int i13 = c23488c0.f92980e;
        boolean z4 = !zM68054b && i13 == -1;
        int i14 = c23488c0.f92977b;
        boolean zM8275j = m8275j(abstractC34609o0, c23488c0);
        boolean zM8274i = m8274i(abstractC34609o0, c23488c0, z4);
        Object obj = c23488c0.f92976a;
        C34605m0 c34605m0 = this.f11384a;
        abstractC34609o0.mo8135g(obj, c34605m0);
        if (c23488c0.m68054b() || i13 == -1) {
            j7 = -9223372036854775807L;
        } else {
            c34605m0.m109395d(i13);
            j7 = 0;
        }
        if (c23488c0.m68054b()) {
            jM109392a = c34605m0.m109392a(i14, c23488c0.f92978c);
        } else {
            jM109392a = (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? c34605m0.f145694d : j7;
        }
        if (c23488c0.m68054b()) {
            c34605m0.m109398g(i14);
        } else if (i13 != -1) {
            c34605m0.m109398g(i13);
        }
        return new C2862r0(c23488c0, c2862r0.f11372b, c2862r0.f11373c, j7, jM109392a, c2862r0.f11376f, false, z4, zM8275j, zM8274i);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m8274i(AbstractC34609o0 abstractC34609o0, C23488c0 c23488c0, boolean z4) {
        int iMo8132b = abstractC34609o0.mo8132b(c23488c0.f92976a);
        if (!abstractC34609o0.mo8129m(abstractC34609o0.mo8128f(iMo8132b, this.f11384a, false).f145693c, this.f11385b, 0L).f145709i) {
            if (abstractC34609o0.m109404d(iMo8132b, this.f11384a, this.f11385b, this.f11390g, this.f11391h) == -1 && z4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m8275j(AbstractC34609o0 abstractC34609o0, C23488c0 c23488c0) {
        boolean z4 = !c23488c0.m68054b() && c23488c0.f92980e == -1;
        Object obj = c23488c0.f92976a;
        if (z4) {
            if (abstractC34609o0.mo8129m(abstractC34609o0.mo8135g(obj, this.f11384a).f145693c, this.f11385b, 0L).f145715o == abstractC34609o0.mo8132b(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m8276k() {
        C2860q0 c2860q0 = this.f11396m;
        if (c2860q0 == null || c2860q0.m8259h()) {
            this.f11396m = null;
            for (int i13 = 0; i13 < this.f11400q.size(); i13++) {
                C2860q0 c2860q1 = (C2860q0) this.f11400q.get(i13);
                if (!c2860q1.m8259h()) {
                    this.f11396m = c2860q1;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8277l() {
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        for (C2860q0 c2860q0 = this.f11392i; c2860q0 != null; c2860q0 = c2860q0.f11365m) {
            c41014d0M133251l.m133222a(c2860q0.f11359g.f11371a);
        }
        C2860q0 c2860q1 = this.f11393j;
        this.f11387d.m121879c(new RunnableC1283d(this, c41014d0M133251l, c2860q1 == null ? null : c2860q1.f11359g.f11371a, 2));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, l9.b1] */
    /* JADX INFO: renamed from: m */
    public final void m8278m(long j7) {
        C2860q0 c2860q0 = this.f11395l;
        if (c2860q0 != null) {
            AbstractC35849g.m113807i(c2860q0.f11365m == null);
            if (c2860q0.f11357e) {
                c2860q0.f11353a.mo36130n(j7 - c2860q0.f11368p);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m8279n(C2860q0 c2860q0) {
        AbstractC35849g.m113808j(c2860q0);
        int i13 = 0;
        if (c2860q0.equals(this.f11395l)) {
            return 0;
        }
        this.f11395l = c2860q0;
        while (true) {
            c2860q0 = c2860q0.f11365m;
            if (c2860q0 == null) {
                break;
            }
            if (c2860q0 == this.f11393j) {
                C2860q0 c2860q1 = this.f11392i;
                this.f11393j = c2860q1;
                this.f11394k = c2860q1;
                i13 = 3;
            }
            if (c2860q0 == this.f11394k) {
                this.f11394k = this.f11393j;
                i13 |= 2;
            }
            c2860q0.m8260i();
            this.f11397n--;
        }
        C2860q0 c2860q2 = this.f11395l;
        c2860q2.getClass();
        if (c2860q2.f11365m != null) {
            c2860q2.m8253b();
            c2860q2.f11365m = null;
            c2860q2.m8254c();
        }
        m8277l();
        return i13;
    }

    /* JADX INFO: renamed from: p */
    public final C23488c0 m8280p(AbstractC34609o0 abstractC34609o0, Object obj, long j7) {
        long jM8281q;
        int iMo8132b;
        Object obj2 = obj;
        C34605m0 c34605m0 = this.f11384a;
        int i13 = abstractC34609o0.mo8135g(obj2, c34605m0).f145693c;
        Object obj3 = this.f11398o;
        if (obj3 == null || (iMo8132b = abstractC34609o0.mo8132b(obj3)) == -1 || abstractC34609o0.mo8128f(iMo8132b, c34605m0, false).f145693c != i13) {
            C2860q0 c2860q0 = this.f11392i;
            while (true) {
                if (c2860q0 == null) {
                    C2860q0 c2860q1 = this.f11392i;
                    while (true) {
                        if (c2860q1 == null) {
                            jM8281q = m8281q(obj2);
                            if (jM8281q != -1) {
                                break;
                            }
                            jM8281q = this.f11389f;
                            this.f11389f = 1 + jM8281q;
                            if (this.f11392i != null) {
                                break;
                            }
                            this.f11398o = obj2;
                            this.f11399p = jM8281q;
                            break;
                        }
                        int iMo8132b2 = abstractC34609o0.mo8132b(c2860q1.f11354b);
                        if (iMo8132b2 != -1 && abstractC34609o0.mo8128f(iMo8132b2, c34605m0, false).f145693c == i13) {
                            jM8281q = c2860q1.f11359g.f11371a.f92979d;
                            break;
                        }
                        c2860q1 = c2860q1.f11365m;
                    }
                } else {
                    if (c2860q0.f11354b.equals(obj2)) {
                        jM8281q = c2860q0.f11359g.f11371a.f92979d;
                        break;
                    }
                    c2860q0 = c2860q0.f11365m;
                }
            }
        } else {
            jM8281q = this.f11399p;
        }
        abstractC34609o0.mo8135g(obj2, c34605m0);
        int i14 = c34605m0.f145693c;
        C34607n0 c34607n0 = this.f11385b;
        abstractC34609o0.m109407n(i14, c34607n0);
        boolean z4 = false;
        for (int iMo8132b3 = abstractC34609o0.mo8132b(obj); iMo8132b3 >= c34607n0.f145714n; iMo8132b3--) {
            abstractC34609o0.mo8128f(iMo8132b3, c34605m0, true);
            boolean z13 = c34605m0.f145697g.f145638a > 0;
            z4 |= z13;
            if (c34605m0.m109394c(c34605m0.f145694d) != -1) {
                obj2 = c34605m0.f145692b;
                obj2.getClass();
            }
            if (z4 && (!z13 || c34605m0.f145694d != 0)) {
                break;
            }
        }
        return m8265o(abstractC34609o0, obj2, j7, jM8281q, this.f11385b, this.f11384a);
    }

    /* JADX INFO: renamed from: q */
    public final long m8281q(Object obj) {
        for (int i13 = 0; i13 < this.f11400q.size(); i13++) {
            C2860q0 c2860q0 = (C2860q0) this.f11400q.get(i13);
            if (c2860q0.f11354b.equals(obj)) {
                return c2860q0.f11359g.f11371a.f92979d;
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: r */
    public final int m8282r(AbstractC34609o0 abstractC34609o0) {
        AbstractC34609o0 abstractC34609o1;
        C2860q0 c2860q0;
        C2860q0 c2860q1 = this.f11392i;
        if (c2860q1 == null) {
            return 0;
        }
        int iMo8132b = abstractC34609o0.mo8132b(c2860q1.f11354b);
        while (true) {
            abstractC34609o1 = abstractC34609o0;
            iMo8132b = abstractC34609o1.m109404d(iMo8132b, this.f11384a, this.f11385b, this.f11390g, this.f11391h);
            while (true) {
                c2860q1.getClass();
                c2860q0 = c2860q1.f11365m;
                if (c2860q0 == null || c2860q1.f11359g.f11378h) {
                    break;
                }
                c2860q1 = c2860q0;
            }
            if (iMo8132b == -1 || c2860q0 == null || abstractC34609o1.mo8132b(c2860q0.f11354b) != iMo8132b) {
                break;
            }
            c2860q1 = c2860q0;
            abstractC34609o0 = abstractC34609o1;
        }
        int iM8279n = m8279n(c2860q1);
        c2860q1.f11359g = m8273h(abstractC34609o1, c2860q1.f11359g);
        return iM8279n;
    }

    /* JADX INFO: renamed from: s */
    public final int m8283s(AbstractC34609o0 abstractC34609o0, long j7, long j13, long j14) {
        C2862r0 c2862r0M8273h;
        C2860q0 c2860q0 = this.f11392i;
        C2860q0 c2860q1 = null;
        while (true) {
            boolean z4 = false;
            if (c2860q0 == null) {
                return 0;
            }
            C2862r0 c2862r0 = c2860q0.f11359g;
            if (c2860q1 == null) {
                c2862r0M8273h = m8273h(abstractC34609o0, c2862r0);
            } else {
                C2862r0 c2862r0M8268c = m8268c(abstractC34609o0, c2860q1, j7);
                if (c2862r0M8268c == null || c2862r0.f11372b != c2862r0M8268c.f11372b || !c2862r0.f11371a.equals(c2862r0M8268c.f11371a)) {
                    return m8279n(c2860q1);
                }
                c2862r0M8273h = c2862r0M8268c;
            }
            long j15 = c2862r0M8273h.f11375e;
            c2860q0.f11359g = c2862r0M8273h.m8263a(c2862r0.f11373c);
            long j16 = c2862r0.f11375e;
            if (j16 != -9223372036854775807L && j16 != j15) {
                c2860q0.m8262k();
                long j17 = j15 == -9223372036854775807L ? Long.MAX_VALUE : c2860q0.f11368p + j15;
                int i13 = (c2860q0 != this.f11393j || c2860q0.f11359g.f11377g || (j13 != Long.MIN_VALUE && j13 < j17)) ? 0 : 1;
                if (c2860q0 == this.f11394k && (j14 == Long.MIN_VALUE || j14 >= j17)) {
                    z4 = true;
                }
                int iM8279n = m8279n(c2860q0);
                if (iM8279n != 0) {
                    return iM8279n;
                }
                return z4 ? i13 | 2 : i13;
            }
            c2860q1 = c2860q0;
            c2860q0 = c2860q0.f11365m;
        }
    }
}
