package p291l0;

import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p669z2.C40005h;
import p669z2.InterfaceC40000c;
import p669z2.InterfaceC40003f;
import p669z2.InterfaceC40004g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.x1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23012x1 implements InterfaceC40000c, InterfaceC40003f {

    /* JADX INFO: renamed from: w */
    public final C28633k1 f90749w = AbstractC28683x.m87272z(new C22969j0(0));

    /* JADX INFO: renamed from: x */
    public final InterfaceC22940b2 f90750x;

    public C23012x1(InterfaceC22940b2 interfaceC22940b2) {
        this.f90750x = interfaceC22940b2;
    }

    @Override // p669z2.InterfaceC40003f
    /* JADX INFO: renamed from: d */
    public final InterfaceC22940b2 mo66776d() {
        return (InterfaceC22940b2) this.f90749w.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23012x1) {
            return AbstractC22676k.m65745e(((C23012x1) obj).f90750x, this.f90750x);
        }
        return false;
    }

    @Override // p669z2.InterfaceC40003f
    public final C40005h getKey() {
        return AbstractC22953f.f90592d;
    }

    @Override // p669z2.InterfaceC40000c
    /* JADX INFO: renamed from: h */
    public final void mo66704h(InterfaceC40004g interfaceC40004g) {
        this.f90749w.setValue(new C23009w1(this.f90750x, (InterfaceC22940b2) interfaceC40004g.mo464a(AbstractC22953f.f90592d)));
    }

    public final int hashCode() {
        return this.f90750x.hashCode();
    }
}
