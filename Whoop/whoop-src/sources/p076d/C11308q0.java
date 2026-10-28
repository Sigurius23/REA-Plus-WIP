package p076d;

import java.io.IOException;
import p001a.C0002v;
import p012ab.C0682h0;

/* JADX INFO: renamed from: d.q0 */
/* JADX INFO: loaded from: classes5.dex */
public class C11308q0 implements InterfaceC11307q, InterfaceC11282f {

    /* JADX INFO: renamed from: a */
    public final int f36238a;

    /* JADX INFO: renamed from: b */
    public final int f36239b;

    /* JADX INFO: renamed from: c */
    public final C0682h0 f36240c;

    public C11308q0(int i13, int i14, C0682h0 c0682h0) {
        this.f36238a = i13;
        this.f36239b = i14;
        this.f36240c = c0682h0;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC11272b1 mo30486b() throws IOException {
        C11311s c11311sM1688c = this.f36240c.m1688c();
        int i13 = c11311sM1688c.f36244a;
        int i14 = this.f36238a;
        int i15 = this.f36239b;
        if (i13 == 1) {
            return new C11277d0(3, i14, i15, c11311sM1688c.m30521d(0), 1);
        }
        C11280e0 c11280e0 = AbstractC11323y.f36278a;
        return new C11277d0(4, i14, i15, i13 < 1 ? AbstractC11323y.f36278a : new C11280e0(c11311sM1688c), 1);
    }

    @Override // p076d.InterfaceC11307q
    /* JADX INFO: renamed from: d */
    public final AbstractC11272b1 mo30482d() {
        try {
            return mo30486b();
        } catch (IOException e5) {
            throw new C0002v(e5.getMessage());
        }
    }
}
