package g40;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p095dp.AbstractC12240d;
import p390p1.C28655q;

/* JADX INFO: renamed from: g40.c2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15332c2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57606w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15454z1 f57607x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f57608y;

    public /* synthetic */ C15332c2(int i13, C15454z1 c15454z1, boolean z4) {
        this.f57606w = i13;
        this.f57607x = c15454z1;
        this.f57608y = z4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57606w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC12240d.m34065c(this.f57607x, this.f57608y, composer, 0);
                    }
                } else {
                    AbstractC12240d.m34065c(this.f57607x, this.f57608y, composer, 0);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        AbstractC12240d.m34065c(this.f57607x, this.f57608y, composer2, 0);
                    }
                } else {
                    AbstractC12240d.m34065c(this.f57607x, this.f57608y, composer2, 0);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
