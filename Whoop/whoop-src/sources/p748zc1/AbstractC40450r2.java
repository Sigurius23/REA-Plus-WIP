package p748zc1;

import a61.AbstractC0471d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: zc1.r2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40450r2 {
    /* JADX INFO: renamed from: b */
    public static final void m130744b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1687305322);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC0471d.m1172u(c28655q, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 2 * 8, 1));
            AbstractC0471d.m1164m(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40388l2(i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m130745c(int i13, Composer composer, int i14) {
        m130744b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
