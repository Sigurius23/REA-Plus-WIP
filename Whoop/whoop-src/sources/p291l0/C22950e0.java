package p291l0;

import ch.C4592m;
import kx1.C22881b;
import m83.C25272z;
import p027b3.AbstractC2409m2;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39080c0;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p669z2.InterfaceC40000c;
import p669z2.InterfaceC40004g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22950e0 extends AbstractC2409m2 implements InterfaceC39080c0, InterfaceC40000c {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f90583z = 0;

    /* JADX INFO: renamed from: x */
    public final InterfaceC22940b2 f90584x;

    /* JADX INFO: renamed from: y */
    public final C28633k1 f90585y;

    public C22950e0(C22937b c22937b) {
        this.f90584x = c22937b;
        this.f90585y = AbstractC28683x.m87272z(c22937b);
    }

    @Override // p635y2.InterfaceC39080c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo14262b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        int iMo43079c = ((InterfaceC22940b2) this.f90585y.getValue()).mo43079c(interfaceC39133t0);
        C25272z c25272z = C25272z.f99163w;
        if (iMo43079c == 0) {
            return interfaceC39133t0.mo86822W(0, 0, c25272z, new C22881b(6));
        }
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(C39169a.m124758b(j7, 0, 0, iMo43079c, iMo43079c, 3));
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, iMo43079c, c25272z, new C4592m(abstractC39104j1Mo448T, 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C22950e0) {
            return AbstractC22676k.m65745e(this.f90584x, ((C22950e0) obj).f90584x);
        }
        return false;
    }

    @Override // p669z2.InterfaceC40000c
    /* JADX INFO: renamed from: h */
    public final void mo66704h(InterfaceC40004g interfaceC40004g) {
        this.f90585y.setValue(new C22958g0(this.f90584x, (InterfaceC22940b2) interfaceC40004g.mo464a(AbstractC22953f.f90592d)));
    }

    public final int hashCode() {
        return AbstractC22960g2.f90607a.hashCode() + (this.f90584x.hashCode() * 31);
    }
}
