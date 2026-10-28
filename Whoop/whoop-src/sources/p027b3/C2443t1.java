package p027b3;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.C28655q;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b3.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2443t1 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C2443t1 f9547w = new C2443t1(2);

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
