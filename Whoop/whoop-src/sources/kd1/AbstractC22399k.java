package kd1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import cp0.C10941a;
import ge3.AbstractC15751g;
import l83.C23454a0;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import x81.C38072d;

/* JADX INFO: renamed from: kd1.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"", "title", "Ll83/a0;", "c", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "e", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22399k {
    /* JADX INFO: renamed from: c */
    public static final void m64473c(String title, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(title, "title");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1575091950);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(title) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C38072d c38072d = C38072d.f163053a;
            long white20 = c38072d.m121949b(c28655q2, 6).getWhite20();
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(title, AbstractC1099a.m3394p(((float) 0.5d) * 8, AbstractC15751g.m44455h(AbstractC1092a.m3358c(modifierM3409f, white20, c17916v0), 2, c38072d.m121949b(c28655q2, 6).getBrandBlack(), c17916v0)), c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH3(), null, c28655q, i14 & 14, 0, 196088);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(title, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m64474d(String str, int i13, Composer composer, int i14) {
        m64473c(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m64475e(String title, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(title, "title");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1553846250);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(title) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C38072d c38072d = C38072d.f163053a;
            long white10 = c38072d.m121949b(c28655q2, 6).getWhite10();
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(title, AbstractC1099a.m3394p(((float) 0.5d) * 8, AbstractC15751g.m44455h(AbstractC1092a.m3358c(modifierM3409f, white10, c17916v0), 2, c38072d.m121949b(c28655q2, 6).getBrandBlack(), c17916v0)), c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB1(), null, c28655q, i14 & 14, 0, 196088);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(title, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m64476f(String str, int i13, Composer composer, int i14) {
        m64475e(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
