package p133f1;

import as1.C1949j;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import d30.C11544k;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import p002a0.AbstractC0056v;
import p002a0.AbstractC0058w;
import p002a0.C0029i0;
import p002a0.C0035k0;
import p003a1.C0112k;
import p026b2.C2319y;
import p132f0.C13774c;
import p164g2.C15247s;
import p181h2.C16617b;
import p181h2.C16618c;
import p268k0.AbstractC22086a;
import p294l3.C23248d;
import p294l3.C23254g;
import p294l3.C23277r0;
import p294l3.C23283u0;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28633k1;
import p390p1.C28676v0;
import p411q2.InterfaceC29805a;
import p510u0.EnumC34315f0;
import p635y2.InterfaceC39147y;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ro.C31624i;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: f1.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13988w0 {

    /* JADX INFO: renamed from: a */
    public final C13926b1 f49900a;

    /* JADX INFO: renamed from: e */
    public InterfaceC29805a f49904e;

    /* JADX INFO: renamed from: f */
    public Function1 f49905f;

    /* JADX INFO: renamed from: k */
    public C16617b f49910k;

    /* JADX INFO: renamed from: l */
    public InterfaceC39147y f49911l;

    /* JADX INFO: renamed from: t */
    public InterfaceC13970q0 f49919t;

    /* JADX INFO: renamed from: u */
    public boolean f49920u;

    /* JADX INFO: renamed from: v */
    public InterfaceC2994c0 f49921v;

    /* JADX INFO: renamed from: w */
    public C13966p f49922w;

    /* JADX INFO: renamed from: x */
    public boolean f49923x;

    /* JADX INFO: renamed from: b */
    public final C28633k1 f49901b = AbstractC28683x.m87272z(null);

    /* JADX INFO: renamed from: c */
    public final C28633k1 f49902c = AbstractC28683x.m87272z(Boolean.TRUE);

    /* JADX INFO: renamed from: d */
    public Function1 f49903d = new C13928c0(this, 7);

    /* JADX INFO: renamed from: g */
    public final C31624i f49906g = new C31624i(1);

    /* JADX INFO: renamed from: h */
    public final C15247s f49907h = new C15247s();

    /* JADX INFO: renamed from: i */
    public final C28633k1 f49908i = AbstractC28683x.m87272z(Boolean.FALSE);

    /* JADX INFO: renamed from: j */
    public final C28612f0 f49909j = AbstractC28683x.m87264r(new C13931d0(this, 3));

    /* JADX INFO: renamed from: m */
    public final C28633k1 f49912m = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);

    /* JADX INFO: renamed from: n */
    public final C28633k1 f49913n = AbstractC28683x.m87272z(new C16617b(0));

    /* JADX INFO: renamed from: o */
    public final C28633k1 f49914o = AbstractC28683x.m87272z(new C16617b(0));

    /* JADX INFO: renamed from: p */
    public final C28633k1 f49915p = AbstractC28683x.m87272z(null);

    /* JADX INFO: renamed from: q */
    public final C28633k1 f49916q = AbstractC28683x.m87272z(null);

    /* JADX INFO: renamed from: r */
    public final C28633k1 f49917r = AbstractC28683x.m87272z(null);

    /* JADX INFO: renamed from: s */
    public final C28633k1 f49918s = AbstractC28683x.m87272z(null);

    public C13988w0(C13926b1 c13926b1) {
        this.f49900a = c13926b1;
        c13926b1.f49650e = new C13928c0(this, 8);
        c13926b1.f49651f = new C1949j(this, 5);
        c13926b1.f49652g = new C11544k(this, 2);
        c13926b1.f49653h = new C13931d0(this, 4);
        c13926b1.f49654i = new C13928c0(this, 1);
        c13926b1.f49655j = new C13928c0(this, 2);
    }

    /* JADX INFO: renamed from: a */
    public static final Object m39796a(C13988w0 c13988w0, AbstractC32275i abstractC32275i) throws Throwable {
        Object objM8705K;
        C23465k c23465kM39800e = c13988w0.m39800e();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (c23465kM39800e != null) {
            C23254g c23254g = (C23254g) c23465kM39800e.f92937w;
            long j7 = ((C23283u0) c23465kM39800e.f92938x).f92253a;
            C13966p c13966p = c13988w0.f49922w;
            if (c13966p != null) {
                if (c23254g.length() == 0 || C23283u0.m67357c(j7)) {
                    objM8705K = c23454a0;
                } else {
                    objM8705K = AbstractC3006f0.m8705K(c13966p.f49795a, new C2319y(c13966p, new C13774c(c13966p, c23254g, j7, (InterfaceC30057d) null, 2), (InterfaceC30057d) null), abstractC32275i);
                }
                if (objM8705K == EnumC31071a.f128113w) {
                    return objM8705K;
                }
            }
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: b */
    public final long m39797b(InterfaceC39147y interfaceC39147y, long j7) {
        InterfaceC39147y interfaceC39147y2 = this.f49911l;
        if (interfaceC39147y2 == null || !interfaceC39147y2.mo3532g()) {
            return 9205357640488583168L;
        }
        return m39806k().mo3537k(interfaceC39147y, j7);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX INFO: renamed from: c */
    public final void m39798c() {
        C23254g c23254gM67309k;
        Function1 function1;
        int iNextIndex;
        if (m39802g() != null) {
            C13926b1 c13926b1 = this.f49900a;
            if (c13926b1.m39690a().f103e == 0) {
                c23254gM67309k = null;
            } else {
                C23248d c23248d = new C23248d();
                ArrayList arrayListM39694e = c13926b1.m39694e(m39806k());
                ListIterator listIterator = arrayListM39694e.listIterator(arrayListM39694e.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    C13981u c13981u = (C13981u) c13926b1.m39690a().m81e(((C13954l) listIterator.previous()).f49741a);
                    if (c13981u != null && c13981u.f49879a.f49872b != c13981u.f49880b.f49872b) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                if (iNextIndex != -1) {
                    int size = arrayListM39694e.size();
                    int i13 = 0;
                    while (i13 < size) {
                        C13954l c13954l = (C13954l) arrayListM39694e.get(i13);
                        C13981u c13981u2 = (C13981u) c13926b1.m39690a().m81e(c13954l.f49741a);
                        if (c13981u2 != null) {
                            C23254g c23254gM39737e = c13954l.m39737e();
                            long jM60431f = AbstractC21478l0.m60431f(c13981u2.f49879a.f49872b, c13981u2.f49880b.f49872b);
                            boolean z4 = i13 >= iNextIndex;
                            c23248d.m67302d(c23254gM39737e, C23283u0.m67360f(jM60431f), C23283u0.m67359e(jM60431f));
                            if (!z4) {
                                c23248d.f92119w.append('\n');
                            }
                        }
                        i13++;
                    }
                }
                c23254gM67309k = c23248d.m67309k();
            }
        } else {
            c23254gM67309k = null;
        }
        if (c23254gM67309k != null) {
            C23254g c23254g = c23254gM67309k.f92135x.length() > 0 ? c23254gM67309k : null;
            if (c23254g == null || (function1 = this.f49905f) == null) {
                return;
            }
            function1.invoke(c23254g);
        }
    }

    /* JADX INFO: renamed from: d */
    public final C13954l m39799d(C13978t c13978t) {
        return (C13954l) this.f49900a.f49648c.m81e(c13978t.f49873c);
    }

    /* JADX INFO: renamed from: e */
    public final C23465k m39800e() {
        int iNextIndex;
        int iM67360f;
        int length;
        if (m39802g() == null) {
            return null;
        }
        C13926b1 c13926b1 = this.f49900a;
        if (c13926b1.f49647b.isEmpty()) {
            return null;
        }
        C23248d c23248d = new C23248d();
        ArrayList arrayListM39694e = c13926b1.m39694e(m39806k());
        ListIterator listIterator = arrayListM39694e.listIterator(arrayListM39694e.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            C13981u c13981u = (C13981u) c13926b1.m39690a().m81e(((C13954l) listIterator.previous()).f49741a);
            if (c13981u != null && c13981u.f49879a.f49872b != c13981u.f49880b.f49872b) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            int size = arrayListM39694e.size();
            int i13 = 0;
            iM67360f = -1;
            length = -1;
            int i14 = 0;
            while (i14 < size) {
                C13954l c13954l = (C13954l) arrayListM39694e.get(i14);
                C13981u c13981u2 = (C13981u) c13926b1.m39690a().m81e(c13954l.f49741a);
                if (c13981u2 != null) {
                    C23254g c23254gM39737e = c13954l.m39737e();
                    long jM60431f = AbstractC21478l0.m60431f(c13981u2.f49879a.f49872b, c13981u2.f49880b.f49872b);
                    int i15 = i14 >= iNextIndex ? 1 : i13;
                    if (iM67360f == -1) {
                        iM67360f = C23283u0.m67360f(jM60431f);
                        c23248d.m67302d(c23254gM39737e, i13, C23283u0.m67360f(jM60431f));
                    }
                    c23248d.m67302d(c23254gM39737e, C23283u0.m67360f(jM60431f), C23283u0.m67359e(jM60431f));
                    StringBuilder sb4 = c23248d.f92119w;
                    if (i15 == 0) {
                        sb4.append('\n');
                    } else {
                        length = sb4.length();
                        c23248d.m67302d(c23254gM39737e, C23283u0.m67359e(jM60431f), c23254gM39737e.f92135x.length());
                    }
                }
                i14++;
                i13 = 0;
            }
        } else {
            iM67360f = -1;
            length = -1;
        }
        C23254g c23254gM67309k = c23248d.m67309k();
        if (iM67360f == -1 || length == -1) {
            return null;
        }
        return new C23465k(c23254gM67309k, new C23283u0(AbstractC21478l0.m60431f(iM67360f, length)));
    }

    /* JADX INFO: renamed from: f */
    public final EnumC34315f0 m39801f() {
        return (EnumC34315f0) this.f49917r.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final C13981u m39802g() {
        return (C13981u) this.f49901b.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m39803h() {
        return ((Boolean) this.f49902c.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m39804i() {
        C13981u c13981uM39802g = m39802g();
        if (c13981uM39802g != null) {
            C13978t c13978t = c13981uM39802g.f49880b;
            C13978t c13978t2 = c13981uM39802g.f49879a;
            if (!AbstractC22676k.m65745e(c13978t2, c13978t)) {
                if (c13978t2.f49873c == c13978t.f49873c) {
                    return true;
                }
                InterfaceC39147y interfaceC39147yM39806k = m39806k();
                C13926b1 c13926b1 = this.f49900a;
                ArrayList arrayListM39694e = c13926b1.m39694e(interfaceC39147yM39806k);
                int size = arrayListM39694e.size();
                for (int i13 = 0; i13 < size; i13++) {
                    C13981u c13981u = (C13981u) c13926b1.m39690a().m81e(((C13954l) arrayListM39694e.get(i13)).f49741a);
                    if (c13981u != null && c13981u.f49879a.f49872b != c13981u.f49880b.f49872b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m39805j() {
        InterfaceC29805a interfaceC29805a;
        C0035k0 c0035k0 = AbstractC0058w.f176a;
        AbstractC22676k.m65748h(c0035k0, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.f49900a.f49656k.setValue(c0035k0);
        this.f49923x = false;
        m39811p();
        if (m39802g() != null) {
            this.f49903d.invoke(null);
            if (!m39803h() || (interfaceC29805a = this.f49904e) == null) {
                return;
            }
            interfaceC29805a.mo7428a(9);
        }
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC39147y m39806k() {
        InterfaceC39147y interfaceC39147y = this.f49911l;
        if (interfaceC39147y == null) {
            AbstractC22086a.m63159b("null coordinates");
            throw new KotlinNothingValueException();
        }
        if (!interfaceC39147y.mo3532g()) {
            AbstractC22086a.m63158a("unattached coordinates");
        }
        return interfaceC39147y;
    }

    /* JADX INFO: renamed from: l */
    public final void m39807l(boolean z4) {
        C28633k1 c28633k1 = this.f49902c;
        if (((Boolean) c28633k1.getValue()).booleanValue() != z4) {
            c28633k1.setValue(Boolean.valueOf(z4));
            m39811p();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m39808m(C13981u c13981u) {
        this.f49901b.setValue(c13981u);
        if (c13981u != null) {
            m39809n();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a6  */
    /* JADX INFO: renamed from: n */
    public final void m39809n() {
        long j7;
        C16617b c16617b;
        long jM39733a;
        C16617b c16617b2;
        C13978t c13978t;
        C13978t c13978t2;
        C13981u c13981uM39802g = m39802g();
        InterfaceC39147y interfaceC39147y = this.f49911l;
        C16617b c16617b3 = null;
        C13954l c13954lM39799d = (c13981uM39802g == null || (c13978t2 = c13981uM39802g.f49879a) == null) ? null : m39799d(c13978t2);
        C13954l c13954lM39799d2 = (c13981uM39802g == null || (c13978t = c13981uM39802g.f49880b) == null) ? null : m39799d(c13978t);
        InterfaceC39147y interfaceC39147yM39736d = c13954lM39799d != null ? c13954lM39799d.m39736d() : null;
        InterfaceC39147y interfaceC39147yM39736d2 = c13954lM39799d2 != null ? c13954lM39799d2.m39736d() : null;
        C28633k1 c28633k1 = this.f49916q;
        C28633k1 c28633k2 = this.f49915p;
        if (c13981uM39802g == null || interfaceC39147y == null || !interfaceC39147y.mo3532g() || (interfaceC39147yM39736d == null && interfaceC39147yM39736d2 == null)) {
            c28633k2.setValue(null);
            c28633k1.setValue(null);
            return;
        }
        C16618c c16618cM39837z = AbstractC13994y0.m39837z(interfaceC39147y);
        if (interfaceC39147yM39736d != null) {
            j7 = 9205357640488583168L;
            long jM39733a2 = c13954lM39799d.m39733a(c13981uM39802g, true);
            if ((jM39733a2 & 9223372034707292159L) != 9205357640488583168L) {
                long jMo3537k = interfaceC39147y.mo3537k(interfaceC39147yM39736d, jM39733a2);
                c16617b = new C16617b(jMo3537k);
                if (m39801f() != EnumC34315f0.f144081x && !AbstractC13994y0.m39828q(c16618cM39837z, jMo3537k)) {
                }
            }
            c28633k2.setValue(c16617b);
            if (interfaceC39147yM39736d2 != null) {
                jM39733a = c13954lM39799d2.m39733a(c13981uM39802g, false);
                if ((jM39733a & 9223372034707292159L) != j7) {
                    long jMo3537k2 = interfaceC39147y.mo3537k(interfaceC39147yM39736d2, jM39733a);
                    c16617b2 = new C16617b(jMo3537k2);
                    if (m39801f() != EnumC34315f0.f144082y || AbstractC13994y0.m39828q(c16618cM39837z, jMo3537k2)) {
                        c16617b3 = c16617b2;
                    }
                }
            }
            c28633k1.setValue(c16617b3);
        }
        j7 = 9205357640488583168L;
        c16617b = null;
        c28633k2.setValue(c16617b);
        if (interfaceC39147yM39736d2 != null) {
            jM39733a = c13954lM39799d2.m39733a(c13981uM39802g, false);
            if ((jM39733a & 9223372034707292159L) != j7) {
                long jMo3537k3 = interfaceC39147y.mo3537k(interfaceC39147yM39736d2, jM39733a);
                c16617b2 = new C16617b(jMo3537k3);
                if (m39801f() != EnumC34315f0.f144082y) {
                    c16617b3 = c16617b2;
                } else {
                    c16617b3 = c16617b2;
                }
            }
        }
        c28633k1.setValue(c16617b3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not found block with instruction: 0x00ac: MOVE (r12v1 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    /* JADX WARN: Not found block with instruction: 0x00cb: MOVE (r4v1 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    /* JADX INFO: renamed from: o */
    public final boolean m39810o(long j7, long j13, boolean z4, C13984v c13984v) {
        ArrayList arrayList;
        InterfaceC13970q0 c13935e1;
        C23277r0 c23277r0;
        long j14;
        int i13;
        C13973r0 c13973r0;
        long j15;
        EnumC13942h enumC13942hM39826o;
        EnumC13942h enumC13942h;
        EnumC13942h enumC13942h2;
        EnumC13942h enumC13942h3;
        EnumC13942h enumC13942h4;
        EnumC13942h enumC13942h5;
        EnumC13942h enumC13942h6;
        C13973r0 c13973r1;
        int i14;
        int i15;
        int i16;
        C13978t c13978t;
        int i17;
        C13978t c13978t2;
        this.f49917r.setValue(z4 ? EnumC34315f0.f144081x : EnumC34315f0.f144082y);
        this.f49918s.setValue(new C16617b(j7));
        InterfaceC39147y interfaceC39147yM39806k = m39806k();
        C13926b1 c13926b1 = this.f49900a;
        ArrayList arrayListM39694e = c13926b1.m39694e(interfaceC39147yM39806k);
        int i18 = AbstractC0056v.f169a;
        C0029i0 c0029i0 = new C0029i0(6);
        int size = arrayListM39694e.size();
        int i19 = 0;
        for (int i24 = 0; i24 < size; i24++) {
            c0029i0.m75e(i24, ((C13954l) arrayListM39694e.get(i24)).f49741a);
        }
        long j16 = 9223372034707292159L;
        long j17 = 9205357640488583168L;
        C13973r0 c13973r2 = new C13973r0(j7, j13, interfaceC39147yM39806k, z4, (j13 & 9223372034707292159L) == 9205357640488583168L ? null : m39802g(), new C13982u0(c0029i0, i19));
        int size2 = arrayListM39694e.size();
        int i25 = 0;
        while (true) {
            arrayList = c13973r2.f49828h;
            if (i25 >= size2) {
                break;
            }
            C13954l c13954l = (C13954l) arrayListM39694e.get(i25);
            InterfaceC39147y interfaceC39147yM39736d = c13954l.m39736d();
            if (interfaceC39147yM39736d == null || (c23277r0 = (C23277r0) c13954l.f49743c.invoke()) == null) {
                i13 = size2;
                arrayListM39694e = arrayListM39694e;
                j14 = j16;
                j17 = j17;
                c13973r1 = c13973r2;
            } else {
                j14 = j16;
                long jMo3537k = c13973r2.f49823c.mo3537k(interfaceC39147yM39736d, 0L);
                long jM47191g = C16617b.m47191g(c13973r2.f49821a, jMo3537k);
                long j18 = c13973r2.f49822b;
                long jM47191g2 = (j18 & j14) == j17 ? j17 : C16617b.m47191g(j18, jMo3537k);
                long j19 = c13954l.f49741a;
                i13 = size2;
                long j24 = c23277r0.f92229c;
                float f13 = (int) (j24 >> 32);
                float f14 = (int) (j24 & 4294967295L);
                int i26 = (int) (jM47191g >> 32);
                EnumC13942h enumC13942h7 = Float.intBitsToFloat(i26) < 0.0f ? EnumC13942h.f49704w : Float.intBitsToFloat(i26) > f13 ? EnumC13942h.f49706y : EnumC13942h.f49705x;
                int i27 = (int) (jM47191g & 4294967295L);
                EnumC13942h enumC13942h8 = Float.intBitsToFloat(i27) < 0.0f ? EnumC13942h.f49704w : Float.intBitsToFloat(i27) > f14 ? EnumC13942h.f49706y : EnumC13942h.f49705x;
                boolean z13 = c13973r2.f49824d;
                C13981u c13981u = c13973r2.f49825e;
                if (z13) {
                    c13973r0 = c13973r2;
                    j15 = j19;
                    enumC13942hM39826o = AbstractC13994y0.m39826o(enumC13942h7, enumC13942h8, c13973r0, j15, c13981u != null ? c13981u.f49880b : null);
                    enumC13942h4 = enumC13942h7;
                    enumC13942h = enumC13942h4;
                    enumC13942h5 = enumC13942h8;
                    enumC13942h2 = enumC13942h5;
                    enumC13942h3 = enumC13942hM39826o;
                    enumC13942h6 = enumC13942h3;
                } else {
                    c13973r0 = c13973r2;
                    j15 = j19;
                    enumC13942hM39826o = AbstractC13994y0.m39826o(enumC13942h7, enumC13942h8, c13973r0, j15, c13981u != null ? c13981u.f49879a : null);
                    enumC13942h = enumC13942h7;
                    enumC13942h2 = enumC13942h8;
                    enumC13942h3 = enumC13942h;
                    enumC13942h4 = enumC13942hM39826o;
                    enumC13942h5 = enumC13942h4;
                    enumC13942h6 = enumC13942h2;
                }
                c13973r1 = c13973r0;
                EnumC13942h enumC13942hM39836y = AbstractC13994y0.m39836y(enumC13942h, enumC13942h2);
                if (enumC13942hM39836y == EnumC13942h.f49705x || enumC13942hM39836y != enumC13942hM39826o) {
                    int length = c23277r0.f92227a.f92216a.f92135x.length();
                    C13982u0 c13982u0 = c13973r1.f49826f;
                    if (z13) {
                        int iM39831t = AbstractC13994y0.m39831t(jM47191g, c23277r0);
                        if (c13981u == null || (c13978t2 = c13981u.f49880b) == null) {
                            i17 = iM39831t;
                            length = i17;
                        } else {
                            i17 = iM39831t;
                            int iCompare = c13982u0.compare(Long.valueOf(c13978t2.f49873c), Long.valueOf(j15));
                            if (iCompare < 0) {
                                length = r10;
                            } else if (iCompare <= 0) {
                                length = c13978t2.f49872b;
                            }
                        }
                        i16 = length;
                        i15 = i17;
                    } else {
                        int iM39831t2 = AbstractC13994y0.m39831t(jM47191g, c23277r0);
                        if (c13981u == null || (c13978t = c13981u.f49879a) == null) {
                            i14 = iM39831t2;
                            i15 = i14;
                        } else {
                            i14 = iM39831t2;
                            int iCompare2 = c13982u0.compare(Long.valueOf(c13978t.f49873c), Long.valueOf(j15));
                            if (iCompare2 < 0) {
                                length = r10;
                            } else if (iCompare2 <= 0) {
                                length = c13978t.f49872b;
                            }
                            i15 = length;
                        }
                        i16 = i14;
                    }
                    int iM39831t3 = (jM47191g2 & j14) == j17 ? -1 : AbstractC13994y0.m39831t(jM47191g2, c23277r0);
                    int i28 = c13973r1.f49831k + 2;
                    c13973r1.f49831k = i28;
                    long j25 = j15;
                    C13972r c13972r = new C13972r(j25, i28, i15, i16, iM39831t3, c23277r0);
                    c13973r1.f49829i = c13973r1.m39770a(c13973r1.f49829i, enumC13942h4, enumC13942h5);
                    c13973r1.f49830j = c13973r1.m39770a(c13973r1.f49830j, enumC13942h3, enumC13942h6);
                    c13973r1.f49827g.m75e(r8.size(), j25);
                    arrayList.add(c13972r);
                }
            }
            i25++;
            i19 = i19;
            size2 = i13;
            c13973r2 = c13973r1;
            j16 = j14;
            j17 = j17;
            arrayListM39694e = arrayListM39694e;
        }
        C13973r0 c13973r3 = c13973r2;
        boolean z14 = i19;
        int i29 = c13973r3.f49831k + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            c13935e1 = null;
        } else if (size3 != 1) {
            int i34 = c13973r3.f49829i;
            int i35 = i34 == -1 ? i29 : i34;
            int i36 = c13973r3.f49830j;
            c13935e1 = new C13951k(c13973r3.f49827g, arrayList, i35, i36 == -1 ? i29 : i36, c13973r3.f49824d, c13973r3.f49825e);
        } else {
            C13972r c13972r2 = (C13972r) AbstractC25265s.m74142p1(arrayList);
            int i37 = c13973r3.f49829i;
            int i38 = i37 == -1 ? i29 : i37;
            int i39 = c13973r3.f49830j;
            c13935e1 = new C13935e1(c13973r3.f49824d, i38, i39 == -1 ? i29 : i39, c13973r3.f49825e, c13972r2);
        }
        if (c13935e1 == null || !c13935e1.mo39703f(this.f49919t)) {
            return z14;
        }
        C13981u c13981uM39795a = c13984v.m39795a(c13935e1);
        if (!AbstractC22676k.m65745e(c13981uM39795a, m39802g())) {
            if (m39803h()) {
                ArrayList arrayList2 = c13926b1.f49647b;
                int size4 = arrayList2.size();
                for (int i44 = z14 ? 1 : 0; i44 < size4; i44++) {
                    if (((C13954l) arrayList2.get(i44)).m39737e().f92135x.length() > 0) {
                        InterfaceC29805a interfaceC29805a = this.f49904e;
                        if (interfaceC29805a == null) {
                            break;
                        }
                        interfaceC29805a.mo7428a(9);
                        break;
                    }
                }
            }
            c13926b1.f49656k.setValue(c13935e1.mo39705h(c13981uM39795a));
            this.f49903d.invoke(c13981uM39795a);
            this.f49920u = z14;
        }
        this.f49919t = c13935e1;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m39811p() {
        C2996c2 c2996c2;
        if (((Boolean) this.f49908i.getValue()).booleanValue()) {
            boolean z4 = this.f49923x;
            C31624i c31624i = this.f49906g;
            if (z4 && m39803h()) {
                if (((C16618c) this.f49909j.getValue()) == null) {
                    return;
                }
                c31624i.m97701D();
            } else {
                C0112k c0112k = (C0112k) c31624i.f130665x;
                if (c0112k == null || (c2996c2 = c0112k.f350U) == null) {
                    return;
                }
                c2996c2.cancel((CancellationException) null);
                c0112k.f350U = null;
            }
        }
    }
}
