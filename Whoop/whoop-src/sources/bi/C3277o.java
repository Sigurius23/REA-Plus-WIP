package bi;

import a30.C0323s;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import c93.InterfaceC4351m;
import ci.C4723a;
import com.squareup.wire.AbstractC5583n;
import f93.C14289a;
import fi.C14509o;
import fi.EnumC14496b;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l83.C23454a0;
import l83.C23470p;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import ne3.C26616h;
import ne3.C26617h0;
import ne3.C26621j0;
import ne3.C26622k;
import ne3.C26624l;
import ne3.InterfaceC26620j;
import p000.C12473e;
import p031b9.C2817b;
import p088dc.AbstractC11895b;
import p118ei.C13215b;
import p319m4.AbstractC25012a;
import p461rh.AbstractC31426o;
import p477s2.AbstractC32072d;
import p505ts.AbstractC34132o;
import p523uh.C34962h;
import p523uh.InterfaceC34960f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import se.AbstractC32410a;
import sh.C32490p;
import sh.EnumC32482h;
import th.C33804b;
import th.C33805c;
import th.C33807e;
import th.C33808f;
import th.C33809g;
import th.C33810h;
import th.InterfaceC33803a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: bi.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C3277o implements InterfaceC34960f {

    /* JADX INFO: renamed from: a */
    public final String f12797a;

    /* JADX INFO: renamed from: b */
    public final C14509o f12798b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC23462h f12799c;

    /* JADX INFO: renamed from: d */
    public final C23470p f12800d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC23462h f12801e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3267e f12802f;

    public C3277o(String str, C14509o c14509o, C23470p c23470p, C23470p c23470p2, C23470p c23470p3, InterfaceC3267e interfaceC3267e) {
        this.f12797a = str;
        this.f12798b = c14509o;
        this.f12799c = c23470p;
        this.f12800d = c23470p2;
        this.f12801e = c23470p3;
        this.f12802f = interfaceC3267e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m9537b(C3277o c3277o, C3282t c3282t, AbstractC32269c abstractC32269c) {
        C3275m c3275m;
        C26616h c26616h;
        if (abstractC32269c instanceof C3275m) {
            c3275m = (C3275m) abstractC32269c;
            int i13 = c3275m.f12786E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3275m.f12786E = i13 - Integer.MIN_VALUE;
            } else {
                c3275m = new C3275m(c3277o, abstractC32269c);
            }
        } else {
            c3275m = new C3275m(c3277o, abstractC32269c);
        }
        Object obj = c3275m.f12789y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3275m.f12786E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c26616h = new C26616h();
            c3275m.f12787w = c3277o;
            c3275m.f12788x = c26616h;
            c3275m.f12786E = 1;
            c3282t.f12816w.mo79190P0(c26616h);
            if (C23454a0.f92919a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C26616h c26616h2 = c3275m.f12788x;
            C3277o c3277o2 = c3275m.f12787w;
            AbstractC34132o.m107864I(obj);
            c26616h = c26616h2;
            c3277o = c3277o2;
        }
        return AbstractC32072d.m99699h(c26616h, c3277o.m9542e());
    }

    /* JADX WARN: Code duplicated, block: B:112:0x022b A[Catch: Exception -> 0x004b, TryCatch #4 {Exception -> 0x004b, blocks: (B:13:0x0044, B:107:0x0212, B:108:0x021a, B:110:0x0228, B:112:0x022b, B:116:0x0236, B:117:0x0237, B:109:0x021b), top: B:144:0x0044, inners: #10 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0232  */
    /* JADX WARN: Code duplicated, block: B:132:0x0252  */
    /* JADX WARN: Code duplicated, block: B:147:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x024c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0242 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0198  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX INFO: renamed from: c */
    public static final Object m9538c(C3277o c3277o, C33809g c33809g, C3281s c3281s, C3281s c3281s2, AbstractC32269c abstractC32269c) throws Exception {
        C3276n c3276n;
        C3277o c3277o2;
        C33808f c33808f;
        C3281s c3281s3;
        ?? th3;
        ?? th4;
        C2817b c2817bM106966h;
        C3282t c3282t;
        C3282t c3282t2;
        C2817b c2817b;
        C33807e c33807e;
        C33805c c33805cM106967i;
        C33809g c33809g2 = c33809g;
        C3281s c3281s4 = c3281s2;
        c3277o.getClass();
        if (abstractC32269c instanceof C3276n) {
            c3276n = (C3276n) abstractC32269c;
            int i13 = c3276n.f12792F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3276n.f12792F = i13 - Integer.MIN_VALUE;
            } else {
                c3276n = new C3276n(c3277o, abstractC32269c);
            }
        } else {
            c3276n = new C3276n(c3277o, abstractC32269c);
        }
        Object c3264b = c3276n.f12796z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3276n.f12792F;
        C33808f c33808f2 = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(c3264b);
            if (!c3277o.f12798b.f53010h.f52929x) {
                if (c33809g2 != null) {
                    try {
                        AbstractC25012a.m73390w(c33809g2);
                        return null;
                    } catch (RuntimeException e5) {
                        throw e5;
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
            InterfaceC3265c interfaceC3265c = (InterfaceC3265c) c3277o.f12801e.getValue();
            c3276n.f12793w = c3277o;
            c3276n.f12794x = c33809g2;
            c3276n.f12795y = c3281s4;
            c3276n.f12792F = 1;
            ((C4723a) interfaceC3265c).getClass();
            if (c3281s4.f12810a != 304 || c3281s == null) {
                c3264b = new C3264b(c3281s4);
            } else {
                C3279q c3279q = c3281s.f12813d;
                C3279q c3279q2 = c3281s4.f12813d;
                c3279q.getClass();
                Map map = c3279q.f12805a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), AbstractC25265s.m74097F1((Collection) entry.getValue()));
                }
                for (Map.Entry entry2 : c3279q2.f12805a.entrySet()) {
                    String str = (String) entry2.getKey();
                    List list = (List) entry2.getValue();
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                    linkedHashMap.put(lowerCase, AbstractC25265s.m74097F1(list));
                }
                c3264b = new C3264b(new C3281s(c3281s4.f12810a, c3281s4.f12811b, c3281s4.f12812c, new C3279q(AbstractC25247g0.m74001j0(linkedHashMap)), null, c3281s4.f12815f));
            }
            if (c3264b == enumC31071a) {
                return enumC31071a;
            }
            c3277o2 = c3277o;
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c33808f = (C33808f) c3276n.f12795y;
                c3281s3 = (C3281s) c3276n.f12794x;
                c3281s4 = (C3281s) c3276n.f12793w;
                try {
                    AbstractC34132o.m107864I(c3264b);
                    c33808f2 = null;
                    c2817b = c33808f.f141609a;
                    c33807e = (C33807e) c2817b.f11021E;
                    synchronized (c33807e.f141595H) {
                        c2817b.m8007f(true);
                        c33805cM106967i = c33807e.m106967i(((C33804b) c2817b.f11024y).f141579a);
                    }
                    return c33805cM106967i != null ? new C33809g(c33805cM106967i) : c33808f2;
                } catch (Exception e13) {
                    e = e13;
                    try {
                        c33808f.f141609a.m8007f(false);
                    } catch (Exception unused2) {
                    }
                    c3282t = c3281s4.f12814e;
                    if (c3282t != null) {
                        try {
                            AbstractC25012a.m73390w(c3282t);
                        } catch (RuntimeException e14) {
                            throw e14;
                        } catch (Exception unused3) {
                        }
                    }
                    c3282t2 = c3281s3.f12814e;
                    if (c3282t2 != null) {
                        throw e;
                    }
                    try {
                        AbstractC25012a.m73390w(c3282t2);
                        throw e;
                    } catch (RuntimeException e15) {
                        throw e15;
                    } catch (Exception unused4) {
                        throw e;
                    }
                }
            }
            C3281s c3281s5 = (C3281s) c3276n.f12795y;
            c33809g2 = (C33809g) c3276n.f12794x;
            c3277o2 = (C3277o) c3276n.f12793w;
            AbstractC34132o.m107864I(c3264b);
            c3281s4 = c3281s5;
            c33808f2 = null;
        }
        C3281s c3281s6 = ((C3264b) c3264b).f12764a;
        if (c3281s6 == null) {
            return c33808f2;
        }
        if (c33809g2 != null) {
            C33805c c33805c = c33809g2.f141610w;
            C33807e c33807e2 = c33805c.f141590y;
            synchronized (c33807e2.f141595H) {
                c33805c.close();
                c2817bM106966h = c33807e2.m106966h(c33805c.f141588w.f141579a);
            }
            if (c2817bM106966h != null) {
                c33808f = new C33808f(c2817bM106966h);
            } else {
                c33808f = c33808f2;
            }
        } else {
            InterfaceC33803a interfaceC33803a = (InterfaceC33803a) c3277o2.f12800d.getValue();
            if (interfaceC33803a == null) {
                c33808f = c33808f2;
            } else {
                String str2 = c3277o2.f12798b.f53007e;
                if (str2 == null) {
                    str2 = c3277o2.f12797a;
                }
                C33807e c33807e3 = ((C33810h) interfaceC33803a).f141612b;
                C26622k c26622k = C26624l.f105882z;
                C2817b c2817bM106966h2 = c33807e3.m106966h(C26622k.m79241b(str2).mo79252c("SHA-256").mo79254e());
                if (c2817bM106966h2 != null) {
                    c33808f = new C33808f(c2817bM106966h2);
                } else {
                    c33808f = c33808f2;
                }
            }
        }
        if (c33808f == null) {
            return c33808f2;
        }
        try {
            C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(c3277o2.m9542e().mo37080p0(c33808f.f141609a.m8010k(0), false));
            try {
                AbstractC32410a.m101041l0(c3281s6, c26617h0M79157b);
                try {
                    c26617h0M79157b.close();
                    th3 = c33808f2;
                } catch (Throwable th5) {
                    th3 = th5;
                }
            } catch (Throwable th6) {
                try {
                    c26617h0M79157b.close();
                } catch (Throwable th7) {
                    AbstractC29125c.m88530g(th6, th7);
                }
                th3 = th6;
            }
            if (th3 != 0) {
                throw th3;
            }
            C3282t c3282t3 = c3281s6.f12814e;
            if (c3282t3 != null) {
                AbstractC26632p abstractC26632pM9542e = c3277o2.m9542e();
                C26611e0 c26611e0M8010k = c33808f.f141609a.m8010k(1);
                c3276n.f12793w = c3281s4;
                c3276n.f12794x = c3281s6;
                c3276n.f12795y = c33808f;
                c3276n.f12792F = 2;
                InterfaceC26620j interfaceC26620j = c3282t3.f12816w;
                C26617h0 c26617h0M79157b2 = AbstractC26604b.m79157b(abstractC26632pM9542e.mo37080p0(c26611e0M8010k, false));
                try {
                    new Long(interfaceC26620j.mo79190P0(c26617h0M79157b2));
                    try {
                        c26617h0M79157b2.close();
                        th4 = c33808f2;
                    } catch (Throwable th8) {
                        th4 = th8;
                    }
                } catch (Throwable th9) {
                    try {
                        c26617h0M79157b2.close();
                    } catch (Throwable th10) {
                        AbstractC29125c.m88530g(th9, th10);
                    }
                    th4 = th9;
                }
                if (th4 != 0) {
                    throw th4;
                }
                if (C23454a0.f92919a == enumC31071a) {
                    return enumC31071a;
                }
            }
            c3281s3 = c3281s6;
            c2817b = c33808f.f141609a;
            c33807e = (C33807e) c2817b.f11021E;
            synchronized (c33807e.f141595H) {
                c2817b.m8007f(true);
                c33805cM106967i = c33807e.m106967i(((C33804b) c2817b.f11024y).f141579a);
                if (c33805cM106967i != null) {
                }
            }
        } catch (Exception e16) {
            e = e16;
            c3281s3 = c3281s6;
            c33808f.f141609a.m8007f(false);
            c3282t = c3281s4.f12814e;
            if (c3282t != null) {
                AbstractC25012a.m73390w(c3282t);
            }
            c3282t2 = c3281s3.f12814e;
            if (c3282t2 != null) {
                throw e;
            }
            AbstractC25012a.m73390w(c3282t2);
            throw e;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m9539f(String str, String str2) {
        String strM16751K;
        if ((str2 == null || AbstractC39421y.m125930O(str2, MimeType.MIME_TYPE_TXT, false)) && (strM16751K = AbstractC5583n.m16751K(str)) != null) {
            return strM16751K;
        }
        if (str2 != null) {
            return AbstractC39414r.m125862H0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:73:0x0173  */
    /* JADX WARN: Code duplicated, block: B:76:0x0179 A[Catch: Exception -> 0x004d, TRY_LEAVE, TryCatch #2 {Exception -> 0x004d, blocks: (B:21:0x0048, B:74:0x0175, B:76:0x0179), top: B:96:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0191  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a5  */
    @Override // p523uh.InterfaceC34960f
    /* JADX INFO: renamed from: a */
    public final Object mo9540a(InterfaceC30057d interfaceC30057d) throws Exception {
        C3274l c3274l;
        C33809g c33809g;
        C22669g0 c22669g0;
        C22669g0 c22669g1;
        C3277o c3277o;
        C22669g0 c22669g2;
        C22669g0 c22669g3;
        C3277o c3277o2;
        InterfaceC33803a interfaceC33803a;
        Exception exc;
        C22669g0 c22669g4;
        C3277o c3277o3;
        C34962h c34962h;
        C33809g c33809g2;
        if (interfaceC30057d instanceof C3274l) {
            c3274l = (C3274l) interfaceC30057d;
            int i13 = c3274l.f12781F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3274l.f12781F = i13 - Integer.MIN_VALUE;
            } else {
                c3274l = new C3274l(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c3274l = new C3274l(this, (AbstractC32269c) interfaceC30057d);
        }
        Object objM9541d = c3274l.f12785z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3274l.f12781F;
        InterfaceC30057d interfaceC30057d2 = null;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(objM9541d);
            C14509o c14509o = this.f12798b;
            boolean z4 = c14509o.f53010h.f52928w;
            String str = this.f12797a;
            if (!z4 || (interfaceC33803a = (InterfaceC33803a) this.f12800d.getValue()) == null) {
                c33809g = null;
            } else {
                String str2 = c14509o.f53007e;
                if (str2 == null) {
                    str2 = str;
                }
                C33807e c33807e = ((C33810h) interfaceC33803a).f141612b;
                C26622k c26622k = C26624l.f105882z;
                C33805c c33805cM106967i = c33807e.m106967i(C26622k.m79241b(str2).mo79252c("SHA-256").mo79254e());
                if (c33805cM106967i != null) {
                    c33809g = new C33809g(c33805cM106967i);
                } else {
                    c33809g = null;
                }
            }
            c22669g0M32004w.f89336w = c33809g;
            try {
                c22669g1 = new C22669g0();
                try {
                    if (c33809g != null) {
                        AbstractC26632p abstractC26632pM9542e = m9542e();
                        C33805c c33805c = ((C33809g) c22669g0M32004w.f89336w).f141610w;
                        if (c33805c.f141589x) {
                            throw new IllegalStateException("snapshot is closed");
                        }
                        Long l7 = (Long) abstractC26632pM9542e.m79271T((C26611e0) c33805c.f141588w.f141581c.get(0)).f104375e;
                        if (l7 != null && l7.longValue() == 0) {
                            return new C34962h(m9544h((C33809g) c22669g0M32004w.f89336w), m9539f(str, null), EnumC32482h.f134509y);
                        }
                        C3281s c3281sM9545i = m9545i((C33809g) c22669g0M32004w.f89336w);
                        c22669g1.f89336w = c3281sM9545i;
                        if (c3281sM9545i != null) {
                            InterfaceC3265c interfaceC3265c = (InterfaceC3265c) this.f12801e.getValue();
                            C3281s c3281s = (C3281s) c22669g1.f89336w;
                            m9543g();
                            c3274l.f12782w = this;
                            c3274l.f12783x = c22669g0M32004w;
                            c3274l.f12784y = c22669g1;
                            c3274l.f12781F = 1;
                            ((C4723a) interfaceC3265c).getClass();
                            C3263a c3263a = new C3263a(c3281s);
                            if (c3263a != enumC31071a) {
                                c22669g3 = c22669g0M32004w;
                                objM9541d = c3263a;
                                c3277o2 = this;
                            }
                        }
                        return enumC31071a;
                    }
                    C3280r c3280rM9543g = c3277o.m9543g();
                    C0323s c0323s = new C0323s(c22669g2, c3277o, c22669g0, c3280rM9543g, null, 1);
                    c3274l.f12782w = c3277o;
                    c3274l.f12783x = c22669g2;
                    c3274l.f12784y = null;
                    c3274l.f12781F = 2;
                    objM9541d = c3277o.m9541d(c3280rM9543g, c0323s, c3274l);
                    if (objM9541d != enumC31071a) {
                        c22669g4 = c22669g2;
                        c3277o3 = c3277o;
                        c34962h = (C34962h) objM9541d;
                        if (c34962h != null) {
                            return c34962h;
                        }
                        C3280r c3280rM9543g2 = c3277o3.m9543g();
                        C12473e c12473e = new C12473e(c3277o3, interfaceC30057d2, 23);
                        c3274l.f12782w = c22669g4;
                        c3274l.f12783x = null;
                        c3274l.f12781F = 3;
                        objM9541d = c3277o3.m9541d(c3280rM9543g2, c12473e, c3274l);
                        if (objM9541d != enumC31071a) {
                            c22669g0 = c22669g4;
                            return (C34962h) objM9541d;
                        }
                    }
                    return enumC31071a;
                } catch (Exception e5) {
                    exc = e5;
                    c22669g0 = c22669g2;
                    c33809g2 = (C33809g) c22669g0.f89336w;
                    if (c33809g2 == null) {
                        throw exc;
                    }
                    AbstractC25012a.m73390w(c33809g2);
                    throw exc;
                }
                c3277o = this;
                c22669g2 = c22669g0M32004w;
                C22669g0 c22669g5 = c22669g1;
            } catch (Exception e13) {
                e = e13;
                c22669g0 = c22669g0M32004w;
                exc = e;
                c33809g2 = (C33809g) c22669g0.f89336w;
                if (c33809g2 == null) {
                    throw exc;
                }
                AbstractC25012a.m73390w(c33809g2);
                throw exc;
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c22669g0 = (C22669g0) c3274l.f12782w;
                    try {
                        AbstractC34132o.m107864I(objM9541d);
                        return (C34962h) objM9541d;
                    } catch (Exception e14) {
                        e = e14;
                        exc = e;
                        c33809g2 = (C33809g) c22669g0.f89336w;
                        if (c33809g2 == null) {
                            throw exc;
                        }
                        try {
                            AbstractC25012a.m73390w(c33809g2);
                            throw exc;
                        } catch (RuntimeException e15) {
                            throw e15;
                        } catch (Exception unused) {
                            throw exc;
                        }
                    }
                }
                c22669g4 = c3274l.f12783x;
                c3277o3 = (C3277o) c3274l.f12782w;
                try {
                    AbstractC34132o.m107864I(objM9541d);
                    c34962h = (C34962h) objM9541d;
                    if (c34962h != null) {
                        return c34962h;
                    }
                    C3280r c3280rM9543g3 = c3277o3.m9543g();
                    C12473e c12473e2 = new C12473e(c3277o3, interfaceC30057d2, 23);
                    c3274l.f12782w = c22669g4;
                    c3274l.f12783x = null;
                    c3274l.f12781F = 3;
                    objM9541d = c3277o3.m9541d(c3280rM9543g3, c12473e2, c3274l);
                    if (objM9541d != enumC31071a) {
                        c22669g0 = c22669g4;
                        return (C34962h) objM9541d;
                    }
                    return enumC31071a;
                } catch (Exception e16) {
                    exc = e16;
                    c22669g0 = c22669g4;
                    c33809g2 = (C33809g) c22669g0.f89336w;
                    if (c33809g2 == null) {
                        throw exc;
                    }
                    AbstractC25012a.m73390w(c33809g2);
                    throw exc;
                }
            }
            c22669g1 = c3274l.f12784y;
            c22669g3 = c3274l.f12783x;
            c3277o2 = (C3277o) c3274l.f12782w;
            try {
                AbstractC34132o.m107864I(objM9541d);
            } catch (Exception e17) {
                exc = e17;
                c22669g0 = c22669g3;
                c33809g2 = (C33809g) c22669g0.f89336w;
                if (c33809g2 == null) {
                    throw exc;
                }
                AbstractC25012a.m73390w(c33809g2);
                throw exc;
            }
        }
        C3263a c3263a2 = (C3263a) objM9541d;
        if (c3263a2.f12763a != null) {
            return new C34962h(c3277o2.m9544h((C33809g) c22669g3.f89336w), m9539f(c3277o2.f12797a, c3263a2.f12763a.f12813d.m9550a()), EnumC32482h.f134509y);
        }
        c22669g2 = c22669g3;
        c3277o = c3277o2;
        C22669g0 c22669g6 = c22669g1;
        C3280r c3280rM9543g4 = c3277o.m9543g();
        C0323s c0323s2 = new C0323s(c22669g2, c3277o, c22669g6, c3280rM9543g4, null, 1);
        c3274l.f12782w = c3277o;
        c3274l.f12783x = c22669g2;
        c3274l.f12784y = null;
        c3274l.f12781F = 2;
        objM9541d = c3277o.m9541d(c3280rM9543g4, c0323s2, c3274l);
        if (objM9541d != enumC31071a) {
            c22669g4 = c22669g2;
            c3277o3 = c3277o;
            c34962h = (C34962h) objM9541d;
            if (c34962h != null) {
                return c34962h;
            }
            C3280r c3280rM9543g5 = c3277o3.m9543g();
            C12473e c12473e3 = new C12473e(c3277o3, interfaceC30057d2, 23);
            c3274l.f12782w = c22669g4;
            c3274l.f12783x = null;
            c3274l.f12781F = 3;
            objM9541d = c3277o3.m9541d(c3280rM9543g5, c12473e3, c3274l);
            if (objM9541d != enumC31071a) {
                c22669g0 = c22669g4;
                return (C34962h) objM9541d;
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m9541d(C3280r c3280r, InterfaceC4351m interfaceC4351m, C3274l c3274l) {
        if (this.f12798b.f53011i.f52928w && AbstractC22676k.m65745e(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        C13215b c13215b = (C13215b) this.f12799c.getValue();
        return C13215b.m37114a(c13215b.f45798a, c3280r, new C3273k(interfaceC4351m, null, 0), c3274l);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC26632p m9542e() {
        AbstractC26632p abstractC26632p;
        InterfaceC33803a interfaceC33803a = (InterfaceC33803a) this.f12800d.getValue();
        return (interfaceC33803a == null || (abstractC26632p = ((C33810h) interfaceC33803a).f141611a) == null) ? this.f12798b.f53008f : abstractC26632p;
    }

    /* JADX INFO: renamed from: g */
    public final C3280r m9543g() {
        C14289a c14289a = AbstractC3270h.f12770b;
        C14509o c14509o = this.f12798b;
        C3279q c3279q = (C3279q) AbstractC31426o.m96742f(c14509o, c14289a);
        c3279q.getClass();
        C3278p c3278p = new C3278p(c3279q);
        EnumC14496b enumC14496b = c14509o.f53010h;
        boolean z4 = enumC14496b.f52928w;
        boolean z13 = c14509o.f53011i.f52928w && this.f12802f.isOnline();
        if (!z13 && z4) {
            c3278p.m9549d("only-if-cached, max-stale=2147483647");
        } else if (!z13 || z4) {
            if (!z13 && !z4) {
                c3278p.m9549d("no-cache, only-if-cached");
            }
        } else if (enumC14496b.f52929x) {
            c3278p.m9549d("no-cache");
        } else {
            c3278p.m9549d("no-cache, no-store");
        }
        String str = (String) AbstractC31426o.m96742f(c14509o, AbstractC3270h.f12769a);
        C3279q c3279q2 = new C3279q(AbstractC25247g0.m74001j0(c3278p.f12803a));
        if (AbstractC31426o.m96742f(c14509o, AbstractC3270h.f12771c) == null) {
            return new C3280r(this.f12797a, str, c3279q2, c14509o.f53012j);
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: h */
    public final C32490p m9544h(C33809g c33809g) {
        C33805c c33805c = c33809g.f141610w;
        if (c33805c.f141589x) {
            throw new IllegalStateException("snapshot is closed");
        }
        C26611e0 c26611e0 = (C26611e0) c33805c.f141588w.f141581c.get(1);
        AbstractC26632p abstractC26632pM9542e = m9542e();
        String str = this.f12798b.f53007e;
        if (str == null) {
            str = this.f12797a;
        }
        return AbstractC32072d.m99698g(c26611e0, abstractC26632pM9542e, str, c33809g, 16);
    }

    /* JADX INFO: renamed from: i */
    public final C3281s m9545i(C33809g c33809g) throws Throwable {
        Throwable th3;
        C3281s c3281sM101011T;
        try {
            AbstractC26632p abstractC26632pM9542e = m9542e();
            C33805c c33805c = c33809g.f141610w;
            if (c33805c.f141589x) {
                throw new IllegalStateException("snapshot is closed");
            }
            C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(abstractC26632pM9542e.mo79155x0((C26611e0) c33805c.f141588w.f141581c.get(0)));
            try {
                c3281sM101011T = AbstractC32410a.m101011T(c26621j0M79158c);
                try {
                    c26621j0M79158c.close();
                    th3 = null;
                } catch (Throwable th4) {
                    th3 = th4;
                }
            } catch (Throwable th5) {
                try {
                    c26621j0M79158c.close();
                } catch (Throwable th6) {
                    AbstractC29125c.m88530g(th5, th6);
                }
                th3 = th5;
                c3281sM101011T = null;
            }
            if (th3 == null) {
                return c3281sM101011T;
            }
            throw th3;
        } catch (IOException unused) {
            return null;
        }
    }
}
