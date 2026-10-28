package p292l1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;

/* JADX INFO: renamed from: l1.n1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23140n1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f91504E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f91505F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91506w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f91507x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f91508y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f91509z;

    public /* synthetic */ C23140n1(Modifier modifier, float f13, long j7, int i13, int i14, int i15) {
        this.f91506w = i15;
        this.f91507x = modifier;
        this.f91508y = f13;
        this.f91509z = j7;
        this.f91504E = i13;
        this.f91505F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f91506w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(this.f91504E | 1);
                AbstractC23124k3.m67100d(this.f91507x, this.f91509z, this.f91508y, iM87244L, (Composer) obj, this.f91505F);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM87244L2 = AbstractC28683x.m87244L(this.f91504E | 1);
                AbstractC23124k3.m67099c(this.f91507x, this.f91509z, this.f91508y, iM87244L2, (Composer) obj, this.f91505F);
                break;
        }
        return C23454a0.f92919a;
    }
}
