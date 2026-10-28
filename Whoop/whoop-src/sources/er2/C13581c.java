package er2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: er2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C13581c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f47946w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13579a f47947x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f47948y;

    public /* synthetic */ C13581c(C13579a c13579a, int i13, int i14) {
        this.f47946w = i14;
        this.f47947x = c13579a;
        this.f47948y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f47946w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC13583e.m38340j(this.f47947x, this.f47948y, composer, iIntValue);
            default:
                return AbstractC13583e.m38342l(this.f47947x, this.f47948y, composer, iIntValue);
        }
    }
}
