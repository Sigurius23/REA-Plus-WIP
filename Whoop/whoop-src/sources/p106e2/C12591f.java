package p106e2;

import e10.C12554k0;
import io.sentry.config.AbstractC20301a;
import p005a3.AbstractC0201g;
import p005a3.InterfaceC0178a0;
import p005a3.InterfaceC0240p2;
import p026b2.AbstractC2316v;
import p028b4.C2696g;
import p108e4.AbstractC12667a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: e2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C12591f extends AbstractC2316v implements InterfaceC0240p2, InterfaceC0178a0 {

    /* JADX INFO: renamed from: O */
    public C12591f f42974O;

    /* JADX INFO: renamed from: P */
    public C12591f f42975P;

    /* JADX INFO: renamed from: Q */
    public long f42976Q;

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        this.f42975P = null;
        this.f42974O = null;
    }

    /* JADX INFO: renamed from: X0 */
    public final boolean m35288X0(C12554k0 c12554k0) {
        C12591f c12591f = this.f42974O;
        if (c12591f != null) {
            return c12591f.m35288X0(c12554k0);
        }
        C12591f c12591f2 = this.f42975P;
        if (c12591f2 != null) {
            return c12591f2.m35288X0(c12554k0);
        }
        return false;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m35289Y0(C12554k0 c12554k0) {
        C12591f c12591f = this.f42975P;
        if (c12591f != null) {
            c12591f.m35289Y0(c12554k0);
            return;
        }
        C12591f c12591f2 = this.f42974O;
        if (c12591f2 != null) {
            c12591f2.m35289Y0(c12554k0);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m35290Z0(C12554k0 c12554k0) {
        C12591f c12591f = this.f42975P;
        if (c12591f != null) {
            c12591f.m35290Z0(c12554k0);
        }
        C12591f c12591f2 = this.f42974O;
        if (c12591f2 != null) {
            c12591f2.m35290Z0(c12554k0);
        }
        this.f42974O = null;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m35291a1(C12554k0 c12554k0) {
        InterfaceC0240p2 interfaceC0240p2;
        C12591f c12591f;
        C12591f c12591f2 = this.f42974O;
        if (c12591f2 == null || !AbstractC12667a.m35462n(c12591f2, AbstractC20301a.m56305D(c12554k0))) {
            if (this.f9142w.f9141N) {
                C22669g0 c22669g0 = new C22669g0();
                AbstractC0201g.m520t(this, new C2696g(c22669g0, this, c12554k0, 2));
                interfaceC0240p2 = (InterfaceC0240p2) c22669g0.f89336w;
            } else {
                interfaceC0240p2 = null;
            }
            c12591f = (C12591f) interfaceC0240p2;
        } else {
            c12591f = c12591f2;
        }
        if (c12591f != null && c12591f2 == null) {
            AbstractC12667a.m35463o(c12591f, c12554k0);
            C12591f c12591f3 = this.f42975P;
            if (c12591f3 != null) {
                c12591f3.m35290Z0(c12554k0);
            }
        } else if (c12591f == null && c12591f2 != null) {
            C12591f c12591f4 = this.f42975P;
            if (c12591f4 != null) {
                AbstractC12667a.m35463o(c12591f4, c12554k0);
            }
            c12591f2.m35290Z0(c12554k0);
        } else if (!AbstractC22676k.m65745e(c12591f, c12591f2)) {
            if (c12591f != null) {
                AbstractC12667a.m35463o(c12591f, c12554k0);
            }
            if (c12591f2 != null) {
                c12591f2.m35290Z0(c12554k0);
            }
        } else if (c12591f != null) {
            c12591f.m35291a1(c12554k0);
        } else {
            C12591f c12591f5 = this.f42975P;
            if (c12591f5 != null) {
                c12591f5.m35291a1(c12554k0);
            }
        }
        this.f42974O = c12591f;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m35292b1(C12554k0 c12554k0) {
        C12591f c12591f = this.f42975P;
        if (c12591f != null) {
            c12591f.m35292b1(c12554k0);
            return;
        }
        C12591f c12591f2 = this.f42974O;
        if (c12591f2 != null) {
            c12591f2.m35292b1(c12554k0);
        }
    }

    @Override // p005a3.InterfaceC0240p2
    /* JADX INFO: renamed from: f */
    public final Object mo276f() {
        return C12589d.f42971a;
    }

    @Override // p005a3.InterfaceC0178a0
    /* JADX INFO: renamed from: g */
    public final void mo423g(long j7) {
        this.f42976Q = j7;
    }
}
