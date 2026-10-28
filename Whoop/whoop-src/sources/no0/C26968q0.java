package no0;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import gf1.C15786e;
import l83.C23454a0;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: no0.q0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26968q0 {

    /* JADX INFO: renamed from: a */
    public static final C26968q0 f107588a = new C26968q0();

    /* JADX INFO: renamed from: b */
    private static Function3 f107589b = new C37816b(new C15786e(29), false, 1620857505);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m80770c(InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(item) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            AbstractC22953f.m66715b(c28655q, InterfaceC1103a.m3431b(item, C2314t.f9131w));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final Function3 m80771b() {
        return f107589b;
    }
}
