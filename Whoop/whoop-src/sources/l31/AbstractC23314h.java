package l31;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import k71.C22241a0;
import l83.C23454a0;
import l83.C23465k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;
import x81.C38072d;
import y11.AbstractC39054g;

/* JADX INFO: renamed from: l31.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23314h {
    /* JADX INFO: renamed from: b */
    public static final void m67472b(Composer composer, int i13) {
        Float fValueOf = Float.valueOf(40.0f);
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-871896370);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C38072d c38072d = C38072d.f163053a;
            AbstractC39054g.m124501b(modifierM3409f, 50.0f, c38072d.m121949b(c28655q, 6).getSleepAwake(), false, new C23465k(fValueOf, Float.valueOf(60.0f)), c28655q, 54, 8);
            float f13 = 4;
            float f14 = f13 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC39054g.m124501b(AbstractC1102d.m3409f(1.0f, c2314t), 30.0f, c38072d.m121949b(c28655q, 6).getAccentAlert(), false, new C23465k(Float.valueOf(20.0f), fValueOf), c28655q, 54, 8);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC39054g.m124501b(AbstractC1102d.m3409f(1.0f, c2314t), 50.0f, c38072d.m121949b(c28655q, 6).getStrain(), false, new C23465k(Float.valueOf(45.0f), Float.valueOf(55.0f)), c28655q, 54, 8);
            C23454a0 c23454a0 = C23454a0.f92919a;
            AbstractC37056f.m118959K(c23454a0, c23454a0, c23454a0, c23454a0, c23454a0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m67473c(int i13, Composer composer, int i14) {
        m67472b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
