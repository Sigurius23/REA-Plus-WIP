package p324m9;

import p010a9.C0580e;
import p171g9.C15587d;
import p299l9.C23538y0;
import p299l9.InterfaceC23540z0;
import qg3.C30352d;

/* JADX INFO: renamed from: m9.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C25277e implements InterfaceC23540z0 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C25279g f99194E;

    /* JADX INFO: renamed from: w */
    public final C25279g f99195w;

    /* JADX INFO: renamed from: x */
    public final C23538y0 f99196x;

    /* JADX INFO: renamed from: y */
    public final int f99197y;

    /* JADX INFO: renamed from: z */
    public boolean f99198z;

    public C25277e(C25279g c25279g, C25279g c25279g2, C23538y0 c23538y0, int i13) {
        this.f99194E = c25279g;
        this.f99195w = c25279g2;
        this.f99196x = c23538y0;
        this.f99197y = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m74171a() {
        if (this.f99198z) {
            return;
        }
        C25279g c25279g = this.f99194E;
        C15587d c15587d = c25279g.f99201G;
        int[] iArr = c25279g.f99221x;
        int i13 = this.f99197y;
        c15587d.m43884b(iArr[i13], c25279g.f99222y[i13], 0, null, c25279g.f99214T);
        this.f99198z = true;
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: b */
    public final boolean mo36169b() {
        C25279g c25279g = this.f99194E;
        return !c25279g.m74178z() && this.f99196x.m68132o(c25279g.f99219Y);
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: c */
    public final void mo36170c() {
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: j */
    public final int mo36171j(long j7) {
        C25279g c25279g = this.f99194E;
        if (c25279g.m74178z()) {
            return 0;
        }
        boolean z4 = c25279g.f99219Y;
        C23538y0 c23538y0 = this.f99196x;
        int iM68131n = c23538y0.m68131n(j7, z4);
        AbstractC25273a abstractC25273a = c25279g.f99216V;
        if (abstractC25273a != null) {
            iM68131n = Math.min(iM68131n, abstractC25273a.m74167a(this.f99197y + 1) - c23538y0.m68129l());
        }
        c23538y0.m68139v(iM68131n);
        if (iM68131n > 0) {
            m74171a();
        }
        return iM68131n;
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: l */
    public final int mo36172l(C30352d c30352d, C0580e c0580e, int i13) {
        C25279g c25279g = this.f99194E;
        if (c25279g.m74178z()) {
            return -3;
        }
        AbstractC25273a abstractC25273a = c25279g.f99216V;
        C23538y0 c23538y0 = this.f99196x;
        if (abstractC25273a != null && abstractC25273a.m74167a(this.f99197y + 1) <= c23538y0.m68129l()) {
            return -3;
        }
        m74171a();
        return c23538y0.m68135r(c30352d, c0580e, i13, c25279g.f99219Y);
    }
}
