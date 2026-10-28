package no;

import ed3.C13117a;
import java.nio.ByteBuffer;
import p309lo.AbstractC24567y;
import p465rm.AbstractC31523d;
import p465rm.C31521c0;
import p527um.C35073c;
import p619xl.C38445a;

/* JADX INFO: renamed from: no.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C26869b extends AbstractC31523d {

    /* JADX INFO: renamed from: M */
    public final C35073c f107217M;

    /* JADX INFO: renamed from: N */
    public final C13117a f107218N;

    /* JADX INFO: renamed from: O */
    public long f107219O;

    /* JADX INFO: renamed from: P */
    public InterfaceC26868a f107220P;

    /* JADX INFO: renamed from: Q */
    public long f107221Q;

    public C26869b() {
        super(6);
        this.f107217M = new C35073c(1);
        this.f107218N = new C13117a();
    }

    @Override // p465rm.AbstractC31523d, p465rm.InterfaceC31522c1
    /* JADX INFO: renamed from: a */
    public final void mo75855a(int i13, Object obj) {
        if (i13 == 8) {
            this.f107220P = (InterfaceC26868a) obj;
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: h */
    public final String mo54420h() {
        return "CameraMotionRenderer";
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: j */
    public final boolean mo49735j() {
        return m97119i();
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: k */
    public final boolean mo49737k() {
        return true;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: l */
    public final void mo54421l() {
        InterfaceC26868a interfaceC26868a = this.f107220P;
        if (interfaceC26868a != null) {
            interfaceC26868a.mo80222c();
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: n */
    public final void mo49741n(long j7, boolean z4) {
        this.f107221Q = Long.MIN_VALUE;
        InterfaceC26868a interfaceC26868a = this.f107220P;
        if (interfaceC26868a != null) {
            interfaceC26868a.mo80222c();
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: r */
    public final void mo49743r(C31521c0[] c31521c0Arr, long j7, long j13) {
        this.f107219O = j13;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: t */
    public final void mo49744t(long j7, long j13) {
        float[] fArr;
        while (!m97119i() && this.f107221Q < 100000 + j7) {
            C35073c c35073c = this.f107217M;
            c35073c.mo49690o();
            C38445a c38445a = this.f130111x;
            c38445a.m123175j();
            if (m97120s(c38445a, c35073c, 0) != -4 || c35073c.m1496f(4)) {
                return;
            }
            this.f107221Q = c35073c.f148797F;
            if (this.f107220P != null && !c35073c.m1496f(Integer.MIN_VALUE)) {
                c35073c.m110919r();
                ByteBuffer byteBuffer = c35073c.f148801z;
                int i13 = AbstractC24567y.f95875a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C13117a c13117a = this.f107218N;
                    c13117a.m36687I(iLimit, bArrArray);
                    c13117a.m36689K(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i14 = 0; i14 < 3; i14++) {
                        fArr2[i14] = Float.intBitsToFloat(c13117a.m36701k());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f107220P.mo80221b(this.f107221Q - this.f107219O, fArr);
                }
            }
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: x */
    public final int mo49746x(C31521c0 c31521c0) {
        return "application/x-camera-motion".equals(c31521c0.f130077L) ? AbstractC31523d.m97116d(4, 0, 0) : AbstractC31523d.m97116d(0, 0, 0);
    }
}
