package d30;

import a20.C0162b;
import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.C2996c2;
import bc3.C3000d2;
import bc3.InterfaceC2994c0;
import dc3.C11923h;
import dc3.C11929n;
import e10.C12554k0;
import e93.AbstractC12889b;
import g40.InterfaceC15367i1;
import h20.C16689l1;
import h20.EnumC16677j1;
import h20.EnumC16683k1;
import hc3.C17171d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import k20.C22136a;
import l83.C23454a0;
import m83.AbstractC25265s;
import p002a0.C0030i1;
import p077d0.AbstractC11348f;
import p078d1.C11456i;
import p088dc.AbstractC11895b;
import p120ek.C13270d;
import p133f1.C13985v0;
import p180h0.AbstractC16472w1;
import p180h0.C16359a2;
import p180h0.C16360a3;
import p180h0.C16365b2;
import p180h0.C16371c2;
import p180h0.C16372c3;
import p180h0.C16477x1;
import p180h0.C16487z1;
import p180h0.EnumC16377d2;
import p454r9.C31089n;
import p465rm.C31543j1;
import p479s4.AbstractC32128i;
import p505ts.AbstractC34132o;
import p512u2.C34465k;
import p512u2.C34472r;
import p512u2.EnumC34466l;
import p516u8.C34625w0;
import p607x8.C38061p;
import p636y3.C39185q;
import p636y3.InterfaceC39171c;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22663d0;
import p715kotlin.jvm.internal.C22669g0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qg3.C30352d;
import r83.EnumC31071a;
import s10.C32063e;
import s10.C32064f;
import s83.AbstractC32269c;
import t10.C33285e;
import t83.C33617b;
import u00.EnumC34376d;
import v00.C35459c0;
import v00.C35479m0;
import v63.AbstractC35745c;
import x30.C37885e1;
import xb3.C38175j;

