package yk2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import l83.C23465k;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import x81.C38072d;

/* JADX INFO: renamed from: yk2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39603c {
    /* JADX INFO: renamed from: b */
    public static final void m126494b(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1453148230);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            long jM125408n = c38072d.m121949b(c28655q, i17).getBackgroundDarkAlt();
            long jM125410o = c38072d.m121949b(c28655q, i17).getBackgroundDarkStd();
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifier, C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(jM125408n)), new C23465k(Float.valueOf(0.3f), new C17919x(C17919x.m51541c(0.0f, jM125408n))), new C23465k(Float.valueOf(0.7f), new C17919x(C17919x.m51541c(0.0f, jM125410o))), new C23465k(Float.valueOf(1.0f), new C17919x(jM125410o))}, 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39602b(i13, i14, 0, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m126495c(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m126494b(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
