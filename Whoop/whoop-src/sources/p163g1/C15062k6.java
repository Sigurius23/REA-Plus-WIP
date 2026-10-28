package p163g1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g1.k6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15062k6 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56399w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15072l6 f56400x;

    public C15062k6(C15072l6 c15072l6, int i13) {
        this.f56399w = i13;
        switch (i13) {
            case 1:
                this.f56400x = c15072l6;
                break;
            default:
                C37816b c37816b = AbstractC15036i1.f56299a;
                this.f56400x = c15072l6;
                break;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56399w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C37816b c37816b = AbstractC15036i1.f56299a;
                    C15072l6 c15072l6 = this.f56400x;
                    AbstractC22676k.m65747g(c15072l6);
                    c37816b.invoke(c15072l6, c28655q, 0);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC15011f9.m43114b(this.f56400x.f56430a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q2, 0, 0, 131070);
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
