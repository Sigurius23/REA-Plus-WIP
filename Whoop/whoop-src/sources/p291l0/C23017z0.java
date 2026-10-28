package p291l0;

import p005a3.AbstractC0262w0;
import p040c0.AbstractC3754k1;
import p635y2.InterfaceC39124q0;
import p636y3.AbstractC39170b;
import p636y3.AbstractC39177i;
import p636y3.C39169a;

/* JADX INFO: renamed from: l0.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23017z0 extends AbstractC3754k1 {

    /* JADX INFO: renamed from: P */
    public EnumC22935a1 f90758P;

    /* JADX INFO: renamed from: Q */
    public boolean f90759Q;

    @Override // p040c0.AbstractC3754k1, p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: E */
    public final int mo433E(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return this.f90758P == EnumC22935a1.f90537w ? interfaceC39124q0.mo438C(i13) : interfaceC39124q0.mo449b(i13);
    }

    @Override // p040c0.AbstractC3754k1
    /* JADX INFO: renamed from: X0 */
    public final long mo11567X0(InterfaceC39124q0 interfaceC39124q0, long j7) {
        int iMo438C = this.f90758P == EnumC22935a1.f90537w ? interfaceC39124q0.mo438C(C39169a.m124765i(j7)) : interfaceC39124q0.mo449b(C39169a.m124765i(j7));
        if (iMo438C < 0) {
            iMo438C = 0;
        }
        if (iMo438C < 0) {
            AbstractC39177i.m124789a("height must be >= 0");
        }
        return AbstractC39170b.m124776h(0, Integer.MAX_VALUE, iMo438C, iMo438C);
    }

    @Override // p040c0.AbstractC3754k1
    /* JADX INFO: renamed from: Y0 */
    public final boolean mo11568Y0() {
        return this.f90759Q;
    }

    @Override // p040c0.AbstractC3754k1, p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: y */
    public final int mo437y(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return this.f90758P == EnumC22935a1.f90537w ? interfaceC39124q0.mo438C(i13) : interfaceC39124q0.mo449b(i13);
    }
}
