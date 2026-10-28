package p668z1;

import ae3.C0803k;
import c93.InterfaceC4351m;
import ch.C4600u;
import io.sentry.android.core.C20119j1;
import java.util.Collection;
import java.util.HashMap;
import m83.AbstractC25260n;
import m83.C25271y;
import p002a0.C0059w0;
import p446r1.C30851e;
import p474s.C31983m2;
import p602x1.C37815a;
import p602x1.C37825k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import vb1.C35868a;

/* JADX INFO: renamed from: z1.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC39963l {

    /* JADX INFO: renamed from: a */
    public static final C39962k f172460a = new C39962k(0);

    /* JADX INFO: renamed from: b */
    public static final C31983m2 f172461b = new C31983m2(10);

    /* JADX INFO: renamed from: c */
    public static final Object f172462c = new Object();

    /* JADX INFO: renamed from: d */
    public static C39961j f172463d;

    /* JADX INFO: renamed from: e */
    public static long f172464e;

    /* JADX INFO: renamed from: f */
    public static final C20119j1 f172465f;

    /* JADX INFO: renamed from: g */
    public static final C0803k f172466g;

    /* JADX INFO: renamed from: h */
    public static Object f172467h;

    /* JADX INFO: renamed from: i */
    public static Object f172468i;

    /* JADX INFO: renamed from: j */
    public static final C39947a f172469j;

    /* JADX INFO: renamed from: k */
    public static final C37815a f172470k;

    static {
        C39961j c39961j = C39961j.f172454E;
        f172463d = c39961j;
        long j7 = 1;
        f172464e = j7 + j7;
        C20119j1 c20119j1 = new C20119j1();
        c20119j1.f75586c = new long[16];
        c20119j1.f75587d = new int[16];
        int[] iArr = new int[16];
        int i13 = 0;
        while (i13 < 16) {
            int i14 = i13 + 1;
            iArr[i13] = i14;
            i13 = i14;
        }
        c20119j1.f75588e = iArr;
        f172465f = c20119j1;
        C0803k c0803k = new C0803k(6);
        c0803k.f2965c = new int[16];
        c0803k.f2966d = new C37825k[16];
        f172466g = c0803k;
        C25271y c25271y = C25271y.f99162w;
        f172467h = c25271y;
        f172468i = c25271y;
        long j13 = f172464e;
        f172464e = j7 + j13;
        C39947a c39947a = new C39947a(j13, c39961j, null, new C35868a(29));
        f172463d = f172463d.m128160g(c39947a.f172443b);
        f172469j = c39947a;
        f172470k = new C37815a(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m128161a() {
        m128166f(f172460a);
    }

    /* JADX INFO: renamed from: b */
    public static final Function1 m128162b(Function1 function1, Function1 function2) {
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new C4600u(function1, 2, function2);
    }

    /* JADX INFO: renamed from: c */
    public static final HashMap m128163c(long j7, C39949b c39949b, C39961j c39961j) {
        long[] jArr;
        C39961j c39961j2;
        long[] jArr2;
        int i13;
        AbstractC39950b0 abstractC39950b0M128179s;
        C0059w0 c0059w0Mo128141x = c39949b.mo128141x();
        if (c0059w0Mo128141x != null) {
            C39961j c39961jM128159e = c39949b.mo128146d().m128160g(c39949b.mo128147g()).m128159e(c39949b.f172415j);
            Object[] objArr = c0059w0Mo128141x.f178b;
            long[] jArr3 = c0059w0Mo128141x.f177a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                HashMap map = null;
                while (true) {
                    long j13 = jArr3[i14];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j13 & 255) < 128) {
                                InterfaceC39977z interfaceC39977z = (InterfaceC39977z) objArr[(i14 << 3) + i17];
                                AbstractC39950b0 abstractC39950b0Mo87010N = interfaceC39977z.mo87010N();
                                jArr2 = jArr3;
                                i13 = i15;
                                AbstractC39950b0 abstractC39950b0M128179s2 = m128179s(abstractC39950b0Mo87010N, j7, c39961j);
                                if (abstractC39950b0M128179s2 != null && (abstractC39950b0M128179s = m128179s(abstractC39950b0Mo87010N, j7, c39961jM128159e)) != null && !abstractC39950b0M128179s2.equals(abstractC39950b0M128179s)) {
                                    AbstractC39950b0 abstractC39950b0M128179s3 = m128179s(abstractC39950b0Mo87010N, c39949b.mo128147g(), c39949b.mo128146d());
                                    if (abstractC39950b0M128179s3 == null) {
                                        m128178r();
                                        throw null;
                                    }
                                    AbstractC39950b0 abstractC39950b0Mo87020S = interfaceC39977z.mo87020S(abstractC39950b0M128179s, abstractC39950b0M128179s2, abstractC39950b0M128179s3);
                                    if (abstractC39950b0Mo87020S == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(abstractC39950b0M128179s2, abstractC39950b0Mo87020S);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i13 = i15;
                            }
                            j13 >>= i13;
                            i17++;
                            j7 = j7;
                            i15 = i13;
                            jArr3 = jArr2;
                            c39961jM128159e = c39961jM128159e;
                        }
                        jArr = jArr3;
                        c39961j2 = c39961jM128159e;
                        if (i16 != i15) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        c39961j2 = c39961jM128159e;
                    }
                    if (i14 == length) {
                        return map;
                    }
                    i14++;
                    jArr3 = jArr;
                    c39961jM128159e = c39961j2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m128164d(AbstractC39957f abstractC39957f) {
        long j7;
        if (f172463d.m128158d(abstractC39957f.mo128147g())) {
            return;
        }
        StringBuilder sb4 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb4.append(abstractC39957f.mo128147g());
        sb4.append(", disposed=");
        sb4.append(abstractC39957f.f172444c);
        sb4.append(", applied=");
        C39949b c39949b = abstractC39957f instanceof C39949b ? (C39949b) abstractC39957f : null;
        sb4.append(c39949b != null ? Boolean.valueOf(c39949b.f172418m) : "read-only");
        sb4.append(", lowestPin=");
        synchronized (f172462c) {
            C20119j1 c20119j1 = f172465f;
            j7 = c20119j1.f75584a > 0 ? ((long[]) c20119j1.f75586c)[0] : -1L;
        }
        sb4.append(j7);
        throw new IllegalStateException(sb4.toString().toString());
    }

    /* JADX INFO: renamed from: e */
    public static final C39961j m128165e(C39961j c39961j, long j7, long j13) {
        while (AbstractC22676k.m65752l(j7, j13) < 0) {
            c39961j = c39961j.m128160g(j7);
            j7 += (long) 1;
        }
        return c39961j;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[LOOP:1: B:30:0x0059->B:43:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0096 A[EDGE_INSN: B:58:0x0096->B:44:0x0096 BREAK  A[LOOP:1: B:30:0x0059->B:43:0x0093], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: f */
    public static final Object m128166f(Function1 function1) {
        C0059w0 c0059w0;
        Object objM128182v;
        C39947a c39947a = f172469j;
        synchronized (f172462c) {
            try {
                c0059w0 = c39947a.f172413h;
                if (c0059w0 != null) {
                    f172470k.addAndGet(1);
                }
                objM128182v = m128182v(c39947a, function1);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (c0059w0 != null) {
            try {
                ?? r10 = f172467h;
                int size = ((Collection) r10).size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((InterfaceC4351m) r10.get(i13)).invoke(new C30851e(c0059w0), c39947a);
                }
                f172470k.addAndGet(-1);
            } catch (Throwable th4) {
                f172470k.addAndGet(-1);
                throw th4;
            }
        }
        synchronized (f172462c) {
            m128167g();
            if (c0059w0 != null) {
                Object[] objArr = c0059w0.f178b;
                long[] jArr = c0059w0.f177a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j7 = jArr[i14];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i14 != length) {
                                break;
                                break;
                            }
                            i14++;
                        } else {
                            int i15 = 8 - ((~(i14 - length)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((255 & j7) < 128) {
                                    m128177q((InterfaceC39977z) objArr[(i14 << 3) + i16]);
                                }
                                j7 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            }
                            if (i14 != length) {
                                break;
                            }
                            i14++;
                        }
                    }
                }
            }
        }
        return objM128182v;
    }

    /* JADX INFO: renamed from: g */
    public static final void m128167g() {
        C0803k c0803k = f172466g;
        int i13 = c0803k.f2964b;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 >= i13) {
                break;
            }
            C37825k c37825k = ((C37825k[]) c0803k.f2966d)[i14];
            Object obj = c37825k != null ? c37825k.get() : null;
            if (obj != null && m128176p((InterfaceC39977z) obj)) {
                if (i15 != i14) {
                    ((C37825k[]) c0803k.f2966d)[i15] = c37825k;
                    int[] iArr = (int[]) c0803k.f2965c;
                    iArr[i15] = iArr[i14];
                }
                i15++;
            }
            i14++;
        }
        for (int i16 = i15; i16 < i13; i16++) {
            ((C37825k[]) c0803k.f2966d)[i16] = null;
            ((int[]) c0803k.f2965c)[i16] = 0;
        }
        if (i15 != i13) {
            c0803k.f2964b = i15;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC39957f m128168h(AbstractC39957f abstractC39957f, Function1 function1, boolean z4) {
        boolean z13 = abstractC39957f instanceof C39949b;
        if (z13 || abstractC39957f == null) {
            return new C39954d0(z13 ? (C39949b) abstractC39957f : null, function1, null, false, z4);
        }
        return new C39956e0(abstractC39957f, function1, false, z4);
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC39950b0 m128169i(AbstractC39950b0 abstractC39950b0) {
        AbstractC39950b0 abstractC39950b0M128179s;
        AbstractC39957f abstractC39957fM128171k = m128171k();
        AbstractC39950b0 abstractC39950b0M128179s2 = m128179s(abstractC39950b0, abstractC39957fM128171k.mo128147g(), abstractC39957fM128171k.mo128146d());
        if (abstractC39950b0M128179s2 != null) {
            return abstractC39950b0M128179s2;
        }
        synchronized (f172462c) {
            AbstractC39957f abstractC39957fM128171k2 = m128171k();
            abstractC39950b0M128179s = m128179s(abstractC39950b0, abstractC39957fM128171k2.mo128147g(), abstractC39957fM128171k2.mo128146d());
        }
        if (abstractC39950b0M128179s != null) {
            return abstractC39950b0M128179s;
        }
        m128178r();
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static final AbstractC39950b0 m128170j(AbstractC39950b0 abstractC39950b0, AbstractC39957f abstractC39957f) {
        AbstractC39950b0 abstractC39950b0M128179s;
        AbstractC39950b0 abstractC39950b0M128179s2 = m128179s(abstractC39950b0, abstractC39957f.mo128147g(), abstractC39957f.mo128146d());
        if (abstractC39950b0M128179s2 != null) {
            return abstractC39950b0M128179s2;
        }
        synchronized (f172462c) {
            abstractC39950b0M128179s = m128179s(abstractC39950b0, abstractC39957f.mo128147g(), abstractC39957f.mo128146d());
        }
        if (abstractC39950b0M128179s != null) {
            return abstractC39950b0M128179s;
        }
        m128178r();
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static final AbstractC39957f m128171k() {
        AbstractC39957f abstractC39957f = (AbstractC39957f) f172461b.m99482f();
        return abstractC39957f == null ? f172469j : abstractC39957f;
    }

    /* JADX INFO: renamed from: l */
    public static final Function1 m128172l(Function1 function1, Function1 function2, boolean z4) {
        if (!z4) {
            function2 = null;
        }
        if (function1 == null || function2 == null || function1 == function2) {
            return function1 == null ? function2 : function1;
        }
        return new C4600u(function1, 1, function2);
    }

    /* JADX INFO: renamed from: m */
    public static final AbstractC39950b0 m128173m(AbstractC39950b0 abstractC39950b0, InterfaceC39977z interfaceC39977z) {
        long j7 = f172464e;
        C20119j1 c20119j1 = f172465f;
        if (c20119j1.f75584a > 0) {
            j7 = ((long[]) c20119j1.f75586c)[0];
        }
        long j13 = j7 - ((long) 1);
        AbstractC39950b0 abstractC39950b1 = null;
        AbstractC39950b0 abstractC39950b2 = null;
        for (AbstractC39950b0 abstractC39950b0Mo87010N = interfaceC39977z.mo87010N(); abstractC39950b0Mo87010N != null; abstractC39950b0Mo87010N = abstractC39950b0Mo87010N.f172420b) {
            long j14 = abstractC39950b0Mo87010N.f172419a;
            if (j14 != 0) {
                if (j14 != 0 && AbstractC22676k.m65752l(j14, j13) <= 0 && !C39961j.f172454E.m128158d(j14)) {
                    if (abstractC39950b2 != null) {
                        if (AbstractC22676k.m65752l(abstractC39950b0Mo87010N.f172419a, abstractC39950b2.f172419a) >= 0) {
                            abstractC39950b1 = abstractC39950b2;
                            break;
                        }
                        break;
                    }
                    abstractC39950b2 = abstractC39950b0Mo87010N;
                }
            }
            abstractC39950b1 = abstractC39950b0Mo87010N;
            break;
        }
        if (abstractC39950b1 != null) {
            abstractC39950b1.f172419a = Long.MAX_VALUE;
            return abstractC39950b1;
        }
        AbstractC39950b0 abstractC39950b0Mo86986b = abstractC39950b0.mo86986b(Long.MAX_VALUE);
        abstractC39950b0Mo86986b.f172420b = interfaceC39977z.mo87010N();
        interfaceC39977z.mo87011m0(abstractC39950b0Mo86986b);
        return abstractC39950b0Mo86986b;
    }

    /* JADX INFO: renamed from: n */
    public static final void m128174n(AbstractC39957f abstractC39957f, InterfaceC39977z interfaceC39977z) {
        abstractC39957f.mo128139t(abstractC39957f.mo128135h() + 1);
        Function1 function1Mo128136i = abstractC39957f.mo128136i();
        if (function1Mo128136i != null) {
            function1Mo128136i.invoke(interfaceC39977z);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final AbstractC39950b0 m128175o(AbstractC39950b0 abstractC39950b0, AbstractC39948a0 abstractC39948a0, AbstractC39957f abstractC39957f, AbstractC39950b0 abstractC39950b1) {
        AbstractC39950b0 abstractC39950b0M128173m;
        if (abstractC39957f.mo128134f()) {
            abstractC39957f.mo128137n(abstractC39948a0);
        }
        long jMo128147g = abstractC39957f.mo128147g();
        if (abstractC39950b1.f172419a == jMo128147g) {
            return abstractC39950b1;
        }
        synchronized (f172462c) {
            abstractC39950b0M128173m = m128173m(abstractC39950b0, abstractC39948a0);
        }
        abstractC39950b0M128173m.f172419a = jMo128147g;
        if (abstractC39950b1.f172419a != 1) {
            abstractC39957f.mo128137n(abstractC39948a0);
        }
        return abstractC39950b0M128173m;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m128176p(InterfaceC39977z interfaceC39977z) {
        AbstractC39950b0 abstractC39950b0;
        long j7 = f172464e;
        C20119j1 c20119j1 = f172465f;
        if (c20119j1.f75584a > 0) {
            j7 = ((long[]) c20119j1.f75586c)[0];
        }
        AbstractC39950b0 abstractC39950b1 = null;
        AbstractC39950b0 abstractC39950b0Mo87010N = null;
        int i13 = 0;
        for (AbstractC39950b0 abstractC39950b0Mo87010N2 = interfaceC39977z.mo87010N(); abstractC39950b0Mo87010N2 != null; abstractC39950b0Mo87010N2 = abstractC39950b0Mo87010N2.f172420b) {
            long j13 = abstractC39950b0Mo87010N2.f172419a;
            if (j13 != 0) {
                if (AbstractC22676k.m65752l(j13, j7) >= 0) {
                    i13++;
                } else if (abstractC39950b1 == null) {
                    i13++;
                    abstractC39950b1 = abstractC39950b0Mo87010N2;
                } else {
                    if (AbstractC22676k.m65752l(abstractC39950b0Mo87010N2.f172419a, abstractC39950b1.f172419a) < 0) {
                        abstractC39950b0 = abstractC39950b1;
                        abstractC39950b1 = abstractC39950b0Mo87010N2;
                    } else {
                        abstractC39950b0 = abstractC39950b0Mo87010N2;
                    }
                    if (abstractC39950b0Mo87010N == null) {
                        abstractC39950b0Mo87010N = interfaceC39977z.mo87010N();
                        AbstractC39950b0 abstractC39950b2 = abstractC39950b0Mo87010N;
                        while (true) {
                            if (abstractC39950b0Mo87010N == null) {
                                abstractC39950b0Mo87010N = abstractC39950b2;
                                break;
                            }
                            if (AbstractC22676k.m65752l(abstractC39950b0Mo87010N.f172419a, j7) >= 0) {
                                break;
                            }
                            if (AbstractC22676k.m65752l(abstractC39950b2.f172419a, abstractC39950b0Mo87010N.f172419a) < 0) {
                                abstractC39950b2 = abstractC39950b0Mo87010N;
                            }
                            abstractC39950b0Mo87010N = abstractC39950b0Mo87010N.f172420b;
                        }
                    }
                    abstractC39950b1.f172419a = 0L;
                    abstractC39950b1.mo86985a(abstractC39950b0Mo87010N);
                    abstractC39950b1 = abstractC39950b0;
                }
            }
        }
        return i13 > 1;
    }

    /* JADX INFO: renamed from: q */
    public static final void m128177q(InterfaceC39977z interfaceC39977z) {
        if (m128176p(interfaceC39977z)) {
            C0803k c0803k = f172466g;
            int i13 = c0803k.f2964b;
            int iIdentityHashCode = System.identityHashCode(interfaceC39977z);
            int i14 = -1;
            if (i13 > 0) {
                int i15 = c0803k.f2964b - 1;
                int i16 = 0;
                while (true) {
                    if (i16 > i15) {
                        i14 = -(i16 + 1);
                        break;
                    }
                    int i17 = (i16 + i15) >>> 1;
                    int i18 = ((int[]) c0803k.f2965c)[i17];
                    if (i18 < iIdentityHashCode) {
                        i16 = i17 + 1;
                    } else if (i18 > iIdentityHashCode) {
                        i15 = i17 - 1;
                    } else {
                        C37825k c37825k = ((C37825k[]) c0803k.f2966d)[i17];
                        if (interfaceC39977z == (c37825k != null ? c37825k.get() : null)) {
                            i14 = i17;
                            break;
                        }
                        int i19 = i17 - 1;
                        while (true) {
                            if (-1 >= i19 || ((int[]) c0803k.f2965c)[i19] != iIdentityHashCode) {
                                i17++;
                                int i24 = c0803k.f2964b;
                                while (true) {
                                    if (i17 >= i24) {
                                        i14 = -(c0803k.f2964b + 1);
                                        break;
                                    }
                                    if (((int[]) c0803k.f2965c)[i17] != iIdentityHashCode) {
                                        i14 = -(i17 + 1);
                                        break;
                                    }
                                    C37825k c37825k2 = ((C37825k[]) c0803k.f2966d)[i17];
                                    if ((c37825k2 != null ? c37825k2.get() : null) == interfaceC39977z) {
                                        i14 = i17;
                                        break;
                                    }
                                    i17++;
                                }
                            } else {
                                C37825k c37825k3 = ((C37825k[]) c0803k.f2966d)[i19];
                                if ((c37825k3 != null ? c37825k3.get() : null) == interfaceC39977z) {
                                    i14 = i19;
                                    break;
                                }
                                i19--;
                            }
                        }
                    }
                }
                if (i14 >= 0) {
                    return;
                }
            }
            int i25 = -(i14 + 1);
            C37825k[] c37825kArr = (C37825k[]) c0803k.f2966d;
            int length = c37825kArr.length;
            if (i13 == length) {
                int i26 = length * 2;
                C37825k[] c37825kArr2 = new C37825k[i26];
                int[] iArr = new int[i26];
                int i27 = i25 + 1;
                System.arraycopy(c37825kArr, i25, c37825kArr2, i27, i13 - i25);
                System.arraycopy((C37825k[]) c0803k.f2966d, 0, c37825kArr2, 0, i25);
                AbstractC25260n.m74064e0(i27, i25, (int[]) c0803k.f2965c, iArr, i13);
                AbstractC25260n.m74069j0(0, i25, (int[]) c0803k.f2965c, iArr, 6);
                c0803k.f2966d = c37825kArr2;
                c0803k.f2965c = iArr;
            } else {
                int i28 = i25 + 1;
                System.arraycopy(c37825kArr, i25, c37825kArr, i28, i13 - i25);
                int[] iArr2 = (int[]) c0803k.f2965c;
                AbstractC25260n.m74064e0(i28, i25, iArr2, iArr2, i13);
            }
            ((C37825k[]) c0803k.f2966d)[i25] = new C37825k(interfaceC39977z);
            ((int[]) c0803k.f2965c)[i25] = iIdentityHashCode;
            c0803k.f2964b++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m128178r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: renamed from: s */
    public static final AbstractC39950b0 m128179s(AbstractC39950b0 abstractC39950b0, long j7, C39961j c39961j) {
        AbstractC39950b0 abstractC39950b1 = null;
        while (abstractC39950b0 != null) {
            long j13 = abstractC39950b0.f172419a;
            if (j13 != 0 && AbstractC22676k.m65752l(j13, j7) <= 0 && !c39961j.m128158d(j13) && (abstractC39950b1 == null || AbstractC22676k.m65752l(abstractC39950b1.f172419a, abstractC39950b0.f172419a) < 0)) {
                abstractC39950b1 = abstractC39950b0;
            }
            abstractC39950b0 = abstractC39950b0.f172420b;
        }
        if (abstractC39950b1 != null) {
            return abstractC39950b1;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final AbstractC39950b0 m128180t(AbstractC39950b0 abstractC39950b0, InterfaceC39977z interfaceC39977z) {
        AbstractC39950b0 abstractC39950b0M128179s;
        AbstractC39957f abstractC39957fM128171k = m128171k();
        Function1 function1Mo128133e = abstractC39957fM128171k.mo128133e();
        if (function1Mo128133e != null) {
            function1Mo128133e.invoke(interfaceC39977z);
        }
        AbstractC39950b0 abstractC39950b0M128179s2 = m128179s(abstractC39950b0, abstractC39957fM128171k.mo128147g(), abstractC39957fM128171k.mo128146d());
        if (abstractC39950b0M128179s2 != null) {
            return abstractC39950b0M128179s2;
        }
        synchronized (f172462c) {
            AbstractC39957f abstractC39957fM128171k2 = m128171k();
            AbstractC39950b0 abstractC39950b0Mo87010N = interfaceC39977z.mo87010N();
            AbstractC22676k.m65748h(abstractC39950b0Mo87010N, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            abstractC39950b0M128179s = m128179s(abstractC39950b0Mo87010N, abstractC39957fM128171k2.mo128147g(), abstractC39957fM128171k2.mo128146d());
            if (abstractC39950b0M128179s == null) {
                m128178r();
                throw null;
            }
        }
        return abstractC39950b0M128179s;
    }

    /* JADX INFO: renamed from: u */
    public static final void m128181u(int i13) {
        C20119j1 c20119j1 = f172465f;
        int i14 = ((int[]) c20119j1.f75588e)[i13];
        c20119j1.m56020g(i14, c20119j1.f75584a - 1);
        c20119j1.f75584a--;
        long[] jArr = (long[]) c20119j1.f75586c;
        long j7 = jArr[i14];
        int i15 = i14;
        while (i15 > 0) {
            int i16 = ((i15 + 1) >> 1) - 1;
            if (AbstractC22676k.m65752l(jArr[i16], j7) <= 0) {
                break;
            }
            c20119j1.m56020g(i16, i15);
            i15 = i16;
        }
        long[] jArr2 = (long[]) c20119j1.f75586c;
        int i17 = c20119j1.f75584a >> 1;
        while (i14 < i17) {
            int i18 = (i14 + 1) << 1;
            int i19 = i18 - 1;
            if (i18 < c20119j1.f75584a && AbstractC22676k.m65752l(jArr2[i18], jArr2[i19]) < 0) {
                if (AbstractC22676k.m65752l(jArr2[i18], jArr2[i14]) >= 0) {
                    break;
                }
                c20119j1.m56020g(i18, i14);
                i14 = i18;
            } else {
                if (AbstractC22676k.m65752l(jArr2[i19], jArr2[i14]) >= 0) {
                    break;
                }
                c20119j1.m56020g(i19, i14);
                i14 = i19;
            }
        }
        ((int[]) c20119j1.f75588e)[i13] = c20119j1.f75585b;
        c20119j1.f75585b = i13;
    }

    /* JADX INFO: renamed from: v */
    public static final Object m128182v(C39947a c39947a, Function1 function1) {
        long j7 = c39947a.f172443b;
        Object objInvoke = function1.invoke(f172463d.m128157c(j7));
        long j13 = f172464e;
        f172464e = ((long) 1) + j13;
        C39961j c39961jM128157c = f172463d.m128157c(j7);
        f172463d = c39961jM128157c;
        c39947a.f172443b = j13;
        c39947a.f172442a = c39961jM128157c;
        c39947a.f172412g = 0;
        c39947a.f172413h = null;
        c39947a.m128154o();
        f172463d = f172463d.m128160g(j13);
        return objInvoke;
    }

    /* JADX INFO: renamed from: w */
    public static final AbstractC39950b0 m128183w(AbstractC39950b0 abstractC39950b0, InterfaceC39977z interfaceC39977z, AbstractC39957f abstractC39957f) {
        AbstractC39950b0 abstractC39950b0M128179s;
        if (abstractC39957f.mo128134f()) {
            abstractC39957f.mo128137n(interfaceC39977z);
        }
        long jMo128147g = abstractC39957f.mo128147g();
        AbstractC39950b0 abstractC39950b0M128179s2 = m128179s(abstractC39950b0, jMo128147g, abstractC39957f.mo128146d());
        if (abstractC39950b0M128179s2 == null) {
            m128178r();
            throw null;
        }
        if (abstractC39950b0M128179s2.f172419a == abstractC39957f.mo128147g()) {
            return abstractC39950b0M128179s2;
        }
        synchronized (f172462c) {
            abstractC39950b0M128179s = m128179s(interfaceC39977z.mo87010N(), jMo128147g, abstractC39957f.mo128146d());
            if (abstractC39950b0M128179s == null) {
                m128178r();
                throw null;
            }
            if (abstractC39950b0M128179s.f172419a != jMo128147g) {
                AbstractC39950b0 abstractC39950b0M128173m = m128173m(abstractC39950b0M128179s, interfaceC39977z);
                abstractC39950b0M128173m.mo86985a(abstractC39950b0M128179s);
                abstractC39950b0M128173m.f172419a = abstractC39957f.mo128147g();
                abstractC39950b0M128179s = abstractC39950b0M128173m;
            }
        }
        if (abstractC39950b0M128179s2.f172419a != 1) {
            abstractC39957f.mo128137n(interfaceC39977z);
        }
        return abstractC39950b0M128179s;
    }
}
