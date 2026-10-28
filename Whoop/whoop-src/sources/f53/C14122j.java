package f53;

import a43.C0379a;
import a43.C0384f;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.InterfaceC3027k1;
import c53.C4255a;
import d30.C11552o;
import e53.C12745d;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import g53.C15512q;
import g53.C15517v;
import io.sentry.internal.debugmeta.C20378c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.C23470p;
import n23.AbstractC26202e;
import n23.C26200c;
import p007a6.C0416e;
import p021av.C2088b;
import p026b2.C2319y;
import p077d0.C11340d;
import p408q.C29662f;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import qg3.C30352d;
import r83.EnumC31071a;
import rb3.AbstractC31199g;
import s83.AbstractC32269c;
import t23.C33403i3;
import t23.InterfaceC33408j3;
import t33.AbstractC33529a;
import u33.EnumC34512e;
import wb3.AbstractC37056f;
import x43.AbstractC37979k;
import x43.C37969a;
import x43.C37976h;
import x43.C37981m;
import z33.C40053b;

/* JADX INFO: renamed from: f53.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C14122j {

    /* JADX INFO: renamed from: a */
    public final String f50747a;

    /* JADX INFO: renamed from: b */
    public final String f50748b;

    /* JADX INFO: renamed from: c */
    public final C30352d f50749c;

    /* JADX INFO: renamed from: d */
    public final C29662f f50750d;

    /* JADX INFO: renamed from: e */
    public final C4255a f50751e;

    /* JADX INFO: renamed from: f */
    public final C0384f f50752f;

    /* JADX INFO: renamed from: g */
    public final C40053b f50753g;

    /* JADX INFO: renamed from: h */
    public C29662f f50754h;

    /* JADX INFO: renamed from: i */
    public final C23470p f50755i;

    /* JADX INFO: renamed from: j */
    public AbstractC31199g f50756j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashSet f50757k;

    /* JADX INFO: renamed from: l */
    public final C20378c f50758l;

    /* JADX INFO: renamed from: m */
    public C2996c2 f50759m;

    /* JADX INFO: renamed from: n */
    public final C37976h f50760n;

    /* JADX INFO: renamed from: o */
    public final C0379a f50761o;

    /* JADX INFO: renamed from: p */
    public final C14118f f50762p;

    public C14122j(String apiKey, String wssUrl, C30352d c30352d, C29662f c29662f, C4255a c4255a, C0384f c0384f, C40053b networkStateProvider) {
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(wssUrl, "wssUrl");
        AbstractC22676k.m65750j(networkStateProvider, "networkStateProvider");
        this.f50747a = apiKey;
        this.f50748b = wssUrl;
        this.f50749c = c30352d;
        this.f50750d = c29662f;
        this.f50751e = c4255a;
        this.f50752f = c0384f;
        this.f50753g = networkStateProvider;
        this.f50755i = AbstractC1772c1.m5382S(this, "Video:Socket");
        this.f50757k = new LinkedHashSet();
        C20378c c20378c = new C20378c(13, (byte) 0);
        this.f50758l = c20378c;
        InterfaceC30057d interfaceC30057d = null;
        this.f50760n = new C37976h(c4255a, new C11340d(this, interfaceC30057d, 1), new C0416e(this, interfaceC30057d, 3), new C2088b(this, 14), 31);
        InterfaceC33408j3.f139483t.getClass();
        this.f50761o = new C0379a(AbstractC37056f.m118959K(new C37969a((InterfaceC13037f2) C33403i3.f139478c), new C37969a(c20378c.m56594w().f168690e)), c20378c);
        this.f50762p = new C14118f(this, 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m40209a(C14122j c14122j, AbstractC32269c abstractC32269c) {
        C14115c c14115c;
        c14122j.getClass();
        if (abstractC32269c instanceof C14115c) {
            c14115c = (C14115c) abstractC32269c;
            int i13 = c14115c.f50728z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c14115c.f50728z = i13 - Integer.MIN_VALUE;
            } else {
                c14115c = new C14115c(c14122j, abstractC32269c);
            }
        } else {
            c14115c = new C14115c(c14122j, abstractC32269c);
        }
        Object obj = c14115c.f50726x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c14115c.f50728z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C0384f c0384f = c14122j.f50752f;
            C0379a c0379a = c14122j.f50761o;
            c14115c.f50725w = c14122j;
            c14115c.f50728z = 1;
            if (c0384f.m1051a(c0379a, c14115c) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c14122j = c14115c.f50725w;
            AbstractC34132o.m107864I(obj);
        }
        c14122j.f50753g.m128403e(c14122j.f50762p);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m40210b(C14122j c14122j, C37981m c37981m, C11552o c11552o) {
        C2345k c2345kM40215f = c14122j.m40215f();
        InterfaceC2339e interfaceC2339e = c2345kM40215f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = c2345kM40215f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM40215f.f9274b.log(enumC2341g, str, "[handleError] error: " + c37981m, null);
        }
        AbstractC26202e abstractC26202e = c37981m.f162639a;
        boolean z4 = abstractC26202e instanceof C26200c;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (z4) {
            Object objM40216h = c14122j.m40216h((C26200c) abstractC26202e, c11552o);
            return objM40216h == EnumC31071a.f128113w ? objM40216h : c23454a0;
        }
        c14122j.m40214e(new C14116d(c37981m, 0));
        return c23454a0;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m40211c(C14122j c14122j, C22669g0 c22669g0, AbstractC31199g abstractC31199g, C2319y c2319y) {
        C2345k c2345kM40215f = c14122j.m40215f();
        InterfaceC2339e interfaceC2339e = c2345kM40215f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM40215f.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM40215f.f9274b.log(enumC2341g, str, "[reconnect] connectionConf: " + abstractC31199g, null);
        }
        abstractC31199g.f128524a = true;
        Object objM40213g = m40213g(c14122j, c22669g0, abstractC31199g, c2319y);
        return objM40213g == EnumC31071a.f128113w ? objM40213g : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: d */
    public static final Object m40212d(C14122j c14122j, AbstractC32269c abstractC32269c) {
        C14121i c14121i;
        c14122j.getClass();
        if (abstractC32269c instanceof C14121i) {
            c14121i = (C14121i) abstractC32269c;
            int i13 = c14121i.f50746z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c14121i.f50746z = i13 - Integer.MIN_VALUE;
            } else {
                c14121i = new C14121i(c14122j, abstractC32269c);
            }
        } else {
            c14121i = new C14121i(c14122j, abstractC32269c);
        }
        Object obj = c14121i.f50744x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c14121i.f50746z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C0384f c0384f = c14122j.f50752f;
            C0379a c0379a = c14122j.f50761o;
            c14121i.f50743w = c14122j;
            c14121i.f50746z = 1;
            if (c0384f.m1052b(c0379a, c14121i) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c14122j = c14121i.f50743w;
            AbstractC34132o.m107864I(obj);
        }
        c14122j.f50753g.m128402d(c14122j.f50762p);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final Object m40213g(C14122j c14122j, C22669g0 c22669g0, AbstractC31199g abstractC31199g, C2319y c2319y) {
        Object objM56579B;
        C2345k c2345kM40215f = c14122j.m40215f();
        C4255a c4255a = c14122j.f50751e;
        InterfaceC2339e interfaceC2339e = c2345kM40215f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM40215f.f9273a;
        InterfaceC30057d interfaceC30057d = null;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM40215f.f9274b.log(enumC2341g, str, "[connectUser] connectionConf: " + abstractC31199g, null);
        }
        AbstractC3006f0.m8732z(c4255a, null, null, new C14113a(c14122j, interfaceC30057d, 3), 3);
        c14122j.f50756j = abstractC31199g;
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c22669g0.f89336w;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        boolean zM128401c = c14122j.f50753g.m128401c();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM128401c) {
            return (zM128401c || (objM56579B = c14122j.f50758l.m56579B(c2319y)) != EnumC31071a.f128113w) ? c23454a0 : objM56579B;
        }
        C29662f c29662fM91125n0 = c14122j.f50750d.m91125n0(abstractC31199g, "#coordinator");
        Iterator it = c14122j.f50757k.iterator();
        while (it.hasNext()) {
            ((AbstractC37979k) it.next()).mo40220e();
        }
        c22669g0.f89336w = AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36597g((C13096w1) c29662fM91125n0.f121232z), new C11552o(c14122j, interfaceC30057d, 13), 0), c4255a);
        c14122j.f50754h = c29662fM91125n0;
        return c23454a0;
    }

    /* JADX INFO: renamed from: e */
    public final void m40214e(Function1 function1) {
        synchronized (this.f50757k) {
            for (AbstractC37979k abstractC37979k : this.f50757k) {
                abstractC37979k.getClass();
                AbstractC3006f0.m8732z(this.f50751e, AbstractC33529a.f139956a, null, new C14114b(function1, abstractC37979k, null, 0), 2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final C2345k m40215f() {
        return (C2345k) this.f50755i.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:47:0x0123  */
    /* JADX WARN: Code duplicated, block: B:52:0x013f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0164  */
    /* JADX WARN: Code duplicated, block: B:58:0x0167 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0168 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00bd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00fe, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x013f, please report this as an issue */
    /* JADX INFO: renamed from: h */
    public final Object m40216h(C26200c c26200c, AbstractC32269c abstractC32269c) {
        C14120h c14120h;
        C14122j c14122j;
        int i13;
        C2345k c2345kM40215f;
        InterfaceC2339e interfaceC2339e;
        EnumC2341g enumC2341g;
        C2345k c2345kM56591t;
        InterfaceC2339e interfaceC2339e2;
        EnumC2341g enumC2341g2;
        Object objM124995a;
        C2345k c2345kM56591t2;
        InterfaceC2339e interfaceC2339e3;
        EnumC2341g enumC2341g3;
        Object objM124995a2;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (abstractC32269c instanceof C14120h) {
            c14120h = (C14120h) abstractC32269c;
            int i14 = c14120h.f50738E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c14120h.f50738E = i14 - Integer.MIN_VALUE;
            } else {
                c14120h = new C14120h(this, abstractC32269c);
            }
        } else {
            c14120h = new C14120h(this, abstractC32269c);
        }
        Object objM92822w = c14120h.f50741y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c14120h.f50738E;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM92822w);
            C33647p c33647p = EnumC34512e.f145082y;
            int i16 = c26200c.f103913b;
            c33647p.getClass();
            if (EnumC34512e.f145083z.contains(Integer.valueOf(i16))) {
                C12745d c12745d = (C12745d) this.f50749c.f124535x;
                c12745d.getClass();
                c12745d.f43626a = "";
            }
            if (c26200c.f103913b == 40) {
                C12745d c12745d2 = (C12745d) this.f50749c.f124535x;
                c12745d2.getClass();
                c12745d2.f43626a = "";
                C30352d c30352d = this.f50749c;
                c14120h.f50739w = this;
                c14120h.f50740x = c26200c;
                c14120h.f50738E = 1;
                objM92822w = c30352d.m92822w(c14120h);
                if (objM92822w != enumC31071a) {
                    c14122j = this;
                }
            } else {
                c14122j = this;
                i13 = c26200c.f103913b;
                C33647p c33647p2 = EnumC34512e.f145082y;
                if (i13 == 1007 || i13 == 1006 || i13 == 2) {
                    c2345kM40215f = c14122j.m40215f();
                    interfaceC2339e = c2345kM40215f.f9275c;
                    enumC2341g = EnumC2341g.DEBUG;
                    if (interfaceC2339e.isLoggable(enumC2341g, c2345kM40215f.f9273a)) {
                        c2345kM40215f.f9274b.log(enumC2341g, c2345kM40215f.f9273a, "One unrecoverable error happened. Error: " + c26200c + ". Error code: " + c26200c.f103913b, null);
                    }
                    C20378c c20378c = c14122j.f50758l;
                    c14120h.f50739w = null;
                    c14120h.f50740x = null;
                    c14120h.f50738E = 2;
                    c20378c.getClass();
                    C20378c.f76419E = C20378c.f76420z;
                    C20378c.f76420z = 0;
                    c2345kM56591t = c20378c.m56591t();
                    interfaceC2339e2 = c2345kM56591t.f9275c;
                    enumC2341g2 = EnumC2341g.ERROR;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM56591t.f9273a)) {
                        c2345kM56591t.f9274b.log(enumC2341g2, c2345kM56591t.f9273a, "[onUnrecoverableError] error: " + c26200c, null);
                    }
                    objM124995a = c20378c.m56594w().m124995a(new C15517v(c26200c), c14120h);
                    if (objM124995a != enumC31071a) {
                        objM124995a = c23454a0;
                    }
                    if (objM124995a != enumC31071a) {
                        return c23454a0;
                    }
                } else {
                    C20378c c20378c2 = c14122j.f50758l;
                    c14120h.f50739w = null;
                    c14120h.f50740x = null;
                    c14120h.f50738E = 3;
                    c2345kM56591t2 = c20378c2.m56591t();
                    interfaceC2339e3 = c2345kM56591t2.f9275c;
                    enumC2341g3 = EnumC2341g.ERROR;
                    if (interfaceC2339e3.isLoggable(enumC2341g3, c2345kM56591t2.f9273a)) {
                        c2345kM56591t2.f9274b.log(enumC2341g3, c2345kM56591t2.f9273a, "[onNetworkError] error: " + c26200c, null);
                    }
                    objM124995a2 = c20378c2.m56594w().m124995a(new C15512q(c26200c), c14120h);
                    if (objM124995a2 != enumC31071a) {
                        objM124995a2 = c23454a0;
                    }
                    if (objM124995a2 != enumC31071a) {
                        return c23454a0;
                    }
                }
            }
            return enumC31071a;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                AbstractC34132o.m107864I(objM92822w);
                return c23454a0;
            }
            if (i15 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM92822w);
            return c23454a0;
        }
        c26200c = c14120h.f50740x;
        c14122j = c14120h.f50739w;
        AbstractC34132o.m107864I(objM92822w);
        String token = (String) objM92822w;
        C30352d c30352d2 = c14122j.f50749c;
        AbstractC22676k.m65750j(token, "token");
        C12745d c12745d3 = (C12745d) c30352d2.f124535x;
        c12745d3.getClass();
        c12745d3.f43626a = token;
        i13 = c26200c.f103913b;
        C33647p c33647p3 = EnumC34512e.f145082y;
        if (i13 == 1007) {
            C20378c c20378c3 = c14122j.f50758l;
            c14120h.f50739w = null;
            c14120h.f50740x = null;
            c14120h.f50738E = 3;
            c2345kM56591t2 = c20378c3.m56591t();
            interfaceC2339e3 = c2345kM56591t2.f9275c;
            enumC2341g3 = EnumC2341g.ERROR;
            if (interfaceC2339e3.isLoggable(enumC2341g3, c2345kM56591t2.f9273a)) {
                c2345kM56591t2.f9274b.log(enumC2341g3, c2345kM56591t2.f9273a, "[onNetworkError] error: " + c26200c, null);
            }
            objM124995a2 = c20378c3.m56594w().m124995a(new C15512q(c26200c), c14120h);
            if (objM124995a2 != enumC31071a) {
                objM124995a2 = c23454a0;
            }
            if (objM124995a2 != enumC31071a) {
                return enumC31071a;
            }
            return c23454a0;
        }
        c2345kM40215f = c14122j.m40215f();
        interfaceC2339e = c2345kM40215f.f9275c;
        enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM40215f.f9273a)) {
            c2345kM40215f.f9274b.log(enumC2341g, c2345kM40215f.f9273a, "One unrecoverable error happened. Error: " + c26200c + ". Error code: " + c26200c.f103913b, null);
        }
        C20378c c20378c4 = c14122j.f50758l;
        c14120h.f50739w = null;
        c14120h.f50740x = null;
        c14120h.f50738E = 2;
        c20378c4.getClass();
        C20378c.f76419E = C20378c.f76420z;
        C20378c.f76420z = 0;
        c2345kM56591t = c20378c4.m56591t();
        interfaceC2339e2 = c2345kM56591t.f9275c;
        enumC2341g2 = EnumC2341g.ERROR;
        if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM56591t.f9273a)) {
            c2345kM56591t.f9274b.log(enumC2341g2, c2345kM56591t.f9273a, "[onUnrecoverableError] error: " + c26200c, null);
        }
        objM124995a = c20378c4.m56594w().m124995a(new C15517v(c26200c), c14120h);
        if (objM124995a != enumC31071a) {
            objM124995a = c23454a0;
        }
        if (objM124995a != enumC31071a) {
            return enumC31071a;
        }
        return c23454a0;
    }
}
