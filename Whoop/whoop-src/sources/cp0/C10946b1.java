package cp0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import ck1.C4785h;
import l83.C23454a0;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import vy0.AbstractC36588p;

/* JADX INFO: renamed from: cp0.b1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10946b1 {

    /* JADX INFO: renamed from: a */
    public static final C10946b1 f33890a = new C10946b1();

    /* JADX INFO: renamed from: b */
    private static Function3 f33891b = new C37816b(new C4785h(10), false, -144553351);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m29035c(InterfaceC4339a onToggle, Composer composer, int i13) {
        AbstractC22676k.m65750j(onToggle, "onToggle");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87157i(onToggle) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            AbstractC36588p.m117484t0(onToggle, c28655q, i13 & 14);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final Function3 m29036b() {
        return f33891b;
    }
}
