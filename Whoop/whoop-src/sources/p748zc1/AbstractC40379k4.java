package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b61.AbstractC2756k;
import j71.C21395c;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r61.AbstractC30978a;
import r61.AbstractC30980c;
import r61.AbstractC30982e;
import r61.AbstractC30986i;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.k4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Ll83/a0;", "e", "(Landroidx/compose/runtime/Composer;I)V", "Lj71/c;", "state", "c", "(Lj71/c;Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40379k4 {
    /* JADX INFO: renamed from: c */
    private static final void m130175c(C21395c c21395c, Composer composer, int i13) {
        int i14;
        C21395c c21395c2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-148343127);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c21395c) : c28655q.m87157i(c21395c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c21395c2 = c21395c;
            AbstractC2756k.m7799p(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), false, 1.3333334f), c21395c2, null, null, false, null, null, c28655q, (C21395c.f81985e << 3) | 6 | ((i14 << 3) & 112), 124);
        } else {
            c21395c2 = c21395c;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40368j4(c21395c2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m130176d(C21395c c21395c, int i13, Composer composer, int i14) {
        m130175c(c21395c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m130177e(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-34182532);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22399k.m64473c("Overview Graph", c28655q, 6);
            float f13 = 4;
            float f14 = 2 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            C21395c c21395cM95342l = AbstractC30982e.m95342l();
            int i14 = C21395c.f81985e;
            m130175c(c21395cM95342l, c28655q, i14);
            float f15 = f13 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            AbstractC22399k.m64473c("Fill Graph", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            m130175c(AbstractC30982e.m95340j(), c28655q, i14);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            AbstractC22399k.m64473c("Scatter Plot", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            m130175c(AbstractC30982e.m95348r(), c28655q, i14);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            AbstractC22399k.m64473c("Stress Hr Graph", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            m130175c(AbstractC30986i.m95388e(), c28655q, i14);
            AbstractC22399k.m64473c("Stress Hr Graph Without Bulb", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            m130175c(AbstractC30986i.m95390g(), c28655q, i14);
            AbstractC22399k.m64473c("Activity Hr Graph", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            m130175c(AbstractC30978a.m95292b(), c28655q, i14);
            AbstractC22399k.m64473c("Biomarker Details Graph", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            m130175c(AbstractC30980c.m95313a(c28655q, 0), c28655q, i14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40461s3(i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m130178f(int i13, Composer composer, int i14) {
        m130177e(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
