package p076d;

import java.io.IOException;
import p012ab.C0682h0;

/* JADX INFO: renamed from: d.g1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11287g1 extends C11308q0 {

    /* JADX INFO: renamed from: d */
    public final boolean f36211d;

    public C11287g1(int i13, int i14, boolean z4, C0682h0 c0682h0) {
        super(i13, i14, c0682h0);
        this.f36211d = z4;
    }

    @Override // p076d.C11308q0, p076d.InterfaceC11282f
    /* JADX INFO: renamed from: b */
    public final AbstractC11272b1 mo30486b() throws IOException {
        C11321x c11321x;
        boolean z4 = this.f36211d;
        int i13 = 4;
        C0682h0 c0682h0 = this.f36240c;
        int i14 = this.f36238a;
        int i15 = this.f36239b;
        if (!z4) {
            return new C11277d0(i13, i14, i15, new C11297l(((C11273c) ((AbstractC11305p) c0682h0.f2433y)).m30484h()), 2);
        }
        C11311s c11311sM1688c = c0682h0.m1688c();
        int i16 = c11311sM1688c.f36244a;
        if (i16 == 1) {
            return new C11277d0(3, i14, i15, c11311sM1688c.m30521d(0), 2);
        }
        C11321x c11321x2 = AbstractC11320w0.f36271a;
        if (i16 < 1) {
            c11321x = AbstractC11320w0.f36271a;
        } else {
            C11321x c11321x3 = new C11321x(c11311sM1688c, 1);
            c11321x3.f36274c = -1;
            c11321x = c11321x3;
        }
        return new C11277d0(i13, i14, i15, c11321x, 2);
    }
}
