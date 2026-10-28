package p047c9;

import java.util.HashMap;
import java.util.Random;
import p031b9.C2855o;
import p299l9.C23488c0;
import p516u8.AbstractC34609o0;
import p516u8.C34605m0;
import p516u8.C34607n0;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: c9.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C4319j {

    /* JADX INFO: renamed from: h */
    public static final C2855o f17531h = new C2855o(1);

    /* JADX INFO: renamed from: i */
    public static final Random f17532i = new Random();

    /* JADX INFO: renamed from: d */
    public C4321l f17536d;

    /* JADX INFO: renamed from: f */
    public String f17538f;

    /* JADX INFO: renamed from: a */
    public final C34607n0 f17533a = new C34607n0();

    /* JADX INFO: renamed from: b */
    public final C34605m0 f17534b = new C34605m0();

    /* JADX INFO: renamed from: c */
    public final HashMap f17535c = new HashMap();

    /* JADX INFO: renamed from: e */
    public AbstractC34609o0 f17537e = AbstractC34609o0.f145755a;

    /* JADX INFO: renamed from: g */
    public long f17539g = -1;

    /* JADX INFO: renamed from: a */
    public final void m13606a(C4318i c4318i) {
        long j7 = c4318i.f17526c;
        if (j7 != -1) {
            this.f17539g = j7;
        }
        this.f17538f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final C4318i m13607b(int i13, C23488c0 c23488c0) {
        long j7;
        long j13;
        long j14;
        HashMap map = this.f17535c;
        C4318i c4318i = null;
        long j15 = Long.MAX_VALUE;
        for (C4318i c4318i2 : map.values()) {
            long j16 = c4318i2.f17526c;
            C23488c0 c23488c1 = c4318i2.f17527d;
            if (j16 == -1 && i13 == c4318i2.f17525b && c23488c0 != null) {
                long j17 = c23488c0.f92979d;
                C4319j c4319j = c4318i2.f17530g;
                j7 = -1;
                C4318i c4318i3 = (C4318i) c4319j.f17535c.get(c4319j.f17538f);
                if (c4318i3 != null) {
                    j14 = c4318i3.f17526c;
                    if (j14 == -1) {
                        j14 = c4319j.f17539g + 1;
                    }
                } else {
                    j14 = c4319j.f17539g + 1;
                }
                if (j17 >= j14) {
                    c4318i2.f17526c = j17;
                }
            } else {
                j7 = -1;
            }
            if (c23488c0 != null) {
                long j18 = c23488c0.f92979d;
                if (c23488c1 == null) {
                    if (!c23488c0.m68054b() && j18 == c4318i2.f17526c) {
                        j13 = c4318i2.f17526c;
                        if (j13 != j7) {
                        }
                        c4318i = c4318i2;
                        j15 = j13;
                    }
                } else if (j18 == c23488c1.f92979d && c23488c0.f92977b == c23488c1.f92977b && c23488c0.f92978c == c23488c1.f92978c) {
                    j13 = c4318i2.f17526c;
                    if (j13 != j7) {
                    }
                    c4318i = c4318i2;
                    j15 = j13;
                }
            } else if (i13 == c4318i2.f17525b) {
                j13 = c4318i2.f17526c;
                if (j13 != j7 || j13 < j15) {
                    c4318i = c4318i2;
                    j15 = j13;
                } else if (j13 == j15) {
                    int i14 = AbstractC38065t.f163031a;
                    if (c4318i.f17527d != null && c23488c1 != null) {
                        c4318i = c4318i2;
                    }
                }
            }
        }
        if (c4318i != null) {
            return c4318i;
        }
        String str = (String) f17531h.get();
        C4318i c4318i4 = new C4318i(this, str, i13, c23488c0);
        map.put(str, c4318i4);
        return c4318i4;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized String m13608c(AbstractC34609o0 abstractC34609o0, C23488c0 c23488c0) {
        return m13607b(abstractC34609o0.mo8135g(c23488c0.f92976a, this.f17534b).f145693c, c23488c0).f17524a;
    }

    /* JADX INFO: renamed from: d */
    public final void m13609d(C4310a c4310a) {
        C23488c0 c23488c0;
        AbstractC34609o0 abstractC34609o0 = c4310a.f17496b;
        int i13 = c4310a.f17497c;
        C23488c0 c23488c1 = c4310a.f17498d;
        boolean zM109408p = abstractC34609o0.m109408p();
        HashMap map = this.f17535c;
        if (zM109408p) {
            String str = this.f17538f;
            if (str != null) {
                C4318i c4318i = (C4318i) map.get(str);
                c4318i.getClass();
                m13606a(c4318i);
                return;
            }
            return;
        }
        C4318i c4318i2 = (C4318i) map.get(this.f17538f);
        this.f17538f = m13607b(i13, c23488c1).f17524a;
        m13610e(c4310a);
        if (c23488c1 != null) {
            long j7 = c23488c1.f92979d;
            if (c23488c1.m68054b()) {
                if (c4318i2 != null && c4318i2.f17526c == j7 && (c23488c0 = c4318i2.f17527d) != null && c23488c0.f92977b == c23488c1.f92977b && c23488c0.f92978c == c23488c1.f92978c) {
                    return;
                }
                m13607b(i13, new C23488c0(c23488c1.f92976a, j7));
                this.f17536d.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb), top: B:52:0x0001 }] */
    /* JADX INFO: renamed from: e */
    public final synchronized void m13610e(C4310a c4310a) {
        long j7;
        this.f17536d.getClass();
        if (c4310a.f17496b.m109408p()) {
            return;
        }
        C23488c0 c23488c0 = c4310a.f17498d;
        if (c23488c0 != null) {
            long j13 = c23488c0.f92979d;
            C4318i c4318i = (C4318i) this.f17535c.get(this.f17538f);
            if (c4318i != null) {
                j7 = c4318i.f17526c;
                if (j7 == -1) {
                    j7 = this.f17539g + 1;
                }
            } else {
                j7 = this.f17539g + 1;
            }
            if (j13 < j7) {
                return;
            }
            C4318i c4318i2 = (C4318i) this.f17535c.get(this.f17538f);
            if (c4318i2 != null && c4318i2.f17526c == -1 && c4318i2.f17525b != c4310a.f17497c) {
                return;
            }
        }
        C4318i c4318iM13607b = m13607b(c4310a.f17497c, c4310a.f17498d);
        if (this.f17538f == null) {
            this.f17538f = c4318iM13607b.f17524a;
        }
        C23488c0 c23488c1 = c4310a.f17498d;
        if (c23488c1 != null && c23488c1.m68054b()) {
            C23488c0 c23488c2 = c4310a.f17498d;
            C4318i c4318iM13607b2 = m13607b(c4310a.f17497c, new C23488c0(c23488c2.f92976a, c23488c2.f92979d, c23488c2.f92977b));
            if (!c4318iM13607b2.f17528e) {
                c4318iM13607b2.f17528e = true;
                c4310a.f17496b.mo8135g(c4310a.f17498d.f92976a, this.f17534b);
                this.f17534b.m109395d(c4310a.f17498d.f92977b);
                Math.max(0L, AbstractC38065t.m121907U(0L) + AbstractC38065t.m121907U(this.f17534b.f145695e));
                this.f17536d.getClass();
            }
        }
        if (!c4318iM13607b.f17528e) {
            c4318iM13607b.f17528e = true;
            this.f17536d.getClass();
        }
        if (c4318iM13607b.f17524a.equals(this.f17538f) && !c4318iM13607b.f17529f) {
            c4318iM13607b.f17529f = true;
            this.f17536d.m13624l(c4310a, c4318iM13607b.f17524a);
        }
    }
}
