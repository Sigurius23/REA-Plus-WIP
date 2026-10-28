package p291l0;

import p005a3.AbstractC0262w0;
import p040c0.AbstractC3754k1;
import p635y2.InterfaceC39124q0;
import p636y3.AbstractC39170b;
import p636y3.AbstractC39177i;
import p636y3.C39169a;

/* JADX INFO: renamed from: l0.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22939b1 extends AbstractC3754k1 {

    /* JADX INFO: renamed from: P */
    public EnumC22935a1 f90546P;

    /* JADX INFO: renamed from: Q */
    public boolean f90547Q;

    @Override // p040c0.AbstractC3754k1
    /* JADX INFO: renamed from: X0 */
    public final long mo11567X0(InterfaceC39124q0 interfaceC39124q0, long j7) {
        int iMo446O = this.f90546P == EnumC22935a1.f90537w ? interfaceC39124q0.mo446O(C39169a.m124764h(j7)) : interfaceC39124q0.mo447Q(C39169a.m124764h(j7));
        if (iMo446O < 0) {
            iMo446O = 0;
        }
        if (iMo446O < 0) {
            AbstractC39177i.m124789a("width must be >= 0");
        }
        return AbstractC39170b.m124776h(iMo446O, iMo446O, 0, Integer.MAX_VALUE);
    }

    @Override // p040c0.AbstractC3754k1
    /* JADX INFO: renamed from: Y0 */
    public final boolean mo11568Y0() {
        return this.f90547Q;
    }

    @Override // p040c0.AbstractC3754k1, p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: g0 */
    public final int mo435g0(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return this.f90546P == EnumC22935a1.f90537w ? interfaceC39124q0.mo446O(i13) : interfaceC39124q0.mo447Q(i13);
    }

    @Override // p040c0.AbstractC3754k1, p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: o */
    public final int mo436o(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return this.f90546P == EnumC22935a1.f90537w ? interfaceC39124q0.mo446O(i13) : interfaceC39124q0.mo447Q(i13);
    }
}
