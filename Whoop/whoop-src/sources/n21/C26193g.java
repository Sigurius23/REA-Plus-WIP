package n21;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p097ds.AbstractC12314q;
import p390p1.AbstractC28683x;
import qk2.AbstractC30446b;

/* JADX INFO: renamed from: n21.g */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C26193g implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f103896E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103897w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f103898x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f103899y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f103900z;

    public /* synthetic */ C26193g(int i13, int i14, long j7, Modifier modifier) {
        this.f103897w = 3;
        this.f103899y = j7;
        this.f103898x = modifier;
        this.f103900z = i13;
        this.f103896E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f103897w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                long j7 = this.f103899y;
                return AbstractC26194h.m77786t(this.f103898x, j7, this.f103900z, this.f103896E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                long j13 = this.f103899y;
                return AbstractC26194h.m77764A(this.f103898x, j13, this.f103900z, this.f103896E, (Composer) obj, iIntValue2);
            case 2:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(this.f103900z | 1);
                AbstractC12314q.m34325e(this.f103899y, this.f103898x, iM87244L, (Composer) obj, this.f103896E);
                return C23454a0.f92919a;
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC30446b.m93157n(this.f103899y, this.f103898x, this.f103900z, this.f103896E, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C26193g(Modifier modifier, long j7, int i13, int i14, int i15) {
        this.f103897w = i15;
        this.f103898x = modifier;
        this.f103899y = j7;
        this.f103900z = i13;
        this.f103896E = i14;
    }
}
