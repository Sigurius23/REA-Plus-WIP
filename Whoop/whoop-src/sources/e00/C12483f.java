package e00;

import b10.C2273z0;
import b10.InterfaceC2227c1;
import b20.C2326f;
import b20.EnumC2323c;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.model.C5597b;
import com.stripe.android.core.model.CountryCode;
import g30.C15296g;
import h20.C16671i1;
import h20.C16760x0;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25272z;
import p479s4.AbstractC32123d;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p555vl.AbstractC36095b;
import p599wz.C37742o0;
import p599wz.C37745p0;
import p664yy.C39857f;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import ug.AbstractC34924m;
import wb3.AbstractC37056f;
import y00.AbstractC38794c0;
import y00.AbstractC38963t7;
import y00.C38784b0;
import y00.C38804d0;
import y00.C38809d5;
import y00.C38824f0;
import y00.C38901n;
import y00.C38915o4;
import y00.C38977v3;
import y00.C39000y;
import y00.EnumC38941r3;

/* JADX INFO: renamed from: e00.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C12483f extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C38901n f42619E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ String f42620F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ String f42621G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42622w = 0;

    /* JADX INFO: renamed from: x */
    public int f42623x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38809d5 f42624y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C12500w f42625z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12483f(C12500w c12500w, String str, C38809d5 c38809d5, String str2, C38901n c38901n, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f42625z = c12500w;
        this.f42620F = str;
        this.f42624y = c38809d5;
        this.f42621G = str2;
        this.f42619E = c38901n;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f42622w) {
            case 0:
                return new C12483f(this.f42625z, this.f42620F, this.f42624y, this.f42621G, this.f42619E, interfaceC30057d);
            default:
                return new C12483f(this.f42624y, this.f42625z, this.f42619E, this.f42620F, this.f42621G, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f42622w) {
            case 0:
                break;
        }
        return ((C12483f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM43403c;
        Object objM7075U;
        String str;
        C39000y c39000y;
        CountryCode countryCodeM16833a;
        C39000y c39000y2;
        int i13 = this.f42622w;
        C38809d5 c38809d5 = this.f42624y;
        C12500w c12500w = this.f42625z;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f42623x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C15296g c15296g = c12500w.f42688e;
                    C38824f0 c38824f0 = new C38824f0((LinkedHashMap) c38809d5.mo124325c0(), this.f42621G);
                    String str2 = c12500w.f42684a.f8870w;
                    C39857f c39857fM35114b = c12500w.m35114b();
                    this.f42623x = 1;
                    objM43403c = c15296g.m43403c(this.f42620F, c38824f0, str2, c39857fM35114b, this);
                    if (objM43403c == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM43403c = ((C23468n) obj).f92940w;
                }
                String str3 = this.f42620F;
                C38901n c38901n = this.f42619E;
                if (!(objM43403c instanceof C23467m)) {
                    try {
                        AbstractC38794c0 abstractC38794c0 = (AbstractC38794c0) AbstractC25265s.m74096F0(((C38804d0) objM43403c).f166994w);
                        Object obj2 = ((LinkedHashMap) c38809d5.mo124325c0()).get("card");
                        Map map = obj2 instanceof Map ? (Map) obj2 : null;
                        objM43403c = new C37742o0(abstractC38794c0, C33647p.m106268j(abstractC38794c0.getId(), str3, c38901n, map != null ? AbstractC25247g0.m73989X(new C23465k("card", AbstractC25247g0.m73989X(new C23465k("cvc", map.get("cvc"))))) : null, c38809d5.f167020Q, 8), c38809d5);
                    } catch (Throwable th3) {
                        objM43403c = AbstractC34132o.m107888l(th3);
                    }
                }
                Throwable thM68037a = C23468n.m68037a(objM43403c);
                if (thM68037a != null) {
                    C2326f c2326f = c12500w.f42691h;
                    EnumC2323c enumC2323c = EnumC2323c.LINK_CREATE_PAYMENT_DETAILS_FAILURE;
                    int i15 = StripeException.f22154E;
                    AbstractC35903f.m113990H(c2326f, enumC2323c, AbstractC32123d.m100024d(thM68037a), null, 4);
                }
                return new C23468n(objM43403c);
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i16 = this.f42623x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    EnumC38941r3 enumC38941r3 = c38809d5.f167020Q;
                    Map mapM95645u = C25272z.f99163w;
                    Map mapM95645u2 = enumC38941r3 != null ? AbstractC31061c.m95645u("allow_redisplay", enumC38941r3.f167636w) : mapM95645u;
                    C38977v3 c38977v3 = c38809d5.f167019P;
                    if (c38977v3 != null && (str = c38977v3.f167776z) != null) {
                        mapM95645u = AbstractC31061c.m95645u("billing_phone", str);
                    }
                    Map mapM73989X = AbstractC25247g0.m73989X(new C23465k("expand", AbstractC37056f.m118958J("payment_method")));
                    Map mapM35113a = C12500w.m35113a(c12500w, this.f42619E);
                    InterfaceC2227c1 interfaceC2227c1 = c12500w.f42687d;
                    Object obj3 = ((LinkedHashMap) c38809d5.mo124325c0()).get("card");
                    Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                    LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(AbstractC25247g0.m73989X(new C23465k("payment_method_options", map2 != null ? AbstractC38963t7.m124385o("card", AbstractC36095b.m114689q(map2.get("cvc"), "cvc")) : null)), mapM95645u2), mapM95645u), mapM73989X), mapM35113a);
                    C39857f c39857fM35114b2 = c12500w.m35114b();
                    this.f42623x = 1;
                    objM7075U = ((C2273z0) interfaceC2227c1).m7075U(this.f42620F, this.f42621G, linkedHashMapM73995d0, c39857fM35114b2, this);
                    if (objM7075U == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM7075U = ((C23468n) obj).f92940w;
                }
                Throwable thM68037a2 = C23468n.m68037a(objM7075U);
                if (thM68037a2 != null) {
                    C2326f c2326f2 = c12500w.f42691h;
                    EnumC2323c enumC2323c2 = EnumC2323c.LINK_SHARE_CARD_FAILURE;
                    int i17 = StripeException.f22154E;
                    AbstractC35903f.m113990H(c2326f2, enumC2323c2, AbstractC32123d.m100024d(thM68037a2), null, 4);
                }
                if (!(objM7075U instanceof C23467m)) {
                    C38915o4 c38915o4 = (C38915o4) objM7075U;
                    String str4 = c38915o4.f167527w;
                    String strM124341b = c38809d5.m124341b();
                    if (strM124341b == null) {
                        strM124341b = "";
                    }
                    String str5 = strM124341b;
                    C38977v3 c38977v4 = c38915o4.f167512F;
                    String str6 = c38977v4 != null ? c38977v4.f167774x : null;
                    if (c38977v4 != null) {
                        C16671i1 c16671i1M110137S = AbstractC34924m.m110137S(c38977v4);
                        C16760x0 c16760x0 = c16671i1M110137S.f64114w;
                        if (c16760x0 == null) {
                            c39000y2 = null;
                        } else {
                            String str7 = c16671i1M110137S.f64116y;
                            String str8 = c16760x0.f64400y;
                            String str9 = c16760x0.f64401z;
                            String str10 = c16760x0.f64398w;
                            String str11 = c16760x0.f64397F;
                            String str12 = c16760x0.f64396E;
                            String str13 = c16760x0.f64399x;
                            if (str13 != null) {
                                CountryCode.Companion.getClass();
                                countryCodeM16833a = C5597b.m16833a(str13);
                            } else {
                                countryCodeM16833a = null;
                            }
                            c39000y2 = new C39000y(str7, str8, str9, str11, str10, str12, countryCodeM16833a);
                        }
                        c39000y = c39000y2;
                    } else {
                        c39000y = null;
                    }
                    C38784b0 c38784b0 = new C38784b0(this.f42621G, str4, str5, c39000y, str6);
                    Object obj4 = ((LinkedHashMap) c38809d5.mo124325c0()).get("card");
                    Map map3 = obj4 instanceof Map ? (Map) obj4 : null;
                    objM7075U = new C37745p0(c38784b0, C33647p.m106268j(str4, this.f42620F, this.f42619E, map3 != null ? AbstractC38963t7.m124385o("card", AbstractC36095b.m114689q(map3.get("cvc"), "cvc")) : null, null, 40), c38915o4);
                }
                return new C23468n(objM7075U);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12483f(C38809d5 c38809d5, C12500w c12500w, C38901n c38901n, String str, String str2, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f42624y = c38809d5;
        this.f42625z = c12500w;
        this.f42619E = c38901n;
        this.f42620F = str;
        this.f42621G = str2;
    }
}
