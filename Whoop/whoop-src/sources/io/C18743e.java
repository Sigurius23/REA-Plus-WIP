package io;

import p465rm.C31521c0;
import p690zr.AbstractC41063y;

/* JADX INFO: renamed from: io.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C18743e implements Comparable {

    /* JADX INFO: renamed from: w */
    public final boolean f73653w;

    /* JADX INFO: renamed from: x */
    public final boolean f73654x;

    public C18743e(C31521c0 c31521c0, int i13) {
        this.f73653w = (c31521c0.f130101z & 1) != 0;
        this.f73654x = C20033m.m55867b(i13, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C18743e c18743e = (C18743e) obj;
        return AbstractC41063y.f177072a.mo133310c(this.f73654x, c18743e.f73654x).mo133310c(this.f73653w, c18743e.f73653w).mo133312e();
    }
}
