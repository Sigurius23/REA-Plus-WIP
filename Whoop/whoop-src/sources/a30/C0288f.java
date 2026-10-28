package a30;

import android.content.SharedPreferences;
import b00.C2179a;
import d00.C11424c;
import d00.InterfaceC11427f;
import ec3.AbstractC13091v;
import f20.C14022a;
import f20.EnumC14023b;
import h20.C16671i1;
import h20.C16689l1;
import h20.C16713p1;
import h20.C16756w2;
import h20.C16760x0;
import h20.EnumC16677j1;
import h20.EnumC16683k1;
import i20.C17928b;
import j00.EnumC21096d0;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import my.C26027a;
import n83.C26460c;
import p234iy.AbstractC21025a;
import p479s4.AbstractC32121b;
import p481s6.AbstractC32229a;
import p499t9.C33623c0;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p537ux.C35330f;
import p537ux.InterfaceC35320a;
import p558vp.AbstractC36259c;
import p599wz.C37709d0;
import p599wz.C37712e0;
import p599wz.C37715f0;
import p599wz.C37718g0;
import p599wz.C37734l1;
import p631xz.C38737n0;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import u00.C34377e;
import v00.C35473j0;
import v00.C35475k0;
import v00.InterfaceC35471i0;
import wb3.AbstractC37056f;
import x43.AbstractC37978j;
import y00.C38785b1;
import y00.C38901n;
import y00.C38912o1;
import y00.C38921p1;
import y00.C38957t1;
import y00.C38966u1;
import y00.EnumC38828f4;
import y00.EnumC38913o2;
import y00.EnumC38922p2;
import y00.EnumC38948s1;
import y00.EnumC38958t2;
import y00.InterfaceC38802c8;
import yb3.AbstractC39414r;
import z20.C40014h;

