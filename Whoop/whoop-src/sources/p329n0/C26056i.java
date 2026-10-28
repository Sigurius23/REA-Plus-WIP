package p329n0;

import androidx.compose.foundation.lazy.C1104b;
import androidx.compose.runtime.Composer;
import mx1.C26003i;
import p012ab.C0682h0;
import p389p0.AbstractC28560y;
import p389p0.InterfaceC28509b0;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n0.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C26056i implements InterfaceC28509b0 {

    /* JADX INFO: renamed from: a */
    public final C26068u f103130a;

    /* JADX INFO: renamed from: b */
    public final C26053f f103131b;

    /* JADX INFO: renamed from: c */
    public final C1104b f103132c;

    /* JADX INFO: renamed from: d */
    public final C0682h0 f103133d;

    public C26056i(C26068u c26068u, C26053f c26053f, C1104b c1104b, C0682h0 c0682h0) {
        this.f103130a = c26068u;
        this.f103131b = c26053f;
        this.f103132c = c1104b;
        this.f103133d = c0682h0;
    }

    @Override // p389p0.InterfaceC28509b0
    /* JADX INFO: renamed from: a */
    public final Object mo77530a(int i13) {
        return this.f103131b.m86887l(i13);
    }

    @Override // p389p0.InterfaceC28509b0
    /* JADX INFO: renamed from: b */
    public final int mo77531b(Object obj) {
        return this.f103133d.m1699n(obj);
    }

    @Override // p389p0.InterfaceC28509b0
    /* JADX INFO: renamed from: c */
    public final Object mo77532c(int i13) {
        Object objM1700o = this.f103133d.m1700o(i13);
        return objM1700o == null ? this.f103131b.m86888n(i13) : objM1700o;
    }

    @Override // p389p0.InterfaceC28509b0
    /* JADX INFO: renamed from: d */
    public final void mo77533d(int i13, Object obj, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-462424778);
        int i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14 | (c28655q.m87157i(obj) ? 32 : 16) | (c28655q.m87153g(this) ? 256 : 128);
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            AbstractC28560y.m86877d(obj, i13, this.f103130a.f103235r, AbstractC37817c.m121344e(-824725566, c28655q, new C26055h(this, i13, 0)), c28655q, ((i15 >> 3) & 14) | 3072 | ((i15 << 3) & 112));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(this, i13, obj, i14, 3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26056i)) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f103131b, ((C26056i) obj).f103131b);
    }

    @Override // p389p0.InterfaceC28509b0
    public final int getItemCount() {
        return this.f103131b.mo77527m().f2432x;
    }

    public final int hashCode() {
        return this.f103131b.hashCode();
    }
}
