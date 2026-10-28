package p748zc1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import hy0.AbstractC17735d2;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
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
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.v8 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40496v8 {
    /* JADX INFO: renamed from: b */
    public static final void m131064b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-76207198);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 4 * 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            float f14 = 100;
            float f15 = 200;
            AbstractC22399k.m64473c("An Image Loaded From a URL", c28655q, 6);
            Modifier modifierM3424u = AbstractC1102d.m3424u(f15, AbstractC1102d.m3411h(f14, c2314t));
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            long jM125426w = c38072d.m121949b(c28655q, i14).getBrandBlack();
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            AbstractC17735d2.m50825b(AbstractC1092a.m3358c(modifierM3424u, jM125426w, c17916v0), "https://www.whoop.com/uploads/2022/03/sloane-stephens-womens-history-month-whoop-768x427.png", "A preview image", Integer.valueOf(c38072d.m121951d().getLogo().getWhoop()), null, c28655q, 432, 16);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            AbstractC22399k.m64473c("An Invalid Image, will fail to load and show placeholder", c28655q, 6);
            AbstractC17735d2.m50825b(AbstractC1092a.m3358c(AbstractC1102d.m3424u(f15, AbstractC1102d.m3411h(f14, c2314t)), c38072d.m121949b(c28655q, i14).getBrandBlack(), c17916v0), "invalid url", "An invalid url", Integer.valueOf(c38072d.m121951d().getLogo().getWhoop()), null, c28655q, 432, 16);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            AbstractC22399k.m64473c("Image URL is null, shows placeholder", c28655q, 6);
            AbstractC17735d2.m50825b(AbstractC1092a.m3358c(AbstractC1102d.m3424u(f15, AbstractC1102d.m3411h(f14, c2314t)), c38072d.m121949b(c28655q, i14).getBrandBlack(), c17916v0), null, "A missing url", Integer.valueOf(c38072d.m121951d().getLogo().getWhoop()), null, c28655q, 432, 16);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40475t7(i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m131065c(int i13, Composer composer, int i14) {
        m131064b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
