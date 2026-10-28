package p292l1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p390p1.C28655q;

/* JADX INFO: renamed from: l1.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C23072c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float f91030w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f91031x;

    public C23072c(float f13, float f14) {
        this.f91030w = f13;
        this.f91031x = f14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC22989q.m66760a(AbstractC1102d.m3421r(C2314t.f9131w, this.f91030w, this.f91031x), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
