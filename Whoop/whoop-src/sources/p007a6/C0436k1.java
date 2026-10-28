package p007a6;

import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: a6.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0436k1 implements InterfaceC30061h {

    /* JADX INFO: renamed from: w */
    public final C0436k1 f1496w;

    /* JADX INFO: renamed from: x */
    public final C0429i0 f1497x;

    public C0436k1(C0436k1 c0436k1, C0429i0 c0429i0) {
        this.f1496w = c0436k1;
        this.f1497x = c0429i0;
    }

    /* JADX INFO: renamed from: a */
    public final void m1119a(C0429i0 c0429i0) {
        if (this.f1497x == c0429i0) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        C0436k1 c0436k1 = this.f1496w;
        if (c0436k1 != null) {
            c0436k1.m1119a(c0429i0);
        }
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return interfaceC4351m.invoke(obj, this);
    }

    @Override // q83.InterfaceC30063j
    public final /* bridge */ InterfaceC30061h get(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36238D(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30061h
    public final InterfaceC30062i getKey() {
        return C0433j1.f1489w;
    }

    @Override // q83.InterfaceC30063j
    public final /* bridge */ InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36251Q(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30063j
    public final /* bridge */ InterfaceC30063j plus(InterfaceC30063j interfaceC30063j) {
        return AbstractC12889b.m36254T(this, interfaceC30063j);
    }
}
