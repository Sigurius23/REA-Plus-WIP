package p163g1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p208i2.C17919x;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: g1.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C15196y0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC28601c1 f57032w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC22973k1 f57033x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function3 f57034y;

    public C15196y0(InterfaceC28601c1 interfaceC28601c1, InterfaceC22973k1 interfaceC22973k1, Function3 function3) {
        this.f57032w = interfaceC28601c1;
        this.f57033x = interfaceC22973k1;
        this.f57034y = function3;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC28683x.m87247a(AbstractC15047j1.f56336a.mo86977a(Float.valueOf(C17919x.m51543e(((C17919x) this.f57032w.getValue()).f69639a))), AbstractC37817c.m121344e(-869936862, c28655q, new C15186x0(this.f57033x, this.f57034y, 1)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
