package ec3;

import bc3.C3017i;
import bc3.C3023j1;
import bc3.C3033m;
import bc3.InterfaceC3027k1;
import dc3.EnumC11916a;
import fc3.AbstractC14370a;
import fc3.AbstractC14371b;
import fc3.AbstractC14372c;
import fc3.InterfaceC14386q;
import ge3.AbstractC15751g;
import hc3.C17191x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: renamed from: ec3.w1 */
/* JADX INFO: loaded from: classes5.dex */
public class C13096w1 extends AbstractC14370a implements InterfaceC13072o1, InterfaceC13026d, InterfaceC14386q {

    /* JADX INFO: renamed from: E */
    public final int f45250E;

    /* JADX INFO: renamed from: F */
    public final int f45251F;

    /* JADX INFO: renamed from: G */
    public final EnumC11916a f45252G;

    /* JADX INFO: renamed from: H */
    public Object[] f45253H;

    /* JADX INFO: renamed from: I */
    public long f45254I;

    /* JADX INFO: renamed from: J */
    public long f45255J;

    /* JADX INFO: renamed from: K */
    public int f45256K;

    /* JADX INFO: renamed from: L */
    public int f45257L;

    public C13096w1(int i13, int i14, EnumC11916a enumC11916a) {
        this.f45250E = i13;
        this.f45251F = i14;
        this.f45252G = enumC11916a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public static void m36617k(C13096w1 c13096w1, InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) throws Throwable {
        C13093v1 c13093v1;
        C13096w1 c13096w2;
        Throwable th3;
        C13099x1 c13099x1;
        InterfaceC13062m interfaceC13062m2;
        InterfaceC3027k1 interfaceC3027k1;
        if (interfaceC30057d instanceof C13093v1) {
            c13093v1 = (C13093v1) interfaceC30057d;
            int i13 = c13093v1.f45241G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13093v1.f45241G = i13 - Integer.MIN_VALUE;
            } else {
                c13093v1 = new C13093v1(c13096w1, interfaceC30057d);
            }
        } else {
            c13093v1 = new C13093v1(c13096w1, interfaceC30057d);
        }
        Object obj = c13093v1.f45239E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13093v1.f45241G;
        if (i14 != 0) {
            if (i14 == 1) {
                c13099x1 = c13093v1.f45244y;
                InterfaceC13062m interfaceC13062m3 = c13093v1.f45243x;
                C13096w1 c13096w3 = c13093v1.f45242w;
                try {
                    AbstractC34132o.m107864I(obj);
                    interfaceC13062m2 = interfaceC13062m3;
                    c13096w1 = c13096w3;
                    try {
                        interfaceC3027k1 = (InterfaceC3027k1) c13093v1.getContext().get(C3023j1.f12041w);
                    } catch (Throwable th4) {
                        c13096w2 = c13096w1;
                        th3 = th4;
                    }
                } catch (Throwable th5) {
                    th3 = th5;
                    c13096w2 = c13096w3;
                }
            } else {
                if (i14 != 2 && i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC3027k1 interfaceC3027k2 = c13093v1.f45245z;
                c13099x1 = c13093v1.f45244y;
                InterfaceC13062m interfaceC13062m4 = c13093v1.f45243x;
                c13096w2 = c13093v1.f45242w;
                try {
                    AbstractC34132o.m107864I(obj);
                    interfaceC13062m2 = interfaceC13062m4;
                    interfaceC3027k1 = interfaceC3027k2;
                    c13096w1 = c13096w2;
                } catch (Throwable th6) {
                    th3 = th6;
                }
            }
            c13096w2.m41036g(c13099x1);
            throw th3;
        }
        AbstractC34132o.m107864I(obj);
        C13099x1 c13099x2 = (C13099x1) c13096w1.m41035c();
        try {
            if (interfaceC13062m instanceof C13057k2) {
                c13093v1.f45242w = c13096w1;
                c13093v1.f45243x = interfaceC13062m;
                c13093v1.f45244y = c13099x2;
                c13093v1.f45241G = 1;
                if (((C13057k2) interfaceC13062m).m36574b(c13093v1) == enumC31071a) {
                    return;
                }
            }
            interfaceC13062m2 = interfaceC13062m;
            c13099x1 = c13099x2;
            interfaceC3027k1 = (InterfaceC3027k1) c13093v1.getContext().get(C3023j1.f12041w);
        } catch (Throwable th7) {
            c13096w2 = c13096w1;
            th3 = th7;
            c13099x1 = c13099x2;
        }
        while (true) {
            Object objM36627s = c13096w1.m36627s(c13099x1);
            if (objM36627s == AbstractC13091v.f45233c) {
                c13093v1.f45242w = c13096w1;
                c13093v1.f45243x = interfaceC13062m2;
                c13093v1.f45244y = c13099x1;
                c13093v1.f45245z = interfaceC3027k1;
                c13093v1.f45241G = 2;
                if (c13096w1.m36618i(c13099x1, c13093v1) == enumC31071a) {
                    return;
                }
            } else {
                if (interfaceC3027k1 != null && !interfaceC3027k1.isActive()) {
                    throw interfaceC3027k1.getCancellationException();
                }
                c13093v1.f45242w = c13096w1;
                c13093v1.f45243x = interfaceC13062m2;
                c13093v1.f45244y = c13099x1;
                c13093v1.f45245z = interfaceC3027k1;
                c13093v1.f45241G = 3;
                if (interfaceC13062m2.emit(objM36627s, c13093v1) == enumC31071a) {
                    return;
                }
            }
        }
    }

    @Override // ec3.InterfaceC13072o1
    /* JADX INFO: renamed from: a */
    public final boolean mo36564a(Object obj) {
        int i13;
        boolean z4;
        InterfaceC30057d[] interfaceC30057dArrM36622n = AbstractC14371b.f52476a;
        synchronized (this) {
            if (m36625q(obj)) {
                interfaceC30057dArrM36622n = m36622n(interfaceC30057dArrM36622n);
                z4 = true;
            } else {
                z4 = false;
            }
        }
        for (InterfaceC30057d interfaceC30057d : interfaceC30057dArrM36622n) {
            if (interfaceC30057d != null) {
                interfaceC30057d.resumeWith(C23454a0.f92919a);
            }
        }
        return z4;
    }

    @Override // fc3.InterfaceC14386q
    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l mo36565b(InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        return AbstractC13091v.m36581G(this, interfaceC30063j, i13, enumC11916a);
    }

    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        m36617k(this, interfaceC13062m, interfaceC30057d);
        return EnumC31071a.f128113w;
    }

