package p043c4;

import java.util.ArrayList;
import java.util.List;
import m83.C25272z;
import p040c0.C3790x0;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;

/* JADX INFO: renamed from: c4.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C3961h implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: b */
    public static final C3961h f16148b = new C3961h(0);

    /* JADX INFO: renamed from: c */
    public static final C3961h f16149c = new C3961h(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16150a;

    public /* synthetic */ C3961h(int i13) {
        this.f16150a = i13;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: a */
    public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7) {
        switch (this.f16150a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iM124767k = 0;
                int iM124766j = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    AbstractC39104j1 abstractC39104j1Mo448T = ((InterfaceC39124q0) list.get(i13)).mo448T(j7);
                    iM124767k = Math.max(iM124767k, abstractC39104j1Mo448T.f168211w);
                    iM124766j = Math.max(iM124766j, abstractC39104j1Mo448T.f168212x);
                    arrayList.add(abstractC39104j1Mo448T);
                }
                if (list.isEmpty()) {
                    iM124767k = C39169a.m124767k(j7);
                    iM124766j = C39169a.m124766j(j7);
                }
                return interfaceC39133t0.mo86822W(iM124767k, iM124766j, C25272z.f99163w, new C3959g(arrayList, 0));
            default:
                int size2 = list.size();
                C25272z c25272z = C25272z.f99163w;
                if (size2 == 0) {
                    return interfaceC39133t0.mo86822W(0, 0, c25272z, C3953d.f16105F);
                }
                if (size2 == 1) {
                    AbstractC39104j1 abstractC39104j1Mo448T2 = ((InterfaceC39124q0) list.get(0)).mo448T(j7);
                    return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T2.f168211w, abstractC39104j1Mo448T2.f168212x, c25272z, new C3790x0(abstractC39104j1Mo448T2, 2));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i14 = 0; i14 < size3; i14++) {
                    AbstractC39104j1 abstractC39104j1Mo448T3 = ((InterfaceC39124q0) list.get(i14)).mo448T(j7);
                    iMax = Math.max(iMax, abstractC39104j1Mo448T3.f168211w);
                    iMax2 = Math.max(iMax2, abstractC39104j1Mo448T3.f168212x);
                    arrayList2.add(abstractC39104j1Mo448T3);
                }
                return interfaceC39133t0.mo86822W(iMax, iMax2, c25272z, new C3959g(arrayList2, 1));
        }
    }
}
