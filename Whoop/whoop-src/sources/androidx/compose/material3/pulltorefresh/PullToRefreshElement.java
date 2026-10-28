package androidx.compose.material3.pulltorefresh;

import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import p000.AbstractC30802r;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p330n1.C26111k;
import p330n1.C26114n;
import p330n1.C26115o;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;", "La3/h1;", "Ln1/n;", "material3"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class PullToRefreshElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final float f4765E;

    /* JADX INFO: renamed from: w */
    public final boolean f4766w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC4339a f4767x;

    /* JADX INFO: renamed from: y */
    public final boolean f4768y;

    /* JADX INFO: renamed from: z */
    public final C26115o f4769z;

    public PullToRefreshElement(boolean z4, InterfaceC4339a interfaceC4339a, boolean z13, C26115o c26115o, float f13) {
        this.f4766w = z4;
        this.f4767x = interfaceC4339a;
        this.f4768y = z13;
        this.f4769z = c26115o;
        this.f4765E = f13;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C26114n(this.f4766w, this.f4767x, this.f4768y, this.f4769z, this.f4765E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.f4766w == pullToRefreshElement.f4766w && this.f4768y == pullToRefreshElement.f4768y && this.f4767x == pullToRefreshElement.f4767x && AbstractC22676k.m65745e(this.f4769z, pullToRefreshElement.f4769z) && C39174f.m124782b(this.f4765E, pullToRefreshElement.f4765E);
    }

    public final int hashCode() {
        return Float.hashCode(this.f4765E) + ((this.f4769z.hashCode() + AbstractC30802r.m94755d(AbstractC2875y.m8289b(Boolean.hashCode(this.f4766w) * 31, 31, this.f4768y), 31, this.f4767x)) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "PullToRefreshModifierNode";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(Boolean.valueOf(this.f4766w), "isRefreshing");
        c2365d3.m7292c(this.f4767x, "onRefresh");
        c2365d3.m7292c(Boolean.valueOf(this.f4768y), "enabled");
        c2365d3.m7292c(this.f4769z, "state");
        c2365d3.m7292c(new C39174f(this.f4765E), "threshold");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C26114n c26114n = (C26114n) abstractC2316v;
        c26114n.f103458R = this.f4767x;
        c26114n.f103459S = this.f4768y;
        c26114n.f103460T = this.f4769z;
        c26114n.f103461U = this.f4765E;
        boolean z4 = c26114n.f103457Q;
        boolean z13 = this.f4766w;
        if (z4 != z13) {
            c26114n.f103457Q = z13;
            AbstractC3006f0.m8732z(c26114n.m7158L0(), null, null, new C26111k(c26114n, null, 2), 3);
        }
    }
}
