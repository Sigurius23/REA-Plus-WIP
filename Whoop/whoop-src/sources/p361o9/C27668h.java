package p361o9;

import p031b9.AbstractC2829f;
import p516u8.C34610p;
import p690zr.AbstractC41063y;

/* JADX INFO: renamed from: o9.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C27668h implements Comparable {

    /* JADX INFO: renamed from: w */
    public final boolean f111365w;

    /* JADX INFO: renamed from: x */
    public final boolean f111366x;

    public C27668h(C34610p c34610p, int i13) {
        this.f111365w = (c34610p.f145774e & 1) != 0;
        this.f111366x = AbstractC2829f.m8056m(i13, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C27668h c27668h = (C27668h) obj;
        return AbstractC41063y.f177072a.mo133310c(this.f111366x, c27668h.f111366x).mo133310c(this.f111365w, c27668h.f111365w).mo133312e();
    }
}
