package p291l0;

import p000.AbstractC11266d;
import p002a0.C0046q;
import p635y2.InterfaceC39124q0;
import p636y3.C39169a;

/* JADX INFO: renamed from: l0.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22984o0 {
    /* JADX INFO: renamed from: a */
    public final void m66758a(InterfaceC39124q0 interfaceC39124q0, InterfaceC39124q0 interfaceC39124q1, long j7) {
        long jM66731c = AbstractC22960g2.m66731c(j7, EnumC22943c1.f90551w);
        if (interfaceC39124q0 != null) {
            int iMo446O = interfaceC39124q0.mo446O(C39169a.m124764h(jM66731c));
            new C0046q(C0046q.m97a(iMo446O, interfaceC39124q0.mo438C(iMo446O)));
        }
        if (interfaceC39124q1 != null) {
            int iMo446O2 = interfaceC39124q1.mo446O(C39169a.m124764h(jM66731c));
            new C0046q(C0046q.m97a(iMo446O2, interfaceC39124q1.mo438C(iMo446O2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22984o0)) {
            return false;
        }
        EnumC22981n0 enumC22981n0 = EnumC22981n0.f90670w;
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC11266d.m30448b(0, EnumC22981n0.f90670w.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + EnumC22981n0.f90670w + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
