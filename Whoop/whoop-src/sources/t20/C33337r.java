package t20;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import g40.C15454z1;
import l83.C23454a0;
import p095dp.AbstractC12240d;
import p390p1.C28655q;

/* JADX INFO: renamed from: t20.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C33337r implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f139077w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15454z1 f139078x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f139079y;

    public C33337r(int i13, C15454z1 c15454z1, boolean z4) {
        this.f139077w = z4;
        this.f139078x = c15454z1;
        this.f139079y = i13;
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
                AbstractC12240d.m34070g(this.f139077w, this.f139078x, null, null, false, false, null, null, this.f139079y, composer, 64, 252);
            }
        } else {
            AbstractC12240d.m34070g(this.f139077w, this.f139078x, null, null, false, false, null, null, this.f139079y, composer, 64, 252);
        }
        return C23454a0.f92919a;
    }
}
