package c11;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: c11.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3836c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15700w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3842i f15701x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f15702y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f15703z;

    public /* synthetic */ C3836c(C3842i c3842i, boolean z4, int i13, int i14) {
        this.f15700w = i14;
        this.f15701x = c3842i;
        this.f15702y = z4;
        this.f15703z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f15700w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC3841h.m11720Z(this.f15701x, this.f15702y, this.f15703z, composer, iIntValue);
            case 1:
                return AbstractC3841h.m11726c0(this.f15701x, this.f15702y, this.f15703z, composer, iIntValue);
            default:
                return AbstractC3841h.m11705K(this.f15701x, this.f15702y, this.f15703z, composer, iIntValue);
        }
    }
}
