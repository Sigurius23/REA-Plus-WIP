package n20;

import a30.AbstractC0287e1;
import a30.C0273a;
import a30.C0274a0;
import a30.C0290f1;
import a30.C0313n0;
import a30.C0320q0;
import a30.C0328u0;
import a30.C0330v0;
import bc3.AbstractC3006f0;
import g73.C15553a;
import h20.C16761x1;
import io.sentry.config.AbstractC20301a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import jo2.C21841d;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25265s;
import m83.C25271y;
import my.C26027a;
import my.C26029c;
import p023ay.C2147u;
import p505ts.AbstractC34132o;
import p522uf.AbstractC34870c0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import q20.C29818g;
import q20.C29822i;
import q20.C29824j;
import q20.C29828m;
import q20.C29838w;
import q20.C29839x;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import v00.AbstractC35461d0;
import v00.C35459c0;
import v00.InterfaceC35457b0;
import y00.C38915o4;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: n20.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C26181p {

    /* JADX INFO: renamed from: a */
    public final C0274a0 f103835a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC30063j f103836b;

    /* JADX INFO: renamed from: c */
    public final C26186u f103837c;

    /* JADX INFO: renamed from: d */
    public final C15553a f103838d;

    /* JADX INFO: renamed from: e */
    public final C26176k f103839e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f103840f;

    /* JADX INFO: renamed from: g */
    public boolean f103841g;

    public C26181p(C0274a0 paymentElementLoader, InterfaceC30063j uiContext, C26186u viewModel, C15553a paymentSelectionUpdater, C26176k confirmationHandler) {
        AbstractC22676k.m65750j(paymentElementLoader, "paymentElementLoader");
        AbstractC22676k.m65750j(uiContext, "uiContext");
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(paymentSelectionUpdater, "paymentSelectionUpdater");
        AbstractC22676k.m65750j(confirmationHandler, "confirmationHandler");
        this.f103835a = paymentElementLoader;
        this.f103836b = uiContext;
        this.f103837c = viewModel;
        this.f103838d = paymentSelectionUpdater;
        this.f103839e = confirmationHandler;
        this.f103840f = new AtomicReference(null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0106 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public static final Object m77732a(C26181p c26181p, C0320q0 c0320q0, C16761x1 c16761x1, boolean z4, C21841d c21841d, AbstractC32269c abstractC32269c) throws Throwable {
        C26179n c26179n;
        C26178m c26178m;
        Object objM814g;
        Throwable thM68037a;
        C0330v0 c0330v0;
        AbstractC0287e1 abstractC0287e1;
        C0290f1 c0290f1;
        C26181p c26181p2;
        C21841d c21841d2;
        C26186u c26186u = c26181p.f103837c;
        if (abstractC32269c instanceof C26179n) {
            c26179n = (C26179n) abstractC32269c;
            int i13 = c26179n.f103825G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26179n.f103825G = i13 - Integer.MIN_VALUE;
            } else {
                c26179n = new C26179n(c26181p, abstractC32269c);
            }
        } else {
            c26179n = new C26179n(c26181p, abstractC32269c);
        }
        Object obj = c26179n.f103823E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26179n.f103825G;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i14) {
            case 0:
                AbstractC34132o.m107864I(obj);
                AbstractC34870c0.m109996f0(c16761x1.f64405H);
                c26178m = new C26178m(c0320q0, c16761x1);
                if (AbstractC22676k.m65745e((C26178m) c26186u.f103857F.getValue(), c26178m)) {
                    c26179n.f103825G = 1;
                    if (m77733b(c26181p, c21841d, null, c26179n) != enumC31071a) {
                        return c23454a0;
                    }
                } else {
                    c26186u.f103860I.invoke();
                    C0274a0 c0274a0 = c26181p.f103835a;
                    C0313n0 c0313n0 = new C0313n0(c16761x1);
                    C0328u0 c0328u0 = new C0328u0(false, z4);
                    c26179n.f103826w = c26181p;
                    c26179n.f103827x = c16761x1;
                    c26179n.f103828y = c21841d;
                    c26179n.f103829z = c26178m;
                    c26179n.f103825G = 2;
                    objM814g = c0274a0.m814g(c0320q0, c0313n0, c0328u0, c26179n);
                    if (objM814g != enumC31071a) {
                        thM68037a = C23468n.m68037a(objM814g);
                        if (thM68037a != null) {
                            c0330v0 = (C0330v0) objM814g;
                            abstractC0287e1 = c0330v0.f1160z;
                            if (abstractC0287e1 != null) {
                                c26179n.f103826w = null;
                                c26179n.f103827x = null;
                                c26179n.f103828y = null;
                                c26179n.f103829z = null;
                                c26179n.f103825G = 3;
                                if (m77733b(c26181p, c21841d, abstractC0287e1, c26179n) == enumC31071a) {
                                    return c23454a0;
                                }
                            } else {
                                c26181p.f103837c.f103857F.m36570j(c26178m);
                                c0290f1 = new C0290f1(c0330v0);
                                c26179n.f103826w = c26181p;
                                c26179n.f103827x = c21841d;
                                c26179n.f103828y = null;
                                c26179n.f103829z = null;
                                c26179n.f103825G = 4;
                                if (c26181p.m77734c(c0290f1, c16761x1, c26179n) != enumC31071a) {
                                    c26181p2 = c26181p;
                                    c21841d2 = c21841d;
                                    c26179n.f103826w = null;
                                    c26179n.f103827x = null;
                                    c26179n.f103825G = 5;
                                    if (m77733b(c26181p2, c21841d2, null, c26179n) == enumC31071a) {
                                        return c23454a0;
                                    }
                                }
                            }
                        } else {
                            c26179n.f103826w = null;
                            c26179n.f103827x = null;
                            c26179n.f103828y = null;
                            c26179n.f103829z = null;
                            c26179n.f103825G = 6;
                            if (m77733b(c26181p, c21841d, thM68037a, c26179n) != enumC31071a) {
                                return c23454a0;
                            }
                        }
                    }
                }
                return enumC31071a;
            case 1:
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            case 2:
                C26178m c26178m2 = c26179n.f103829z;
                c21841d = c26179n.f103828y;
                c16761x1 = (C16761x1) c26179n.f103827x;
                C26181p c26181p3 = c26179n.f103826w;
                AbstractC34132o.m107864I(obj);
                objM814g = ((C23468n) obj).f92940w;
                c26178m = c26178m2;
                c26181p = c26181p3;
                thM68037a = C23468n.m68037a(objM814g);
                if (thM68037a != null) {
                    c26179n.f103826w = null;
                    c26179n.f103827x = null;
                    c26179n.f103828y = null;
                    c26179n.f103829z = null;
                    c26179n.f103825G = 6;
                    if (m77733b(c26181p, c21841d, thM68037a, c26179n) != enumC31071a) {
                        return enumC31071a;
                    }
                    return c23454a0;
                }
                c0330v0 = (C0330v0) objM814g;
                abstractC0287e1 = c0330v0.f1160z;
                if (abstractC0287e1 != null) {
                    c26179n.f103826w = null;
                    c26179n.f103827x = null;
                    c26179n.f103828y = null;
                    c26179n.f103829z = null;
                    c26179n.f103825G = 3;
                    if (m77733b(c26181p, c21841d, abstractC0287e1, c26179n) == enumC31071a) {
                        return c23454a0;
                    }
                } else {
                    c26181p.f103837c.f103857F.m36570j(c26178m);
                    c0290f1 = new C0290f1(c0330v0);
                    c26179n.f103826w = c26181p;
                    c26179n.f103827x = c21841d;
                    c26179n.f103828y = null;
                    c26179n.f103829z = null;
                    c26179n.f103825G = 4;
                    if (c26181p.m77734c(c0290f1, c16761x1, c26179n) != enumC31071a) {
                        c26181p2 = c26181p;
                        c21841d2 = c21841d;
                        c26179n.f103826w = null;
                        c26179n.f103827x = null;
                        c26179n.f103825G = 5;
                        if (m77733b(c26181p2, c21841d2, null, c26179n) == enumC31071a) {
                            return c23454a0;
                        }
                    }
                }
                return enumC31071a;
            case 3:
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            case 4:
                c21841d2 = (C21841d) c26179n.f103827x;
                c26181p2 = c26179n.f103826w;
                AbstractC34132o.m107864I(obj);
                c26179n.f103826w = null;
                c26179n.f103827x = null;
                c26179n.f103825G = 5;
                if (m77733b(c26181p2, c21841d2, null, c26179n) == enumC31071a) {
                    return enumC31071a;
                }
                return c23454a0;
            case 5:
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            case 6:
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m77733b(C26181p c26181p, C21841d c21841d, Throwable th3, C26179n c26179n) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(c26181p.f103836b, new C2147u(c26181p, th3, c21841d, null, 10), c26179n);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:75:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x013c  */
    /* JADX INFO: renamed from: c */
    public final Object m77734c(C0290f1 newState, C16761x1 newConfig, AbstractC32269c abstractC32269c) {
        C26180o c26180o;
        C26181p c26181p;
        C0290f1 c0290f1;
        boolean zM112544y;
        boolean z4;
        if (abstractC32269c instanceof C26180o) {
            c26180o = (C26180o) abstractC32269c;
            int i13 = c26180o.f103830E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26180o.f103830E = i13 - Integer.MIN_VALUE;
            } else {
                c26180o = new C26180o(this, abstractC32269c);
            }
        } else {
            c26180o = new C26180o(this, abstractC32269c);
        }
        Object obj = c26180o.f103833y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26180o.f103830E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C26186u c26186u = this.f103837c;
            C15553a c15553a = this.f103838d;
            AbstractC29840y abstractC29840y = c26186u.f103856E;
            C26173h c26173hM77735g = this.f103837c.m77735g();
            InterfaceC30057d interfaceC30057d = null;
            C16761x1 c16761x1 = c26173hM77735g != null ? c26173hM77735g.f103768x : null;
            boolean z13 = this.f103837c.f103863z;
            c15553a.getClass();
            AbstractC22676k.m65750j(newState, "newState");
            AbstractC22676k.m65750j(newConfig, "newConfig");
            if (abstractC29840y == null) {
                abstractC29840y = newState.f1022y;
            }
            if (abstractC29840y != null) {
                C35459c0 c35459c0 = newState.f1019E;
                List listM112535S = c35459c0.m112535S();
                boolean z14 = false;
                if (abstractC29840y instanceof AbstractC29835t) {
                    AbstractC29835t abstractC29835t = (AbstractC29835t) abstractC29840y;
                    String paymentMethodCode = abstractC29835t.mo91330i().f167026w;
                    AbstractC22676k.m65750j(paymentMethodCode, "paymentMethodCode");
                    InterfaceC35457b0 interfaceC35457b0 = (InterfaceC35457b0) ((Map) AbstractC35461d0.f151001b.getValue()).get(paymentMethodCode);
                    boolean z15 = (interfaceC35457b0 != null ? interfaceC35457b0.mo112528c(c35459c0) : false) && !abstractC29835t.mo91330i().f167027x;
                    if (!listM112535S.contains(abstractC29835t.mo91330i().f167026w) || z15) {
                        zM112544y = false;
                    } else {
                        zM112544y = true;
                    }
                } else if (abstractC29840y instanceof C29838w) {
                    C38915o4 c38915o4 = ((C29838w) abstractC29840y).f121955x;
                    EnumC38828f4 enumC38828f4 = c38915o4.f167511E;
                    if (AbstractC25265s.m74155w0(listM112535S, enumC38828f4 != null ? enumC38828f4.f167132w : null)) {
                        C0273a c0273a = newState.f1021x;
                        if ((c0273a != null ? c0273a.f935w : C25271y.f99162w).contains(c38915o4)) {
                            zM112544y = true;
                        }
                    }
                    zM112544y = false;
                } else if (abstractC29840y instanceof C29824j) {
                    zM112544y = c35459c0.f150974Q;
                } else {
                    if (abstractC29840y instanceof C29828m) {
                        if (c35459c0.f150995l0 != null) {
                            zM112544y = true;
                        }
                    } else if (abstractC29840y instanceof C29822i) {
                        zM112544y = c35459c0.m112530C(((C29822i) abstractC29840y).f121901x);
                    } else if (abstractC29840y instanceof C29818g) {
                        zM112544y = c35459c0.m112544y(((C29818g) abstractC29840y).f121888x);
                    } else if (!(abstractC29840y instanceof C29839x)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zM112544y = false;
                }
                if (zM112544y) {
                    if (c16761x1 != null) {
                        C26027a c26027aM56345m = AbstractC20301a.m56345m(c16761x1);
                        C26027a c26027aM56345m2 = AbstractC20301a.m56345m(newConfig);
                        if (new C26029c(c26027aM56345m.f102950E, c26027aM56345m.f102954I, c26027aM56345m.f102959N).equals(new C26029c(c26027aM56345m2.f102950E, c26027aM56345m2.f102954I, c26027aM56345m2.f102959N))) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        z14 = true;
                    }
                }
                if (!z14) {
                    abstractC29840y = null;
                }
            } else {
                abstractC29840y = null;
            }
            c26186u.f103856E = abstractC29840y;
            InterfaceC30063j interfaceC30063j = this.f103836b;
            C2147u c2147u = new C2147u(this, newState, newConfig, interfaceC30057d, 11);
            c26180o.f103831w = this;
            c26180o.f103832x = newState;
            c26180o.f103830E = 1;
            if (AbstractC3006f0.m8705K(interfaceC30063j, c2147u, c26180o) == enumC31071a) {
                return enumC31071a;
            }
            c26181p = this;
            c0290f1 = newState;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0290f1 = c26180o.f103832x;
            c26181p = c26180o.f103831w;
            AbstractC34132o.m107864I(obj);
        }
        C26176k c26176k = c26181p.f103839e;
        C35459c0 paymentMethodMetadata = c0290f1.f1019E;
        c26176k.getClass();
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        c26176k.f103797b.m35247c(paymentMethodMetadata);
        return C23454a0.f92919a;
    }
}
