package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p026b2.C2307m;
import p088dc.AbstractC11894a;
import p208i2.AbstractC17921y;
import p390p1.C28655q;

/* JADX INFO: renamed from: b30.l2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2565l2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9965w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC17921y f9966x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2307m f9967y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f9968z;

    public C2565l2(int i13, AbstractC17921y abstractC17921y, C2307m c2307m, Modifier modifier) {
        this.f9965w = i13;
        this.f9966x = abstractC17921y;
        this.f9967y = c2307m;
        this.f9968z = modifier;
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
                AbstractC11894a.m31961j(this.f9965w, this.f9966x, this.f9967y, this.f9968z, composer, 3072);
            }
        } else {
            AbstractC11894a.m31961j(this.f9965w, this.f9966x, this.f9967y, this.f9968z, composer, 3072);
        }
        return C23454a0.f92919a;
    }
}
