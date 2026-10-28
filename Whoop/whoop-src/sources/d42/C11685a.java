package d42;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import ck1.C4785h;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d42.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11685a {

    /* JADX INFO: renamed from: a */
    public static final C11685a f37787a = new C11685a();

    /* JADX INFO: renamed from: b */
    private static Function3 f37788b = new C37816b(new C4785h(11), false, 1243442351);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m31158c(InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC18489d0.m53380u(5, 4, C2314t.f9131w, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final Function3 m31159b() {
        return f37788b;
    }
}
