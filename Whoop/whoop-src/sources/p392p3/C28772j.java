package p392p3;

import bp0.C3526n;
import e93.AbstractC12889b;
import p002a0.C0005a0;
import p007a6.C0428i;
import p014aj.C0928c;
import p014aj.C0929d;
import p249jc.C21567b;
import p389p0.C28539n0;

/* JADX INFO: renamed from: p3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C28772j implements InterfaceC28770h {

    /* JADX INFO: renamed from: a */
    public final C0928c f116523a;

    /* JADX INFO: renamed from: b */
    public final C28758a f116524b;

    /* JADX INFO: renamed from: c */
    public final C28539n0 f116525c;

    /* JADX INFO: renamed from: d */
    public final C28775m f116526d;

    /* JADX INFO: renamed from: e */
    public final C0929d f116527e;

    /* JADX INFO: renamed from: f */
    public final C0428i f116528f;

    public C28772j(C0928c c0928c, C28758a c28758a) {
        C28539n0 c28539n0 = AbstractC28773k.f116529a;
        C28775m c28775m = new C28775m(AbstractC28773k.f116530b);
        C0929d c0929d = new C0929d(23, false);
        this.f116523a = c0928c;
        this.f116524b = c28758a;
        this.f116525c = c28539n0;
        this.f116526d = c28775m;
        this.f116527e = c0929d;
        this.f116528f = new C0428i(this, 28);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC28767e0 m87528a(C28759a0 c28759a0) {
        C28539n0 c28539n0 = this.f116525c;
        C3526n c3526n = new C3526n(29, this, c28759a0);
        synchronized (((C21567b) c28539n0.f115462x)) {
            InterfaceC28767e0 interfaceC28767e0 = (InterfaceC28767e0) ((C0005a0) c28539n0.f115463y).m2c(c28759a0);
            if (interfaceC28767e0 != null) {
                if (interfaceC28767e0.mo87527b()) {
                    return interfaceC28767e0;
                }
            }
            try {
                InterfaceC28767e0 interfaceC28767e1 = (InterfaceC28767e0) c3526n.invoke(new C28761b0(0, c28539n0, c28759a0));
                synchronized (((C21567b) c28539n0.f115462x)) {
                    if (((C0005a0) c28539n0.f115463y).m2c(c28759a0) == null && interfaceC28767e1.mo87527b()) {
                        ((C0005a0) c28539n0.f115463y).m3d(c28759a0, interfaceC28767e1);
                    }
                }
                return interfaceC28767e1;
            } catch (Exception e5) {
                throw new IllegalStateException("Could not load font", e5);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC28767e0 m87529b(AbstractC28771i abstractC28771i, C28780r c28780r, int i13, int i14) {
        C28758a c28758a = this.f116524b;
        c28758a.getClass();
        int i15 = c28758a.f116492w;
        C28780r c28780r2 = (i15 == 0 || i15 == Integer.MAX_VALUE) ? c28780r : new C28780r(AbstractC12889b.m36284n(c28780r.f116547w + i15, 1, 1000));
        this.f116523a.getClass();
        return m87528a(new C28759a0(abstractC28771i, c28780r2, i13, i14, null));
    }
}
