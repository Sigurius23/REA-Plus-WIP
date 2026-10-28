package p510u0;

import p181h2.C16618c;
import p294l3.C23277r0;
import p635y2.InterfaceC39147y;

/* JADX INFO: renamed from: u0.p1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34346p1 {

    /* JADX INFO: renamed from: a */
    public final C23277r0 f144282a;

    /* JADX INFO: renamed from: b */
    public InterfaceC39147y f144283b = null;

    /* JADX INFO: renamed from: c */
    public InterfaceC39147y f144284c;

    public C34346p1(C23277r0 c23277r0, InterfaceC39147y interfaceC39147y) {
        this.f144282a = c23277r0;
        this.f144284c = interfaceC39147y;
    }

    /* JADX INFO: renamed from: a */
    public final long m108648a(long j7) {
        C16618c c16618cMo3547r;
        InterfaceC39147y interfaceC39147y = this.f144283b;
        C16618c c16618c = C16618c.f63938e;
        if (interfaceC39147y != null) {
            if (interfaceC39147y.mo3532g()) {
                InterfaceC39147y interfaceC39147y2 = this.f144284c;
                c16618cMo3547r = interfaceC39147y2 != null ? interfaceC39147y2.mo3547r(interfaceC39147y, true) : null;
            } else {
                c16618cMo3547r = c16618c;
            }
            if (c16618cMo3547r != null) {
                c16618c = c16618cMo3547r;
            }
        }
        int i13 = (int) (j7 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i13);
        float fIntBitsToFloat2 = c16618c.f63939a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i13);
            fIntBitsToFloat2 = c16618c.f63941c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i13);
            }
        }
        int i14 = (int) (j7 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i14);
        float fIntBitsToFloat5 = c16618c.f63940b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i14);
            fIntBitsToFloat5 = c16618c.f63942d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i14);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public final int m108649b(long j7, boolean z4) {
        if (z4) {
            j7 = m108648a(j7);
        }
        return this.f144282a.f92228b.m67377g(m108651d(j7));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m108650c(long j7) {
        long jM108651d = m108651d(m108648a(j7));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jM108651d));
        C23277r0 c23277r0 = this.f144282a;
        int iM67375e = c23277r0.f92228b.m67375e(fIntBitsToFloat);
        int i13 = (int) (jM108651d >> 32);
        return Float.intBitsToFloat(i13) >= c23277r0.m67337f(iM67375e) && Float.intBitsToFloat(i13) <= c23277r0.m67338g(iM67375e);
    }

    /* JADX INFO: renamed from: d */
    public final long m108651d(long j7) {
        InterfaceC39147y interfaceC39147y;
        InterfaceC39147y interfaceC39147y2 = this.f144283b;
        if (interfaceC39147y2 == null) {
            return j7;
        }
        if (!interfaceC39147y2.mo3532g()) {
            interfaceC39147y2 = null;
        }
        if (interfaceC39147y2 == null || (interfaceC39147y = this.f144284c) == null) {
            return j7;
        }
        InterfaceC39147y interfaceC39147y3 = interfaceC39147y.mo3532g() ? interfaceC39147y : null;
        return interfaceC39147y3 == null ? j7 : interfaceC39147y2.mo3537k(interfaceC39147y3, j7);
    }

    /* JADX INFO: renamed from: e */
    public final long m108652e(long j7) {
        InterfaceC39147y interfaceC39147y;
        InterfaceC39147y interfaceC39147y2 = this.f144283b;
        if (interfaceC39147y2 == null) {
            return j7;
        }
        if (!interfaceC39147y2.mo3532g()) {
            interfaceC39147y2 = null;
        }
        if (interfaceC39147y2 == null || (interfaceC39147y = this.f144284c) == null) {
            return j7;
        }
        InterfaceC39147y interfaceC39147y3 = interfaceC39147y.mo3532g() ? interfaceC39147y : null;
        return interfaceC39147y3 == null ? j7 : interfaceC39147y3.mo3537k(interfaceC39147y2, j7);
    }
}
