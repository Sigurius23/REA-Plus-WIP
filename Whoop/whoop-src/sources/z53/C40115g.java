package z53;

import a63.C0488g0;
import a63.C0490h0;
import androidx.room.C1832u;
import androidx.room.C1849z1;
import bc3.AbstractC3006f0;
import bc3.C2986a0;
import bc3.C3003e1;
import bc3.C3004e2;
import bc3.C3023j1;
import bc3.C3033m;
import bc3.EnumC2998d0;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3061u;
import d63.C11744a;
import e63.C12776e;
import e63.C12778g;
import e93.AbstractC12889b;
import g63.C15539c;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import i63.AbstractC18179r;
import i63.C18163d;
import i63.C18166e0;
import i63.C18175n;
import i63.C18176o;
import i63.C18181t;
import i63.C18182u;
import i63.C18183v;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.utils.p228io.C20023p;
import io.ktor.utils.p228io.InterfaceC20024q;
import j63.AbstractC21385b;
import j63.AbstractC21386c;
import j63.AbstractC21387d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23470p;
import m83.AbstractC25260n;
import ne3.InterfaceC26620j;
import o63.AbstractC27621l;
import o63.C27613d;
import o63.C27616g;
import o63.C27620k;
import p005a3.C0222l0;
import p026b2.C2312r;
import p027b3.C2442t0;
import p132f0.C13773b1;
import p320m5.C25067k;
import p389p0.C28539n0;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30005a;
import q63.C30006b;
import q83.AbstractC30060g;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import ud3.AbstractC34799a1;
import ud3.AbstractC34846v0;
import ud3.C34826l0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34844u0;
import ud3.C34850x0;
import ud3.EnumC34828m0;
import wb3.AbstractC37056f;
import y53.AbstractC39243c;
import y53.AbstractC39248h;
import y53.C39247g;
import y53.InterfaceC39244d;
import zd3.C40571o;

