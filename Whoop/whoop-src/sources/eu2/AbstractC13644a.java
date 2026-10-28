package eu2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
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
import p699b70.C2775a;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: eu2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007\"\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000e"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "SCRIM_CONTENT_HEIGHT", "SCRIM_TOP_PADDING", "c", "SCRIM_BOTTOM_PADDING", "d", "SCRIM_TOTAL_HEIGHT", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13644a {

    /* JADX INFO: renamed from: a */
    private static final float f48335a;

    /* JADX INFO: renamed from: b */
    private static final float f48336b;

    /* JADX INFO: renamed from: c */
    private static final float f48337c;

    /* JADX INFO: renamed from: d */
    private static final float f48338d;

    static {
        float f13 = 4;
        float f14 = ((float) 14.5d) * f13;
        f48335a = f14;
        float f15 = 3 * f13;
        f48336b = f15;
        float f16 = ((float) 3.5d) * f13;
        f48337c = f16;
        f48338d = f14 + f15 + f16;
    }

    /* JADX INFO: renamed from: b */
    public static final void m38442b(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1660257229);
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
            long jM51541c = C17919x.m51541c(0.5f, C17919x.f69625b);
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3411h(f48338d, AbstractC1102d.m3409f(1.0f, modifier)), C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m)), new C23465k(Float.valueOf(0.8333333f), new C17919x(jM51541c)), new C23465k(Float.valueOf(1.0f), new C17919x(jM51541c))}, 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 7, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m38443c(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m38442b(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
