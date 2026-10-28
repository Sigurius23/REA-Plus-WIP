package p291l0;

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
import p636y3.C39169a;

/* JADX INFO: renamed from: l0.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23015y1 extends AbstractC2316v implements InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public float f90755O;

    /* JADX INFO: renamed from: P */
    public float f90756P;

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: E */
    public final int mo433E(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        int iMo449b = interfaceC39124q0.mo449b(i13);
        int iMo724F = !Float.isNaN(this.f90756P) ? abstractC0262w0.mo724F(this.f90756P) : 0;
        return iMo449b < iMo724F ? iMo724F : iMo449b;
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        int iM124767k;
        int iM124766j;
        if (Float.isNaN(this.f90755O) || C39169a.m124767k(j7) != 0) {
            iM124767k = C39169a.m124767k(j7);
        } else {
            int iMo724F = interfaceC39133t0.mo724F(this.f90755O);
            iM124767k = C39169a.m124765i(j7);
            if (iMo724F < 0) {
                iMo724F = 0;
            }
            if (iMo724F <= iM124767k) {
                iM124767k = iMo724F;
            }
        }
        int iM124765i = C39169a.m124765i(j7);
        if (Float.isNaN(this.f90756P) || C39169a.m124766j(j7) != 0) {
            iM124766j = C39169a.m124766j(j7);
        } else {
            int iMo724F2 = interfaceC39133t0.mo724F(this.f90756P);
            iM124766j = C39169a.m124764h(j7);
            int i13 = iMo724F2 >= 0 ? iMo724F2 : 0;
            if (i13 <= iM124766j) {
                iM124766j = i13;
            }
        }
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(AbstractC39170b.m124769a(iM124767k, iM124765i, iM124766j, C39169a.m124764h(j7)));
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C12526m(abstractC39104j1Mo448T, 6));
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: g0 */
    public final int mo435g0(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        int iMo446O = interfaceC39124q0.mo446O(i13);
        int iMo724F = !Float.isNaN(this.f90755O) ? abstractC0262w0.mo724F(this.f90755O) : 0;
        return iMo446O < iMo724F ? iMo724F : iMo446O;
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: o */
    public final int mo436o(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        int iMo447Q = interfaceC39124q0.mo447Q(i13);
        int iMo724F = !Float.isNaN(this.f90755O) ? abstractC0262w0.mo724F(this.f90755O) : 0;
        return iMo447Q < iMo724F ? iMo724F : iMo447Q;
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: y */
    public final int mo437y(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        int iMo438C = interfaceC39124q0.mo438C(i13);
        int iMo724F = !Float.isNaN(this.f90756P) ? abstractC0262w0.mo724F(this.f90756P) : 0;
        return iMo438C < iMo724F ? iMo724F : iMo438C;
    }
}
