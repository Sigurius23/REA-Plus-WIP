package p040c0;

import m83.C25272z;
import p005a3.AbstractC0262w0;
import p005a3.InterfaceC0186c0;
import p026b2.AbstractC2316v;
import p105e1.C12526m;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;

/* JADX INFO: renamed from: c0.k1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3754k1 extends AbstractC2316v implements InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ int f15345O;

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: E */
    public int mo433E(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        switch (this.f15345O) {
            case 0:
                break;
        }
        return interfaceC39124q0.mo449b(i13);
    }

    /* JADX INFO: renamed from: X0 */
    public abstract long mo11567X0(InterfaceC39124q0 interfaceC39124q0, long j7);

    /* JADX INFO: renamed from: Y0 */
    public abstract boolean mo11568Y0();

    /* JADX INFO: renamed from: b */
    public InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        long jMo11567X0 = mo11567X0(interfaceC39124q0, j7);
        if (mo11568Y0()) {
            jMo11567X0 = AbstractC39170b.m124773e(j7, jMo11567X0);
        }
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(jMo11567X0);
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C12526m(abstractC39104j1Mo448T, 4));
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: g0 */
    public int mo435g0(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        switch (this.f15345O) {
            case 0:
                break;
        }
        return interfaceC39124q0.mo446O(i13);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: o */
    public int mo436o(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        switch (this.f15345O) {
            case 0:
                break;
        }
        return interfaceC39124q0.mo447Q(i13);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: y */
    public int mo437y(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        switch (this.f15345O) {
            case 0:
                break;
        }
        return interfaceC39124q0.mo438C(i13);
    }
}
