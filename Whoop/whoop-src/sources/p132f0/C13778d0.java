package p132f0;

import androidx.room.C1849z1;
import bc3.AbstractC3006f0;
import p005a3.C0238p0;
import p005a3.InterfaceC0245r;
import p026b2.AbstractC2316v;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p270k2.C22128b;
import p270k2.InterfaceC22131e;

/* JADX INFO: renamed from: f0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13778d0 extends AbstractC2316v implements InterfaceC0245r {

    /* JADX INFO: renamed from: O */
    public final InterfaceC21083i f49158O;

    /* JADX INFO: renamed from: P */
    public boolean f49159P;

    /* JADX INFO: renamed from: Q */
    public boolean f49160Q;

    /* JADX INFO: renamed from: R */
    public boolean f49161R;

    public C13778d0(InterfaceC21083i interfaceC21083i) {
        this.f49158O = interfaceC21083i;
    }

    @Override // p005a3.InterfaceC0245r
    /* JADX INFO: renamed from: O */
    public final void mo459O(C0238p0 c0238p0) {
        c0238p0.m728a();
        C22128b c22128b = c0238p0.f815w;
        if (this.f49159P) {
            InterfaceC22131e.m63383i0(c0238p0, C17919x.m51541c(0.3f, C17919x.f69625b), 0L, c22128b.mo731d(), 0.0f, null, 0, 122);
        } else if (this.f49160Q || this.f49161R) {
            InterfaceC22131e.m63383i0(c0238p0, C17919x.m51541c(0.1f, C17919x.f69625b), 0L, c22128b.mo731d(), 0.0f, null, 0, 122);
        }
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        AbstractC3006f0.m8732z(m7158L0(), null, null, new C1849z1(this, null, 3), 3);
    }
}
