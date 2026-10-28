package p077d0;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.k1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11370k1 implements InterfaceC11355g2 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC11355g2 f36446w;

    /* JADX INFO: renamed from: x */
    public final long f36447x;

    public C11370k1(InterfaceC11355g2 interfaceC11355g2, long j7) {
        this.f36446w = interfaceC11355g2;
        this.f36447x = j7;
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: a */
    public final boolean mo2317a() {
        return this.f36446w.mo2317a();
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: c */
    public final long mo2197c(AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return this.f36446w.mo2197c(abstractC11395r, abstractC11395r2, abstractC11395r3) + this.f36447x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11370k1)) {
            return false;
        }
        C11370k1 c11370k1 = (C11370k1) obj;
        return c11370k1.f36447x == this.f36447x && AbstractC22676k.m65745e(c11370k1.f36446w, this.f36446w);
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: h */
    public final AbstractC11395r mo2202h(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        long j13 = this.f36447x;
        return j7 < j13 ? abstractC11395r : this.f36446w.mo2202h(j7 - j13, abstractC11395r, abstractC11395r2, abstractC11395r3);
    }

    public final int hashCode() {
        return Long.hashCode(this.f36447x) + (this.f36446w.hashCode() * 31);
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: m */
    public final AbstractC11395r mo2205m(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        long j13 = this.f36447x;
        return j7 < j13 ? abstractC11395r3 : this.f36446w.mo2205m(j7 - j13, abstractC11395r, abstractC11395r2, abstractC11395r3);
    }
}
