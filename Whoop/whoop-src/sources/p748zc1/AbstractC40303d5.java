package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p026b2.C2314t;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: zc1.d5 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40303d5 {
    /* JADX INFO: renamed from: b */
    public static final void m129515b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(805352348);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 10;
            AbstractC22960g2.m66729a(AbstractC1099a.m3394p(f13, C2314t.f9131w), AbstractC22977m.m66746i(12), AbstractC22977m.m66746i(f13), null, 0, 0, C40299d1.f174222a.m129499d(), c28655q, 1573302, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40270a5(i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m129516c(int i13, Composer composer, int i14) {
        m129515b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
