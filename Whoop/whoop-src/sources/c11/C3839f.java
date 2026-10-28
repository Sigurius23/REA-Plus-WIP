package c11;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: c11.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3839f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15710w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3842i f15711x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f15712y;

    public /* synthetic */ C3839f(C3842i c3842i, int i13, int i14) {
        this.f15710w = i14;
        this.f15711x = c3842i;
        this.f15712y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f15710w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC3841h.m11715U(this.f15711x, this.f15712y, composer, iIntValue);
            case 1:
                return AbstractC3841h.m11711Q(this.f15711x, this.f15712y, composer, iIntValue);
            default:
                return AbstractC3841h.m11713S(this.f15711x, this.f15712y, composer, iIntValue);
        }
    }
}
