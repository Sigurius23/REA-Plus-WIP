package a63;

import ad3.C0783z;
import bc3.AbstractC3006f0;
import bc3.C3004e2;
import e63.C12772a;
import e63.C12774c;
import e63.C12775d;
import e63.C12776e;
import e63.C12778g;
import f63.AbstractC14155c;
import f63.C14153a;
import g63.AbstractC15538b;
import ge3.AbstractC15751g;
import i63.AbstractC18179r;
import i63.C18160b0;
import i63.C18166e0;
import i63.C18176o;
import i63.C18181t;
import i63.C18187z;
import i93.C18283i;
import io.ktor.http.UnsafeHeaderException;
import io.ktor.utils.p228io.InterfaceC20024q;
import j63.AbstractC21387d;
import j63.C21384a;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import o63.C27610a;
import o63.C27615f;
import p002a0.C0006a1;
import p003a1.C0109h;
import p005a3.C0227m1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r63.AbstractC30993e;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import v53.C35709c;
import v63.AbstractC35750h;
import w53.C36845b;
import wb3.AbstractC37056f;
import y53.AbstractC39245e;
import y53.AbstractC39246f;
import y53.InterfaceC39244d;
import yb3.AbstractC39415s;
import z53.C40115g;

/* JADX INFO: renamed from: a63.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C0506w extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f1707E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f1708F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1709w;

    /* JADX INFO: renamed from: x */
    public int f1710x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C35709c f1711y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f1712z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0506w(Object obj, C35709c c35709c, InterfaceC30057d interfaceC30057d, int i13) {
        super(3, interfaceC30057d);
        this.f1709w = i13;
        this.f1708F = obj;
        this.f1711y = c35709c;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f1709w) {
            case 0:
                C0506w c0506w = new C0506w((C0507x) this.f1708F, this.f1711y, (InterfaceC30057d) obj3, 0);
                c0506w.f1712z = (InterfaceC0492i0) obj;
                c0506w.f1707E = (C12775d) obj2;
                return c0506w.invokeSuspend(C23454a0.f92919a);
            case 1:
                C0506w c0506w2 = new C0506w((C0484e0) this.f1708F, this.f1711y, (InterfaceC30057d) obj3, 1);
                c0506w2.f1712z = (AbstractC30993e) obj;
                c0506w2.f1707E = obj2;
                return c0506w2.invokeSuspend(C23454a0.f92919a);
            case 2:
                C0506w c0506w3 = new C0506w((C0490h0) this.f1708F, this.f1711y, (InterfaceC30057d) obj3, 2);
                c0506w3.f1712z = (InterfaceC0492i0) obj;
                c0506w3.f1707E = (C12775d) obj2;
                return c0506w3.invokeSuspend(C23454a0.f92919a);
            default:
                C40115g c40115g = (C40115g) this.f1708F;
                C0506w c0506w4 = new C0506w(this.f1711y, c40115g, (InterfaceC30057d) obj3);
                c0506w4.f1712z = (AbstractC30993e) obj;
                c0506w4.f1707E = obj2;
                return c0506w4.invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0492i0 interfaceC0492i0;
        C12775d c12775d;
        Object objMo1199a;
        AbstractC30993e abstractC30993e;
        Object objMo1199a2;
        AbstractC30993e abstractC30993e2;
        C12776e requestData;
        Object objM113272a;
        int i13 = this.f1709w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C35709c c35709c = this.f1711y;
        Object obj2 = this.f1708F;
        switch (i13) {
            case 0:
                C0507x c0507x = (C0507x) obj2;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f1710x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    interfaceC0492i0 = (InterfaceC0492i0) this.f1712z;
                    c12775d = (C12775d) this.f1707E;
                    this.f1712z = interfaceC0492i0;
                    this.f1707E = c12775d;
                    this.f1710x = 1;
                    objMo1199a = interfaceC0492i0.mo1199a(c12775d, this);
                    if (objMo1199a == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    c12775d = (C12775d) this.f1707E;
                    interfaceC0492i0 = (InterfaceC0492i0) this.f1712z;
                    AbstractC34132o.m107864I(obj);
                    objMo1199a = obj;
                }
                C36845b c36845b = (C36845b) objMo1199a;
                c0507x.getClass();
                if (!AbstractC0508y.f1716a.contains(c36845b.m118139c().getMethod())) {
                    return c36845b;
                }
                C0475a c0475a = C0507x.f1713a;
                this.f1712z = null;
                this.f1707E = null;
                this.f1710x = 2;
                Object objM1196c = C0475a.m1196c(interfaceC0492i0, c12775d, c36845b, c35709c, this);
                return objM1196c == enumC31071a ? enumC31071a : objM1196c;
            case 1:
                C0484e0 c0484e0 = (C0484e0) obj2;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f1710x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    abstractC30993e = (AbstractC30993e) this.f1712z;
                    Object obj3 = this.f1707E;
                    if (!(obj3 instanceof AbstractC21387d)) {
                        throw new IllegalStateException(AbstractC39415s.m125910t("\n|Fail to prepare request body for sending. \n|The body type is: " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(obj3.getClass()) + ", with Content-Type: " + AbstractC34132o.m107885i((C12775d) abstractC30993e.f127968w) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.").toString());
                    }
                    C12775d c12775d2 = (C12775d) abstractC30993e.f127968w;
                    c12775d2.getClass();
                    c12775d2.f43712d = obj3;
                    c12775d2.m35804a(null);
                    c0484e0.getClass();
                    ArrayList arrayList = c0484e0.f1641a;
                    InterfaceC0492i0 c0480c0 = new C0480c0(c35709c);
                    int iM118951C = AbstractC37056f.m118951C(arrayList);
                    C18283i c18283i = new C18283i(iM118951C, AbstractC21478l0.m60400F(iM118951C, 0, -1), -1);
                    while (c18283i.f71138y) {
                        c0480c0 = new C0482d0((Function3) arrayList.get(c18283i.nextInt()), c0480c0);
                    }
                    C12775d c12775d3 = (C12775d) abstractC30993e.f127968w;
                    this.f1712z = abstractC30993e;
                    this.f1710x = 1;
                    objMo1199a2 = c0480c0.mo1199a(c12775d3, this);
                    if (objMo1199a2 != enumC31071a2) {
                    }
                    return enumC31071a2;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                abstractC30993e = (AbstractC30993e) this.f1712z;
                AbstractC34132o.m107864I(obj);
                objMo1199a2 = obj;
                this.f1712z = null;
                this.f1710x = 2;
                if (abstractC30993e.mo95526d((C36845b) objMo1199a2, this) != enumC31071a2) {
                    return c23454a0;
                }
                return enumC31071a2;
            case 2:
                C0490h0 c0490h0 = (C0490h0) obj2;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i16 = this.f1710x;
                if (i16 != 0) {
                    if (i16 != 1 && i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC0492i0 interfaceC0492i1 = (InterfaceC0492i0) this.f1712z;
                C12775d c12775d4 = (C12775d) this.f1707E;
                C18187z c18187z = c12775d4.f43709a;
                C27615f c27615f = c12775d4.f43714f;
                C18160b0 c18160b0 = c18187z.f70534a;
                AbstractC22676k.m65750j(c18160b0, "<this>");
                String str = c18160b0.f70472a;
                InterfaceC30057d interfaceC30057d = null;
                if (str.equals("ws") || str.equals("wss")) {
                    this.f1712z = null;
                    this.f1710x = 1;
                    Object objMo1199a3 = interfaceC0492i1.mo1199a(c12775d4, this);
                    if (objMo1199a3 != enumC31071a3) {
                        return objMo1199a3;
                    }
                } else {
                    C0488g0 c0488g0 = C0490h0.f1652d;
                    C27610a c27610a = AbstractC39245e.f168745a;
                    Map map = (Map) c27615f.m83376d(c27610a);
                    C0486f0 c0486f0 = (C0486f0) (map != null ? map.get(c0488g0) : null);
                    if (c0486f0 == null && (c0490h0.f1654a != null || c0490h0.f1655b != null || c0490h0.f1656c != null)) {
                        c0486f0 = new C0486f0();
                        ((Map) c27615f.m83373a(c27610a, C12774c.f43708w)).put(c0488g0, c0486f0);
                    }
                    if (c0486f0 != null) {
                        Long l7 = c0486f0.f1646b;
                        if (l7 == null) {
                            l7 = c0490h0.f1655b;
                        }
                        C0486f0.m1200a(l7);
                        c0486f0.f1646b = l7;
                        Long l12 = c0486f0.f1647c;
                        if (l12 == null) {
                            l12 = c0490h0.f1656c;
                        }
                        C0486f0.m1200a(l12);
                        c0486f0.f1647c = l12;
                        Long l13 = c0486f0.f1645a;
                        if (l13 == null) {
                            l13 = c0490h0.f1654a;
                        }
                        C0486f0.m1200a(l13);
                        c0486f0.f1645a = l13;
                        if (l13 == null) {
                            l13 = c0490h0.f1654a;
                        }
                        Long l14 = l13;
                        if (l14 != null && l14.longValue() != Long.MAX_VALUE) {
                            c12775d4.f43713e.invokeOnCompletion(new C0006a1(AbstractC3006f0.m8732z(c35709c, null, null, new C0109h(l14, c12775d4, c12775d4.f43713e, interfaceC30057d, 6), 3), 5));
                        }
                    }
                    this.f1712z = null;
                    this.f1710x = 2;
                    Object objMo1199a4 = interfaceC0492i1.mo1199a(c12775d4, this);
                    if (objMo1199a4 != enumC31071a3) {
                        return objMo1199a4;
                    }
                }
                return enumC31071a3;
            default:
                C40115g c40115g = (C40115g) obj2;
                C0783z c0783z = c35709c.f151930J;
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i17 = this.f1710x;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    abstractC30993e2 = (AbstractC30993e) this.f1712z;
                    Object obj4 = this.f1707E;
                    C12775d c12775d5 = new C12775d();
                    c12775d5.m35805b((C12775d) abstractC30993e2.f127968w);
                    if (obj4 == null) {
                        c12775d5.f43712d = C21384a.f81810a;
                        InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(Object.class);
                        c12775d5.m35804a(AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(Object.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                    } else if (obj4 instanceof AbstractC21387d) {
                        c12775d5.f43712d = obj4;
                        c12775d5.m35804a(null);
                    } else {
                        c12775d5.f43712d = obj4;
                        InterfaceC21456a0 interfaceC21456a0M65691d2 = AbstractC22671h0.m65691d(Object.class);
                        c12775d5.m35804a(AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(Object.class), interfaceC21456a0M65691d2, AbstractC21478l0.m60396B(interfaceC21456a0M65691d2)));
                    }
                    c0783z.m1877v(AbstractC15538b.f58264b);
                    C18166e0 c18166e0M52176b = c12775d5.f43709a.m52176b();
                    C18181t c18181t = c12775d5.f43710b;
                    Map values = (Map) c12775d5.f43711c.f3536x;
                    AbstractC22676k.m65750j(values, "values");
                    C18176o c18176o = new C18176o(values);
                    Object obj5 = c12775d5.f43712d;
                    AbstractC21387d abstractC21387d = obj5 instanceof AbstractC21387d ? (AbstractC21387d) obj5 : null;
                    if (abstractC21387d == null) {
                        throw new IllegalStateException(("No request transformation found: " + c12775d5.f43712d).toString());
                    }
                    C3004e2 c3004e2 = c12775d5.f43713e;
                    C27615f c27615f2 = c12775d5.f43714f;
                    requestData = new C12776e(c18166e0M52176b, c18181t, c18176o, abstractC21387d, c3004e2, c27615f2);
                    c27615f2.m83377e(AbstractC39246f.f168747b, c35709c.f151931K);
                    Set setKeySet = c18176o.f111160c.keySet();
                    AbstractC22676k.m65750j(setKeySet, "<this>");
                    Set setUnmodifiableSet = Collections.unmodifiableSet(setKeySet);
                    AbstractC22676k.m65749i(setUnmodifiableSet, "unmodifiableSet(this)");
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : setUnmodifiableSet) {
                        if (AbstractC18179r.f70507a.contains((String) obj6)) {
                            arrayList2.add(obj6);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        throw new UnsafeHeaderException(arrayList2.toString());
                    }
                    for (InterfaceC39244d interfaceC39244d : requestData.f43721g) {
                        if (!c40115g.f173153E.contains(interfaceC39244d)) {
                            throw new IllegalArgumentException(("Engine doesn't support " + interfaceC39244d).toString());
                        }
                    }
                    this.f1712z = abstractC30993e2;
                    this.f1707E = requestData;
                    this.f1710x = 1;
                    objM113272a = AbstractC35750h.m113272a(c40115g, requestData, this);
                    if (objM113272a != enumC31071a4) {
                    }
                    return enumC31071a4;
                }
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                C12776e c12776e = (C12776e) this.f1707E;
                abstractC30993e2 = (AbstractC30993e) this.f1712z;
                AbstractC34132o.m107864I(obj);
                requestData = c12776e;
                objM113272a = obj;
                C12778g responseData = (C12778g) objM113272a;
                AbstractC22676k.m65750j(requestData, "requestData");
                AbstractC22676k.m65750j(responseData, "responseData");
                C36845b c36845b2 = new C36845b(c35709c);
                c36845b2.f157616x = new C12772a(c36845b2, requestData);
                c36845b2.f157617y = new C14153a(c36845b2, responseData);
                Object obj7 = responseData.f43738e;
                if (!(obj7 instanceof InterfaceC20024q)) {
                    c36845b2.m118139c().getAttributes().m83377e(C36845b.f157613E, obj7);
                }
                AbstractC14155c abstractC14155cM118140d = c36845b2.m118140d();
                c0783z.m1877v(AbstractC15538b.f58265c);
                AbstractC3006f0.m8725s(abstractC14155cM118140d.getCoroutineContext()).invokeOnCompletion(new C0227m1(c35709c, abstractC14155cM118140d));
                this.f1712z = null;
                this.f1707E = null;
                this.f1710x = 2;
                if (abstractC30993e2.mo95526d(c36845b2, this) != enumC31071a4) {
                    return c23454a0;
                }
                return enumC31071a4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0506w(C35709c c35709c, C40115g c40115g, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f1709w = 3;
        this.f1711y = c35709c;
        this.f1708F = c40115g;
    }
}
