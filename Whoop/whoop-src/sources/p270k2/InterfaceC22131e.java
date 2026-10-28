package p270k2;

import java.util.ArrayList;
import p005a3.C0237p;
import p181h2.C16620e;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17921y;
import p208i2.C17885g;
import p208i2.InterfaceC17910s0;
import p208i2.InterfaceC17912t0;
import p249jc.AbstractC21598x;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: k2.e */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC22131e extends InterfaceC39171c {
    /* JADX INFO: renamed from: D */
    static /* synthetic */ void m63374D(InterfaceC22131e interfaceC22131e, long j7, long j13, long j14, long j15, AbstractC22132f abstractC22132f, float f13, int i13) {
        long j16 = (i13 & 2) != 0 ? 0L : j13;
        interfaceC22131e.mo749z0(j7, j16, (i13 & 4) != 0 ? m63382h0(interfaceC22131e.mo731d(), j16) : j14, j15, (i13 & 16) != 0 ? C22134h.f85857a : abstractC22132f, (i13 & 32) != 0 ? 1.0f : f13, (i13 & 128) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: G */
    static /* synthetic */ void m63375G(InterfaceC22131e interfaceC22131e, AbstractC17911t abstractC17911t, float f13, long j7, float f14, AbstractC22132f abstractC22132f, int i13) {
        if ((i13 & 2) != 0) {
            f13 = C16620e.m47212d(interfaceC22131e.mo731d()) / 2.0f;
        }
        float f15 = f13;
        if ((i13 & 4) != 0) {
            j7 = interfaceC22131e.mo721B0();
        }
        long j13 = j7;
        if ((i13 & 8) != 0) {
            f14 = 1.0f;
        }
        float f16 = f14;
        if ((i13 & 16) != 0) {
            abstractC22132f = C22134h.f85857a;
        }
        interfaceC22131e.mo747x(abstractC17911t, f15, j13, f16, abstractC22132f);
    }

    /* JADX INFO: renamed from: J0 */
    static /* synthetic */ void m63376J0(InterfaceC22131e interfaceC22131e, AbstractC17911t abstractC17911t, long j7, long j13, long j14, float f13, AbstractC22132f abstractC22132f, int i13) {
        if ((i13 & 2) != 0) {
            j7 = 0;
        }
        long j15 = j7;
        interfaceC22131e.mo739m(abstractC17911t, j15, (i13 & 4) != 0 ? m63382h0(interfaceC22131e.mo731d(), j15) : j13, j14, (i13 & 16) != 0 ? 1.0f : f13, (i13 & 32) != 0 ? C22134h.f85857a : abstractC22132f);
    }

    /* JADX INFO: renamed from: K0 */
    static void m63377K0(InterfaceC22131e interfaceC22131e, C17885g c17885g, long j7, long j13, float f13, AbstractC17921y abstractC17921y, int i13, int i14) {
        interfaceC22131e.mo725I(c17885g, 0L, j7, (i14 & 16) != 0 ? j7 : j13, (i14 & 32) != 0 ? 1.0f : f13, abstractC17921y, (i14 & 512) != 0 ? 1 : i13);
    }

    /* JADX INFO: renamed from: L */
    static /* synthetic */ void m63378L(InterfaceC22131e interfaceC22131e, InterfaceC17910s0 interfaceC17910s0, AbstractC17911t abstractC17911t, float f13, AbstractC22132f abstractC22132f, int i13) {
        if ((i13 & 4) != 0) {
            f13 = 1.0f;
        }
        float f14 = f13;
        if ((i13 & 8) != 0) {
            abstractC22132f = C22134h.f85857a;
        }
        interfaceC22131e.mo720B(interfaceC17910s0, abstractC17911t, f14, abstractC22132f, (i13 & 32) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: M */
    static /* synthetic */ void m63379M(InterfaceC22131e interfaceC22131e, long j7, float f13, long j13, float f14, AbstractC22132f abstractC22132f, int i13) {
        if ((i13 & 2) != 0) {
            f13 = C16620e.m47212d(interfaceC22131e.mo731d()) / 2.0f;
        }
        float f15 = f13;
        if ((i13 & 4) != 0) {
            j13 = interfaceC22131e.mo721B0();
        }
        long j14 = j13;
        if ((i13 & 8) != 0) {
            f14 = 1.0f;
        }
        interfaceC22131e.mo745u0(j7, f15, j14, f14, (i13 & 16) != 0 ? C22134h.f85857a : abstractC22132f);
    }

    /* JADX INFO: renamed from: P */
    static /* synthetic */ void m63380P(InterfaceC22131e interfaceC22131e, long j7, float f13, float f14, long j13, long j14, float f15, C22135i c22135i, int i13) {
        long j15 = (i13 & 16) != 0 ? 0L : j13;
        interfaceC22131e.mo737k0(j7, f13, f14, j15, (i13 & 32) != 0 ? m63382h0(interfaceC22131e.mo731d(), j15) : j14, (i13 & 64) != 0 ? 1.0f : f15, c22135i);
    }

    /* JADX INFO: renamed from: X */
    static /* synthetic */ void m63381X(InterfaceC22131e interfaceC22131e, AbstractC17911t abstractC17911t, float f13, float f14, boolean z4, long j7, long j13, C22135i c22135i, int i13, int i14) {
        long j14 = (i14 & 16) != 0 ? 0L : j7;
        interfaceC22131e.mo746w(abstractC17911t, f13, f14, z4, j14, (i14 & 32) != 0 ? m63382h0(interfaceC22131e.mo731d(), j14) : j13, (i14 & 128) != 0 ? C22134h.f85857a : c22135i, (i14 & 512) != 0 ? 3 : i13);
    }

    /* JADX INFO: renamed from: h0 */
    static long m63382h0(long j7, long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) - Float.intBitsToFloat((int) (j13 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: i0 */
    static /* synthetic */ void m63383i0(InterfaceC22131e interfaceC22131e, long j7, long j13, long j14, float f13, AbstractC17921y abstractC17921y, int i13, int i14) {
        long j15 = (i14 & 2) != 0 ? 0L : j13;
        interfaceC22131e.mo741n0(j7, j15, (i14 & 4) != 0 ? m63382h0(interfaceC22131e.mo731d(), j15) : j14, (i14 & 8) != 0 ? 1.0f : f13, (i14 & 32) != 0 ? null : abstractC17921y, (i14 & 64) != 0 ? 3 : i13);
    }

    /* JADX INFO: renamed from: u */
    static /* synthetic */ void m63385u(InterfaceC22131e interfaceC22131e, AbstractC17911t abstractC17911t, long j7, long j13, float f13, AbstractC22132f abstractC22132f, int i13, int i14) {
        if ((i14 & 2) != 0) {
            j7 = 0;
        }
        long j14 = j7;
        interfaceC22131e.mo729a0(abstractC17911t, j14, (i14 & 4) != 0 ? m63382h0(interfaceC22131e.mo731d(), j14) : j13, (i14 & 8) != 0 ? 1.0f : f13, (i14 & 16) != 0 ? C22134h.f85857a : abstractC22132f, (i14 & 64) != 0 ? 3 : i13);
    }

    /* JADX INFO: renamed from: z */
    static /* synthetic */ void m63386z(InterfaceC22131e interfaceC22131e, InterfaceC17910s0 interfaceC17910s0, long j7, float f13, AbstractC22132f abstractC22132f, int i13) {
        if ((i13 & 4) != 0) {
            f13 = 1.0f;
        }
        float f14 = f13;
        if ((i13 & 8) != 0) {
            abstractC22132f = C22134h.f85857a;
        }
        interfaceC22131e.mo723E0(interfaceC17910s0, j7, f14, abstractC22132f);
    }

    /* JADX INFO: renamed from: B */
    void mo720B(InterfaceC17910s0 interfaceC17910s0, AbstractC17911t abstractC17911t, float f13, AbstractC22132f abstractC22132f, int i13);

    /* JADX INFO: renamed from: B0 */
    default long mo721B0() {
        return AbstractC21598x.m60656L(mo744t0().m670A());
    }

    /* JADX INFO: renamed from: E0 */
    void mo723E0(InterfaceC17910s0 interfaceC17910s0, long j7, float f13, AbstractC22132f abstractC22132f);

    /* JADX INFO: renamed from: I */
    void mo725I(C17885g c17885g, long j7, long j13, long j14, float f13, AbstractC17921y abstractC17921y, int i13);

    /* JADX INFO: renamed from: R */
    void mo727R(AbstractC17911t abstractC17911t, long j7, long j13, float f13, InterfaceC17912t0 interfaceC17912t0, float f14);

    /* JADX INFO: renamed from: a0 */
    void mo729a0(AbstractC17911t abstractC17911t, long j7, long j13, float f13, AbstractC22132f abstractC22132f, int i13);

    /* JADX INFO: renamed from: d */
    default long mo731d() {
        return mo744t0().m670A();
    }

    /* JADX INFO: renamed from: d0 */
    void mo732d0(long j7, long j13, long j14, float f13, int i13, InterfaceC17912t0 interfaceC17912t0);

    EnumC39181m getLayoutDirection();

    /* JADX INFO: renamed from: k0 */
    void mo737k0(long j7, float f13, float f14, long j13, long j14, float f15, AbstractC22132f abstractC22132f);

    /* JADX INFO: renamed from: m */
    void mo739m(AbstractC17911t abstractC17911t, long j7, long j13, long j14, float f13, AbstractC22132f abstractC22132f);

    /* JADX INFO: renamed from: n0 */
    void mo741n0(long j7, long j13, long j14, float f13, AbstractC17921y abstractC17921y, int i13);

    /* JADX INFO: renamed from: t0 */
    C0237p mo744t0();

    /* JADX INFO: renamed from: u0 */
    void mo745u0(long j7, float f13, long j13, float f14, AbstractC22132f abstractC22132f);

    /* JADX INFO: renamed from: w */
    void mo746w(AbstractC17911t abstractC17911t, float f13, float f14, boolean z4, long j7, long j13, AbstractC22132f abstractC22132f, int i13);

    /* JADX INFO: renamed from: x */
    void mo747x(AbstractC17911t abstractC17911t, float f13, long j7, float f14, AbstractC22132f abstractC22132f);

    /* JADX INFO: renamed from: y0 */
    void mo748y0(ArrayList arrayList, long j7, float f13);

    /* JADX INFO: renamed from: z0 */
    void mo749z0(long j7, long j13, long j14, long j15, AbstractC22132f abstractC22132f, float f13, int i13);
}
