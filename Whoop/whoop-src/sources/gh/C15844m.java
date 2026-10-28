package gh;

import al0.C0971f;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import bc3.C3033m;
import coil.network.HttpException;
import ge3.AbstractC15751g;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import j93.InterfaceC21461d;
import ja3.C21516l;
import java.io.IOException;
import java.util.Map;
import l83.C23470p;
import mh.C25545m;
import mh.EnumC25534b;
import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import ne3.C26617h0;
import ne3.C26621j0;
import ne3.C26622k;
import ne3.C26624l;
import p014aj.C0928c;
import p092dh.C12029p;
import p092dh.C12039z;
import p092dh.EnumC12020g;
import p117eh.C13184a;
import p117eh.C13186c;
import p117eh.C13188e;
import p117eh.C13190g;
import p117eh.C13191h;
import p249jc.AbstractC21598x;
import p304lh.C24063b;
import p304lh.C24064c;
import p304lh.C24065d;
import p425qh.AbstractC30358d;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import ud3.AbstractC34799a1;
import ud3.C34817h;
import ud3.C34818h0;
import ud3.C34826l0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34848w0;
import ud3.C34850x0;
import ud3.InterfaceC34819i;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import zd3.C40571o;

/* JADX INFO: renamed from: gh.m */
/* JADX INFO: loaded from: classes.dex */
public final class C15844m implements InterfaceC15839h {

