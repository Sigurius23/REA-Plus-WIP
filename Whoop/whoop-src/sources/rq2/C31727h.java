package rq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: rq2.h */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31727h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131428w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31723f f131429x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f131430y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f131431z;

    public /* synthetic */ C31727h(C31723f c31723f, boolean z4, int i13, int i14) {
        this.f131428w = i14;
        this.f131429x = c31723f;
        this.f131430y = z4;
        this.f131431z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f131428w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC31729i.m98464k(this.f131429x, this.f131430y, this.f131431z, composer, iIntValue);
            default:
                return AbstractC31733k.m98489k(this.f131429x, this.f131430y, this.f131431z, composer, iIntValue);
        }
    }
}
