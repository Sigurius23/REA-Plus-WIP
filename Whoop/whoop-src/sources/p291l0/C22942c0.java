package p291l0;

import p026b2.InterfaceC2300f;
import p635y2.AbstractC39104j1;
import p636y3.EnumC39181m;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22942c0 extends AbstractC22953f {

    /* JADX INFO: renamed from: e */
    public final InterfaceC2300f f90550e;

    public C22942c0(InterfaceC2300f interfaceC2300f) {
        this.f90550e = interfaceC2300f;
    }

    @Override // p291l0.AbstractC22953f
    /* JADX INFO: renamed from: d */
    public final int mo66707d(int i13, EnumC39181m enumC39181m, AbstractC39104j1 abstractC39104j1, int i14) {
        return this.f90550e.mo7155a(0, i13, enumC39181m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22942c0) && AbstractC22676k.m65745e(this.f90550e, ((C22942c0) obj).f90550e);
    }

    public final int hashCode() {
        return this.f90550e.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f90550e + ')';
    }
}
