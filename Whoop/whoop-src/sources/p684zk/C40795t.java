package p684zk;

import p586wk.InterfaceC37327e;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: zk.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C40795t implements InterfaceC40801z {

    /* JADX INFO: renamed from: E */
    public final InterfaceC37327e f175942E;

    /* JADX INFO: renamed from: F */
    public int f175943F;

    /* JADX INFO: renamed from: G */
    public boolean f175944G;

    /* JADX INFO: renamed from: w */
    public final boolean f175945w;

    /* JADX INFO: renamed from: x */
    public final boolean f175946x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC40801z f175947y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC40794s f175948z;

    public C40795t(InterfaceC40801z interfaceC40801z, boolean z4, boolean z13, InterfaceC37327e interfaceC37327e, InterfaceC40794s interfaceC40794s) {
        AbstractC29125c.m88539p(interfaceC40801z, "Argument must not be null");
        this.f175947y = interfaceC40801z;
        this.f175945w = z4;
        this.f175946x = z13;
        this.f175942E = interfaceC37327e;
        AbstractC29125c.m88539p(interfaceC40794s, "Argument must not be null");
        this.f175948z = interfaceC40794s;
    }

    @Override // p684zk.InterfaceC40801z
    /* JADX INFO: renamed from: a */
    public final synchronized void mo44996a() {
        if (this.f175943F > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f175944G) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f175944G = true;
        if (this.f175946x) {
            this.f175947y.mo44996a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m132303b() {
        if (this.f175944G) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f175943F++;
    }

    @Override // p684zk.InterfaceC40801z
    /* JADX INFO: renamed from: c */
    public final Class mo44997c() {
        return this.f175947y.mo44997c();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m132304d() {
        return this.f175945w;
    }

    /* JADX INFO: renamed from: e */
    public final void m132305e() {
        boolean z4;
        synchronized (this) {
            int i13 = this.f175943F;
            if (i13 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z4 = true;
            int i14 = i13 - 1;
            this.f175943F = i14;
            if (i14 != 0) {
                z4 = false;
            }
        }
        if (z4) {
            ((C40787l) this.f175948z).m132292e(this.f175942E, this);
        }
    }

    @Override // p684zk.InterfaceC40801z
    public final Object get() {
        return this.f175947y.get();
    }

    @Override // p684zk.InterfaceC40801z
    public final int getSize() {
        return this.f175947y.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f175945w + ", listener=" + this.f175948z + ", key=" + this.f175942E + ", acquired=" + this.f175943F + ", isRecycled=" + this.f175944G + ", resource=" + this.f175947y + '}';
    }
}
