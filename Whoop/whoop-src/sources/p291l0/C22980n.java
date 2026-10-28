package p291l0;

import androidx.compose.foundation.layout.AbstractC1099a;
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
import p636y3.AbstractC39177i;
import p636y3.C39169a;
import p636y3.C39180l;

/* JADX INFO: renamed from: l0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C22980n extends AbstractC2316v implements InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public float f90668O;

    /* JADX INFO: renamed from: P */
    public boolean f90669P;

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: E */
    public final int mo433E(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return i13 != Integer.MAX_VALUE ? Math.round(i13 / this.f90668O) : interfaceC39124q0.mo449b(i13);
    }

    /* JADX INFO: renamed from: X0 */
    public final long m66749X0(long j7, boolean z4) {
        int iRound;
        int iM124764h = C39169a.m124764h(j7);
        if (iM124764h == Integer.MAX_VALUE || (iRound = Math.round(iM124764h * this.f90668O)) <= 0) {
            return 0L;
        }
        if (!z4 || AbstractC1099a.m3389k(iRound, j7, iM124764h)) {
            return (((long) iRound) << 32) | (((long) iM124764h) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Y0 */
    public final long m66750Y0(long j7, boolean z4) {
        int iRound;
        int iM124765i = C39169a.m124765i(j7);
        if (iM124765i == Integer.MAX_VALUE || (iRound = Math.round(iM124765i / this.f90668O)) <= 0) {
            return 0L;
        }
        if (!z4 || AbstractC1099a.m3389k(iM124765i, j7, iRound)) {
            return (((long) iM124765i) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Z0 */
    public final long m66751Z0(long j7, boolean z4) {
        int iM124766j = C39169a.m124766j(j7);
        int iRound = Math.round(iM124766j * this.f90668O);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z4 || AbstractC1099a.m3389k(iRound, j7, iM124766j)) {
            return (((long) iRound) << 32) | (((long) iM124766j) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a1 */
    public final long m66752a1(long j7, boolean z4) {
        int iM124767k = C39169a.m124767k(j7);
        int iRound = Math.round(iM124767k / this.f90668O);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z4 || AbstractC1099a.m3389k(iM124767k, j7, iRound)) {
            return (((long) iM124767k) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        long jM66749X0;
        if (this.f90669P) {
            jM66749X0 = m66749X0(j7, true);
            if (C39180l.m124799a(jM66749X0, 0L)) {
                jM66749X0 = m66750Y0(j7, true);
                if (C39180l.m124799a(jM66749X0, 0L)) {
                    jM66749X0 = m66751Z0(j7, true);
                    if (C39180l.m124799a(jM66749X0, 0L)) {
                        jM66749X0 = m66752a1(j7, true);
                        if (C39180l.m124799a(jM66749X0, 0L)) {
                            jM66749X0 = m66749X0(j7, false);
                            if (C39180l.m124799a(jM66749X0, 0L)) {
                                jM66749X0 = m66750Y0(j7, false);
                                if (C39180l.m124799a(jM66749X0, 0L)) {
                                    jM66749X0 = m66751Z0(j7, false);
                                    if (C39180l.m124799a(jM66749X0, 0L)) {
                                        jM66749X0 = m66752a1(j7, false);
                                        if (C39180l.m124799a(jM66749X0, 0L)) {
                                            jM66749X0 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jM66749X0 = m66750Y0(j7, true);
            if (C39180l.m124799a(jM66749X0, 0L)) {
                jM66749X0 = m66749X0(j7, true);
                if (C39180l.m124799a(jM66749X0, 0L)) {
                    jM66749X0 = m66752a1(j7, true);
                    if (C39180l.m124799a(jM66749X0, 0L)) {
                        jM66749X0 = m66751Z0(j7, true);
                        if (C39180l.m124799a(jM66749X0, 0L)) {
                            jM66749X0 = m66750Y0(j7, false);
                            if (C39180l.m124799a(jM66749X0, 0L)) {
                                jM66749X0 = m66749X0(j7, false);
                                if (C39180l.m124799a(jM66749X0, 0L)) {
                                    jM66749X0 = m66752a1(j7, false);
                                    if (C39180l.m124799a(jM66749X0, 0L)) {
                                        jM66749X0 = m66751Z0(j7, false);
                                        if (C39180l.m124799a(jM66749X0, 0L)) {
                                            jM66749X0 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!C39180l.m124799a(jM66749X0, 0L)) {
            int i13 = (int) (jM66749X0 >> 32);
            int i14 = (int) (4294967295L & jM66749X0);
            if (!((i13 >= 0) & (i14 >= 0))) {
                AbstractC39177i.m124789a("width and height must be >= 0");
            }
            j7 = AbstractC39170b.m124776h(i13, i13, i14, i14);
        }
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C12526m(abstractC39104j1Mo448T, 2));
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: g0 */
    public final int mo435g0(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return i13 != Integer.MAX_VALUE ? Math.round(i13 * this.f90668O) : interfaceC39124q0.mo446O(i13);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: o */
    public final int mo436o(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return i13 != Integer.MAX_VALUE ? Math.round(i13 * this.f90668O) : interfaceC39124q0.mo447Q(i13);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: y */
    public final int mo437y(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return i13 != Integer.MAX_VALUE ? Math.round(i13 / this.f90668O) : interfaceC39124q0.mo438C(i13);
    }
}
