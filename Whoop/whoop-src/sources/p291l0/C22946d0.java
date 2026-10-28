package p291l0;

import p026b2.C2306l;
import p026b2.InterfaceC2301g;
import p635y2.AbstractC39104j1;
import p636y3.EnumC39181m;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22946d0 extends AbstractC22953f {

    /* JADX INFO: renamed from: e */
    public final InterfaceC2301g f90577e;

    public C22946d0(InterfaceC2301g interfaceC2301g) {
        this.f90577e = interfaceC2301g;
    }

    @Override // p291l0.AbstractC22953f
    /* JADX INFO: renamed from: d */
    public final int mo66707d(int i13, EnumC39181m enumC39181m, AbstractC39104j1 abstractC39104j1, int i14) {
        return ((C2306l) this.f90577e).m7157a(0, i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22946d0) && AbstractC22676k.m65745e(this.f90577e, ((C22946d0) obj).f90577e);
    }

    public final int hashCode() {
        return Float.hashCode(((C2306l) this.f90577e).f9120a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f90577e + ')';
    }
}
