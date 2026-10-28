package a20;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1601k1;
import bc3.AbstractC3006f0;
import ec3.C13096w1;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import p088dc.AbstractC11894a;
import p266jz.C22057e;
import p442qy.C30765d;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import w10.C36689a;
import w10.C36690b;
import w10.C36691c;
import w10.InterfaceC36692d;
import y00.C38826f2;
import y00.EnumC38922p2;
import y10.C39041c;
import y10.C39046h;
import z10.AbstractC39982e;
import z10.AbstractC39995r;
import z10.C39978a;
import z10.C39979b;
import z10.C39980c;
import z10.C39981d;
import z10.C39994q;

/* JADX INFO: renamed from: a20.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C0170j extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final C39046h f506E;

    /* JADX INFO: renamed from: F */
    public final C1601k1 f507F;

    /* JADX INFO: renamed from: G */
    public final C30765d f508G;

    /* JADX INFO: renamed from: H */
    public final C13096w1 f509H;

    /* JADX INFO: renamed from: w */
    public final AbstractC39982e f510w;

    /* JADX INFO: renamed from: x */
    public final C13096w1 f511x;

    /* JADX INFO: renamed from: y */
    public final C39046h f512y;

    /* JADX INFO: renamed from: z */
    public final C39041c f513z;

    public C0170j(AbstractC39982e abstractC39982e, C13096w1 c13096w1, C39046h c39046h, C39041c c39041c, C39046h c39046h2, C1601k1 c1601k1, C30765d logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.f510w = abstractC39982e;
        this.f511x = c13096w1;
        this.f512y = c39046h;
        this.f513z = c39041c;
        this.f506E = c39046h2;
        this.f507F = c1601k1;
        this.f508G = logger;
        this.f509H = c13096w1;
        if (AbstractC22676k.m65745e(c1601k1.m5001b("key_has_launched"), Boolean.TRUE)) {
            return;
        }
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C0162b(this, null, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014e  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:69:0x0148, B:72:0x014f, B:73:0x0156), top: B:93:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x015d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0163  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b0 A[PHI: r0 r1 r4
      0x01b0: PHI (r0v14 java.lang.Object) = (r0v10 java.lang.Object), (r0v17 java.lang.Object) binds: [B:78:0x0161, B:83:0x01af] A[DONT_GENERATE, DONT_INLINE]
      0x01b0: PHI (r1v12 java.lang.Object) = (r1v8 java.lang.Object), (r1v13 java.lang.Object) binds: [B:78:0x0161, B:83:0x01af] A[DONT_GENERATE, DONT_INLINE]
      0x01b0: PHI (r4v13 a20.j) = (r4v12 a20.j), (r4v14 a20.j) binds: [B:78:0x0161, B:83:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0163, please report this as an issue */
    /* JADX INFO: renamed from: g */
    public static final Object m403g(C0170j c0170j, AbstractC32269c abstractC32269c) {
        C0169i c0169i;
        Object obj;
        Object objM124467c;
        String str;
        String str2;
        C0170j c0170j2;
        Object objM107888l;
        C13096w1 c13096w1;
        C0165e c0165e;
        C0170j c0170j3;
        Throwable thM68037a;
        C0170j c0170j4 = c0170j;
        AbstractC39982e abstractC39982e = c0170j4.f510w;
        if (abstractC32269c instanceof C0169i) {
            c0169i = (C0169i) abstractC32269c;
            int i13 = c0169i.f501E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0169i.f501E = i13 - Integer.MIN_VALUE;
            } else {
                c0169i = new C0169i(c0170j4, abstractC32269c);
            }
        } else {
            c0169i = new C0169i(c0170j4, abstractC32269c);
        }
        C0169i c0169i2 = c0169i;
        Object obj2 = c0169i2.f504y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        switch (c0169i2.f501E) {
            case 0:
                AbstractC34132o.m107864I(obj2);
                if (abstractC39982e instanceof C39978a) {
                    C39978a c39978a = (C39978a) abstractC39982e;
                    C22057e c22057eM31962k = AbstractC11894a.m31962k(c39978a.f172516E);
                    C39046h c39046h = c0170j4.f512y;
                    String str3 = c39978a.f172524y;
                    String str4 = c39978a.f172525z;
                    String str5 = c39978a.f172518G;
                    String str6 = c39978a.f172519H;
                    String str7 = c39978a.f172520I;
                    String str8 = c39978a.f172521J;
                    EnumC38922p2 enumC38922p2 = c22057eM31962k != null ? c22057eM31962k.f85566y : null;
                    Integer num = c39978a.f172522K;
                    String str9 = c39978a.f172523L;
                    InterfaceC36692d interfaceC36692dMo128207f = abstractC39982e.mo128207f();
                    if (interfaceC36692dMo128207f instanceof C36689a) {
                        str2 = "instant_debits";
                    } else {
                        if (!(interfaceC36692dMo128207f instanceof C36691c) && !(interfaceC36692dMo128207f instanceof C36690b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = null;
                    }
                    c0169i2.f502w = c0170j4;
                    c0169i2.f501E = 1;
                    obj = null;
                    objM124467c = c39046h.m124465a(str3, str4, str6, str7, str8, str5, enumC38922p2, num, str9, str2, c0169i2);
                    if (objM124467c == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    obj = null;
                    if (abstractC39982e instanceof C39979b) {
                        C39979b c39979b = (C39979b) abstractC39982e;
                        C22057e c22057eM31962k2 = AbstractC11894a.m31962k(c39979b.f172526E);
                        C39046h c39046h2 = c0170j4.f512y;
                        String str10 = c39979b.f172532y;
                        String str11 = c39979b.f172533z;
                        String str12 = c39979b.f172527F;
                        String str13 = c39979b.f172529H;
                        String str14 = c39979b.f172530I;
                        String str15 = c39979b.f172531J;
                        EnumC38922p2 enumC38922p3 = c22057eM31962k2 != null ? c22057eM31962k2.f85566y : null;
                        InterfaceC36692d interfaceC36692dMo128207f2 = abstractC39982e.mo128207f();
                        if (interfaceC36692dMo128207f2 instanceof C36689a) {
                            str = "instant_debits";
                        } else {
                            if (!(interfaceC36692dMo128207f2 instanceof C36691c) && !(interfaceC36692dMo128207f2 instanceof C36690b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = null;
                        }
                        c0169i2.f502w = c0170j4;
                        c0169i2.f501E = 2;
                        objM124467c = c39046h2.m124465a(str10, str11, str13, str14, str15, str12, enumC38922p3, null, null, str, c0169i2);
                        if (objM124467c == enumC31071a) {
                            return enumC31071a;
                        }
                    } else if (abstractC39982e instanceof C39980c) {
                        C39046h c39046h3 = c0170j4.f512y;
                        C39980c c39980c = (C39980c) abstractC39982e;
                        String str16 = c39980c.f172539y;
                        String str17 = c39980c.f172540z;
                        String str18 = c39980c.f172538I;
                        String str19 = c39980c.f172534E;
                        InterfaceC36692d interfaceC36692d = c39980c.f172535F;
                        c0169i2.f502w = c0170j4;
                        c0169i2.f501E = 3;
                        objM124467c = c39046h3.m124466b(str16, str19, str17, str18, interfaceC36692d, c0169i2);
                        if (objM124467c == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (!(abstractC39982e instanceof C39981d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C39046h c39046h4 = c0170j4.f512y;
                        C39981d c39981d = (C39981d) abstractC39982e;
                        String str20 = c39981d.f172546y;
                        String str21 = c39981d.f172547z;
                        String str22 = c39981d.f172545I;
                        String str23 = c39981d.f172541E;
                        InterfaceC36692d interfaceC36692d2 = c39981d.f172542F;
                        c0169i2.f502w = c0170j4;
                        c0169i2.f501E = 4;
                        objM124467c = c39046h4.m124467c(str20, str23, str21, str22, interfaceC36692d2, c0169i2);
                        if (objM124467c == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                }
                c0170j2 = c0170j4;
                if (objM124467c instanceof C23467m) {
                    objM107888l = objM124467c;
                } else {
                    try {
                        objM107888l = ((C38826f2) objM124467c).f167083w;
                        if (objM107888l != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } catch (Throwable th3) {
                        objM107888l = AbstractC34132o.m107888l(th3);
                    }
                }
                if (objM107888l instanceof C23467m) {
                    thM68037a = C23468n.m68037a(objM107888l);
                    if (thM68037a != null) {
                        c0169i2.f502w = objM107888l;
                        c0169i2.f503x = obj;
                        c0169i2.f501E = 6;
                        if (c0170j2.m404j(thM68037a, c0169i2) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    String str24 = (String) objM107888l;
                    C30765d c30765d = c0170j2.f508G;
                    AbstractC39982e abstractC39982e2 = c0170j2.f510w;
                    c30765d.m94511a("Bank account session created! " + str24 + ".");
                    c0170j2.f507F.m5004e(Boolean.TRUE, "key_has_launched");
                    C22057e c22057eM31962k3 = AbstractC11894a.m31962k(abstractC39982e2.mo128207f());
                    c13096w1 = c0170j2.f511x;
                    c0165e = new C0165e(abstractC39982e2.mo128209i(), str24, abstractC39982e2.mo128210k(), c22057eM31962k3);
                    c0169i2.f502w = c0170j2;
                    c0169i2.f503x = objM107888l;
                    c0169i2.f501E = 5;
                    if (c13096w1.emit(c0165e, c0169i2) == enumC31071a) {
                        return enumC31071a;
                    }
                    c0170j3 = c0170j2;
                    c0170j2 = c0170j3;
                    thM68037a = C23468n.m68037a(objM107888l);
                    if (thM68037a != null) {
                        c0169i2.f502w = objM107888l;
                        c0169i2.f503x = obj;
                        c0169i2.f501E = 6;
                        if (c0170j2.m404j(thM68037a, c0169i2) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                }
                return C23454a0.f92919a;
            case 1:
            case 2:
            case 3:
            case 4:
                c0170j4 = (C0170j) c0169i2.f502w;
                AbstractC34132o.m107864I(obj2);
                objM124467c = ((C23468n) obj2).f92940w;
                obj = null;
                c0170j2 = c0170j4;
                if (objM124467c instanceof C23467m) {
                    objM107888l = ((C38826f2) objM124467c).f167083w;
                    if (objM107888l != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    objM107888l = objM124467c;
                }
                if (objM107888l instanceof C23467m) {
                    String str25 = (String) objM107888l;
                    C30765d c30765d2 = c0170j2.f508G;
                    AbstractC39982e abstractC39982e3 = c0170j2.f510w;
                    c30765d2.m94511a("Bank account session created! " + str25 + ".");
                    c0170j2.f507F.m5004e(Boolean.TRUE, "key_has_launched");
                    C22057e c22057eM31962k4 = AbstractC11894a.m31962k(abstractC39982e3.mo128207f());
                    c13096w1 = c0170j2.f511x;
                    c0165e = new C0165e(abstractC39982e3.mo128209i(), str25, abstractC39982e3.mo128210k(), c22057eM31962k4);
                    c0169i2.f502w = c0170j2;
                    c0169i2.f503x = objM107888l;
                    c0169i2.f501E = 5;
                    if (c13096w1.emit(c0165e, c0169i2) == enumC31071a) {
                        return enumC31071a;
                    }
                    c0170j3 = c0170j2;
                    c0170j2 = c0170j3;
                    thM68037a = C23468n.m68037a(objM107888l);
                    if (thM68037a != null) {
                        c0169i2.f502w = objM107888l;
                        c0169i2.f503x = obj;
                        c0169i2.f501E = 6;
                        if (c0170j2.m404j(thM68037a, c0169i2) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    thM68037a = C23468n.m68037a(objM107888l);
                    if (thM68037a != null) {
                        c0169i2.f502w = objM107888l;
                        c0169i2.f503x = obj;
                        c0169i2.f501E = 6;
                        if (c0170j2.m404j(thM68037a, c0169i2) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                }
                return C23454a0.f92919a;
            case 5:
                objM107888l = c0169i2.f503x;
                c0170j3 = (C0170j) c0169i2.f502w;
                AbstractC34132o.m107864I(obj2);
                obj = null;
                c0170j2 = c0170j3;
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    c0169i2.f502w = objM107888l;
                    c0169i2.f503x = obj;
                    c0169i2.f501E = 6;
                    if (c0170j2.m404j(thM68037a, c0169i2) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            case 6:
                AbstractC34132o.m107864I(obj2);
                return C23454a0.f92919a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: j */
    public final Object m404j(Throwable th3, AbstractC32269c abstractC32269c) throws Throwable {
        this.f508G.m94512b("Error", new Exception(th3));
        Object objM405l = m405l(new C39994q(th3), abstractC32269c);
        return objM405l == EnumC31071a.f128113w ? objM405l : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public final Object m405l(AbstractC39995r abstractC39995r, AbstractC32269c abstractC32269c) throws Throwable {
        Object objEmit = this.f511x.emit(new C0164d(abstractC39995r), abstractC32269c);
        return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
    }
}
