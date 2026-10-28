package p077d0;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.j1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11366j1 implements InterfaceC11372l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11372l f36434a;

    /* JADX INFO: renamed from: b */
    public final long f36435b;

    public C11366j1(InterfaceC11337c0 interfaceC11337c0, long j7) {
        this.f36434a = interfaceC11337c0;
        this.f36435b = j7;
    }

    @Override // p077d0.InterfaceC11372l
    /* JADX INFO: renamed from: a */
    public final InterfaceC11355g2 mo30534a(C11351f2 c11351f2) {
        return new C11370k1(this.f36434a.mo30534a(c11351f2), this.f36435b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11366j1)) {
            return false;
        }
        C11366j1 c11366j1 = (C11366j1) obj;
        return c11366j1.f36435b == this.f36435b && AbstractC22676k.m65745e(c11366j1.f36434a, this.f36434a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f36435b) + (this.f36434a.hashCode() * 31);
    }
}
