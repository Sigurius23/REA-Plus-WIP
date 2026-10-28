package p484s9;

import java.nio.ByteBuffer;
import p010a9.C0580e;
import p031b9.AbstractC2829f;
import p516u8.C34610p;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import qg3.C30352d;

/* JADX INFO: renamed from: s9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C32277b extends AbstractC2829f {

    /* JADX INFO: renamed from: R */
    public final C0580e f133574R;

    /* JADX INFO: renamed from: S */
    public final C38059n f133575S;

    /* JADX INFO: renamed from: T */
    public InterfaceC32276a f133576T;

    /* JADX INFO: renamed from: U */
    public long f133577U;

    public C32277b() {
        super(6);
        this.f133574R = new C0580e(1);
        this.f133575S = new C38059n();
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: A */
    public final int mo8057A(C34610p c34610p) {
        return "application/x-camera-motion".equals(c34610p.f145783n) ? AbstractC2829f.m8055f(4, 0, 0, 0) : AbstractC2829f.m8055f(0, 0, 0, 0);
    }

    @Override // p031b9.AbstractC2829f, p031b9.InterfaceC2828e1
    /* JADX INFO: renamed from: a */
    public final void mo8047a(int i13, Object obj) {
        if (i13 == 8) {
            this.f133576T = (InterfaceC32276a) obj;
        }
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: j */
    public final String mo8062j() {
        return "CameraMotionRenderer";
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: l */
    public final boolean mo8064l() {
        return m8063k();
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: n */
    public final boolean mo8065n() {
        return true;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: o */
    public final void mo8066o() {
        InterfaceC32276a interfaceC32276a = this.f133576T;
        if (interfaceC32276a != null) {
            interfaceC32276a.mo8049c();
        }
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: q */
    public final void mo8068q(long j7, boolean z4) {
        this.f133577U = Long.MIN_VALUE;
        InterfaceC32276a interfaceC32276a = this.f133576T;
        if (interfaceC32276a != null) {
            interfaceC32276a.mo8049c();
        }
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: x */
    public final void mo8075x(long j7, long j13) {
        float[] fArr;
        while (!m8063k() && this.f133577U < 100000 + j7) {
            C0580e c0580e = this.f133574R;
            c0580e.mo1506o();
            C30352d c30352d = this.f11096y;
            c30352d.m92812k();
            if (m8074w(c30352d, c0580e, 0) != -4 || c0580e.m1496f(4)) {
                return;
            }
            long j14 = c0580e.f2065G;
            this.f133577U = j14;
            boolean z4 = j14 < this.f11088L;
            if (this.f133576T != null && !z4) {
                c0580e.m1509r();
                ByteBuffer byteBuffer = c0580e.f2063E;
                int i13 = AbstractC38065t.f163031a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C38059n c38059n = this.f133575S;
                    c38059n.m121844D(iLimit, bArrArray);
                    c38059n.m121846F(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i14 = 0; i14 < 3; i14++) {
                        fArr2[i14] = Float.intBitsToFloat(c38059n.m121856i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f133576T.mo8048b(this.f133577U - this.f11087K, fArr);
                }
            }
        }
    }
}
