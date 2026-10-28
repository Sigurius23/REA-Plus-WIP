package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import d30.C11520c;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zc1.a1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40266a1 {

    /* JADX INFO: renamed from: a */
    public static final C40266a1 f174170a = new C40266a1();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4352n f174171b = new C37816b(new C11520c(9), false, -709885596);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m129314c(InterfaceC1103a items, int i13, Composer composer, int i14) {
        AbstractC22676k.m65750j(items, "$this$items");
        if ((i14 & 48) == 0) {
            i14 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 145) != 144)) {
            float f13 = 8;
            AbstractC40458s0.m130815r(i13, AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 2 * f13, 0.0f, 2), 0.0f, (i13 == 0 ? (float) 0.5d : 0) * f13, 0.0f, 1 * f13, 5), c28655q, (i14 >> 3) & 14, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4352n m129315b() {
        return f174171b;
    }
}
