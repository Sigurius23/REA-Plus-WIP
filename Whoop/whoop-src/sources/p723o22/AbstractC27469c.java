package p723o22;

import a22.AbstractC0172a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p719m22.C24965t;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: o22.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "pairing-ui_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27469c {
    /* JADX INFO: renamed from: b */
    public static final void m82896b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1083496196);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC0172a.f528h, c28655q, 0), null, AbstractC1102d.m3419p(74 * 4, C2314t.f9131w), null, null, 0.0f, null, c28655q, 432, 120);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m82897c(int i13, Composer composer, int i14) {
        m82896b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
