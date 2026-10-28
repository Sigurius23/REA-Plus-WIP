package az0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import k91.C22302a;
import l83.C23454a0;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: az0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Li91/a;", "background", "Lk91/a;", "roundedCorners", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2159b {
    /* JADX INFO: renamed from: b */
    public static final void m6721b(Modifier modifier, AbstractC18247a abstractC18247a, C22302a c22302a, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1682482941);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= ((i14 & 2) == 0 && c28655q.m87153g(abstractC18247a)) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= ((i14 & 4) == 0 && c28655q.m87153g(c22302a)) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if (i16 != 0) {
                    modifier = C2314t.f9131w;
                }
                if ((i14 & 2) != 0) {
                    abstractC18247a = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
                }
                if ((i14 & 4) != 0) {
                    c22302a = C22302a.Companion.m64092d(C22302a.INSTANCE, ((float) 0.5d) * 4, 0.0f, 2, null);
                }
            } else {
                c28655q.m87138X();
            }
            c28655q.m87175r();
            AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC37056f.m118994r(modifier, c22302a.m64090c()), abstractC18247a), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        AbstractC18247a abstractC18247a2 = abstractC18247a;
        C22302a c22302a2 = c22302a;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2158a(modifier2, abstractC18247a2, c22302a2, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m6722c(Modifier modifier, AbstractC18247a abstractC18247a, C22302a c22302a, int i13, int i14, Composer composer, int i15) {
        m6721b(modifier, abstractC18247a, c22302a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
