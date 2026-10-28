package g40;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.C28655q;
import p547v8.AbstractC35785b;

/* JADX INFO: renamed from: g40.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15330c0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f57602w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f57603x;

    public C15330c0(boolean z4, boolean z13) {
        this.f57602w = z4;
        this.f57603x = z13;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                AbstractC35785b.m113409d(null, this.f57602w, this.f57603x, composer, 48, 4);
            }
        } else {
            AbstractC35785b.m113409d(null, this.f57602w, this.f57603x, composer, 48, 4);
        }
        return C23454a0.f92919a;
    }
}
