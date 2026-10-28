package p316m1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;

/* JADX INFO: renamed from: m1.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C24901f0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f97536E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97537w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f97538x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23285v0 f97539y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f97540z;

    public /* synthetic */ C24901f0(long j7, C23285v0 c23285v0, InterfaceC4351m interfaceC4351m, int i13, int i14) {
        this.f97537w = i14;
        this.f97538x = j7;
        this.f97539y = c23285v0;
        this.f97540z = interfaceC4351m;
        this.f97536E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f97537w) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC24899e0.m72995b(this.f97538x, this.f97539y, this.f97540z, (Composer) obj, AbstractC28683x.m87244L(this.f97536E | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC24913l0.m73014b(this.f97538x, this.f97539y, this.f97540z, (Composer) obj, AbstractC28683x.m87244L(this.f97536E | 1));
                break;
        }
        return C23454a0.f92919a;
    }
}