    @Override // ec3.InterfaceC13072o1
    /* JADX INFO: renamed from: d */
    public final void mo36566d() throws Throwable {
        synchronized (this) {
            try {
                try {
                    m36628t(m36623o() + ((long) this.f45256K), this.f45255J, m36623o() + ((long) this.f45256K), m36623o() + ((long) this.f45256K) + ((long) this.f45257L));
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // fc3.AbstractC14370a
    /* JADX INFO: renamed from: e */
    public final AbstractC14372c mo36567e() {
        C13099x1 c13099x1 = new C13099x1();
        c13099x1.f45265a = -1L;
        return c13099x1;
    }

    @Override // ec3.InterfaceC13072o1, ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) throws Throwable {
        Throwable th3;
        InterfaceC30057d[] interfaceC30057dArrM36622n;
        C13090u1 c13090u1;
        if (mo36564a(obj)) {
            return C23454a0.f92919a;
        }
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        InterfaceC30057d[] interfaceC30057dArrM36622n2 = AbstractC14371b.f52476a;
        synchronized (this) {
            try {
                if (m36625q(obj)) {
                    try {
                        c3033m.resumeWith(C23454a0.f92919a);
                        interfaceC30057dArrM36622n = m36622n(interfaceC30057dArrM36622n2);
                        c13090u1 = null;
                    } catch (Throwable th4) {
                        th3 = th4;
                        throw th3;
                    }
                } else {
                    try {
                        C13090u1 c13090u2 = new C13090u1(this, m36623o() + ((long) (this.f45256K + this.f45257L)), obj, c3033m);
                        m36621m(c13090u2);
                        this.f45257L++;
                        if (this.f45251F == 0) {
                            interfaceC30057dArrM36622n2 = m36622n(interfaceC30057dArrM36622n2);
                        }
                        interfaceC30057dArrM36622n = interfaceC30057dArrM36622n2;
                        c13090u1 = c13090u2;
                    } catch (Throwable th5) {
                        th = th5;
                        th3 = th;
                        throw th3;
                    }
                }
                if (c13090u1 != null) {
                    c3033m.m8777v(new C3017i(c13090u1, 1));
                }
                for (InterfaceC30057d interfaceC30057d2 : interfaceC30057dArrM36622n) {
                    if (interfaceC30057d2 != null) {
                        interfaceC30057d2.resumeWith(C23454a0.f92919a);
                    }
                }
                Object objM8773r = c3033m.m8773r();
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (objM8773r != enumC31071a) {
                    objM8773r = C23454a0.f92919a;
                }
                return objM8773r == enumC31071a ? objM8773r : C23454a0.f92919a;
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    @Override // fc3.AbstractC14370a
    /* JADX INFO: renamed from: f */
    public final AbstractC14372c[] mo36568f() {
        return new C13099x1[2];
    }

    @Override // ec3.InterfaceC13087t1
    public final List getReplayCache() {
        synchronized (this) {
            int iM36623o = (int) ((m36623o() + ((long) this.f45256K)) - this.f45254I);
            if (iM36623o == 0) {
                return C25271y.f99162w;
            }
            ArrayList arrayList = new ArrayList(iM36623o);
            Object[] objArr = this.f45253H;
            AbstractC22676k.m65747g(objArr);
            for (int i13 = 0; i13 < iM36623o; i13++) {
                arrayList.add(objArr[((int) (this.f45254I + ((long) i13))) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: i */
    public final Object m36618i(C13099x1 c13099x1, C13093v1 c13093v1) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c13093v1));
        c3033m.m8774s();
        synchronized (this) {
            try {
                if (m36626r(c13099x1) < 0) {
                    c13099x1.f45266b = c3033m;
                } else {
                    c3033m.resumeWith(C23454a0.f92919a);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Object objM8773r = c3033m.m8773r();
        return objM8773r == EnumC31071a.f128113w ? objM8773r : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public final void m36619j() {
        if (this.f45251F != 0 || this.f45257L > 1) {
            Object[] objArr = this.f45253H;
            AbstractC22676k.m65747g(objArr);
            while (this.f45257L > 0) {
                long jM36623o = m36623o();
                int i13 = this.f45256K;
                int i14 = this.f45257L;
                if (objArr[((int) ((jM36623o + ((long) (i13 + i14))) - 1)) & (objArr.length - 1)] != AbstractC13091v.f45233c) {
                    return;
                }
                this.f45257L = i14 - 1;
                AbstractC13091v.m36596f(objArr, m36623o() + ((long) (this.f45256K + this.f45257L)), null);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m36620l() {
        AbstractC14372c[] abstractC14372cArr;
        Object[] objArr = this.f45253H;
        AbstractC22676k.m65747g(objArr);
        AbstractC13091v.m36596f(objArr, m36623o(), null);
        this.f45256K--;
        long jM36623o = m36623o() + 1;
        if (this.f45254I < jM36623o) {
            this.f45254I = jM36623o;
        }
        if (this.f45255J < jM36623o) {
            if (this.f52473x != 0 && (abstractC14372cArr = this.f52472w) != null) {
                for (AbstractC14372c abstractC14372c : abstractC14372cArr) {
                    if (abstractC14372c != null) {
                        C13099x1 c13099x1 = (C13099x1) abstractC14372c;
                        long j7 = c13099x1.f45265a;
                        if (j7 >= 0 && j7 < jM36623o) {
                            c13099x1.f45265a = jM36623o;
                        }
                    }
                }
            }
            this.f45255J = jM36623o;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m36621m(Object obj) {
        int i13 = this.f45256K + this.f45257L;
        Object[] objArrM36624p = this.f45253H;
        if (objArrM36624p == null) {
            objArrM36624p = m36624p(0, 2, null);
        } else if (i13 >= objArrM36624p.length) {
            objArrM36624p = m36624p(i13, objArrM36624p.length * 2, objArrM36624p);
        }
        AbstractC13091v.m36596f(objArrM36624p, m36623o() + ((long) i13), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [q83.d[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: n */
    public final InterfaceC30057d[] m36622n(InterfaceC30057d[] interfaceC30057dArr) {
        AbstractC14372c[] abstractC14372cArr;
        C13099x1 c13099x1;
        C3033m c3033m;
        int length = interfaceC30057dArr.length;
        if (this.f52473x != 0 && (abstractC14372cArr = this.f52472w) != null) {
            int length2 = abstractC14372cArr.length;
            int i13 = 0;
            while (i13 < length2) {
                AbstractC14372c abstractC14372c = abstractC14372cArr[i13];
                if (abstractC14372c == null || (c3033m = (c13099x1 = (C13099x1) abstractC14372c).f45266b) == null || m36626r(c13099x1) < 0) {
                    interfaceC30057dArr = interfaceC30057dArr;
                } else {
                    if (length >= interfaceC30057dArr.length) {
                        interfaceC30057dArr = interfaceC30057dArr;
                        interfaceC30057dArr = interfaceC30057dArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) interfaceC30057dArr, Math.max(2, interfaceC30057dArr.length * 2));
                        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
                        interfaceC30057dArr = objArrCopyOf;
                    }
                    interfaceC30057dArr = interfaceC30057dArr;
                    interfaceC30057dArr = interfaceC30057dArr;
                    ((InterfaceC30057d[]) interfaceC30057dArr)[length] = c3033m;
                    c13099x1.f45266b = null;
                    length++;
                }
                i13++;
                interfaceC30057dArr = interfaceC30057dArr;
            }
            interfaceC30057dArr = interfaceC30057dArr;
        }
        return (InterfaceC30057d[]) interfaceC30057dArr;
    }

    /* JADX INFO: renamed from: o */
    public final long m36623o() {
        return Math.min(this.f45255J, this.f45254I);
    }

    /* JADX INFO: renamed from: p */
    public final Object[] m36624p(int i13, int i14, Object[] objArr) {
        if (i14 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i14];
        this.f45253H = objArr2;
        if (objArr != null) {
            long jM36623o = m36623o();
            for (int i15 = 0; i15 < i13; i15++) {
                long j7 = ((long) i15) + jM36623o;
                AbstractC13091v.m36596f(objArr2, j7, objArr[((int) j7) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX INFO: renamed from: q */
    public final boolean m36625q(Object obj) {
        int i13;
        long jM36623o;
        long j7;
        int i14 = this.f52473x;
        int i15 = this.f45250E;
        if (i14 != 0) {
            int i16 = this.f45256K;
            int i17 = this.f45251F;
            if (i16 < i17 || this.f45255J > this.f45254I) {
                m36621m(obj);
                i13 = this.f45256K + 1;
                this.f45256K = i13;
                if (i13 > i17) {
                    m36620l();
                }
                jM36623o = m36623o() + ((long) this.f45256K);
                j7 = this.f45254I;
                if (((int) (jM36623o - j7)) > i15) {
                    m36628t(1 + j7, this.f45255J, m36623o() + ((long) this.f45256K), m36623o() + ((long) this.f45256K) + ((long) this.f45257L));
                }
            } else {
                int iOrdinal = this.f45252G.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal == 1) {
                    m36621m(obj);
                    i13 = this.f45256K + 1;
                    this.f45256K = i13;
                    if (i13 > i17) {
                        m36620l();
                    }
                    jM36623o = m36623o() + ((long) this.f45256K);
                    j7 = this.f45254I;
                    if (((int) (jM36623o - j7)) > i15) {
                        m36628t(1 + j7, this.f45255J, m36623o() + ((long) this.f45256K), m36623o() + ((long) this.f45256K) + ((long) this.f45257L));
                    }
                } else if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else if (i15 != 0) {
            m36621m(obj);
            int i18 = this.f45256K + 1;
            this.f45256K = i18;
            if (i18 > i15) {
                m36620l();
            }
            this.f45255J = m36623o() + ((long) this.f45256K);
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final long m36626r(C13099x1 c13099x1) {
        long j7 = c13099x1.f45265a;
        if (j7 < m36623o() + ((long) this.f45256K)) {
            return j7;
        }
        if (this.f45251F <= 0 && j7 <= m36623o() && this.f45257L != 0) {
            return j7;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: s */
    public final Object m36627s(C13099x1 c13099x1) {
        Object obj;
        InterfaceC30057d[] interfaceC30057dArrM36629u = AbstractC14371b.f52476a;
        synchronized (this) {
            try {
                long jM36626r = m36626r(c13099x1);
                if (jM36626r < 0) {
                    obj = AbstractC13091v.f45233c;
                } else {
                    long j7 = c13099x1.f45265a;
                    Object[] objArr = this.f45253H;
                    AbstractC22676k.m65747g(objArr);
                    Object obj2 = objArr[((int) jM36626r) & (objArr.length - 1)];
                    if (obj2 instanceof C13090u1) {
                        obj2 = ((C13090u1) obj2).f45229y;
                    }
                    c13099x1.f45265a = jM36626r + 1;
                    Object obj3 = obj2;
                    interfaceC30057dArrM36629u = m36629u(j7);
                    obj = obj3;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        for (InterfaceC30057d interfaceC30057d : interfaceC30057dArrM36629u) {
            if (interfaceC30057d != null) {
                interfaceC30057d.resumeWith(C23454a0.f92919a);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: t */
    public final void m36628t(long j7, long j13, long j14, long j15) {
        long jMin = Math.min(j13, j7);
        for (long jM36623o = m36623o(); jM36623o < jMin; jM36623o++) {
            Object[] objArr = this.f45253H;
            AbstractC22676k.m65747g(objArr);
            AbstractC13091v.m36596f(objArr, jM36623o, null);
        }
        this.f45254I = j7;
        this.f45255J = j13;
        this.f45256K = (int) (j14 - jMin);
        this.f45257L = (int) (j15 - j14);
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC30057d[] m36629u(long j7) {
        long j13;
        long j14;
        InterfaceC30057d[] interfaceC30057dArr;
        InterfaceC30057d[] interfaceC30057dArr2;
        AbstractC14372c[] abstractC14372cArr;
        C17191x c17191x = AbstractC13091v.f45233c;
        InterfaceC30057d[] interfaceC30057dArr3 = AbstractC14371b.f52476a;
        if (j7 <= this.f45255J) {
            long jM36623o = m36623o();
            long j15 = ((long) this.f45256K) + jM36623o;
            int i13 = this.f45251F;
            if (i13 == 0 && this.f45257L > 0) {
                j15++;
            }
            int i14 = 0;
            if (this.f52473x != 0 && (abstractC14372cArr = this.f52472w) != null) {
                for (AbstractC14372c abstractC14372c : abstractC14372cArr) {
                    if (abstractC14372c != null) {
                        long j16 = ((C13099x1) abstractC14372c).f45265a;
                        if (j16 >= 0 && j16 < j15) {
                            j15 = j16;
                        }
                    }
                }
            }
            if (j15 > this.f45255J) {
                long jM36623o2 = m36623o() + ((long) this.f45256K);
                int iMin = this.f52473x > 0 ? Math.min(this.f45257L, i13 - ((int) (jM36623o2 - j15))) : this.f45257L;
                long j17 = ((long) this.f45257L) + jM36623o2;
                if (iMin > 0) {
                    j14 = 1;
                    Object[] objArr = this.f45253H;
                    AbstractC22676k.m65747g(objArr);
                    InterfaceC30057d[] interfaceC30057dArr4 = new InterfaceC30057d[iMin];
                    long j18 = jM36623o2;
                    while (true) {
                        if (jM36623o2 >= j17) {
                            interfaceC30057dArr2 = interfaceC30057dArr4;
                            j13 = j15;
                            break;
                        }
                        interfaceC30057dArr2 = interfaceC30057dArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jM36623o2)];
                        if (obj != c17191x) {
                            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            C13090u1 c13090u1 = (C13090u1) obj;
                            int i15 = i14 + 1;
                            j13 = j15;
                            interfaceC30057dArr2[i14] = c13090u1.f45230z;
                            AbstractC13091v.m36596f(objArr, jM36623o2, c17191x);
                            AbstractC13091v.m36596f(objArr, j18, c13090u1.f45229y);
                            j18++;
                            if (i15 >= iMin) {
                                break;
                            }
                            i14 = i15;
                        } else {
                            j13 = j15;
                        }
                        jM36623o2++;
                        interfaceC30057dArr4 = interfaceC30057dArr2;
                        j15 = j13;
                    }
                    jM36623o2 = j18;
                    interfaceC30057dArr = interfaceC30057dArr2;
                } else {
                    j13 = j15;
                    j14 = 1;
                    interfaceC30057dArr = interfaceC30057dArr3;
                }
                int i16 = (int) (jM36623o2 - jM36623o);
                long j19 = this.f52473x == 0 ? jM36623o2 : j13;
                long jMax = Math.max(this.f45254I, jM36623o2 - ((long) Math.min(this.f45250E, i16)));
                if (i13 == 0 && jMax < j17) {
                    Object[] objArr2 = this.f45253H;
                    AbstractC22676k.m65747g(objArr2);
                    if (AbstractC22676k.m65745e(objArr2[((int) jMax) & (objArr2.length - 1)], c17191x)) {
                        jM36623o2 += j14;
                        jMax += j14;
                    }
                }
                m36628t(jMax, j19, jM36623o2, j17);
                m36619j();
                return interfaceC30057dArr.length == 0 ? interfaceC30057dArr : m36622n(interfaceC30057dArr);
            }
        }
        return interfaceC30057dArr3;
    }
}
