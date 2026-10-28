package p163g1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.C28655q;
import p558vp.AbstractC36259c;

/* JADX INFO: renamed from: g1.l8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15074l8 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56437w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f56438x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4351m f56439y;

    public /* synthetic */ C15074l8(long j7, InterfaceC4351m interfaceC4351m, int i13) {
        this.f56437w = i13;
        this.f56438x = j7;
        this.f56439y = interfaceC4351m;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56437w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC15114p8.m43175b(this.f56438x, null, this.f56439y, c28655q, 0, 6);
                } else {
                    c28655q.m87138X();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC15114p8.m43175b(this.f56438x, null, this.f56439y, c28655q2, 0, 6);
                } else {
                    c28655q2.m87138X();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q3 = (C28655q) composer3;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        AbstractC36259c.m115696k(this.f56438x, null, this.f56439y, composer3, 0, 6);
                    }
                } else {
                    AbstractC36259c.m115696k(this.f56438x, null, this.f56439y, composer3, 0, 6);
                }
                break;
            default:
                Composer composer4 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q4 = (C28655q) composer4;
                    if (c28655q4.m87121F()) {
                        c28655q4.m87138X();
                    } else {
                        AbstractC36259c.m115696k(this.f56438x, null, this.f56439y, composer4, 0, 6);
                    }
                } else {
                    AbstractC36259c.m115696k(this.f56438x, null, this.f56439y, composer4, 0, 6);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
