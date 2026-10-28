package p076d;

import java.io.IOException;
import p001a.C0001h;
import p001a.C0002v;
import p012ab.C0682h0;

/* JADX INFO: renamed from: d.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11289h0 implements InterfaceC11307q, InterfaceC11282f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36213a;

    /* JADX INFO: renamed from: b */
    public final C0682h0 f36214b;

    public /* synthetic */ C11289h0(C0682h0 c0682h0, int i13) {
        this.f36213a = i13;
        this.f36214b = c0682h0;
    }

    @Override // p076d.InterfaceC11282f
    /* JADX INFO: renamed from: b */
    public final AbstractC11272b1 mo30486b() throws IOException {
        int i13 = this.f36213a;
        C0682h0 c0682h0 = this.f36214b;
        switch (i13) {
            case 0:
                return new C11280e0(c0682h0.m1688c());
            case 1:
                return new C11296k0(c0682h0.m1688c());
            case 2:
                C11311s c11311sM1688c = c0682h0.m1688c();
                C11321x c11321x = AbstractC11320w0.f36271a;
                if (c11311sM1688c.f36244a < 1) {
                    return AbstractC11320w0.f36271a;
                }
                C11321x c11321x2 = new C11321x(c11311sM1688c, 1);
                c11321x2.f36274c = -1;
                return c11321x2;
            case 3:
                try {
                    C11321x c11321x3 = new C11321x(c0682h0.m1688c(), 1);
                    c11321x3.f36274c = -1;
                    return new C11316u0(c11321x3);
                } catch (IllegalArgumentException e5) {
                    throw new C0001h(e5, e5.getMessage());
                }
            default:
                C11311s c11311sM1688c2 = c0682h0.m1688c();
                C11321x c11321x4 = AbstractC11320w0.f36271a;
                if (c11311sM1688c2.f36244a < 1) {
                    return AbstractC11320w0.f36272b;
                }
                C11325z c11325z = new C11325z(c11311sM1688c2);
                c11325z.f36281d = -1;
                return c11325z;
        }
    }

    @Override // p076d.InterfaceC11307q
    /* JADX INFO: renamed from: d */
    public final AbstractC11272b1 mo30482d() {
        switch (this.f36213a) {
            case 0:
                try {
                    return new C11280e0(this.f36214b.m1688c());
                } catch (IOException e5) {
                    throw new IllegalStateException(e5.getMessage());
                }
            case 1:
                try {
                    return new C11296k0(this.f36214b.m1688c());
                } catch (IOException e13) {
                    throw new C0002v(e13, e13.getMessage());
                }
            case 2:
                try {
                    return mo30486b();
                } catch (IOException e14) {
                    throw new IllegalStateException(e14.getMessage());
                }
            case 3:
                try {
                    return mo30486b();
                } catch (IOException e15) {
                    throw new C0002v(e15, "unable to get DER object");
                } catch (IllegalArgumentException e16) {
                    throw new C0002v(e16, "unable to get DER object");
                }
            default:
                try {
                    return mo30486b();
                } catch (IOException e17) {
                    throw new C0002v(e17, e17.getMessage());
                }
        }
    }
}