/* JADX INFO: renamed from: z53.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C40115g extends AbstractC39243c {

    /* JADX INFO: renamed from: I */
    public static final C23470p f173152I = AbstractC30060g.m92088H(C40111c.f173137w);

    /* JADX INFO: renamed from: F */
    public final InterfaceC30063j f173154F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC30063j f173155G;

    /* JADX INFO: renamed from: H */
    public final Map f173156H;

    /* JADX INFO: renamed from: y */
    public final C40110b f173157y;

    /* JADX INFO: renamed from: z */
    public final C23470p f173158z = AbstractC30060g.m92088H(new C0222l0(this, 25));

    /* JADX INFO: renamed from: E */
    public final Set f173153E = AbstractC25260n.m74059b1(new InterfaceC39244d[]{C0490h0.f1652d, C11744a.f38017a});

    public C40115g(C40110b c40110b) {
        this.f173157y = c40110b;
        Map mapSynchronizedMap = Collections.synchronizedMap(new C27620k(new C1832u(1, this, C40115g.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;)Lokhttp3/OkHttpClient;", 0, 26), c40110b.f173136c));
        AbstractC22676k.m65749i(mapSynchronizedMap, "synchronizedMap(LRUCache…upplier, close, maxSize))");
        this.f173156H = mapSynchronizedMap;
        InterfaceC30061h interfaceC30061h = super.getCoroutineContext().get(C3023j1.f12041w);
        AbstractC22676k.m65747g(interfaceC30061h);
        InterfaceC30063j interfaceC30063jM36254T = AbstractC12889b.m36254T(new C3004e2((InterfaceC3027k1) interfaceC30061h), new C27616g(C2986a0.f11990w, 0));
        this.f173154F = interfaceC30063jM36254T;
        this.f173155G = super.getCoroutineContext().plus(interfaceC30063jM36254T);
        AbstractC3006f0.m8731y(C3003e1.f12012w, super.getCoroutineContext(), EnumC2998d0.f12006y, new C1849z1(this, null, 12));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: b */
    public final Object m128659b(C12776e c12776e, AbstractC32269c abstractC32269c) {
        C40112d c40112d;
        C12776e c12776e2;
        C40115g c40115g;
        String string;
        String string2;
        AbstractC34846v0 abstractC34846v0M109926c;
        if (abstractC32269c instanceof C40112d) {
            c40112d = (C40112d) abstractC32269c;
            int i13 = c40112d.f173138E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40112d.f173138E = i13 - Integer.MIN_VALUE;
            } else {
                c40112d = new C40112d(this, abstractC32269c);
            }
        } else {
            c40112d = new C40112d(this, abstractC32269c);
        }
        C40112d c40112d2 = c40112d;
        Object obj = c40112d2.f173141y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c40112d2.f173138E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c40112d2.f173139w = this;
            c40112d2.f173140x = c12776e;
            c40112d2.f173138E = 1;
            Set set = AbstractC39248h.f168750a;
            InterfaceC30061h interfaceC30061h = c40112d2.getContext().get(C39247g.f168748x);
            AbstractC22676k.m65747g(interfaceC30061h);
            InterfaceC30063j interfaceC30063j = ((C39247g) interfaceC30061h).f168749w;
            if (interfaceC30063j != enumC31071a) {
                c12776e2 = c12776e;
                obj = interfaceC30063j;
                c40115g = this;
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        C12776e c12776e3 = c40112d2.f173140x;
        C40115g c40115g2 = c40112d2.f173139w;
        AbstractC34132o.m107864I(obj);
        c12776e2 = c12776e3;
        c40115g = c40115g2;
        InterfaceC30063j callContext = (InterfaceC30063j) obj;
        C34830n0 c34830n0 = new C34830n0();
        C18166e0 c18166e0 = c12776e2.f43715a;
        C18181t c18181t = c12776e2.f43716b;
        c34830n0.m109905f(c18166e0.f70487g);
        C18176o c18176o = c12776e2.f43717c;
        AbstractC21387d abstractC21387d = c12776e2.f43718d;
        C2312r c2312r = new C2312r(c34830n0, 10);
        Set set2 = AbstractC39248h.f168750a;
        C2442t0 c2442t0 = new C2442t0(14, c18176o, abstractC21387d);
        C18175n c18175n = new C18175n(3);
        c2442t0.invoke(c18175n);
        Map values = (Map) c18175n.f3536x;
        AbstractC22676k.m65750j(values, "values");
        C27613d c27613d = new C27613d();
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            C12776e c12776e4 = c12776e2;
            for (int i15 = 0; i15 < size; i15++) {
                arrayList.add((String) list.get(i15));
            }
            c27613d.put(str, arrayList);
            c12776e2 = c12776e4;
        }
        C12776e c12776e5 = c12776e2;
        C2312r c2312r2 = new C2312r(c2312r, 9);
        for (Map.Entry entry2 : c27613d.entrySet()) {
            c2312r2.invoke((String) entry2.getKey(), (List) entry2.getValue());
        }
        List list2 = AbstractC18179r.f70507a;
        if (c18176o.get("User-Agent") == null && abstractC21387d.mo60029c().get("User-Agent") == null) {
            boolean z4 = AbstractC27621l.f111159a;
            c2312r.invoke("User-Agent", "Ktor client");
        }
        C18163d c18163dMo1202b = abstractC21387d.mo1202b();
        if ((c18163dMo1202b == null || (string = c18163dMo1202b.toString()) == null) && (string = abstractC21387d.mo60029c().get("Content-Type")) == null) {
            string = c18176o.get("Content-Type");
        }
        Long lMo1201a = abstractC21387d.mo1201a();
        if ((lMo1201a == null || (string2 = lMo1201a.toString()) == null) && (string2 = abstractC21387d.mo60029c().get("Content-Length")) == null) {
            string2 = c18176o.get("Content-Length");
        }
        if (string != null) {
            c2312r.invoke("Content-Type", string);
        }
        if (string2 != null) {
            c2312r.invoke("Content-Length", string2);
        }
        if (AbstractC37056f.m118969X(c18181t.f70515a)) {
            AbstractC22676k.m65750j(callContext, "callContext");
            if (abstractC21387d instanceof AbstractC21385b) {
                byte[] bArrMo1203d = ((AbstractC21385b) abstractC21387d).mo1203d();
                C34844u0 c34844u0 = AbstractC34846v0.Companion;
                int length = bArrMo1203d.length;
                c34844u0.getClass();
                abstractC34846v0M109926c = C34844u0.m109926c(null, bArrMo1203d, 0, length);
            } else if (abstractC21387d instanceof AbstractC21386c) {
                abstractC34846v0M109926c = new C40117i(abstractC21387d.mo1201a(), new C25067k(abstractC21387d, 20));
            } else {
                if (!(abstractC21387d instanceof C15539c)) {
                    throw new UnsupportedContentTypeException(abstractC21387d);
                }
                AbstractC34846v0.Companion.getClass();
                abstractC34846v0M109926c = C34844u0.m109926c(null, new byte[0], 0, 0);
            }
        } else {
            abstractC34846v0M109926c = null;
        }
        c34830n0.m109904e(c18181t.f70515a, abstractC34846v0M109926c);
        C34832o0 c34832o0 = new C34832o0(c34830n0);
        Map map = c40115g.f173156H;
        C0488g0 c0488g0 = C0490h0.f1652d;
        C34826l0 c34826l0 = (C34826l0) map.get(c12776e5.m35806a());
        if (c34826l0 == null) {
            throw new IllegalStateException("OkHttpClient can't be constructed because HttpTimeout plugin is not installed");
        }
        c40112d2.f173139w = null;
        c40112d2.f173140x = null;
        c40112d2.f173138E = 3;
        Object objM128660h = c40115g.m128660h(c34826l0, c34832o0, callContext, c12776e5, c40112d2);
        return objM128660h == enumC31071a ? enumC31071a : objM128660h;
    }

    @Override // y53.AbstractC39243c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        InterfaceC30061h interfaceC30061h = this.f173154F.get(C3023j1.f12041w);
        AbstractC22676k.m65748h(interfaceC30061h, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((InterfaceC3061u) interfaceC30061h).complete();
    }

    @Override // y53.AbstractC39243c, bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f173155G;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: h */
    public final Object m128660h(C34826l0 c34826l0, C34832o0 c34832o0, InterfaceC30063j interfaceC30063j, C12776e c12776e, AbstractC32269c abstractC32269c) {
        C40113e c40113e;
        C40115g c40115g;
        C12776e c12776e2;
        C30006b c30006b;
        InterfaceC30063j interfaceC30063j2;
        Object objM55862a;
        C18182u c18182u;
        InterfaceC26620j interfaceC26620jMo1940d1;
        if (abstractC32269c instanceof C40113e) {
            c40113e = (C40113e) abstractC32269c;
            int i13 = c40113e.f173145G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40113e.f173145G = i13 - Integer.MIN_VALUE;
            } else {
                c40113e = new C40113e(this, abstractC32269c);
            }
        } else {
            c40113e = new C40113e(this, abstractC32269c);
        }
        Object obj = c40113e.f173143E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c40113e.f173145G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C30006b c30006bM91825a = AbstractC30005a.m91825a(null);
            c40113e.f173146w = this;
            c40113e.f173147x = interfaceC30063j;
            c40113e.f173148y = c12776e;
            c40113e.f173149z = c30006bM91825a;
            c40113e.f173145G = 1;
            C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c40113e));
            c3033m.m8774s();
            C40571o c40571oM109898b = c34826l0.m109898b(c34832o0);
            c40571oM109898b.m131548d(new C28539n0(c12776e, c3033m));
            c3033m.m8776u(new C40114f(c40571oM109898b, 1));
            Object objM8773r = c3033m.m8773r();
            if (objM8773r == enumC31071a) {
                return enumC31071a;
            }
            c40115g = this;
            c12776e2 = c12776e;
            c30006b = c30006bM91825a;
            interfaceC30063j2 = interfaceC30063j;
            obj = objM8773r;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C30006b c30006b2 = c40113e.f173149z;
            c12776e2 = c40113e.f173148y;
            InterfaceC30063j interfaceC30063j3 = c40113e.f173147x;
            c40115g = c40113e.f173146w;
            AbstractC34132o.m107864I(obj);
            c30006b = c30006b2;
            interfaceC30063j2 = interfaceC30063j3;
        }
        C34850x0 c34850x0 = (C34850x0) obj;
        AbstractC34799a1 abstractC34799a1 = c34850x0.f146778G;
        InterfaceC30061h interfaceC30061h = interfaceC30063j2.get(C3023j1.f12041w);
        AbstractC22676k.m65747g(interfaceC30061h);
        ((InterfaceC3027k1) interfaceC30061h).invokeOnCompletion(new C40114f(abstractC34799a1, 0));
        if (abstractC34799a1 == null || (interfaceC26620jMo1940d1 = abstractC34799a1.mo1940d1()) == null) {
            InterfaceC20024q.f75124a.getClass();
            objM55862a = C20023p.m55862a();
        } else {
            objM55862a = AbstractC17269i.m48915s0(C3003e1.f12012w, interfaceC30063j2, false, new C13773b1(interfaceC26620jMo1940d1, interfaceC30063j2, c12776e2, null)).f75135x;
        }
        Object obj2 = objM55862a;
        c40115g.getClass();
        C18183v c18183v = new C18183v(c34850x0.f146792z, c34850x0.f146791y);
        EnumC34828m0 enumC34828m0 = c34850x0.f146790x;
        AbstractC22676k.m65750j(enumC34828m0, "<this>");
        int iOrdinal = enumC34828m0.ordinal();
        if (iOrdinal == 0) {
            c18182u = C18182u.f70518f;
        } else if (iOrdinal == 1) {
            c18182u = C18182u.f70517e;
        } else if (iOrdinal != 2) {
            c18182u = C18182u.f70516d;
            if (iOrdinal != 3 && iOrdinal != 4) {
                if (iOrdinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                c18182u = C18182u.f70520h;
            }
        } else {
            c18182u = C18182u.f70519g;
        }
        return new C12778g(c18183v, c30006b, new C40116h(c34850x0.f146777F), c18182u, obj2, interfaceC30063j2);
    }
}
