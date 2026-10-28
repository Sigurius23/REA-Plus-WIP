package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p005a3.C0227m1;
import p026b2.C2314t;
import p040c0.C3731d;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11343d2;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p077d0.C11351f2;
import p077d0.C11409v1;
import p077d0.C11421z1;
import p077d0.InterfaceC11403t1;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p240j2.AbstractC21222c;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: g1.v7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15173v7 {
    static {
        AbstractC35745c.m113246h(20);
    }

    /* JADX INFO: renamed from: a */
    public static final void m43207a(final boolean z4, final InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z13, long j7, long j13, final C37816b c37816b, Composer composer, final int i13) {
        final Modifier modifier2;
        final boolean z14;
        final long j14;
        final long j15;
        int i14;
        Modifier modifier3;
        long j16;
        long j17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1847932236);
        int i15 = i13 | (c28655q.m87155h(z4) ? 4 : 2) | (c28655q.m87157i(interfaceC4339a) ? 32 : 16) | 617856;
        if (c28655q.m87135U(i15 & 1, (4793491 & i15) != 4793490)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                C28596b0 c28596b0 = AbstractC15067l1.f56420a;
                long j18 = ((C17919x) c28655q.m87161k(c28596b0)).f69639a;
                long j19 = ((C17919x) c28655q.m87161k(c28596b0)).f69639a;
                long jM51541c = C17919x.m51541c((!((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j19)) < 0.5d : ((double) AbstractC17918w0.m51536x(j19)) > 0.5d) ? 0.6f : 0.74f, j18);
                i14 = i15 & (-4128769);
                modifier3 = C2314t.f9131w;
                j16 = j18;
                j17 = jM51541c;
                z14 = true;
            } else {
                c28655q.m87138X();
                i14 = i15 & (-4128769);
                modifier3 = modifier;
                z14 = z13;
                j16 = j7;
                j17 = j13;
            }
            c28655q.m87175r();
            Modifier modifier4 = modifier3;
            int i16 = 3072 | ((i14 << 6) & 896);
            long j24 = j16;
            long j25 = j17;
            m43208b(j24, j25, z4, AbstractC37817c.m121344e(-652402312, c28655q, new C15163u7(modifier4, z4, AbstractC15210z4.m43228a(j16, 2, true, 0.0f), z14, interfaceC4339a, c37816b)), c28655q, i16);
            j14 = j24;
            j15 = j25;
            modifier2 = modifier4;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            z14 = z13;
            j14 = j7;
            j15 = j13;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m(z4, interfaceC4339a, modifier2, z14, j14, j15, c37816b, i13) { // from class: g1.s7

                /* JADX INFO: renamed from: E */
                public final /* synthetic */ long f56786E;

                /* JADX INFO: renamed from: F */
                public final /* synthetic */ long f56787F;

                /* JADX INFO: renamed from: G */
                public final /* synthetic */ C37816b f56788G;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ boolean f56789w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ InterfaceC4339a f56790x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ Modifier f56791y;

                /* JADX INFO: renamed from: z */
                public final /* synthetic */ boolean f56792z;

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(12582913);
                    AbstractC15173v7.m43207a(this.f56789w, this.f56790x, this.f56791y, this.f56792z, this.f56786E, this.f56787F, this.f56788G, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43208b(final long j7, long j13, final boolean z4, final C37816b c37816b, Composer composer, final int i13) {
        int i14;
        long j14;
        boolean z13;
        C11347e2 c11347e2M30574v;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1841653376);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            j14 = j13;
            i14 |= c28655q.m87151f(j14) ? 32 : 16;
        } else {
            j14 = j13;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            int i15 = i14 >> 6;
            C11421z1 c11421z1M30544f = AbstractC11343d2.m30544f(Boolean.valueOf(z4), null, c28655q, i15 & 14, 2);
            C28633k1 c28633k1 = c11421z1M30544f.f36633d;
            boolean zBooleanValue = ((Boolean) c28633k1.getValue()).booleanValue();
            c28655q.m87150e0(90393475);
            long j15 = zBooleanValue ? j7 : j14;
            c28655q.m87173q(false);
            AbstractC21222c abstractC21222cM51545g = C17919x.m51545g(j15);
            boolean zM87153g = c28655q.m87153g(abstractC21222cM51545g);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                C11351f2 c11351f2 = new C11351f2(C3731d.f15261z, new C0227m1(abstractC21222cM51545g, 9));
                c28655q.m87172p0(c11351f2);
                objM87133R = c11351f2;
            }
            C11351f2 c11351f3 = (C11351f2) objM87133R;
            boolean zBooleanValue2 = ((Boolean) c11421z1M30544f.f36630a.mo2428y0()).booleanValue();
            c28655q.m87150e0(90393475);
            C17919x c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, zBooleanValue2 ? j7 : j14);
            boolean zBooleanValue3 = ((Boolean) c28633k1.getValue()).booleanValue();
            c28655q.m87150e0(90393475);
            C17919x c17919xM31989h2 = AbstractC11895b.m31989h(c28655q, false, zBooleanValue3 ? j7 : j14);
            InterfaceC11403t1 interfaceC11403t1M30664f = c11421z1M30544f.m30664f();
            c28655q.m87150e0(297582231);
            if (interfaceC11403t1M30664f.m30637d(Boolean.FALSE, Boolean.TRUE)) {
                c11347e2M30574v = new C11347e2(150, 100, AbstractC11333b0.f36312c);
                z13 = false;
            } else {
                z13 = false;
                c11347e2M30574v = AbstractC11348f.m30574v(100, 0, AbstractC11333b0.f36312c, 2);
            }
            c28655q.m87173q(z13);
            C11409v1 c11409v1M30542d = AbstractC11343d2.m30542d(c11421z1M30544f, c17919xM31989h, c17919xM31989h2, c11347e2M30574v, c11351f3, c28655q, 0);
            AbstractC28683x.m87248b(new C28673u1[]{AbstractC15067l1.f56420a.mo86977a(new C17919x(C17919x.m51541c(1.0f, ((C17919x) c11409v1M30542d.f36585J.getValue()).f69639a))), AbstractC15047j1.f56336a.mo86977a(Float.valueOf(C17919x.m51543e(((C17919x) c11409v1M30542d.f36585J.getValue()).f69639a)))}, c37816b, c28655q, (i15 & 112) | 8);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final long j16 = j14;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.t7
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC15173v7.m43208b(j7, j16, z4, c37816b, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }
}
