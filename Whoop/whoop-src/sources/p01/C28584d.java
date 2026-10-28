package p01;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: p01.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C28584d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115677w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28582b f115678x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f115679y;

    public /* synthetic */ C28584d(C28582b c28582b, int i13, int i14) {
        this.f115677w = i14;
        this.f115678x = c28582b;
        this.f115679y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f115677w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC28586f.m86949n(this.f115678x, this.f115679y, composer, iIntValue);
            case 1:
                return AbstractC28586f.m86953r(this.f115678x, this.f115679y, composer, iIntValue);
            default:
                return AbstractC28586f.m86955t(this.f115678x, this.f115679y, composer, iIntValue);
        }
    }
}
