package zy0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import br2.C3565g;
import l83.C23454a0;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zy0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lzy0/d;", "type", "Li2/x;", "color", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Lzy0/d;JLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41215c {
    /* JADX INFO: renamed from: b */
    public static final void m133896b(Modifier modifier, EnumC41216d type, long j7, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(type, "type");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-344508103);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(type.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87151f(j7) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifier, AbstractC33253j.m105490f(type.getStartCornerPadding(), type.getEndCornerPadding(), type.getEndCornerPadding(), type.getStartCornerPadding())), j7, AbstractC17918w0.f69621a), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3565g(modifier2, type, j7, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m133897c(Modifier modifier, EnumC41216d enumC41216d, long j7, int i13, int i14, Composer composer, int i15) {
        m133896b(modifier, enumC41216d, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
