package e61;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import j61.C21369c;

/* JADX INFO: renamed from: e61.k */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C12768k implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43692w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21369c f43693x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f43694y;

    public /* synthetic */ C12768k(C21369c c21369c, int i13, int i14) {
        this.f43692w = i14;
        this.f43693x = c21369c;
        this.f43694y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f43692w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC12770m.m35800m(this.f43693x, this.f43694y, composer, iIntValue);
            default:
                return AbstractC12770m.m35795h(this.f43693x, this.f43694y, composer, iIntValue);
        }
    }
}
