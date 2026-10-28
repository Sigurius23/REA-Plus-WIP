package e61;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import dw1.C12413a;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p91.AbstractC29011e;
import p91.C29007a;
import qz0.AbstractC30795n;
import x81.C38072d;

/* JADX INFO: renamed from: e61.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12759b {

    /* JADX INFO: renamed from: a */
    public static final C12759b f43640a = new C12759b();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4351m f43641b = new C37816b(new C12413a(5), false, -2005152828);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m35707c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM88149j = AbstractC29011e.m88149j(C2314t.f9131w, 0.5f, 0.5f, C29007a.INSTANCE.m88136a());
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h("Dead Center", modifierM88149j, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH1(), null, c28655q, 6, 0, 196600);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4351m m35708b() {
        return f43641b;
    }
}