/* JADX INFO: renamed from: a30.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C0288f {

    /* JADX INFO: renamed from: a */
    public final C0291g f1013a;

    /* JADX INFO: renamed from: b */
    public final C0286e0 f1014b;

    /* JADX INFO: renamed from: c */
    public final C38737n0 f1015c;

    /* JADX INFO: renamed from: d */
    public final C34377e f1016d;

    /* JADX INFO: renamed from: e */
    public final C33647p f1017e;

    public C0288f(C0291g accountStatusProvider, C0286e0 retrieveCustomerEmail, C38737n0 linkStore, C34377e linkGateFactory, C33647p cardFundingFilterFactory) {
        AbstractC22676k.m65750j(accountStatusProvider, "accountStatusProvider");
        AbstractC22676k.m65750j(retrieveCustomerEmail, "retrieveCustomerEmail");
        AbstractC22676k.m65750j(linkStore, "linkStore");
        AbstractC22676k.m65750j(linkGateFactory, "linkGateFactory");
        AbstractC22676k.m65750j(cardFundingFilterFactory, "cardFundingFilterFactory");
        this.f1013a = accountStatusProvider;
        this.f1014b = retrieveCustomerEmail;
        this.f1015c = linkStore;
        this.f1016d = linkGateFactory;
        this.f1017e = cardFundingFilterFactory;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: a */
    public final Object m819a(AbstractC0326t0 abstractC0326t0, C26027a c26027a, AbstractC32269c abstractC32269c, C38901n c38901n, C38966u1 c38966u1, C40014h c40014h) {
        C0282d c0282d;
        String str;
        InterfaceC35320a interfaceC35320a;
        C38901n c38901n2;
        C0288f c0288f;
        C26027a c26027a2;
        String str2;
        AbstractC0326t0 abstractC0326t1;
        C38966u1 c38966u2;
        C17928b c17928b;
        C38912o1 c38912o1;
        C16760x0 c16760x0;
        if (abstractC32269c instanceof C0282d) {
            c0282d = (C0282d) abstractC32269c;
            int i13 = c0282d.f995K;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0282d.f995K = i13 - Integer.MIN_VALUE;
            } else {
                c0282d = new C0282d(this, abstractC32269c);
            }
        } else {
            c0282d = new C0282d(this, abstractC32269c);
        }
        Object obj = c0282d.f993I;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0282d.f995K;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C38957t1 c38957t1 = c38966u1.f167735w;
            InterfaceC35320a c35473j0 = (!(c38957t1 != null ? c38957t1.f167691x : false) || AbstractC22676k.m65745e(c26027a.f102959N, C16713p1.f64245w)) ? C35330f.f150532w : new C35473j0(c26027a.f102959N);
            C17928b c17928b2 = c26027a.f102951F;
            if (c17928b2 != null ? AbstractC22676k.m65745e(c17928b2.f69686z, Boolean.TRUE) : false) {
                str = c17928b2.f69685y;
            } else {
                C16671i1 c16671i1 = c26027a.f102950E;
                str = c16671i1 != null ? c16671i1.f64117z : null;
            }
            c0282d.f996w = this;
            c0282d.f997x = c26027a;
            c0282d.f998y = c38966u1;
            c0282d.f999z = abstractC0326t0;
            c0282d.f989E = c38901n;
            c0282d.f990F = c35473j0;
            c0282d.f991G = c17928b2;
            c0282d.f992H = str;
            c0282d.f995K = 1;
            Object objM818a = this.f1014b.m818a(c26027a, c40014h, c0282d);
            if (objM818a == enumC31071a) {
                return enumC31071a;
            }
            interfaceC35320a = c35473j0;
            obj = objM818a;
            c38901n2 = c38901n;
            c0288f = this;
            c26027a2 = c26027a;
            str2 = str;
            abstractC0326t1 = abstractC0326t0;
            c38966u2 = c38966u1;
            c17928b = c17928b2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c0282d.f992H;
            c17928b = c0282d.f991G;
            InterfaceC35320a interfaceC35320a2 = c0282d.f990F;
            C38901n c38901n3 = c0282d.f989E;
            abstractC0326t1 = c0282d.f999z;
            c38966u2 = c0282d.f998y;
            c26027a2 = c0282d.f997x;
            c0288f = c0282d.f996w;
            AbstractC34132o.m107864I(obj);
            interfaceC35320a = interfaceC35320a2;
            c38901n2 = c38901n3;
        }
        String str3 = (String) obj;
        C16671i1 c16671i2 = c26027a2.f102950E;
        C37715f0 c37715f0 = new C37715f0(c16671i2 != null ? c16671i2.f64116y : null, str3, str2, (c16671i2 == null || (c16760x0 = c16671i2.f64114w) == null) ? null : c16760x0.f64399x);
        c0288f.getClass();
        C38785b1 c38785b1 = c38966u2.f167726K;
        Map map = c38966u2.f167721F;
        C38957t1 c38957t2 = c38966u2.f167735w;
        C37712e0 c37712e0 = c38785b1 != null ? new C37712e0(c38785b1.f166941w, c38785b1.f166942x) : null;
        InterfaceC38802c8 interfaceC38802c8 = c38966u2.f167738z;
        String str4 = c26027a2.f102970w;
        String strM115677X = AbstractC36259c.m115677X(abstractC0326t1);
        String str5 = c38966u2.f167724I;
        String str6 = c38966u2.f167725J;
        C17928b c17928b3 = (c17928b == null || !AbstractC22676k.m65745e(c17928b.f69686z, Boolean.TRUE)) ? null : c17928b;
        boolean z4 = c38957t2 != null ? c38957t2.f167691x : false;
        C33647p c33647p = c0288f.f1017e;
        Object obj2 = map.get(EnumC38948s1.ELEMENTS_MOBILE_CARD_FUND_FILTERING);
        Boolean bool = Boolean.TRUE;
        List list = AbstractC22676k.m65745e(obj2, bool) ? c26027a2.f102960O : AbstractC21025a.f79600j;
        c33647p.getClass();
        List params = list;
        AbstractC22676k.m65750j(params, "params");
        C35475k0 c35475k0 = new C35475k0(params);
        EnumC14023b enumC14023bM39912a = C14022a.m39912a(c38966u2);
        Map map2 = c38957t2 != null ? c38957t2.f167693z : C25272z.f99163w;
        boolean z13 = c38957t2 != null ? c38957t2.f167682G : false;
        boolean z14 = c38957t2 != null ? c38957t2.f167683H : false;
        boolean z15 = c38957t2 != null ? c38957t2.f167684I : false;
        boolean z16 = c38957t2 != null ? c38957t2.f167685J : false;
        boolean z17 = c38957t2 != null ? c38957t2.f167687L : false;
        boolean z18 = c38957t2 != null ? c38957t2.f167688M : false;
        String str7 = c38966u2.f167730O;
        EnumC38922p2 enumC38922p2 = c38957t2 != null ? c38957t2.f167692y : null;
        C16689l1 c16689l1 = c26027a2.f102954I;
        C16671i1 c16671i3 = c26027a2.f102950E;
        boolean z19 = !(c38957t2 != null ? AbstractC22676k.m65745e(c38957t2.f167693z.get("link_mobile_disable_default_opt_in"), bool) : false);
        String str8 = c26027a2.f102963R;
        C16756w2 c16756w2 = c26027a2.f102973z;
        boolean z24 = c16756w2.f64378x;
        boolean z25 = c16756w2.f64379y;
        boolean z26 = c16756w2.f64380z;
        boolean z27 = c38957t2 != null ? c38957t2.f167686K : false;
        C38921p1 c38921p1 = c38966u2.f167723H;
        String str9 = (c38921p1 == null || (c38912o1 = c38921p1.f167545y) == null) ? null : c38912o1.f167498E;
        C37709d0 c37709d0 = c26027a2.f102964S;
        InterfaceC35471i0 interfaceC35471i0M100263j = AbstractC32229a.m100263j(c38966u2);
        boolean zM65745e = AbstractC22676k.m65745e(map.get(EnumC38948s1.ELEMENTS_MOBILE_FORCE_SETUP_FUTURE_USE_BEHAVIOR_AND_NEW_MANDATE_TEXT), bool);
        List list2 = c38957t2 != null ? c38957t2.f167689N : null;
        if (list2 == null) {
            list2 = C25271y.f99162w;
        }
        return new C37718g0(interfaceC38802c8, str4, strM115677X, str5, str6, c37715f0, c17928b3, z4, map2, c37712e0, interfaceC35320a, c35475k0, enumC14023bM39912a, c16689l1, c16671i3, z13, z14, z15, str7, enumC38922p2, z19, str8, z24, z25, z26, z16, z27, c37709d0, z17, z18, str9, interfaceC35471i0M100263j, zM65745e, list2, c38901n2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:114:0x01df  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x0136  */
    /* JADX WARN: Code duplicated, block: B:67:0x013a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0150  */
    /* JADX WARN: Code duplicated, block: B:71:0x0157  */
    /* JADX WARN: Code duplicated, block: B:72:0x015a  */
    /* JADX WARN: Code duplicated, block: B:74:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x015f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0162  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Code duplicated, block: B:80:0x016c  */
    /* JADX WARN: Code duplicated, block: B:81:0x016f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0172  */
    /* JADX WARN: Code duplicated, block: B:89:0x0181  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0184  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b5  */
    /* JADX INFO: renamed from: b */
    public final Object m820b(AbstractC0326t0 abstractC0326t0, C26027a c26027a, AbstractC32269c abstractC32269c, C38901n c38901n, C38966u1 c38966u1, C40014h c40014h) {
        C0285e c0285e;
        C0288f c0288f;
        C38966u1 c38966u2;
        C26027a c26027a2;
        C37718g0 c37718g0;
        C0288f c0288f2;
        C38966u1 c38966u3;
        C26027a c26027a3;
        InterfaceC11427f interfaceC11427f;
        C26460c c26460cM119000x;
        InterfaceC38802c8 interfaceC38802c8;
        C38957t1 c38957t1;
        List listMo124333i0;
        boolean z4;
        boolean z13;
        Object value;
        C26460c c26460cM118988k;
        boolean z14;
        boolean zM100011q;
        boolean z15;
        EnumC21096d0 enumC21096d0;
        InterfaceC0301j0 c0298i0;
        String str;
        InterfaceC0301j0 interfaceC0301j0;
        String str2;
        boolean z16;
        boolean z17;
        if (abstractC32269c instanceof C0285e) {
            c0285e = (C0285e) abstractC32269c;
            int i13 = c0285e.f1007G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0285e.f1007G = i13 - Integer.MIN_VALUE;
            } else {
                c0285e = new C0285e(this, abstractC32269c);
            }
        } else {
            c0285e = new C0285e(this, abstractC32269c);
        }
        C0285e c0285e2 = c0285e;
        Object obj = c0285e2.f1005E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0285e2.f1007G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C26460c c26460cM119000x2 = AbstractC37056f.m119000x();
            boolean zM124397b = c38966u1.m124397b();
            C38957t1 c38957t2 = c38966u1.f167735w;
            if (!zM124397b) {
                c26460cM119000x2.add(EnumC38913o2.NotSupportedInElementsSession);
            }
            if (!c26027a.f102973z.m47275b()) {
                c26460cM119000x2.add(EnumC38913o2.LinkConfiguration);
            }
            this.f1016d.getClass();
            boolean zM6861b = new C2179a(c38966u1.f167738z, c38957t2 != null ? c38957t2.f167682G : false, c38957t2 != null ? c38957t2.f167683H : false, c38957t2 != null ? c38957t2.f167684I : false).m6861b();
            if ((c38957t2 != null ? c38957t2.f167691x : false) && !AbstractC22676k.m65745e(c26027a.f102959N, C16713p1.f64245w) && !zM6861b) {
                c26460cM119000x2.add(EnumC38913o2.CardBrandFiltering);
            }
            C16689l1 c16689l1 = c26027a.f102954I;
            EnumC16683k1 enumC16683k1 = c16689l1.f64189w;
            EnumC16683k1 enumC16683k2 = EnumC16683k1.f64151y;
            if ((enumC16683k1 == enumC16683k2 || c16689l1.f64190x == enumC16683k2 || c16689l1.f64191y == enumC16683k2 || c16689l1.f64192z == EnumC16677j1.f64133y) && !zM6861b) {
                c26460cM119000x2.add(EnumC38913o2.BillingDetailsCollection);
            }
            C26460c c26460cM118988k2 = AbstractC37056f.m118988k(c26460cM119000x2);
            if (!c26460cM118988k2.isEmpty()) {
                return new C0289f0(c26460cM118988k2);
            }
            c0285e2.f1008w = this;
            c0285e2.f1009x = c38966u1;
            c0285e2.f1010y = c26027a;
            c0285e2.f1007G = 1;
            Object objM819a = m819a(abstractC0326t0, c26027a, c0285e2, c38901n, c38966u1, c40014h);
            if (objM819a != enumC31071a) {
                c0288f = this;
                c38966u2 = c38966u1;
                obj = objM819a;
                c26027a2 = c26027a;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            c26027a2 = c0285e2.f1010y;
            c38966u2 = c0285e2.f1009x;
            c0288f = c0285e2.f1008w;
            AbstractC34132o.m107864I(obj);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c37718g0 = c0285e2.f1011z;
            c26027a3 = c0285e2.f1010y;
            c38966u3 = c0285e2.f1009x;
            c0288f2 = c0285e2.f1008w;
            AbstractC34132o.m107864I(obj);
        }
        interfaceC11427f = (InterfaceC11427f) obj;
        EnumC0304k0 enumC0304k0M121639X = AbstractC37978j.m121639X(interfaceC11427f);
        c0288f2.getClass();
        if (interfaceC11427f.equals(C11424c.f36644a)) {
            c26460cM119000x = AbstractC37056f.m119000x();
            interfaceC38802c8 = c38966u3.f167738z;
            c38957t1 = c38966u3.f167735w;
            listMo124333i0 = interfaceC38802c8.mo124333i0();
            C33623c0 c33623c0 = EnumC38828f4.f167088G;
            if (!listMo124333i0.contains("card")) {
                c26460cM119000x.add(EnumC38958t2.LinkCardNotSupported);
            }
            if (c38957t1 != null) {
                z4 = c38957t1.f167680E;
            } else {
                z4 = false;
            }
            if (z4) {
                if (c38957t1 != null) {
                    z17 = c38957t1.f167687L;
                } else {
                    z17 = false;
                }
                if (!z17) {
                    c26460cM119000x.add(EnumC38958t2.DisabledInElementsSession);
                }
            }
            if (c38957t1 != null) {
                z13 = c38957t1.f167687L;
            } else {
                z13 = false;
            }
            if (z13) {
                str2 = c37718g0.f161606F.f161585x;
                if (str2 != null || AbstractC39414r.m125890i0(str2)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    c26460cM119000x.add(EnumC38958t2.SignupOptInFeatureNoEmailProvided);
                }
            }
            value = c0288f2.f1015c.f166704a.getValue();
            AbstractC22676k.m65749i(value, "getValue(...)");
            if (((SharedPreferences) value).getBoolean("has_used_link", false) && interfaceC38802c8.mo124338q0()) {
                c26460cM119000x.add(EnumC38958t2.LinkUsedBefore);
            }
            c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
            if (c26460cM118988k.isEmpty()) {
                InterfaceC35471i0 interfaceC35471i0M100263j = AbstractC32229a.m100263j(c38966u3);
                if (c26027a3.f102971x != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM100011q = AbstractC32121b.m100011q("card", interfaceC35471i0M100263j, interfaceC38802c8, z14);
                if (c38957t1 != null) {
                    z15 = c38957t1.f167687L;
                } else {
                    z15 = false;
                }
                if (!z15) {
                    str = c37718g0.f161606F.f161585x;
                    if (!(str != null || AbstractC39414r.m125890i0(str))) {
                        enumC21096d0 = EnumC21096d0.f79989w;
                    } else if (zM100011q) {
                        enumC21096d0 = EnumC21096d0.f79990x;
                    } else {
                        enumC21096d0 = EnumC21096d0.f79989w;
                    }
                } else if (zM100011q) {
                    enumC21096d0 = EnumC21096d0.f79990x;
                } else {
                    enumC21096d0 = EnumC21096d0.f79989w;
                }
                c0298i0 = new C0298i0(enumC21096d0);
            } else {
                c0298i0 = new C0295h0(c26460cM118988k);
            }
            interfaceC0301j0 = c0298i0;
        } else {
            interfaceC0301j0 = C0292g0.f1025w;
        }
        return new C0307l0(c37718g0, enumC0304k0M121639X, interfaceC0301j0);
        C37718g0 configuration = (C37718g0) obj;
        C0291g c0291g = c0288f.f1013a;
        c0285e2.f1008w = c0288f;
        c0285e2.f1009x = c38966u2;
        c0285e2.f1010y = c26027a2;
        c0285e2.f1011z = configuration;
        c0285e2.f1007G = 2;
        C37734l1 c37734l1 = c0291g.f1024a;
        c37734l1.getClass();
        AbstractC22676k.m65750j(configuration, "configuration");
        Object objM36575A = AbstractC13091v.m36575A(c37734l1.m121148b(configuration).m77714a().f166758m, c0285e2);
        if (objM36575A != enumC31071a) {
            C26027a c26027a4 = c26027a2;
            c37718g0 = configuration;
            obj = objM36575A;
            c0288f2 = c0288f;
            c38966u3 = c38966u2;
            c26027a3 = c26027a4;
            interfaceC11427f = (InterfaceC11427f) obj;
            EnumC0304k0 enumC0304k0M121639X2 = AbstractC37978j.m121639X(interfaceC11427f);
            c0288f2.getClass();
            if (interfaceC11427f.equals(C11424c.f36644a)) {
                interfaceC0301j0 = C0292g0.f1025w;
            } else {
                c26460cM119000x = AbstractC37056f.m119000x();
                interfaceC38802c8 = c38966u3.f167738z;
                c38957t1 = c38966u3.f167735w;
                listMo124333i0 = interfaceC38802c8.mo124333i0();
                C33623c0 c33623c1 = EnumC38828f4.f167088G;
                if (!listMo124333i0.contains("card")) {
                    c26460cM119000x.add(EnumC38958t2.LinkCardNotSupported);
                }
                if (c38957t1 != null) {
                    z4 = c38957t1.f167680E;
                } else {
                    z4 = false;
                }
                if (z4) {
                    if (c38957t1 != null) {
                        z17 = c38957t1.f167687L;
                    } else {
                        z17 = false;
                    }
                    if (!z17) {
                        c26460cM119000x.add(EnumC38958t2.DisabledInElementsSession);
                    }
                }
                if (c38957t1 != null) {
                    z13 = c38957t1.f167687L;
                } else {
                    z13 = false;
                }
                if (z13) {
                    str2 = c37718g0.f161606F.f161585x;
                    if (str2 != null) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    if (z16) {
                        c26460cM119000x.add(EnumC38958t2.SignupOptInFeatureNoEmailProvided);
                    }
                }
                value = c0288f2.f1015c.f166704a.getValue();
                AbstractC22676k.m65749i(value, "getValue(...)");
                if (((SharedPreferences) value).getBoolean("has_used_link", false)) {
                    c26460cM119000x.add(EnumC38958t2.LinkUsedBefore);
                }
                c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
                if (c26460cM118988k.isEmpty()) {
                    c0298i0 = new C0295h0(c26460cM118988k);
                } else {
                    InterfaceC35471i0 interfaceC35471i0M100263j2 = AbstractC32229a.m100263j(c38966u3);
                    if (c26027a3.f102971x != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zM100011q = AbstractC32121b.m100011q("card", interfaceC35471i0M100263j2, interfaceC38802c8, z14);
                    if (c38957t1 != null) {
                        z15 = c38957t1.f167687L;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                        str = c37718g0.f161606F.f161585x;
                        if (!(str != null || AbstractC39414r.m125890i0(str))) {
                            enumC21096d0 = EnumC21096d0.f79989w;
                        } else if (zM100011q) {
                            enumC21096d0 = EnumC21096d0.f79990x;
                        } else {
                            enumC21096d0 = EnumC21096d0.f79989w;
                        }
                    } else if (zM100011q) {
                        enumC21096d0 = EnumC21096d0.f79990x;
                    } else {
                        enumC21096d0 = EnumC21096d0.f79989w;
                    }
                    c0298i0 = new C0298i0(enumC21096d0);
                }
                interfaceC0301j0 = c0298i0;
            }
            return new C0307l0(c37718g0, enumC0304k0M121639X2, interfaceC0301j0);
        }
        return enumC31071a;
    }
}
