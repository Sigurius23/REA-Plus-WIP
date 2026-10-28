package lf0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import io2.C20769k0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import kk1.C22541b;
import l83.C23454a0;
import p026b2.C2314t;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p392p3.C28780r;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rz0.AbstractC31926e;
import x81.C38072d;

/* JADX INFO: renamed from: lf0.v1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llf0/w1;", "state", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Llf0/w1;Landroidx/compose/runtime/Composer;II)V", "Liz0/m;", "f", "(Landroidx/compose/runtime/Composer;I)Liz0/m;", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23978v1 {
    /* JADX INFO: renamed from: c */
    public static final void m70747c(Modifier modifier, C23981w1 state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2111366153);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(state) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, modifier3), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getNeutral15(), AbstractC33253j.m105489e(12), null, null, 0, AbstractC37817c.m121344e(1046186887, c28655q, new C22541b(state, 17)), c28655q, 14155776, 50);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(modifier2, i13, state, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m70748d(C23981w1 c23981w1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC21048g.m58807M(c23981w1.getCallout(), AbstractC1099a.m3395q(C2314t.f9131w, 16, 12), false, m70750f(c28655q, 0), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 48, 500);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m70749e(Modifier modifier, C23981w1 c23981w1, int i13, int i14, Composer composer, int i15) {
        m70747c(modifier, c23981w1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static final C21054m m70750f(Composer composer, int i13) {
        C21053l c21053l = C21053l.f79834a;
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        C23285v0 style = c38072d.m121952e(composer, i14).getB3().getStyle();
        long white70 = c38072d.m121949b(composer, i14).getWhite70();
        C28780r c28780r = C28780r.f116544x;
        return c21053l.m58880a(style, white70, 0L, 0L, C28780r.f116546z, c38072d.m121949b(composer, i14).getWhite90(), 0, c38072d.m121949b(composer, i14).getRecovery(), null, 0L, 0.0f, 0.0f, false, false, 0.0f, composer, 24576, C21053l.f79835b << 15, 32524);
    }
}
