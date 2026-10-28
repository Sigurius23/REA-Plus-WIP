package a30;

import a01.C0084d;
import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.C3022j0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dc3.C11923h;
import e00.C12500w;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ep1.C13412g;
import g30.C15296g;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.C23465k;
import l83.C23468n;
import m83.AbstractC25247g0;
import m83.C25272z;
import my.C26027a;
import p000.C22931l;
import p180h0.AbstractC16387f1;
import p180h0.AbstractC16444q3;
import p180h0.AbstractC16486z0;
import p180h0.C16358a1;
import p180h0.C16391g0;
import p180h0.C16451s0;
import p390p1.C28688y1;
import p395p6.C28894l;
import p395p6.C28899m1;
import p505ts.AbstractC34132o;
import p508ty.C34248b;
import p512u2.InterfaceC34476v;
import p605x6.C38015t;
import p605x6.InterfaceC38016u;
import p664yy.C39857f;
import p715kotlin.jvm.internal.C22667f0;
import q30.C29896b0;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import v00.C35459c0;
import v00.C35473j0;
import v00.C35475k0;
import wb3.AbstractC37056f;
import y00.AbstractC38963t7;
import y00.C38901n;

/* JADX INFO: renamed from: a30.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C0319q extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public Object f1096E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f1097F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f1098G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f1099H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f1100I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f1101J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1102w;

    /* JADX INFO: renamed from: x */
    public int f1103x;

    /* JADX INFO: renamed from: y */
    public Object f1104y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f1105z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0319q(C0274a0 c0274a0, InterfaceC0303k interfaceC0303k, C3022j0 c3022j0, C3022j0 c3022j1, C26027a c26027a, C35475k0 c35475k0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1102w = 0;
        this.f1105z = c0274a0;
        this.f1097F = interfaceC0303k;
        this.f1098G = c3022j0;
        this.f1099H = c3022j1;
        this.f1100I = c26027a;
        this.f1101J = c35475k0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f1102w) {
            case 0:
                return new C0319q((C0274a0) this.f1105z, (InterfaceC0303k) this.f1097F, (C3022j0) this.f1098G, (C3022j0) this.f1099H, (C26027a) this.f1100I, (C35475k0) this.f1101J, interfaceC30057d);
            case 1:
                return new C0319q((C12500w) this.f1104y, (String) this.f1105z, (String) this.f1096E, (C38901n) this.f1097F, (String) this.f1098G, (String) this.f1099H, (String) this.f1100I, (String) this.f1101J, interfaceC30057d);
            case 2:
                C0319q c0319q = new C0319q((InterfaceC34476v) this.f1105z, (AbstractC16387f1) this.f1096E, (C22931l) this.f1097F, (C13412g) this.f1098G, (C16358a1) this.f1099H, (C16358a1) this.f1100I, (C0084d) this.f1101J, interfaceC30057d, 2);
                c0319q.f1104y = obj;
                return c0319q;
            default:
                C0319q c0319q2 = new C0319q((C28688y1) this.f1105z, (C28894l) this.f1096E, (C13045h2) this.f1097F, (Context) this.f1098G, (C28899m1) this.f1099H, (InterfaceC38016u) this.f1100I, (C38015t) this.f1101J, interfaceC30057d, 3);
                c0319q2.f1104y = obj;
                return c0319q2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f1102w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C0319q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM8817m;
        C0274a0 c0274a0;
        InterfaceC0303k interfaceC0303k;
        Object objM43409i;
        InterfaceC2994c0 interfaceC2994c0;
        int i13 = this.f1102w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f1101J;
        Object obj3 = this.f1100I;
        Object obj4 = this.f1099H;
        Object obj5 = this.f1098G;
        Object obj6 = this.f1097F;
        Object obj7 = this.f1105z;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f1103x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C0274a0 c0274a1 = (C0274a0) obj7;
                    InterfaceC0303k interfaceC0303k2 = (InterfaceC0303k) obj6;
                    this.f1104y = c0274a1;
                    this.f1096E = interfaceC0303k2;
                    this.f1103x = 1;
                    objM8817m = ((C3022j0) obj5).m8817m(this);
                    if (objM8817m != enumC31071a) {
                        c0274a0 = c0274a1;
                        interfaceC0303k = interfaceC0303k2;
                    }
                    return enumC31071a;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                interfaceC0303k = (InterfaceC0303k) this.f1096E;
                C0274a0 c0274a2 = (C0274a0) this.f1104y;
                AbstractC34132o.m107864I(obj);
                c0274a0 = c0274a2;
                objM8817m = obj;
                this.f1104y = null;
                this.f1096E = null;
                this.f1103x = 2;
                Object objM808a = C0274a0.m808a(c0274a0, interfaceC0303k, (C35459c0) objM8817m, (C3022j0) obj4, new C35473j0(((C26027a) obj3).f102959N), (C35475k0) obj2, this);
                if (objM808a != enumC31071a) {
                    return objM808a;
                }
                return enumC31071a;
            case 1:
                C12500w c12500w = (C12500w) this.f1104y;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f1103x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C34248b c34248bM108289a = c12500w.f42692i.m108289a();
                    Map mapM108291b = c34248bM108289a != null ? c34248bM108289a.m108291b() : null;
                    Map mapM95645u = C25272z.f99163w;
                    if (mapM108291b == null) {
                        mapM108291b = mapM95645u;
                    }
                    Map mapM73989X = AbstractC25247g0.m73989X(new C23465k("expand", AbstractC37056f.m118958J("payment_method")));
                    String str = (String) obj7;
                    Map mapM124385o = str != null ? AbstractC38963t7.m124385o("payment_method_options", AbstractC38963t7.m124385o("card", AbstractC31061c.m95645u("cvc", str))) : mapM95645u;
                    String str2 = (String) this.f1096E;
                    if (str2 != null) {
                        mapM95645u = AbstractC31061c.m95645u("allow_redisplay", str2);
                    }
                    LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(mapM73989X, mapM108291b), mapM124385o), mapM95645u), C12500w.m35113a(c12500w, (C38901n) obj6));
                    C39857f c39857fM35114b = c12500w.m35114b();
                    C15296g c15296g = c12500w.f42688e;
                    String str3 = c12500w.f42684a.f8870w;
                    this.f1103x = 1;
                    objM43409i = c15296g.m43409i((String) obj5, (String) obj4, (String) obj3, (String) obj2, str3, c39857fM35114b, linkedHashMapM73995d0, this);
                    if (objM43409i == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM43409i = ((C23468n) obj).f92940w;
                }
                return new C23468n(objM43409i);
            case 2:
                AbstractC16387f1 abstractC16387f1 = (AbstractC16387f1) this.f1096E;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i16 = this.f1103x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) this.f1104y;
                    try {
                        C0084d c0084d = (C0084d) obj2;
                        this.f1104y = interfaceC2994c1;
                        this.f1103x = 1;
                        float f13 = AbstractC16486z0.f63358a;
                        Object objM46625g = AbstractC16444q3.m46625g((InterfaceC34476v) obj7, new C16451s0((C16358a1) obj3, new C22667f0(), abstractC16387f1.f63006Q, (C22931l) obj6, c0084d, (C16358a1) obj4, (C13412g) obj5, null), this);
                        if (objM46625g != enumC31071a3) {
                            objM46625g = c23454a0;
                        }
                        return objM46625g == enumC31071a3 ? enumC31071a3 : c23454a0;
                    } catch (CancellationException e5) {
                        e = e5;
                        interfaceC2994c0 = interfaceC2994c1;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) this.f1104y;
                    try {
                        AbstractC34132o.m107864I(obj);
                        return c23454a0;
                    } catch (CancellationException e13) {
                        e = e13;
                    }
                }
                C11923h c11923h = abstractC16387f1.f63010U;
                if (c11923h != null) {
                    c11923h.mo32218s(C16391g0.f63025a);
                }
                if (AbstractC3006f0.m8729w(interfaceC2994c0)) {
                    return c23454a0;
                }
                throw e;
            default:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i17 = this.f1103x;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC2994c0 interfaceC2994c2 = (InterfaceC2994c0) this.f1104y;
                C22667f0 c22667f0 = new C22667f0();
                C28688y1 c28688y1 = (C28688y1) obj7;
                c22667f0.f89335w = c28688y1.f116035a;
                C13045h2 c13045h2 = c28688y1.f116055u;
                C29896b0 c29896b0 = new C29896b0((C28894l) this.f1096E, c28688y1, c22667f0, (C13045h2) obj6, (Context) obj5, (C28899m1) obj4, (InterfaceC38016u) obj3, (C38015t) obj2, interfaceC2994c2, null);
                this.f1103x = 1;
                return AbstractC13091v.m36604n(c13045h2, c29896b0, this) == enumC31071a4 ? enumC31071a4 : c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0319q(C12500w c12500w, String str, String str2, C38901n c38901n, String str3, String str4, String str5, String str6, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1102w = 1;
        this.f1104y = c12500w;
        this.f1105z = str;
        this.f1096E = str2;
        this.f1097F = c38901n;
        this.f1098G = str3;
        this.f1099H = str4;
        this.f1100I = str5;
        this.f1101J = str6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0319q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f1102w = i13;
        this.f1105z = obj;
        this.f1096E = obj2;
        this.f1097F = obj3;
        this.f1098G = obj4;
        this.f1099H = obj5;
        this.f1100I = obj6;
        this.f1101J = obj7;
    }
}
