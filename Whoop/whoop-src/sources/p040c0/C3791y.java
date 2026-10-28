package p040c0;

import java.util.ArrayList;
import java.util.List;
import m83.C25272z;
import p005a3.C0227m1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39126r;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39180l;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C3791y implements InterfaceC39127r0 {

    /* JADX INFO: renamed from: a */
    public final C3750j0 f15455a;

    /* JADX INFO: renamed from: b */
    public boolean f15456b;

    public C3791y(C3750j0 c3750j0) {
        this.f15455a = c3750j0;
    }

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
        boolean zMo781A = interfaceC39133t0.mo781A();
        C3750j0 c3750j0 = this.f15455a;
        if (zMo781A) {
            this.f15456b = true;
            c3750j0.f15332a.setValue(new C39180l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.f15456b) {
            c3750j0.f15332a.setValue(new C39180l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return interfaceC39133t0.mo86822W(iMax, iMax2, C25272z.f99163w, new C0227m1(arrayList, 8));
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: b */
    public final int mo537b(InterfaceC39126r interfaceC39126r, List list, int i13) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo438C = ((InterfaceC39124q0) list.get(0)).mo438C(i13);
        int iM118951C = AbstractC37056f.m118951C(list);
        int i14 = 1;
        if (1 <= iM118951C) {
            while (true) {
                int iMo438C2 = ((InterfaceC39124q0) list.get(i14)).mo438C(i13);
                if (iMo438C2 > iMo438C) {
                    iMo438C = iMo438C2;
                }
                if (i14 == iM118951C) {
                    break;
                }
                i14++;
            }
        }
        return iMo438C;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: c */
    public final int mo538c(InterfaceC39126r interfaceC39126r, List list, int i13) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo447Q = ((InterfaceC39124q0) list.get(0)).mo447Q(i13);
        int iM118951C = AbstractC37056f.m118951C(list);
        int i14 = 1;
        if (1 <= iM118951C) {
            while (true) {
                int iMo447Q2 = ((InterfaceC39124q0) list.get(i14)).mo447Q(i13);
                if (iMo447Q2 > iMo447Q) {
                    iMo447Q = iMo447Q2;
                }
                if (i14 == iM118951C) {
                    break;
                }
                i14++;
            }
        }
        return iMo447Q;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: d */
    public final int mo539d(InterfaceC39126r interfaceC39126r, List list, int i13) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo449b = ((InterfaceC39124q0) list.get(0)).mo449b(i13);
        int iM118951C = AbstractC37056f.m118951C(list);
        int i14 = 1;
        if (1 <= iM118951C) {
            while (true) {
                int iMo449b2 = ((InterfaceC39124q0) list.get(i14)).mo449b(i13);
                if (iMo449b2 > iMo449b) {
                    iMo449b = iMo449b2;
                }
                if (i14 == iM118951C) {
                    break;
                }
                i14++;
            }
        }
        return iMo449b;
    }

    @Override // p635y2.InterfaceC39127r0
    /* JADX INFO: renamed from: e */
    public final int mo540e(InterfaceC39126r interfaceC39126r, List list, int i13) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo446O = ((InterfaceC39124q0) list.get(0)).mo446O(i13);
        int iM118951C = AbstractC37056f.m118951C(list);
        int i14 = 1;
        if (1 <= iM118951C) {
            while (true) {
                int iMo446O2 = ((InterfaceC39124q0) list.get(i14)).mo446O(i13);
                if (iMo446O2 > iMo446O) {
                    iMo446O = iMo446O2;
                }
                if (i14 == iM118951C) {
                    break;
                }
                i14++;
            }
        }
        return iMo446O;
    }
}
