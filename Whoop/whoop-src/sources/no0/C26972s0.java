package no0;

import androidx.compose.runtime.Composer;
import b91.C2886a;
import l83.C23454a0;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import x81.C38072d;

/* JADX INFO: renamed from: no0.s0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26972s0 {

    /* JADX INFO: renamed from: a */
    public static final C26972s0 f107607a = new C26972s0();

    /* JADX INFO: renamed from: b */
    private static Function3 f107608b = new C37816b(new C26970r0(0), false, 1364471448);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m80808c(String label, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(label, "label");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(label) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(label, null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, i14 & 14, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final Function3 m80809b() {
        return f107608b;
    }
}
