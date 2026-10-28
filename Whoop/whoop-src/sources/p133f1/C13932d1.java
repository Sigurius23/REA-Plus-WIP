package p133f1;

import c41.C4014e1;
import java.util.ArrayList;
import java.util.List;
import m83.C25272z;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;

/* JADX INFO: renamed from: f1.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13932d1 implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public static final C13932d1 f49671a = new C13932d1();

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC39104j1 abstractC39104j1Mo448T = ((InterfaceC39124q0) list.get(i13)).mo448T(j7);
            iMax = Math.max(iMax, abstractC39104j1Mo448T.f168211w);
            iMax2 = Math.max(iMax2, abstractC39104j1Mo448T.f168212x);
            arrayList.add(abstractC39104j1Mo448T);
        }
        return interfaceC39133t0.mo86822W(iMax, iMax2, C25272z.f99163w, new C4014e1(arrayList, 1));
    }
}
