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

/* JADX INFO: renamed from: l0.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23006v1 extends AbstractC2316v implements InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public float f90734O;

    /* JADX INFO: renamed from: P */
    public float f90735P;

    /* JADX INFO: renamed from: Q */
    public float f90736Q;

    /* JADX INFO: renamed from: R */
    public float f90737R;

    /* JADX INFO: renamed from: S */
    public boolean f90738S;

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: E */
    public final int mo433E(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        long jM66774X0 = m66774X0(abstractC0262w0);
        if (C39169a.m124762f(jM66774X0)) {
            return C39169a.m124764h(jM66774X0);
        }
        if (!this.f90738S) {
            i13 = AbstractC39170b.m124775g(i13, jM66774X0);
        }
        return AbstractC39170b.m124774f(interfaceC39124q0.mo449b(i13), jM66774X0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX INFO: renamed from: X0 */
    public final long m66774X0(InterfaceC39133t0 interfaceC39133t0) {
        int iMo724F;
        int iMo724F2;
        int iMo724F3;
        int i13 = 0;
        if (Float.isNaN(this.f90736Q)) {
            iMo724F = Integer.MAX_VALUE;
        } else {
            iMo724F = interfaceC39133t0.mo724F(this.f90736Q);
            if (iMo724F < 0) {
                iMo724F = 0;
            }
        }
        if (Float.isNaN(this.f90737R)) {
            iMo724F2 = Integer.MAX_VALUE;
        } else {
            iMo724F2 = interfaceC39133t0.mo724F(this.f90737R);
            if (iMo724F2 < 0) {
                iMo724F2 = 0;
            }
        }
        if (Float.isNaN(this.f90734O)) {
            iMo724F3 = 0;
        } else {
            iMo724F3 = interfaceC39133t0.mo724F(this.f90734O);
            if (iMo724F3 < 0) {
                iMo724F3 = 0;
            }
            if (iMo724F3 > iMo724F) {
                iMo724F3 = iMo724F;
            }
            if (iMo724F3 == Integer.MAX_VALUE) {
                iMo724F3 = 0;
            }
        }
        if (!Float.isNaN(this.f90735P)) {
            int iMo724F4 = interfaceC39133t0.mo724F(this.f90735P);
            if (iMo724F4 < 0) {
                iMo724F4 = 0;
            }
            if (iMo724F4 > iMo724F2) {
                iMo724F4 = iMo724F2;
            }
            if (iMo724F4 != Integer.MAX_VALUE) {
                i13 = iMo724F4;
            }
        }
        return AbstractC39170b.m124769a(iMo724F3, iMo724F, i13, iMo724F2);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        int iM124767k;
        int iM124765i;
        int iM124766j;
        int iM124764h;
        long jM124769a;
        long jM66774X0 = m66774X0(interfaceC39133t0);
        if (this.f90738S) {
            jM124769a = AbstractC39170b.m124773e(j7, jM66774X0);
        } else {
            if (Float.isNaN(this.f90734O)) {
                iM124767k = C39169a.m124767k(j7);
                int iM124765i2 = C39169a.m124765i(jM66774X0);
                if (iM124767k > iM124765i2) {
                    iM124767k = iM124765i2;
                }
            } else {
                iM124767k = C39169a.m124767k(jM66774X0);
            }
            if (Float.isNaN(this.f90736Q)) {
                iM124765i = C39169a.m124765i(j7);
                int iM124767k2 = C39169a.m124767k(jM66774X0);
                if (iM124765i < iM124767k2) {
                    iM124765i = iM124767k2;
                }
            } else {
                iM124765i = C39169a.m124765i(jM66774X0);
            }
            if (Float.isNaN(this.f90735P)) {
                iM124766j = C39169a.m124766j(j7);
                int iM124764h2 = C39169a.m124764h(jM66774X0);
                if (iM124766j > iM124764h2) {
                    iM124766j = iM124764h2;
                }
            } else {
                iM124766j = C39169a.m124766j(jM66774X0);
            }
            if (Float.isNaN(this.f90737R)) {
                iM124764h = C39169a.m124764h(j7);
                int iM124766j2 = C39169a.m124766j(jM66774X0);
                if (iM124764h < iM124766j2) {
                    iM124764h = iM124766j2;
                }
            } else {
                iM124764h = C39169a.m124764h(jM66774X0);
            }
            jM124769a = AbstractC39170b.m124769a(iM124767k, iM124765i, iM124766j, iM124764h);
        }
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(jM124769a);
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C12526m(abstractC39104j1Mo448T, 5));
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: g0 */
    public final int mo435g0(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        long jM66774X0 = m66774X0(abstractC0262w0);
        if (C39169a.m124763g(jM66774X0)) {
            return C39169a.m124765i(jM66774X0);
        }
        if (!this.f90738S) {
            i13 = AbstractC39170b.m124774f(i13, jM66774X0);
        }
        return AbstractC39170b.m124775g(interfaceC39124q0.mo446O(i13), jM66774X0);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: o */
    public final int mo436o(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        long jM66774X0 = m66774X0(abstractC0262w0);
        if (C39169a.m124763g(jM66774X0)) {
            return C39169a.m124765i(jM66774X0);
        }
        if (!this.f90738S) {
            i13 = AbstractC39170b.m124774f(i13, jM66774X0);
        }
        return AbstractC39170b.m124775g(interfaceC39124q0.mo447Q(i13), jM66774X0);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: y */
    public final int mo437y(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        long jM66774X0 = m66774X0(abstractC0262w0);
        if (C39169a.m124762f(jM66774X0)) {
            return C39169a.m124764h(jM66774X0);
        }
        if (!this.f90738S) {
            i13 = AbstractC39170b.m124775g(i13, jM66774X0);
        }
        return AbstractC39170b.m124774f(interfaceC39124q0.mo438C(i13), jM66774X0);
    }
}
