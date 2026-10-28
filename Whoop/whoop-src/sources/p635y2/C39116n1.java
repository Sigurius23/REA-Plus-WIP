package p635y2;

import java.util.ArrayList;
import java.util.List;
import m83.C25272z;
import p005a3.AbstractC0210i0;
import p040c0.C3741g0;
import p043c4.C3959g;
import p636y3.AbstractC39170b;
import p636y3.C39169a;

/* JADX INFO: renamed from: y2.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C39116n1 extends AbstractC0210i0 {

    /* JADX INFO: renamed from: b */
    public static final C39116n1 f168244b = new C39116n1("Undefined intrinsics block and it is required");

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        int size = list.size();
        C25272z c25272z = C25272z.f99163w;
        if (size == 0) {
            return interfaceC39133t0.mo86822W(C39169a.m124767k(j7), C39169a.m124766j(j7), c25272z, C39107k1.f168218y);
        }
        if (size == 1) {
            AbstractC39104j1 abstractC39104j1Mo448T = ((InterfaceC39124q0) list.get(0)).mo448T(j7);
            return interfaceC39133t0.mo86822W(AbstractC39170b.m124775g(abstractC39104j1Mo448T.f168211w, j7), AbstractC39170b.m124774f(abstractC39104j1Mo448T.f168212x, j7), c25272z, new C3741g0(abstractC39104j1Mo448T, 2));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            AbstractC39104j1 abstractC39104j1Mo448T2 = ((InterfaceC39124q0) list.get(i13)).mo448T(j7);
            iMax = Math.max(abstractC39104j1Mo448T2.f168211w, iMax);
            iMax2 = Math.max(abstractC39104j1Mo448T2.f168212x, iMax2);
            arrayList.add(abstractC39104j1Mo448T2);
        }
        return interfaceC39133t0.mo86822W(AbstractC39170b.m124775g(iMax, j7), AbstractC39170b.m124774f(iMax2, j7), c25272z, new C3959g(arrayList, 2));
    }
}
