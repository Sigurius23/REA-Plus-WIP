package rq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: rq2.m */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31737m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131445w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31745q f131446x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f131447y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f131448z;

    public /* synthetic */ C31737m(C31745q c31745q, boolean z4, int i13, int i14) {
        this.f131445w = i14;
        this.f131446x = c31745q;
        this.f131447y = z4;
        this.f131448z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f131445w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC31739n.m98503e(this.f131446x, this.f131447y, this.f131448z, composer, iIntValue);
            default:
                return AbstractC31743p.m98519g(this.f131446x, this.f131447y, this.f131448z, composer, iIntValue);
        }
    }
}
