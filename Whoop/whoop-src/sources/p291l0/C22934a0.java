package p291l0;

import p669z2.InterfaceC40000c;
import p669z2.InterfaceC40004g;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22934a0 implements InterfaceC40000c {

    /* JADX INFO: renamed from: w */
    public final Function1 f90535w;

    /* JADX INFO: renamed from: x */
    public InterfaceC22940b2 f90536x;

    public C22934a0(Function1 function1) {
        this.f90535w = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22934a0) && ((C22934a0) obj).f90535w == this.f90535w;
    }

    @Override // p669z2.InterfaceC40000c
    /* JADX INFO: renamed from: h */
    public final void mo66704h(InterfaceC40004g interfaceC40004g) {
        InterfaceC22940b2 interfaceC22940b2 = (InterfaceC22940b2) interfaceC40004g.mo464a(AbstractC22953f.f90592d);
        if (AbstractC22676k.m65745e(interfaceC22940b2, this.f90536x)) {
            return;
        }
        this.f90536x = interfaceC22940b2;
        this.f90535w.invoke(interfaceC22940b2);
    }

    public final int hashCode() {
        return this.f90535w.hashCode();
    }
}
