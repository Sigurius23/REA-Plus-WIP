package p329n0;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: n0.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C26052e implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C37816b f103123w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f103124x;

    public C26052e(C37816b c37816b, int i13) {
        this.f103123w = c37816b;
        this.f103124x = i13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 19) != 18)) {
            this.f103123w.invoke(interfaceC1103a, Integer.valueOf(this.f103124x), c28655q, Integer.valueOf(iIntValue & 14));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
