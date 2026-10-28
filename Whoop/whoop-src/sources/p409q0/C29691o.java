package p409q0;

import androidx.compose.runtime.Composer;
import of2.C27900d;
import p012ab.C0682h0;
import p329n0.C26055h;
import p389p0.AbstractC28560y;
import p389p0.InterfaceC28509b0;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q0.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C29691o implements InterfaceC28509b0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC29701y f121366a;

    /* JADX INFO: renamed from: b */
    public final AbstractC28560y f121367b;

    /* JADX INFO: renamed from: c */
    public final C0682h0 f121368c;

    public C29691o(AbstractC29701y abstractC29701y, C29690n c29690n, C0682h0 c0682h0) {
        this.f121366a = abstractC29701y;
        this.f121367b = c29690n;
        this.f121368c = c0682h0;
    }

    @Override // p389p0.InterfaceC28509b0
    /* JADX INFO: renamed from: b */
    public final int mo77531b(Object obj) {
        return this.f121368c.m1699n(obj);
    }

    @Override // p389p0.InterfaceC28509b0
    /* JADX INFO: renamed from: c */
    public final Object mo77532c(int i13) {
        Object objM1700o = this.f121368c.m1700o(i13);
        return objM1700o == null ? this.f121367b.m86888n(i13) : objM1700o;
    }

    @Override // p389p0.InterfaceC28509b0
    /* JADX INFO: renamed from: d */
    public final void mo77533d(int i13, Object obj, Composer composer, int i14) {
        int i15;
        Object obj2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1201380429);
        int i16 = (c28655q.m87149e(i13) ? 4 : 2) | i14 | (c28655q.m87157i(obj) ? 32 : 16) | (c28655q.m87153g(this) ? 256 : 128);
        if (c28655q.m87135U(i16 & 1, (i16 & 147) != 146)) {
            i15 = i13;
            obj2 = obj;
            AbstractC28560y.m86877d(obj2, i15, this.f121366a.f121423C, AbstractC37817c.m121344e(1142237095, c28655q, new C26055h(this, i13, 2)), c28655q, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112));
        } else {
            i15 = i13;
            obj2 = obj;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(this, i15, obj2, i14);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29691o)) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f121367b, ((C29691o) obj).f121367b);
    }

    @Override // p389p0.InterfaceC28509b0
    public final int getItemCount() {
        return this.f121367b.mo77527m().f2432x;
    }

    public final int hashCode() {
        return this.f121367b.hashCode();
    }
}