/* JADX INFO: renamed from: d30.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11530f0 {

    /* JADX INFO: renamed from: a */
    public boolean f37148a;

    /* JADX INFO: renamed from: b */
    public Object f37149b;

    /* JADX INFO: renamed from: c */
    public Object f37150c;

    /* JADX INFO: renamed from: d */
    public final Object f37151d;

    /* JADX INFO: renamed from: e */
    public Object f37152e;

    /* JADX INFO: renamed from: f */
    public Object f37153f;

    /* JADX INFO: renamed from: g */
    public final Object f37154g;

    /* JADX INFO: renamed from: h */
    public final Object f37155h;

    public C11530f0(C35479m0 c35479m0) {
        this.f37150c = c35479m0;
        this.f37151d = new ArrayList();
        this.f37152e = new ArrayList();
        this.f37153f = new ArrayList();
        this.f37154g = new LinkedHashSet();
        this.f37155h = new LinkedHashSet();
        this.f37149b = c35479m0.f151040i.m47249b();
        C33617b c33617b = EnumC34376d.f144460E;
        c33617b.getClass();
        C0030i1 c0030i1 = new C0030i1(c33617b, 2);
        while (c0030i1.hasNext()) {
            EnumC34376d enumC34376d = (EnumC34376d) c0030i1.next();
            C16689l1 configuration = ((C35479m0) this.f37150c).f151040i;
            enumC34376d.getClass();
            AbstractC22676k.m65750j(configuration, "configuration");
            if (enumC34376d.mo108672a(configuration) == EnumC16683k1.f64151y) {
                m30985h(enumC34376d);
            }
        }
        if (((C35479m0) this.f37150c).f151040i.f64192z == EnumC16677j1.f64133y) {
            Set availableCountries = (Set) this.f37149b;
            AbstractC22676k.m65750j(availableCountries, "availableCountries");
            if (((C35479m0) this.f37150c).f151040i.f64192z != EnumC16677j1.f64132x) {
                this.f37148a = true;
                this.f37149b = availableCountries;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: a */
    public static final Object m30977a(C11530f0 c11530f0, C16372c3 c16372c3, C16477x1 c16477x1, float f13, float f14, AbstractC32269c abstractC32269c) {
        C16487z1 c16487z1;
        C22663d0 c22663d0;
        float f15;
        C16372c3 c16372c4;
        long jM100047a;
        if (abstractC32269c instanceof C16487z1) {
            c16487z1 = (C16487z1) abstractC32269c;
            int i13 = c16487z1.f63360F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16487z1.f63360F = i13 - Integer.MIN_VALUE;
            } else {
                c16487z1 = new C16487z1(c11530f0, abstractC32269c);
            }
        } else {
            c16487z1 = new C16487z1(c11530f0, abstractC32269c);
        }
        C16487z1 c16487z2 = c16487z1;
        Object obj = c16487z2.f63364z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c16487z2.f63360F;
        Object obj3 = C23454a0.f92919a;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            c22669g0M32004w.f89336w = c16477x1;
            c11530f0.m30988l(c16477x1);
            C16477x1 c16477x1M30979k = m30979k((C11923h) c11530f0.f37154g);
            if (c16477x1M30979k != null) {
                c11530f0.m30988l(c16477x1M30979k);
                c22669g0M32004w.f89336w = ((C16477x1) c22669g0M32004w.f89336w).m46651a(c16477x1M30979k);
            }
            C22663d0 c22663d1 = new C22663d0();
            float fM46574g = c16372c3.m46574g(c16372c3.m46572e(((C16477x1) c22669g0M32004w.f89336w).f63318a));
            c22663d1.f89331w = fM46574g;
            if (!AbstractC16472w1.m46644a(fM46574g)) {
                C22669g0 c22669g0 = new C22669g0();
                c22669g0.f89336w = AbstractC11348f.m30554b(0.0f, 0.0f, 30);
                C16359a2 c16359a2 = new C16359a2(c22663d1, c22669g0, c22669g0M32004w, f13, c11530f0, f14, c16372c3, null);
                c16487z2.f63361w = c16372c3;
                c16487z2.f63362x = c22663d1;
                c16487z2.f63363y = f14;
                c16487z2.f63360F = 1;
                if (c11530f0.m30990n(c16372c3, c16359a2, c16487z2) != obj2) {
                    c22663d0 = c22663d1;
                    f15 = f14;
                    c16372c4 = c16372c3;
                }
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj3;
        }
        f15 = c16487z2.f63363y;
        c22663d0 = c16487z2.f63362x;
        c16372c4 = c16487z2.f63361w;
        AbstractC34132o.m107864I(obj);
        C30352d c30352d = (C30352d) c11530f0.f37155h;
        long jM100047a2 = AbstractC32128i.m100047a(((C31543j1) c30352d.f124535x).m97146b(Float.MAX_VALUE), ((C31543j1) c30352d.f124536y).m97146b(Float.MAX_VALUE));
        if (C39185q.m124812c(jM100047a2)) {
            float fM46571d = c16372c4.m46571d(Math.signum(c22663d0.f89331w)) * Math.min(Math.abs(c22663d0.f89331w) / 100, f15) * 1000;
            if (fM46571d == 0.0f) {
                jM100047a = 0;
            } else {
                jM100047a = c16372c4.f62939d == EnumC16377d2.f62972x ? AbstractC32128i.m100047a(fM46571d, 0.0f) : AbstractC32128i.m100047a(0.0f, fM46571d);
            }
            jM100047a2 = jM100047a;
        }
        C13270d c13270d = (C13270d) c11530f0.f37152e;
        C39185q c39185q = new C39185q(jM100047a2);
        c16487z2.f63361w = null;
        c16487z2.f63362x = null;
        c16487z2.f63360F = 2;
        c13270d.invoke(c39185q, c16487z2);
        return obj3 == obj2 ? obj2 : obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public static final Object m30978b(C11530f0 c11530f0, C22669g0 c22669g0, C22663d0 c22663d0, C16372c3 c16372c3, C22669g0 c22669g1, long j7, AbstractC32269c abstractC32269c) {
        C16365b2 c16365b2;
        C16372c3 c16372c4;
        C22669g0 c22669g2;
        C22669g0 c22669g3;
        C22663d0 c22663d1;
        boolean z4;
        if (abstractC32269c instanceof C16365b2) {
            c16365b2 = (C16365b2) abstractC32269c;
            int i13 = c16365b2.f62910G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16365b2.f62910G = i13 - Integer.MIN_VALUE;
            } else {
                c16365b2 = new C16365b2(abstractC32269c);
            }
        } else {
            c16365b2 = new C16365b2(abstractC32269c);
        }
        Object objM8750d = c16365b2.f62909F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16365b2.f62910G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8750d);
            if (j7 < 0) {
                return Boolean.FALSE;
            }
            C0162b c0162b = new C0162b(c11530f0, null, 24);
            c16365b2.f62911w = c11530f0;
            c16365b2.f62912x = c22669g0;
            c16365b2.f62913y = c22663d0;
            c16372c4 = c16372c3;
            c16365b2.f62914z = c16372c4;
            c22669g2 = c22669g1;
            c16365b2.f62908E = c22669g2;
            c16365b2.f62910G = 1;
            objM8750d = AbstractC3028k2.m8750d(j7, c0162b, c16365b2);
            if (objM8750d == enumC31071a) {
                return enumC31071a;
            }
            c22669g3 = c22669g0;
            c22663d1 = c22663d0;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C22669g0 c22669g4 = c16365b2.f62908E;
            C16372c3 c16372c5 = c16365b2.f62914z;
            c22663d1 = c16365b2.f62913y;
            c22669g3 = c16365b2.f62912x;
            C11530f0 c11530f1 = c16365b2.f62911w;
            AbstractC34132o.m107864I(objM8750d);
            c22669g2 = c22669g4;
            c16372c4 = c16372c5;
            c11530f0 = c11530f1;
        }
        C16477x1 c16477x1 = (C16477x1) objM8750d;
        if (c16477x1 != null) {
            boolean z13 = ((C16477x1) c22669g3.f89336w).f63320c;
            long j13 = c16477x1.f63318a;
            c22669g3.f89336w = new C16477x1(j13, z13, c16477x1.f63319b);
            c22663d1.f89331w = c16372c4.m46574g(c16372c4.m46572e(j13));
            c22669g2.f89336w = AbstractC11348f.m30554b(0.0f, 0.0f, 30);
            c11530f0.m30988l(c16477x1);
            z4 = !AbstractC16472w1.m46644a(c22663d1.f89331w);
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static C16477x1 m30979k(C11923h c11923h) {
        C16477x1 c16477x1 = null;
        C38175j c38175jM113247i = AbstractC35745c.m113247i(new C13985v0((Object) new C11456i(c11923h, 29), (InterfaceC30057d) (0 == true ? 1 : 0), 2));
        while (c38175jM113247i.hasNext()) {
            C16477x1 c16477x1M46651a = (C16477x1) c38175jM113247i.next();
            if (c16477x1 != null) {
                c16477x1M46651a = c16477x1.m46651a(c16477x1M46651a);
            }
            c16477x1 = c16477x1M46651a;
        }
        return c16477x1;
    }

    /* JADX INFO: renamed from: c */
    public float m30980c(C16360a3 c16360a3, float f13) {
        C16372c3 c16372c3 = (C16372c3) this.f37150c;
        long jM46575h = c16372c3.m46575h(c16372c3.m46571d(f13));
        C16372c3 c16372c4 = c16360a3.f62899a;
        return c16372c3.m46574g(c16372c3.m46572e(c16372c4.m46570c(c16372c4.f62946k, jM46575h, 1)));
    }

    /* JADX INFO: renamed from: d */
    public void m30981d(InterfaceC15367i1 formElement) {
        AbstractC22676k.m65750j(formElement, "formElement");
        ((ArrayList) this.f37152e).add(formElement);
    }

    /* JADX INFO: renamed from: e */
    public void m30982e(C37885e1 c37885e1) {
        ((ArrayList) this.f37153f).add(c37885e1);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: f */
    public void m30983f(C34465k c34465k, EnumC34466l enumC34466l, long j7) {
        if (enumC34466l == EnumC34466l.f144807x) {
            int i13 = c34465k.f144805f;
            ?? r10 = c34465k.f144800a;
            if (i13 == 6) {
                Collection collection = (Collection) r10;
                int size = collection.size();
                for (int i14 = 0; i14 < size; i14++) {
                    if (((C34472r) r10.get(i14)).m108956l()) {
                        return;
                    }
                }
                long jM35237l = ((C12554k0) this.f37151d).m35237l(c34465k);
                C16372c3 c16372c3 = (C16372c3) this.f37150c;
                float fM46574g = c16372c3.m46574g(c16372c3.m46572e(jM35237l));
                if (fM46574g == 0.0f ? false : fM46574g > 0.0f ? c16372c3.f62936a.mo39183d() : c16372c3.f62936a.mo39182c() ? !(((C11923h) this.f37154g).mo32218s(new C16477x1(jM35237l, false, ((C34472r) AbstractC25265s.m74096F0(r10)).f144816b)) instanceof C11929n) : this.f37148a) {
                    int size2 = collection.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        ((C34472r) r10.get(i15)).m108946a();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m30984g(EnumC34376d enumC34376d) {
        if (((LinkedHashSet) this.f37154g).contains(enumC34376d)) {
            ((LinkedHashSet) this.f37155h).add(enumC34376d);
            ((ArrayList) this.f37152e).add(enumC34376d.mo108673b(((C35479m0) this.f37150c).f151034c));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m30985h(EnumC34376d enumC34376d) {
        C16689l1 configuration = ((C35479m0) this.f37150c).f151040i;
        AbstractC22676k.m65750j(configuration, "configuration");
        if (enumC34376d.mo108672a(configuration) != EnumC16683k1.f64150x) {
            ((LinkedHashSet) this.f37154g).add(enumC34376d);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m30986i() {
        ((LinkedHashMap) this.f37154g).clear();
        ((LinkedHashMap) this.f37153f).clear();
        ((LinkedHashMap) this.f37152e).clear();
        this.f37148a = false;
        C2996c2 c2996c2 = (C2996c2) this.f37149b;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        AbstractC3006f0.m8714h((C17171d) this.f37155h, null);
    }

    /* JADX INFO: renamed from: j */
    public void m30987j(InterfaceC2994c0 interfaceC2994c0) {
        if (((C2996c2) this.f37149b) == null) {
            this.f37149b = AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C11552o(this, (InterfaceC30057d) null, 24), 3);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m30988l(C16477x1 c16477x1) {
        C30352d c30352d = (C30352d) this.f37155h;
        long j7 = c16477x1.f63319b;
        long j13 = c16477x1.f63318a;
        ((C31543j1) c30352d.f124535x).m97145a(Float.intBitsToFloat((int) (j13 >> 32)), j7);
        ((C31543j1) c30352d.f124536y).m97145a(Float.intBitsToFloat((int) (j13 & 4294967295L)), j7);
    }

    /* JADX INFO: renamed from: m */
    public void m30989m(InterfaceC39171c interfaceC39171c) {
        this.f37153f = interfaceC39171c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public Object m30990n(C16372c3 c16372c3, C16359a2 c16359a2, AbstractC32269c abstractC32269c) {
        C16371c2 c16371c2;
        if (abstractC32269c instanceof C16371c2) {
            c16371c2 = (C16371c2) abstractC32269c;
            int i13 = c16371c2.f62935y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16371c2.f62935y = i13 - Integer.MIN_VALUE;
            } else {
                c16371c2 = new C16371c2(this, abstractC32269c);
            }
        } else {
            c16371c2 = new C16371c2(this, abstractC32269c);
        }
        Object obj = c16371c2.f62933w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c16371c2.f62935y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            this.f37148a = true;
            C11552o c11552o = new C11552o(c16372c3, c16359a2, null, 25);
            c16371c2.f62935y = 1;
            C3000d2 c3000d2 = new C3000d2(c16371c2.getContext(), c16371c2, 0);
            if (AbstractC12889b.m36266c0(c3000d2, true, c3000d2, c11552o) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        this.f37148a = false;
        return C23454a0.f92919a;
    }

    public C11530f0(C35459c0 paymentMethodMetadata, String paymentMethodCode, boolean z4, C32064f embeddedSelectionHolder, C32063e embeddedFormHelperFactory, InterfaceC2994c0 viewModelScope, C33285e formActivityStateHelper, C22136a eventReporter) {
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(paymentMethodCode, "paymentMethodCode");
        AbstractC22676k.m65750j(embeddedSelectionHolder, "embeddedSelectionHolder");
        AbstractC22676k.m65750j(embeddedFormHelperFactory, "embeddedFormHelperFactory");
        AbstractC22676k.m65750j(viewModelScope, "viewModelScope");
        AbstractC22676k.m65750j(formActivityStateHelper, "formActivityStateHelper");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        this.f37150c = paymentMethodMetadata;
        this.f37151d = paymentMethodCode;
        this.f37148a = z4;
        this.f37152e = embeddedSelectionHolder;
        this.f37153f = embeddedFormHelperFactory;
        this.f37154g = viewModelScope;
        this.f37155h = formActivityStateHelper;
        this.f37149b = eventReporter;
    }

    public C11530f0(List expectedItems, C11538i c11538i, InterfaceC30063j interfaceC30063j) {
        AbstractC22676k.m65750j(expectedItems, "expectedItems");
        this.f37150c = expectedItems;
        this.f37151d = c11538i;
        this.f37152e = new LinkedHashMap();
        this.f37153f = new LinkedHashMap();
        this.f37154g = new LinkedHashMap();
        this.f37155h = AbstractC3006f0.m8708b(interfaceC30063j);
    }

    public C11530f0(C16372c3 c16372c3, C12554k0 c12554k0, C13270d c13270d, InterfaceC39171c interfaceC39171c) {
        this.f37150c = c16372c3;
        this.f37151d = c12554k0;
        this.f37152e = c13270d;
        this.f37153f = interfaceC39171c;
        this.f37154g = AbstractC30060g.m92111d(Integer.MAX_VALUE, 6, null);
        this.f37155h = new C30352d(14, (byte) 0);
    }

    public C11530f0(Context context, C31089n c31089n) {
        this.f37150c = context.getApplicationContext();
        this.f37151d = c31089n;
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        this.f37154g = C41060w0.f177067E;
        this.f37155h = C34625w0.f145865a;
        this.f37149b = C38061p.f163023a;
    }
}
