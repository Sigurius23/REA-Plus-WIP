package p631xz;

import b00.C2179a;
import b20.C2326f;
import b20.EnumC2323c;
import com.stripe.android.link.LinkEventException;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.attestation.AttestationError;
import e00.C12500w;
import j00.EnumC21098e0;
import java.util.List;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p522uf.AbstractC34870c0;
import p599wz.C37718g0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s30.AbstractC32100b;
import s83.AbstractC32269c;
import t40.C33536f;
import y00.C38887l3;
import y00.EnumC38796c2;
import y00.EnumC38884l0;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: xz.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38719e0 {

    /* JADX INFO: renamed from: a */
    public final C2179a f166654a;

    /* JADX INFO: renamed from: b */
    public final C12500w f166655b;

    /* JADX INFO: renamed from: c */
    public final C33536f f166656c;

    /* JADX INFO: renamed from: d */
    public final C2326f f166657d;

    /* JADX INFO: renamed from: e */
    public final C37718g0 f166658e;

    /* JADX INFO: renamed from: f */
    public final String f166659f;

    public C38719e0(C2179a linkGate, C12500w linkRepository, C33536f integrityRequestManager, C2326f errorReporter, C37718g0 config, String applicationId) {
        AbstractC22676k.m65750j(linkGate, "linkGate");
        AbstractC22676k.m65750j(linkRepository, "linkRepository");
        AbstractC22676k.m65750j(integrityRequestManager, "integrityRequestManager");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(applicationId, "applicationId");
        this.f166654a = linkGate;
        this.f166655b = linkRepository;
        this.f166656c = integrityRequestManager;
        this.f166657d = errorReporter;
        this.f166658e = config;
        this.f166659f = applicationId;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC38884l0 m124140a(EnumC21098e0 enumC21098e0) {
        switch (enumC21098e0.ordinal()) {
            case 0:
                return EnumC38884l0.Checkbox;
            case 1:
                return EnumC38884l0.CheckboxWithPrefilledEmail;
            case 2:
                return EnumC38884l0.CheckboxWithPrefilledEmailAndPhone;
            case 3:
                return EnumC38884l0.Implied;
            case 4:
                return EnumC38884l0.ImpliedWithPrefilledEmail;
            case 5:
                return EnumC38884l0.PrecheckedOptInBoxPrefilledAll;
            case 6:
                return EnumC38884l0.PrecheckedOptInBoxPrefilledSome;
            case 7:
                return EnumC38884l0.PrecheckedOptInBoxPrefilledNone;
            case 8:
                return EnumC38884l0.SignUpOptInMobileChecked;
            case 9:
                return EnumC38884l0.SignUpOptInMobilePrechecked;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: b */
    public final Object m124141b(String str, EnumC38796c2 enumC38796c2, String str2, String str3, String str4, List list, AbstractC32269c abstractC32269c) {
        C38749z c38749z;
        if (abstractC32269c instanceof C38749z) {
            c38749z = (C38749z) abstractC32269c;
            int i13 = c38749z.f166768y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38749z.f166768y = i13 - Integer.MIN_VALUE;
            } else {
                c38749z = new C38749z(this, abstractC32269c);
            }
        } else {
            c38749z = new C38749z(this, abstractC32269c);
        }
        C38749z c38749z2 = c38749z;
        Object obj = c38749z2.f166766w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c38749z2.f166768y;
        if (i14 != 0) {
            if (i14 == 1) {
                AbstractC34132o.m107864I(obj);
                return ((C23468n) obj).f92940w;
            }
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        boolean z4 = (str == null || enumC38796c2 == null) ? false : true;
        boolean z13 = str2 != null;
        if (!z4 && !z13) {
            return AbstractC34132o.m107888l(new IllegalArgumentException("Either email+emailSource, linkAuthIntentId, or linkAuthTokenClientSecret must be provided"));
        }
        if (this.f166654a.m6860a()) {
            c38749z2.f166768y = 1;
            Object objM124142c = m124142c(str, enumC38796c2, str2, str3, str4, list, c38749z2);
            if (objM124142c != obj2) {
                return objM124142c;
            }
        } else {
            c38749z2.f166768y = 2;
            Object objM35124l = this.f166655b.m35124l(str, str2, str4, str3, list, c38749z2);
            if (objM35124l != obj2) {
                return objM35124l;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: c */
    public final Object m124142c(String str, EnumC38796c2 enumC38796c2, String str2, String str3, String str4, List list, AbstractC32269c abstractC32269c) {
        C38711a0 c38711a0;
        C38719e0 c38719e0;
        String str5;
        String str6;
        Object objM105908c;
        C38719e0 c38719e1;
        String str7;
        List list2;
        EnumC38796c2 enumC38796c3;
        String str8;
        C38719e0 c38719e2;
        String str9;
        Object objM35126n;
        Object objM107888l;
        Throwable thM68037a;
        String str10;
        if (abstractC32269c instanceof C38711a0) {
            c38711a0 = (C38711a0) abstractC32269c;
            int i13 = c38711a0.f166619K;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38711a0.f166619K = i13 - Integer.MIN_VALUE;
            } else {
                c38711a0 = new C38711a0(this, abstractC32269c);
            }
        } else {
            c38711a0 = new C38711a0(this, abstractC32269c);
        }
        C38711a0 c38711a1 = c38711a0;
        Object obj = c38711a1.f166617I;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38711a1.f166619K;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                C33536f c33536f = this.f166656c;
                c38711a1.f166620w = this;
                c38711a1.f166621x = str;
                c38711a1.f166622y = enumC38796c2;
                str5 = str2;
                c38711a1.f166623z = str5;
                c38711a1.f166613E = str3;
                str6 = str4;
                c38711a1.f166614F = str6;
                c38711a1.f166615G = list;
                c38711a1.f166616H = this;
                c38711a1.f166619K = 1;
                objM105908c = c33536f.m105908c(c38711a1);
                if (objM105908c != enumC31071a) {
                    c38719e1 = this;
                    str7 = str;
                    list2 = list;
                    enumC38796c3 = enumC38796c2;
                    str8 = str3;
                    c38719e2 = c38719e1;
                    AbstractC34132o.m107864I(objM105908c);
                    String str11 = (String) objM105908c;
                    C12500w c12500w = c38719e2.f166655b;
                    String str12 = c38719e2.f166659f;
                    c38711a1.f166620w = c38719e1;
                    c38711a1.f166621x = str7;
                    c38711a1.f166622y = null;
                    c38711a1.f166623z = null;
                    c38711a1.f166613E = null;
                    c38711a1.f166614F = null;
                    c38711a1.f166615G = null;
                    c38711a1.f166616H = null;
                    c38711a1.f166619K = 2;
                    str9 = str7;
                    objM35126n = c12500w.m35126n(str9, enumC38796c3, str5, str11, str12, str6, str8, list2, null, c38711a1);
                    if (objM35126n != enumC31071a) {
                        str = str9;
                        c38719e0 = c38719e1;
                        AbstractC34132o.m107864I(objM35126n);
                        objM107888l = (ConsumerSessionLookup) objM35126n;
                    }
                }
                return enumC31071a;
            } catch (Throwable th3) {
                th = th3;
                c38719e0 = this;
                objM107888l = AbstractC34132o.m107888l(th);
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    if (str != null) {
                        str10 = "lookup";
                    } else {
                        str10 = "lookupByAuthIntent";
                    }
                    c38719e0.m124145f(str10, thM68037a);
                }
                return objM107888l;
            }
        }
        if (i14 == 1) {
            c38719e2 = c38711a1.f166616H;
            List list3 = c38711a1.f166615G;
            String str13 = c38711a1.f166614F;
            String str14 = c38711a1.f166613E;
            String str15 = c38711a1.f166623z;
            EnumC38796c2 enumC38796c4 = c38711a1.f166622y;
            str7 = c38711a1.f166621x;
            C38719e0 c38719e3 = c38711a1.f166620w;
            try {
                AbstractC34132o.m107864I(obj);
                objM105908c = ((C23468n) obj).f92940w;
                str6 = str13;
                enumC38796c3 = enumC38796c4;
                list2 = list3;
                c38719e1 = c38719e3;
                str8 = str14;
                str5 = str15;
                try {
                    AbstractC34132o.m107864I(objM105908c);
                    String str16 = (String) objM105908c;
                    C12500w c12500w2 = c38719e2.f166655b;
                    String str17 = c38719e2.f166659f;
                    c38711a1.f166620w = c38719e1;
                    c38711a1.f166621x = str7;
                    c38711a1.f166622y = null;
                    c38711a1.f166623z = null;
                    c38711a1.f166613E = null;
                    c38711a1.f166614F = null;
                    c38711a1.f166615G = null;
                    c38711a1.f166616H = null;
                    c38711a1.f166619K = 2;
                    str9 = str7;
                    try {
                        objM35126n = c12500w2.m35126n(str9, enumC38796c3, str5, str16, str17, str6, str8, list2, null, c38711a1);
                        if (objM35126n != enumC31071a) {
                            str = str9;
                            c38719e0 = c38719e1;
                            AbstractC34132o.m107864I(objM35126n);
                            objM107888l = (ConsumerSessionLookup) objM35126n;
                        }
                        return enumC31071a;
                    } catch (Throwable th4) {
                        th = th4;
                        str = str9;
                        c38719e0 = c38719e1;
                        objM107888l = AbstractC34132o.m107888l(th);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    str9 = str7;
                }
            } catch (Throwable th6) {
                th = th6;
                str = str7;
                c38719e0 = c38719e3;
                objM107888l = AbstractC34132o.m107888l(th);
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    if (str != null) {
                        str10 = "lookup";
                    } else {
                        str10 = "lookupByAuthIntent";
                    }
                    c38719e0.m124145f(str10, thM68037a);
                }
                return objM107888l;
            }
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c38711a1.f166621x;
            c38719e0 = c38711a1.f166620w;
            try {
                AbstractC34132o.m107864I(obj);
                objM35126n = ((C23468n) obj).f92940w;
                AbstractC34132o.m107864I(objM35126n);
                objM107888l = (ConsumerSessionLookup) objM35126n;
            } catch (Throwable th7) {
                th = th7;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        }
        thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            if (str != null) {
                str10 = "lookup";
            } else {
                str10 = "lookupByAuthIntent";
            }
            c38719e0.m124145f(str10, thM68037a);
        }
        return objM107888l;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b3 A[Catch: all -> 0x00e5, TryCatch #1 {all -> 0x00e5, blocks: (B:30:0x0095, B:32:0x00b3, B:34:0x00b9), top: B:51:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: d */
    public final Object m124143d(String str, String str2, String str3, String str4, String str5, EnumC21098e0 enumC21098e0, AbstractC32269c abstractC32269c) {
        C38713b0 c38713b0;
        C38719e0 c38719e0;
        String str6;
        String str7;
        String str8;
        String str9;
        EnumC21098e0 enumC21098e1;
        Object objM105908c;
        C38719e0 c38719e1;
        String str10;
        C38719e0 c38719e2;
        InterfaceC38802c8 interfaceC38802c8;
        Long l7;
        Object objM35127o;
        Object objM107888l;
        Throwable thM68037a;
        if (abstractC32269c instanceof C38713b0) {
            c38713b0 = (C38713b0) abstractC32269c;
            int i13 = c38713b0.f166633K;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38713b0.f166633K = i13 - Integer.MIN_VALUE;
            } else {
                c38713b0 = new C38713b0(this, abstractC32269c);
            }
        } else {
            c38713b0 = new C38713b0(this, abstractC32269c);
        }
        C38713b0 c38713b1 = c38713b0;
        Object obj = c38713b1.f166631I;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38713b1.f166633K;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                C33536f c33536f = this.f166656c;
                c38713b1.f166634w = this;
                c38713b1.f166635x = str;
                str6 = str2;
                c38713b1.f166636y = str6;
                str7 = str3;
                c38713b1.f166637z = str7;
                str8 = str4;
                c38713b1.f166627E = str8;
                str9 = str5;
                c38713b1.f166628F = str9;
                enumC21098e1 = enumC21098e0;
                c38713b1.f166629G = enumC21098e1;
                c38713b1.f166630H = this;
                c38713b1.f166633K = 1;
                objM105908c = c33536f.m105908c(c38713b1);
                if (objM105908c != enumC31071a) {
                    c38719e1 = this;
                    str10 = str;
                    c38719e2 = c38719e1;
                    AbstractC34132o.m107864I(objM105908c);
                    String str11 = (String) objM105908c;
                    C12500w c12500w = c38719e2.f166655b;
                    C37718g0 c37718g0 = c38719e2.f166658e;
                    EnumC38884l0 enumC38884l0M124140a = m124140a(enumC21098e1);
                    String str12 = c38719e2.f166659f;
                    interfaceC38802c8 = c37718g0.f161636w;
                    AbstractC22676k.m65750j(interfaceC38802c8, "<this>");
                    if (interfaceC38802c8 instanceof C38887l3) {
                        l7 = ((C38887l3) interfaceC38802c8).f167393y;
                    } else {
                        l7 = null;
                    }
                    String strM109981P = AbstractC34870c0.m109981P(c37718g0.f161636w);
                    c38713b1.f166634w = c38719e1;
                    c38713b1.f166635x = null;
                    c38713b1.f166636y = null;
                    c38713b1.f166637z = null;
                    c38713b1.f166627E = null;
                    c38713b1.f166628F = null;
                    c38713b1.f166629G = null;
                    c38713b1.f166630H = null;
                    c38713b1.f166633K = 2;
                    objM35127o = c12500w.m35127o(str9, str10, str6, str7, str8, enumC38884l0M124140a, l7, strM109981P, str11, str12, c38713b1);
                    if (objM35127o != enumC31071a) {
                        c38719e0 = c38719e1;
                        AbstractC34132o.m107864I(objM35127o);
                        objM107888l = (ConsumerSessionSignup) objM35127o;
                    }
                }
                return enumC31071a;
            } catch (Throwable th3) {
                th = th3;
                c38719e0 = this;
                objM107888l = AbstractC34132o.m107888l(th);
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    c38719e0.m124145f("signup", thM68037a);
                }
                return objM107888l;
            }
        }
        if (i14 == 1) {
            c38719e2 = c38713b1.f166630H;
            EnumC21098e0 enumC21098e2 = c38713b1.f166629G;
            String str13 = c38713b1.f166628F;
            String str14 = c38713b1.f166627E;
            String str15 = c38713b1.f166637z;
            String str16 = c38713b1.f166636y;
            String str17 = c38713b1.f166635x;
            C38719e0 c38719e3 = c38713b1.f166634w;
            try {
                AbstractC34132o.m107864I(obj);
                objM105908c = ((C23468n) obj).f92940w;
                enumC21098e1 = enumC21098e2;
                str10 = str17;
                str9 = str13;
                str6 = str16;
                str8 = str14;
                str7 = str15;
                c38719e1 = c38719e3;
                try {
                    AbstractC34132o.m107864I(objM105908c);
                    String str18 = (String) objM105908c;
                    C12500w c12500w2 = c38719e2.f166655b;
                    C37718g0 c37718g1 = c38719e2.f166658e;
                    EnumC38884l0 enumC38884l0M124140a2 = m124140a(enumC21098e1);
                    String str19 = c38719e2.f166659f;
                    interfaceC38802c8 = c37718g1.f161636w;
                    AbstractC22676k.m65750j(interfaceC38802c8, "<this>");
                    if (interfaceC38802c8 instanceof C38887l3) {
                        l7 = ((C38887l3) interfaceC38802c8).f167393y;
                    } else {
                        l7 = null;
                    }
                    String strM109981P2 = AbstractC34870c0.m109981P(c37718g1.f161636w);
                    c38713b1.f166634w = c38719e1;
                    c38713b1.f166635x = null;
                    c38713b1.f166636y = null;
                    c38713b1.f166637z = null;
                    c38713b1.f166627E = null;
                    c38713b1.f166628F = null;
                    c38713b1.f166629G = null;
                    c38713b1.f166630H = null;
                    c38713b1.f166633K = 2;
                    objM35127o = c12500w2.m35127o(str9, str10, str6, str7, str8, enumC38884l0M124140a2, l7, strM109981P2, str18, str19, c38713b1);
                    if (objM35127o != enumC31071a) {
                        c38719e0 = c38719e1;
                        AbstractC34132o.m107864I(objM35127o);
                        objM107888l = (ConsumerSessionSignup) objM35127o;
                    }
                    return enumC31071a;
                } catch (Throwable th4) {
                    th = th4;
                    c38719e0 = c38719e1;
                    objM107888l = AbstractC34132o.m107888l(th);
                }
            } catch (Throwable th5) {
                th = th5;
                c38719e0 = c38719e3;
                objM107888l = AbstractC34132o.m107888l(th);
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    c38719e0.m124145f("signup", thM68037a);
                }
                return objM107888l;
            }
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c38719e0 = c38713b1.f166634w;
            try {
                AbstractC34132o.m107864I(obj);
                objM35127o = ((C23468n) obj).f92940w;
                AbstractC34132o.m107864I(objM35127o);
                objM107888l = (ConsumerSessionSignup) objM35127o;
            } catch (Throwable th6) {
                th = th6;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        }
        thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            c38719e0.m124145f("signup", thM68037a);
        }
        return objM107888l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m124144e(String str, List list, AbstractC32269c abstractC32269c) {
        C38715c0 c38715c0;
        if (abstractC32269c instanceof C38715c0) {
            c38715c0 = (C38715c0) abstractC32269c;
            int i13 = c38715c0.f166644y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38715c0.f166644y = i13 - Integer.MIN_VALUE;
            } else {
                c38715c0 = new C38715c0(this, abstractC32269c);
            }
        } else {
            c38715c0 = new C38715c0(this, abstractC32269c);
        }
        Object obj = c38715c0.f166642w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38715c0.f166644y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        c38715c0.f166644y = 1;
        Object objM35129q = this.f166655b.m35129q(this.f166659f, str, list, c38715c0);
        return objM35129q == enumC31071a ? enumC31071a : objM35129q;
    }

    /* JADX INFO: renamed from: f */
    public final void m124145f(String str, Throwable th3) {
        EnumC2323c enumC2323c;
        if (AbstractC32100b.m99867p(th3)) {
            enumC2323c = EnumC2323c.LINK_NATIVE_FAILED_TO_ATTEST_REQUEST;
        } else if (!(th3 instanceof AttestationError)) {
            return;
        } else {
            enumC2323c = EnumC2323c.LINK_NATIVE_FAILED_TO_GET_INTEGRITY_TOKEN;
        }
        this.f166657d.m7175a(enumC2323c, new LinkEventException(th3), AbstractC31061c.m95645u("operation", str));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: g */
    public final Object m124146g(String str, String str2, String str3, String str4, String str5, EnumC21098e0 enumC21098e0, AbstractC32269c abstractC32269c) {
        C38717d0 c38717d0;
        if (abstractC32269c instanceof C38717d0) {
            c38717d0 = (C38717d0) abstractC32269c;
            int i13 = c38717d0.f166650y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38717d0.f166650y = i13 - Integer.MIN_VALUE;
            } else {
                c38717d0 = new C38717d0(this, abstractC32269c);
            }
        } else {
            c38717d0 = new C38717d0(this, abstractC32269c);
        }
        C38717d0 c38717d1 = c38717d0;
        Object obj = c38717d1.f166648w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c38717d1.f166650y;
        if (i14 != 0) {
            if (i14 != 1 && i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        if (this.f166654a.m6860a()) {
            c38717d1.f166650y = 1;
            Object objM124143d = m124143d(str, str2, str3, str4, str5, enumC21098e0, c38717d1);
            if (objM124143d != obj2) {
                return objM124143d;
            }
        } else {
            EnumC38884l0 enumC38884l0M124140a = m124140a(enumC21098e0);
            c38717d1.f166650y = 2;
            Object objM35116d = this.f166655b.m35116d(str, str2, str3, str4, str5, enumC38884l0M124140a, c38717d1);
            if (objM35116d != obj2) {
                return objM35116d;
            }
        }
        return obj2;
    }
}
