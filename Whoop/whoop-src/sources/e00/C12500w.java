package e00;

import a30.C0319q;
import android.app.Application;
import androidx.room.C1845y0;
import b10.C2273z0;
import b10.EnumC2228d;
import b10.InterfaceC2227c1;
import b20.C2326f;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import com.stripe.android.model.ConsumerSession;
import cz.C11194d;
import g30.C15296g;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import l83.C23468n;
import p003a1.C0109h;
import p026b2.C2319y;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p508ty.C34247a;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.AbstractC38963t7;
import y00.C38809d5;
import y00.C38854i0;
import y00.C38901n;
import y00.EnumC38796c2;
import y00.EnumC38872j8;
import y00.EnumC38884l0;
import y00.EnumC38922p2;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: e00.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C12500w {

    /* JADX INFO: renamed from: a */
    public final EnumC2228d f42684a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4339a f42685b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4339a f42686c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2227c1 f42687d;

    /* JADX INFO: renamed from: e */
    public final C15296g f42688e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC30063j f42689f;

    /* JADX INFO: renamed from: g */
    public final Locale f42690g;

    /* JADX INFO: renamed from: h */
    public final C2326f f42691h;

    /* JADX INFO: renamed from: i */
    public final C34247a f42692i;

    public C12500w(Application application, EnumC2228d requestSurface, InterfaceC4339a publishableKeyProvider, InterfaceC4339a stripeAccountIdProvider, InterfaceC2227c1 stripeRepository, C15296g consumersApiService, InterfaceC30063j workContext, Locale locale, C2326f errorReporter) {
        AbstractC22676k.m65750j(application, "application");
        AbstractC22676k.m65750j(requestSurface, "requestSurface");
        AbstractC22676k.m65750j(publishableKeyProvider, "publishableKeyProvider");
        AbstractC22676k.m65750j(stripeAccountIdProvider, "stripeAccountIdProvider");
        AbstractC22676k.m65750j(stripeRepository, "stripeRepository");
        AbstractC22676k.m65750j(consumersApiService, "consumersApiService");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        this.f42684a = requestSurface;
        this.f42685b = publishableKeyProvider;
        this.f42686c = stripeAccountIdProvider;
        this.f42687d = stripeRepository;
        this.f42688e = consumersApiService;
        this.f42689f = workContext;
        this.f42690g = locale;
        this.f42691h = errorReporter;
        C34247a c34247aM100021a = AbstractC32123d.m100021a(application, workContext);
        this.f42692i = c34247aM100021a;
        c34247aM100021a.m108290b();
    }

    /* JADX INFO: renamed from: a */
    public static final Map m35113a(C12500w c12500w, C38901n c38901n) {
        return AbstractC38963t7.m124385o("client_attribution_metadata", c38901n.mo124325c0());
    }

    /* JADX INFO: renamed from: b */
    public final C39857f m35114b() {
        return new C39857f((String) this.f42685b.invoke(), (String) this.f42686c.invoke(), 4);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m35115c(String str, String str2, Boolean bool, AbstractC32269c abstractC32269c) {
        C12478a c12478a;
        if (abstractC32269c instanceof C12478a) {
            c12478a = (C12478a) abstractC32269c;
            int i13 = c12478a.f42600y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12478a.f42600y = i13 - Integer.MIN_VALUE;
            } else {
                c12478a = new C12478a(this, abstractC32269c);
            }
        } else {
            c12478a = new C12478a(this, abstractC32269c);
        }
        C12478a c12478a2 = c12478a;
        Object objM43401a = c12478a2.f42598w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12478a2.f42600y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM43401a);
                C15296g c15296g = this.f42688e;
                String str3 = this.f42684a.f8870w;
                EnumC38872j8[] enumC38872j8Arr = EnumC38872j8.f167319w;
                C39857f c39857fM35114b = m35114b();
                c12478a2.f42600y = 1;
                objM43401a = c15296g.m43401a(str2, str, str3, bool, c39857fM35114b, c12478a2);
                if (objM43401a == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM43401a);
            }
            if (objM43401a != null) {
                return (ConsumerSession) objM43401a;
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable th3) {
            return AbstractC34132o.m107888l(th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: d */
    public final Object m35116d(String str, String str2, String str3, String str4, String str5, EnumC38884l0 enumC38884l0, AbstractC32269c abstractC32269c) throws Throwable {
        C12479b c12479b;
        if (abstractC32269c instanceof C12479b) {
            c12479b = (C12479b) abstractC32269c;
            int i13 = c12479b.f42603y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12479b.f42603y = i13 - Integer.MIN_VALUE;
            } else {
                c12479b = new C12479b(this, abstractC32269c);
            }
        } else {
            c12479b = new C12479b(this, abstractC32269c);
        }
        C12479b c12479b2 = c12479b;
        Object objM8705K = c12479b2.f42601w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12479b2.f42603y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C12480c c12480c = new C12480c(this, str, str2, str3, str4, str5, enumC38884l0, null, 0);
            c12479b2.f42603y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f42689f, c12480c, c12479b2);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: e */
    public final Object m35117e(String str, String str2, String str3, C38901n c38901n, AbstractC32269c abstractC32269c) {
        C12481d c12481d;
        if (abstractC32269c instanceof C12481d) {
            c12481d = (C12481d) abstractC32269c;
            int i13 = c12481d.f42615y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12481d.f42615y = i13 - Integer.MIN_VALUE;
            } else {
                c12481d = new C12481d(this, abstractC32269c);
            }
        } else {
            c12481d = new C12481d(this, abstractC32269c);
        }
        C12481d c12481d2 = c12481d;
        Object objM8705K = c12481d2.f42613w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12481d2.f42615y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C11194d c11194d = new C11194d(this, str3, str, str2, c38901n, null, 4);
            c12481d2.f42615y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f42689f, c11194d, c12481d2);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m35118f(C38809d5 c38809d5, String str, String str2, C38901n c38901n, AbstractC32269c abstractC32269c) throws Throwable {
        C12482e c12482e;
        if (abstractC32269c instanceof C12482e) {
            c12482e = (C12482e) abstractC32269c;
            int i13 = c12482e.f42618y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12482e.f42618y = i13 - Integer.MIN_VALUE;
            } else {
                c12482e = new C12482e(this, abstractC32269c);
            }
        } else {
            c12482e = new C12482e(this, abstractC32269c);
        }
        C12482e c12482e2 = c12482e;
        Object objM8705K = c12482e2.f42616w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12482e2.f42618y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C12483f c12483f = new C12483f(this, str2, c38809d5, str, c38901n, (InterfaceC30057d) null);
            c12482e2.f42618y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f42689f, c12483f, c12482e2);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m35119g(String str, InterfaceC38802c8 interfaceC38802c8, EnumC38922p2 enumC38922p2, AbstractC32269c abstractC32269c) {
        C12484g c12484g;
        if (abstractC32269c instanceof C12484g) {
            c12484g = (C12484g) abstractC32269c;
            int i13 = c12484g.f42628y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12484g.f42628y = i13 - Integer.MIN_VALUE;
            } else {
                c12484g = new C12484g(this, abstractC32269c);
            }
        } else {
            c12484g = new C12484g(this, abstractC32269c);
        }
        C12484g c12484g2 = c12484g;
        Object obj = c12484g2.f42626w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12484g2.f42628y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        String clientSecret = interfaceC38802c8.getClientSecret();
        String str2 = this.f42684a.f8870w;
        C39857f c39857fM35114b = m35114b();
        c12484g2.f42628y = 1;
        Object objM43402b = this.f42688e.m43402b(str, clientSecret, enumC38922p2, str2, c39857fM35114b, c12484g2);
        return objM43402b == enumC31071a ? enumC31071a : objM43402b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m35120h(String str, String str2, AbstractC32269c abstractC32269c) {
        C12485h c12485h;
        if (abstractC32269c instanceof C12485h) {
            c12485h = (C12485h) abstractC32269c;
            int i13 = c12485h.f42631y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12485h.f42631y = i13 - Integer.MIN_VALUE;
            } else {
                c12485h = new C12485h(this, abstractC32269c);
            }
        } else {
            c12485h = new C12485h(this, abstractC32269c);
        }
        Object obj = c12485h.f42629w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12485h.f42631y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39857f c39857fM35114b = m35114b();
        c12485h.f42631y = 1;
        Object objM7097t = ((C2273z0) this.f42687d).m7097t(str2, str, c12485h, c39857fM35114b);
        return objM7097t == enumC31071a ? enumC31071a : objM7097t;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m35121i(Set set, String str, AbstractC32269c abstractC32269c) {
        C12486i c12486i;
        if (abstractC32269c instanceof C12486i) {
            c12486i = (C12486i) abstractC32269c;
            int i13 = c12486i.f42634y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12486i.f42634y = i13 - Integer.MIN_VALUE;
            } else {
                c12486i = new C12486i(this, abstractC32269c);
            }
        } else {
            c12486i = new C12486i(this, abstractC32269c);
        }
        Object obj = c12486i.f42632w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12486i.f42634y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39857f c39857fM35114b = m35114b();
        c12486i.f42634y = 1;
        Object objM7058D = ((C2273z0) this.f42687d).m7058D(str, set, c12486i, c39857fM35114b);
        return objM7058D == enumC31071a ? enumC31071a : objM7058D;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m35122j(String str, AbstractC32269c abstractC32269c) {
        C12487j c12487j;
        if (abstractC32269c instanceof C12487j) {
            c12487j = (C12487j) abstractC32269c;
            int i13 = c12487j.f42637y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12487j.f42637y = i13 - Integer.MIN_VALUE;
            } else {
                c12487j = new C12487j(this, abstractC32269c);
            }
        } else {
            c12487j = new C12487j(this, abstractC32269c);
        }
        Object obj = c12487j.f42635w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12487j.f42637y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39857f c39857fM35114b = m35114b();
        c12487j.f42637y = 1;
        Object objM7059E = ((C2273z0) this.f42687d).m7059E(str, c39857fM35114b, c12487j);
        return objM7059E == enumC31071a ? enumC31071a : objM7059E;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m35123k(String str, String str2, AbstractC32269c abstractC32269c) throws Throwable {
        C12488k c12488k;
        if (abstractC32269c instanceof C12488k) {
            c12488k = (C12488k) abstractC32269c;
            int i13 = c12488k.f42640y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12488k.f42640y = i13 - Integer.MIN_VALUE;
            } else {
                c12488k = new C12488k(this, abstractC32269c);
            }
        } else {
            c12488k = new C12488k(this, abstractC32269c);
        }
        Object objM8705K = c12488k.f42638w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12488k.f42640y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C0109h c0109h = new C0109h(this, str, str2, null, 16);
            c12488k.f42640y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f42689f, c0109h, c12488k);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: l */
    public final Object m35124l(String str, String str2, String str3, String str4, List list, AbstractC32269c abstractC32269c) throws Throwable {
        C12489l c12489l;
        if (abstractC32269c instanceof C12489l) {
            c12489l = (C12489l) abstractC32269c;
            int i13 = c12489l.f42643y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12489l.f42643y = i13 - Integer.MIN_VALUE;
            } else {
                c12489l = new C12489l(this, abstractC32269c);
            }
        } else {
            c12489l = new C12489l(this, abstractC32269c);
        }
        C12489l c12489l2 = c12489l;
        Object objM8705K = c12489l2.f42641w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12489l2.f42643y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C12480c c12480c = new C12480c(this, str, str2, str3, list, str4, null);
            c12489l2.f42643y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f42689f, c12480c, c12489l2);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m35125m(String str, String str2, AbstractC32269c abstractC32269c) throws Throwable {
        C12490m c12490m;
        if (abstractC32269c instanceof C12490m) {
            c12490m = (C12490m) abstractC32269c;
            int i13 = c12490m.f42646y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12490m.f42646y = i13 - Integer.MIN_VALUE;
            } else {
                c12490m = new C12490m(this, abstractC32269c);
            }
        } else {
            c12490m = new C12490m(this, abstractC32269c);
        }
        Object objM8705K = c12490m.f42644w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12490m.f42646y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C2319y c2319y = new C2319y(this, str, str2, null, 3);
            c12490m.f42646y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f42689f, c2319y, c12490m);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: n */
    public final Object m35126n(String str, EnumC38796c2 enumC38796c2, String str2, String str3, String str4, String str5, String str6, List list, String str7, AbstractC32269c abstractC32269c) throws Throwable {
        C12491n c12491n;
        if (abstractC32269c instanceof C12491n) {
            c12491n = (C12491n) abstractC32269c;
            int i13 = c12491n.f42649y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12491n.f42649y = i13 - Integer.MIN_VALUE;
            } else {
                c12491n = new C12491n(this, abstractC32269c);
            }
        } else {
            c12491n = new C12491n(this, abstractC32269c);
        }
        C12491n c12491n2 = c12491n;
        Object objM8705K = c12491n2.f42647w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12491n2.f42649y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C12492o c12492o = new C12492o(this, str, enumC38796c2, str2, str3, str4, list, str5, str6, str7, null);
            c12491n2.f42649y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f42689f, c12492o, c12491n2);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: o */
    public final Object m35127o(String str, String str2, String str3, String str4, String str5, EnumC38884l0 enumC38884l0, Long l7, String str6, String str7, String str8, AbstractC32269c abstractC32269c) throws Throwable {
        C12493p c12493p;
        if (abstractC32269c instanceof C12493p) {
            c12493p = (C12493p) abstractC32269c;
            int i13 = c12493p.f42665y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12493p.f42665y = i13 - Integer.MIN_VALUE;
            } else {
                c12493p = new C12493p(this, abstractC32269c);
            }
        } else {
            c12493p = new C12493p(this, abstractC32269c);
        }
        C12493p c12493p2 = c12493p;
        Object objM8705K = c12493p2.f42663w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12493p2.f42665y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C12492o c12492o = new C12492o(this, str2, str3, str4, str5, str, l7, str6, enumC38884l0, str7, str8, null);
            c12493p2.f42665y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f42689f, c12492o, c12493p2);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m35128p(String str, boolean z4, AbstractC32269c abstractC32269c) {
        C12494q c12494q;
        if (abstractC32269c instanceof C12494q) {
            c12494q = (C12494q) abstractC32269c;
            int i13 = c12494q.f42668y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12494q.f42668y = i13 - Integer.MIN_VALUE;
            } else {
                c12494q = new C12494q(this, abstractC32269c);
            }
        } else {
            c12494q = new C12494q(this, abstractC32269c);
        }
        Object objM8705K = c12494q.f42666w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12494q.f42668y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C1845y0 c1845y0 = new C1845y0(this, str, z4, (InterfaceC30057d) null);
            c12494q.f42668y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f42689f, c1845y0, c12494q);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m35129q(String str, String str2, List list, AbstractC32269c abstractC32269c) throws Throwable {
        C12495r c12495r;
        if (abstractC32269c instanceof C12495r) {
            c12495r = (C12495r) abstractC32269c;
            int i13 = c12495r.f42671y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12495r.f42671y = i13 - Integer.MIN_VALUE;
            } else {
                c12495r = new C12495r(this, abstractC32269c);
            }
        } else {
            c12495r = new C12495r(this, abstractC32269c);
        }
        Object objM8705K = c12495r.f42669w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12495r.f42671y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C11194d c11194d = new C11194d(this, str, str2, list, (InterfaceC30057d) null, 5);
            c12495r.f42671y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f42689f, c11194d, c12495r);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: r */
    public final Object m35130r(C38809d5 c38809d5, String str, String str2, C38901n c38901n, AbstractC32269c abstractC32269c) throws Throwable {
        C12496s c12496s;
        if (abstractC32269c instanceof C12496s) {
            c12496s = (C12496s) abstractC32269c;
            int i13 = c12496s.f42674y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12496s.f42674y = i13 - Integer.MIN_VALUE;
            } else {
                c12496s = new C12496s(this, abstractC32269c);
            }
        } else {
            c12496s = new C12496s(this, abstractC32269c);
        }
        C12496s c12496s2 = c12496s;
        Object objM8705K = c12496s2.f42672w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12496s2.f42674y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C12483f c12483f = new C12483f(c38809d5, this, c38901n, str2, str, (InterfaceC30057d) null);
            c12496s2.f42674y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f42689f, c12483f, c12496s2);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: s */
    public final Object m35131s(String str, String str2, String str3, String str4, String str5, String str6, C38901n c38901n, AbstractC32269c abstractC32269c) throws Throwable {
        C12497t c12497t;
        if (abstractC32269c instanceof C12497t) {
            c12497t = (C12497t) abstractC32269c;
            int i13 = c12497t.f42677y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12497t.f42677y = i13 - Integer.MIN_VALUE;
            } else {
                c12497t = new C12497t(this, abstractC32269c);
            }
        } else {
            c12497t = new C12497t(this, abstractC32269c);
        }
        C12497t c12497t2 = c12497t;
        Object objM8705K = c12497t2.f42675w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12497t2.f42677y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C0319q c0319q = new C0319q(this, str5, str6, c38901n, str, str2, str3, str4, (InterfaceC30057d) null);
            c12497t2.f42677y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f42689f, c0319q, c12497t2);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: t */
    public final Object m35132t(String str, boolean z4, AbstractC32269c abstractC32269c) {
        C12498u c12498u;
        if (abstractC32269c instanceof C12498u) {
            c12498u = (C12498u) abstractC32269c;
            int i13 = c12498u.f42680y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12498u.f42680y = i13 - Integer.MIN_VALUE;
            } else {
                c12498u = new C12498u(this, abstractC32269c);
            }
        } else {
            c12498u = new C12498u(this, abstractC32269c);
        }
        C12498u c12498u2 = c12498u;
        Object objM43411k = c12498u2.f42678w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12498u2.f42680y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM43411k);
                C15296g c15296g = this.f42688e;
                Locale locale = this.f42690g;
                if (locale == null) {
                    locale = Locale.US;
                }
                Locale locale2 = locale;
                AbstractC22676k.m65747g(locale2);
                String str2 = this.f42684a.f8870w;
                EnumC38872j8[] enumC38872j8Arr = EnumC38872j8.f167319w;
                C39857f c39857fM35114b = m35114b();
                c12498u2.f42680y = 1;
                objM43411k = c15296g.m43411k(str, locale2, str2, c39857fM35114b, z4, c12498u2);
                if (objM43411k == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM43411k);
            }
            if (objM43411k != null) {
                return (ConsumerSession) objM43411k;
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable th3) {
            return AbstractC34132o.m107888l(th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m35133u(C38854i0 c38854i0, String str, AbstractC32269c abstractC32269c) {
        C12499v c12499v;
        if (abstractC32269c instanceof C12499v) {
            c12499v = (C12499v) abstractC32269c;
            int i13 = c12499v.f42683y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12499v.f42683y = i13 - Integer.MIN_VALUE;
            } else {
                c12499v = new C12499v(this, abstractC32269c);
            }
        } else {
            c12499v = new C12499v(this, abstractC32269c);
        }
        Object obj = c12499v.f42681w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12499v.f42683y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C39857f c39857fM35114b = m35114b();
        c12499v.f42683y = 1;
        Object objM7077W = ((C2273z0) this.f42687d).m7077W(str, c38854i0, c39857fM35114b, c12499v);
        return objM7077W == enumC31071a ? enumC31071a : objM7077W;
    }
}