    /* JADX INFO: renamed from: f */
    public static final C34817h f59841f = new C34817h(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: g */
    public static final C34817h f59842g = new C34817h(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* JADX INFO: renamed from: a */
    public final String f59843a;

    /* JADX INFO: renamed from: b */
    public final C25545m f59844b;

    /* JADX INFO: renamed from: c */
    public final C23470p f59845c;

    /* JADX INFO: renamed from: d */
    public final C23470p f59846d;

    /* JADX INFO: renamed from: e */
    public final boolean f59847e;

    public C15844m(String str, C25545m c25545m, C23470p c23470p, C23470p c23470p2, boolean z4) {
        this.f59843a = str;
        this.f59844b = c25545m;
        this.f59845c = c23470p;
        this.f59846d = c23470p2;
        this.f59847e = z4;
    }

    /* JADX INFO: renamed from: d */
    public static String m44674d(String str, C34818h0 c34818h0) {
        String strM92828b;
        String str2 = c34818h0 != null ? c34818h0.f146591a : null;
        if ((str2 == null || AbstractC39421y.m125930O(str2, MimeType.MIME_TYPE_TXT, false)) && (strM92828b = AbstractC30358d.m92828b(MimeTypeMap.getSingleton(), str)) != null) {
            return strM92828b;
        }
        if (str2 != null) {
            return AbstractC39414r.m125862H0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0212 A[Catch: Exception -> 0x018c, TryCatch #1 {Exception -> 0x018c, blocks: (B:92:0x01de, B:94:0x01e4, B:96:0x0209, B:98:0x020e, B:97:0x020c, B:100:0x0212, B:101:0x0217, B:68:0x015c, B:71:0x0168, B:73:0x0174, B:75:0x0182, B:79:0x018e, B:81:0x019a, B:83:0x01ba, B:85:0x01bf, B:84:0x01bd, B:87:0x01c3), top: B:110:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e4 A[Catch: Exception -> 0x018c, TryCatch #1 {Exception -> 0x018c, blocks: (B:92:0x01de, B:94:0x01e4, B:96:0x0209, B:98:0x020e, B:97:0x020c, B:100:0x0212, B:101:0x0217, B:68:0x015c, B:71:0x0168, B:73:0x0174, B:75:0x0182, B:79:0x018e, B:81:0x019a, B:83:0x01ba, B:85:0x01bf, B:84:0x01bd, B:87:0x01c3), top: B:110:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0209 A[Catch: Exception -> 0x018c, TryCatch #1 {Exception -> 0x018c, blocks: (B:92:0x01de, B:94:0x01e4, B:96:0x0209, B:98:0x020e, B:97:0x020c, B:100:0x0212, B:101:0x0217, B:68:0x015c, B:71:0x0168, B:73:0x0174, B:75:0x0182, B:79:0x018e, B:81:0x019a, B:83:0x01ba, B:85:0x01bf, B:84:0x01bd, B:87:0x01c3), top: B:110:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:97:0x020c A[Catch: Exception -> 0x018c, TryCatch #1 {Exception -> 0x018c, blocks: (B:92:0x01de, B:94:0x01e4, B:96:0x0209, B:98:0x020e, B:97:0x020c, B:100:0x0212, B:101:0x0217, B:68:0x015c, B:71:0x0168, B:73:0x0174, B:75:0x0182, B:79:0x018e, B:81:0x019a, B:83:0x01ba, B:85:0x01bf, B:84:0x01bd, B:87:0x01c3), top: B:110:0x015c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [gh.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [gh.m] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [eh.g] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11, types: [eh.g] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [gh.m] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // gh.InterfaceC15839h
    /* JADX INFO: renamed from: a */
    public final Object mo44670a(InterfaceC30057d interfaceC30057d) throws Exception {
        C15843l c15843l;
        ?? r10;
        C13190g c13190g;
        C24065d c24065dM70978a;
        C24065d c24065d;
        ?? r14;
        C13191h c13191h;
        C13190g c13190g2;
        ?? r15;
        C34850x0 c34850x0;
        Exception e5;
        ?? r16;
        C34850x0 c34850x1;
        AbstractC34799a1 abstractC34799a1;
        EnumC12020g enumC12020g;
        if (interfaceC30057d instanceof C15843l) {
            c15843l = (C15843l) interfaceC30057d;
            int i13 = c15843l.f59836F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15843l.f59836F = i13 - Integer.MIN_VALUE;
            } else {
                c15843l = new C15843l(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c15843l = new C15843l(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj = c15843l.f59840z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        ?? r17 = c15843l.f59836F;
        int i14 = 3;
        try {
            if (r17 == 0) {
                AbstractC34132o.m107864I(obj);
                C25545m c25545m = this.f59844b;
                boolean z4 = c25545m.f100148n.f100053w;
                String str = this.f59843a;
                if (!z4 || (c13191h = (C13191h) this.f59846d.getValue()) == null) {
                    c13190g = null;
                } else {
                    String str2 = c25545m.f100143i;
                    if (str2 == null) {
                        str2 = str;
                    }
                    C13188e c13188e = c13191h.f45733b;
                    C26622k c26622k = C26624l.f105882z;
                    C13186c c13186cM37087i = c13188e.m37087i(C26622k.m79241b(str2).mo79252c("SHA-256").mo79254e());
                    if (c13186cM37087i != null) {
                        c13190g2 = new C13190g(c13186cM37087i);
                    } else {
                        c13190g = null;
                    }
                }
                if (c13190g != null) {
                    AbstractC26632p abstractC26632pM44676c = m44676c();
                    C13186c c13186c = c13190g.f45731w;
                    if (c13186c.f45710x) {
                        c13190g = c13190g2;
                        throw new IllegalStateException("snapshot is closed");
                    }
                    Long l7 = (Long) abstractC26632pM44676c.m79271T((C26611e0) c13186c.f45709w.f45702c.get(0)).f104375e;
                    if (l7 == null) {
                        c13190g = c13190g2;
                    } else if (l7.longValue() == 0) {
                        c13190g = c13190g2;
                        return new C15845n(m44679g(c13190g), m44674d(str, null), EnumC12020g.f39763y);
                    }
                    c13190g = c13190g2;
                    if (!this.f59847e) {
                        C12029p c12029pM44679g = m44679g(c13190g);
                        C24063b c24063bM44678f = m44678f(c13190g);
                        return new C15845n(c12029pM44679g, m44674d(str, c24063bM44678f != null ? (C34818h0) c24063bM44678f.f95088b.getValue() : null), EnumC12020g.f39763y);
                    }
                    c24065dM70978a = new C24064c(m44677e(), m44678f(c13190g)).m70978a();
                    C24063b c24063b = c24065dM70978a.f95105b;
                    if (c24065dM70978a.f95104a == null && c24063b != null) {
                        return new C15845n(m44679g(c13190g), m44674d(str, (C34818h0) c24063b.f95088b.getValue()), EnumC12020g.f39763y);
                    }
                } else {
                    c13190g = c13190g2;
                    c24065dM70978a = new C24064c(m44677e(), null).m70978a();
                }
                C34832o0 c34832o0 = c24065dM70978a.f95104a;
                AbstractC22676k.m65747g(c34832o0);
                c15843l.f59837w = this;
                c15843l.f59838x = c13190g;
                c15843l.f59839y = c24065dM70978a;
                c15843l.f59836F = 1;
                Object objM44675b = m44675b(c34832o0, c15843l);
                if (objM44675b != enumC31071a) {
                    c24065d = c24065dM70978a;
                    obj = objM44675b;
                    r14 = this;
                    r15 = c13190g;
                }
                return enumC31071a;
            }
            if (r17 != 1) {
                if (r17 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c34850x0 = (C34850x0) c15843l.f59839y;
                C13190g c13190g3 = c15843l.f59838x;
                C15844m c15844m = c15843l.f59837w;
                try {
                    AbstractC34132o.m107864I(obj);
                    r16 = c15844m;
                    c34850x1 = (C34850x0) obj;
                    Bitmap.Config[] configArr = AbstractC30358d.f124548a;
                    abstractC34799a1 = c34850x1.f146778G;
                    if (abstractC34799a1 != null) {
                        throw new IllegalStateException("response body == null");
                    }
                    r16.getClass();
                    C12039z c12039z = new C12039z(abstractC34799a1.mo1940d1(), new C0971f(r16.f59844b.f100135a, i14), null);
                    String strM44674d = m44674d(r16.f59843a, abstractC34799a1.mo1942k());
                    if (c34850x1.f146780I != null) {
                        enumC12020g = EnumC12020g.f39764z;
                    } else {
                        enumC12020g = EnumC12020g.f39763y;
                    }
                    return new C15845n(c12039z, strM44674d, enumC12020g);
                } catch (Exception e13) {
                    e5 = e13;
                    AbstractC30358d.m92827a(c34850x0);
                    throw e5;
                }
            }
            C24065d c24065d2 = (C24065d) c15843l.f59839y;
            r10 = c15843l.f59838x;
            C15844m c15844m2 = c15843l.f59837w;
            try {
                AbstractC34132o.m107864I(obj);
                c24065d = c24065d2;
                r15 = r10;
                r14 = c15844m2;
            } catch (Exception e14) {
                e = e14;
                if (r10 != 0) {
                    AbstractC30358d.m92827a(r10);
                }
                throw e;
            }
            C34850x0 c34850x2 = (C34850x0) obj;
            Bitmap.Config[] configArr2 = AbstractC30358d.f124548a;
            AbstractC34799a1 abstractC34799a2 = c34850x2.f146778G;
            if (abstractC34799a2 == null) {
                throw new IllegalStateException("response body == null");
            }
            try {
                C13190g c13190gM44680h = r14.m44680h(r15, c24065d.f95104a, c34850x2, c24065d.f95105b);
                String str3 = r14.f59843a;
                if (c13190gM44680h != null) {
                    C12029p c12029pM44679g2 = r14.m44679g(c13190gM44680h);
                    C24063b c24063bM44678f2 = r14.m44678f(c13190gM44680h);
                    return new C15845n(c12029pM44679g2, m44674d(str3, c24063bM44678f2 != null ? (C34818h0) c24063bM44678f2.f95088b.getValue() : null), EnumC12020g.f39764z);
                }
                if (abstractC34799a2.mo1940d1().request(1L)) {
                    return new C15845n(new C12039z(abstractC34799a2.mo1940d1(), new C0971f(r14.f59844b.f100135a, i14), null), m44674d(str3, abstractC34799a2.mo1942k()), c34850x2.f146780I != null ? EnumC12020g.f39764z : EnumC12020g.f39763y);
                }
                AbstractC30358d.m92827a(c34850x2);
                C34832o0 c34832o0M44677e = r14.m44677e();
                c15843l.f59837w = r14;
                c15843l.f59838x = c13190gM44680h;
                c15843l.f59839y = c34850x2;
                c15843l.f59836F = 2;
                Object objM44675b2 = r14.m44675b(c34832o0M44677e, c15843l);
                if (objM44675b2 != enumC31071a) {
                    c34850x0 = c34850x2;
                    obj = objM44675b2;
                    r16 = r14;
                    c34850x1 = (C34850x0) obj;
                    Bitmap.Config[] configArr3 = AbstractC30358d.f124548a;
                    abstractC34799a1 = c34850x1.f146778G;
                    if (abstractC34799a1 != null) {
                        throw new IllegalStateException("response body == null");
                    }
                    r16.getClass();
                    C12039z c12039z2 = new C12039z(abstractC34799a1.mo1940d1(), new C0971f(r16.f59844b.f100135a, i14), null);
                    String strM44674d2 = m44674d(r16.f59843a, abstractC34799a1.mo1942k());
                    if (c34850x1.f146780I != null) {
                        enumC12020g = EnumC12020g.f39764z;
                    } else {
                        enumC12020g = EnumC12020g.f39763y;
                    }
                    return new C15845n(c12039z2, strM44674d2, enumC12020g);
                }
                return enumC31071a;
            } catch (Exception e15) {
                c34850x0 = c34850x2;
                e5 = e15;
                AbstractC30358d.m92827a(c34850x0);
                throw e5;
            }
        } catch (Exception e16) {
            e = e16;
            r10 = r17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m44675b(C34832o0 c34832o0, AbstractC32269c abstractC32269c) {
        C15842k c15842k;
        C34850x0 c34850x0M131549e;
        if (abstractC32269c instanceof C15842k) {
            c15842k = (C15842k) abstractC32269c;
            int i13 = c15842k.f59834y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15842k.f59834y = i13 - Integer.MIN_VALUE;
            } else {
                c15842k = new C15842k(this, abstractC32269c);
            }
        } else {
            c15842k = new C15842k(this, abstractC32269c);
        }
        Object objM8773r = c15842k.f59832w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15842k.f59834y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8773r);
            Bitmap.Config[] configArr = AbstractC30358d.f124548a;
            boolean zM65745e = AbstractC22676k.m65745e(Looper.myLooper(), Looper.getMainLooper());
            C23470p c23470p = this.f59845c;
            if (!zM65745e) {
                C40571o c40571oM109898b = ((C34826l0) ((InterfaceC34819i) c23470p.getValue())).m109898b(c34832o0);
                c15842k.f59834y = 1;
                C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c15842k));
                c3033m.m8774s();
                C21516l c21516l = new C21516l(3, c40571oM109898b, c3033m);
                c40571oM109898b.m131548d(c21516l);
                c3033m.m8776u(c21516l);
                objM8773r = c3033m.m8773r();
                if (objM8773r == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (this.f59844b.f100149o.f100053w) {
                    throw new NetworkOnMainThreadException();
                }
                c34850x0M131549e = ((C34826l0) ((InterfaceC34819i) c23470p.getValue())).m109898b(c34832o0).m131549e();
            }
            if (!c34850x0M131549e.f146788Q || c34850x0M131549e.f146792z == 304) {
                return c34850x0M131549e;
            }
            AbstractC34799a1 abstractC34799a1 = c34850x0M131549e.f146778G;
            if (abstractC34799a1 != null) {
                AbstractC30358d.m92827a(abstractC34799a1);
            }
            throw new HttpException(c34850x0M131549e);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM8773r);
        c34850x0M131549e = (C34850x0) objM8773r;
        if (c34850x0M131549e.f146788Q) {
        }
        return c34850x0M131549e;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC26632p m44676c() {
        Object value = this.f59846d.getValue();
        AbstractC22676k.m65747g(value);
        return ((C13191h) value).f45732a;
    }

    /* JADX INFO: renamed from: e */
    public final C34832o0 m44677e() {
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109905f(this.f59843a);
        C25545m c25545m = this.f59844b;
        c34830n0.m109903d(c25545m.f100144j);
        for (Map.Entry entry : c25545m.f100145k.f100160a.entrySet()) {
            Object key = entry.getKey();
            AbstractC22676k.m65748h(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            Object value = entry.getValue();
            InterfaceC21461d type = AbstractC21598x.m60666V((Class) key);
            AbstractC22676k.m65750j(type, "type");
            c34830n0.f146691e = c34830n0.f146691e.mo113254k(type, value);
        }
        EnumC25534b enumC25534b = c25545m.f100148n;
        boolean z4 = enumC25534b.f100053w;
        boolean z13 = c25545m.f100149o.f100053w;
        if (!z13 && z4) {
            c34830n0.m109901b(C34817h.f146575o);
        } else if (!z13 || z4) {
            if (!z13 && !z4) {
                c34830n0.m109901b(f59842g);
            }
        } else if (enumC25534b.f100054x) {
            c34830n0.m109901b(C34817h.f146574n);
        } else {
            c34830n0.m109901b(f59841f);
        }
        return new C34832o0(c34830n0);
    }

    /* JADX INFO: renamed from: f */
    public final C24063b m44678f(C13190g c13190g) throws Throwable {
        Throwable th3;
        C24063b c24063b;
        try {
            AbstractC26632p abstractC26632pM44676c = m44676c();
            C13186c c13186c = c13190g.f45731w;
            if (c13186c.f45710x) {
                throw new IllegalStateException("snapshot is closed");
            }
            C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(abstractC26632pM44676c.mo79155x0((C26611e0) c13186c.f45709w.f45702c.get(0)));
            try {
                c24063b = new C24063b(c26621j0M79158c);
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
                c24063b = null;
            }
            if (th3 == null) {
                return c24063b;
            }
            throw th3;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final C12029p m44679g(C13190g c13190g) {
        C13186c c13186c = c13190g.f45731w;
        if (c13186c.f45710x) {
            throw new IllegalStateException("snapshot is closed");
        }
        C26611e0 c26611e0 = (C26611e0) c13186c.f45709w.f45702c.get(1);
        AbstractC26632p abstractC26632pM44676c = m44676c();
        String str = this.f59844b.f100143i;
        if (str == null) {
            str = this.f59843a;
        }
        return new C12029p(c26611e0, abstractC26632pM44676c, str, c13190g);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX INFO: renamed from: h */
    public final C13190g m44680h(C13190g c13190g, C34832o0 c34832o0, C34850x0 c34850x0, C24063b c24063b) {
        C0928c c0928c;
        Throwable th3;
        C13184a c13184aM37086h;
        Throwable th4 = null;
        if (this.f59844b.f100148n.f100054x && (!this.f59847e || (!c34832o0.m109906a().f146577b && !c34850x0.m109932b().f146577b && !AbstractC22676k.m65745e(c34850x0.f146777F.m109863a("Vary"), "*")))) {
            int i13 = 10;
            if (c13190g != null) {
                C13186c c13186c = c13190g.f45731w;
                C13188e c13188e = c13186c.f45711y;
                synchronized (c13188e) {
                    c13186c.close();
                    c13184aM37086h = c13188e.m37086h(c13186c.f45709w.f45700a);
                }
                if (c13184aM37086h != null) {
                    c0928c = new C0928c(c13184aM37086h, i13);
                } else {
                    c0928c = null;
                }
            } else {
                C13191h c13191h = (C13191h) this.f59846d.getValue();
                if (c13191h == null) {
                    c0928c = null;
                } else {
                    String str = this.f59844b.f100143i;
                    if (str == null) {
                        str = this.f59843a;
                    }
                    C13188e c13188e2 = c13191h.f45733b;
                    C26622k c26622k = C26624l.f105882z;
                    C13184a c13184aM37086h2 = c13188e2.m37086h(C26622k.m79241b(str).mo79252c("SHA-256").mo79254e());
                    if (c13184aM37086h2 != null) {
                        c0928c = new C0928c(c13184aM37086h2, i13);
                    } else {
                        c0928c = null;
                    }
                }
            }
            if (c0928c != null) {
                try {
                    try {
                        if (c34850x0.f146792z != 304 || c24063b == null) {
                            C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(m44676c().mo37080p0(((C13184a) c0928c.f3421x).m37076b(0), false));
                            try {
                                new C24063b(c34850x0).m70977a(c26617h0M79157b);
                                try {
                                    c26617h0M79157b.close();
                                    th3 = null;
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
                            if (th3 != null) {
                                throw th3;
                            }
                            C26617h0 c26617h0M79157b2 = AbstractC26604b.m79157b(m44676c().mo37080p0(((C13184a) c0928c.f3421x).m37076b(1), false));
                            try {
                                AbstractC34799a1 abstractC34799a1 = c34850x0.f146778G;
                                AbstractC22676k.m65747g(abstractC34799a1);
                                abstractC34799a1.mo1940d1().mo79190P0(c26617h0M79157b2);
                                try {
                                    c26617h0M79157b2.close();
                                } catch (Throwable th8) {
                                    th4 = th8;
                                }
                            } catch (Throwable th9) {
                                th4 = th9;
                                try {
                                    c26617h0M79157b2.close();
                                } catch (Throwable th10) {
                                    AbstractC29125c.m88530g(th4, th10);
                                }
                            }
                            if (th4 != null) {
                                throw th4;
                            }
                        } else {
                            C34848w0 c34848w0M109933h = c34850x0.m109933h();
                            c34848w0M109933h.m109931c(AbstractC15751g.m44461n(c24063b.f95092f, c34850x0.f146777F));
                            C34850x0 c34850x0M109930a = c34848w0M109933h.m109930a();
                            C26617h0 c26617h0M79157b3 = AbstractC26604b.m79157b(m44676c().mo37080p0(((C13184a) c0928c.f3421x).m37076b(0), false));
                            try {
                                new C24063b(c34850x0M109930a).m70977a(c26617h0M79157b3);
                                try {
                                    c26617h0M79157b3.close();
                                } catch (Throwable th11) {
                                    th4 = th11;
                                }
                            } catch (Throwable th12) {
                                th4 = th12;
                                try {
                                    c26617h0M79157b3.close();
                                } catch (Throwable th13) {
                                    AbstractC29125c.m88530g(th4, th13);
                                }
                            }
                            if (th4 != null) {
                                throw th4;
                            }
                        }
                        C13190g c13190gM2294B = c0928c.m2294B();
                        AbstractC30358d.m92827a(c34850x0);
                        return c13190gM2294B;
                    } catch (Exception e5) {
                        Bitmap.Config[] configArr = AbstractC30358d.f124548a;
                        try {
                            ((C13184a) c0928c.f3421x).m37075a(false);
                        } catch (Exception unused) {
                        }
                        throw e5;
                    }
                } catch (Throwable th14) {
                    AbstractC30358d.m92827a(c34850x0);
                    throw th14;
                }
            }
        } else if (c13190g != null) {
            AbstractC30358d.m92827a(c13190g);
        }
        return null;
    }
}
