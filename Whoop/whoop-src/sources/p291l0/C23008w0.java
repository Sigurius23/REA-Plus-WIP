package p291l0;

import m83.C25272z;
import p163g1.C15109p3;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39080c0;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p669z2.C40005h;
import p669z2.InterfaceC40000c;
import p669z2.InterfaceC40003f;
import p669z2.InterfaceC40004g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23008w0 implements InterfaceC39080c0, InterfaceC40000c, InterfaceC40003f {

    /* JADX INFO: renamed from: w */
    public final InterfaceC22940b2 f90740w;

    /* JADX INFO: renamed from: x */
    public final C28633k1 f90741x;

    /* JADX INFO: renamed from: y */
    public final C28633k1 f90742y;

    public C23008w0(InterfaceC22940b2 interfaceC22940b2) {
        this.f90740w = interfaceC22940b2;
        this.f90741x = AbstractC28683x.m87272z(interfaceC22940b2);
        this.f90742y = AbstractC28683x.m87272z(interfaceC22940b2);
    }

    @Override // p635y2.InterfaceC39080c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo14262b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        C28633k1 c28633k1 = this.f90741x;
        int iMo43077a = ((InterfaceC22940b2) c28633k1.getValue()).mo43077a(interfaceC39133t0, interfaceC39133t0.getLayoutDirection());
        int iMo43080d = ((InterfaceC22940b2) c28633k1.getValue()).mo43080d(interfaceC39133t0);
        int iMo43078b = ((InterfaceC22940b2) c28633k1.getValue()).mo43078b(interfaceC39133t0, interfaceC39133t0.getLayoutDirection()) + iMo43077a;
        int iMo43079c = ((InterfaceC22940b2) c28633k1.getValue()).mo43079c(interfaceC39133t0) + iMo43080d;
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(AbstractC39170b.m124777i(-iMo43078b, j7, -iMo43079c));
        return interfaceC39133t0.mo86822W(AbstractC39170b.m124775g(abstractC39104j1Mo448T.f168211w + iMo43078b, j7), AbstractC39170b.m124774f(abstractC39104j1Mo448T.f168212x + iMo43079c, j7), C25272z.f99163w, new C15109p3(abstractC39104j1Mo448T, iMo43077a, iMo43080d, 1));
    }

    @Override // p669z2.InterfaceC40003f
    /* JADX INFO: renamed from: d */
    public final InterfaceC22940b2 mo66776d() {
        return (InterfaceC22940b2) this.f90742y.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23008w0) {
            return AbstractC22676k.m65745e(((C23008w0) obj).f90740w, this.f90740w);
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
        InterfaceC22940b2 interfaceC22940b2 = (InterfaceC22940b2) interfaceC40004g.mo464a(AbstractC22953f.f90592d);
        InterfaceC22940b2 interfaceC22940b3 = this.f90740w;
        this.f90741x.setValue(new C22958g0(interfaceC22940b3, interfaceC22940b2));
        this.f90742y.setValue(new C23009w1(interfaceC22940b2, interfaceC22940b3));
    }

    public final int hashCode() {
        return this.f90740w.hashCode();
    }
}
