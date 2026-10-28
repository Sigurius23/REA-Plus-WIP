package p162g0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22989q;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: g0.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14924a implements Function3 {

    /* JADX INFO: renamed from: w */
    public static final C14924a f55621w = new C14924a();

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C14926c c14926c = (C14926c) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87153g(c14926c) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 19) != 18)) {
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3411h(AbstractC14928e.f55639k, AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, AbstractC14928e.f55640l, 1))), c14926c.f55625c, AbstractC17918w0.f69621a), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
