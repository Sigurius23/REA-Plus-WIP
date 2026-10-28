package c01;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: c01.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3803c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f15556E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15557w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3808h f15558x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f15559y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f15560z;

    public /* synthetic */ C3803c(Modifier modifier, C3808h c3808h, int i13, int i14) {
        this.f15557w = 0;
        this.f15559y = modifier;
        this.f15558x = c3808h;
        this.f15560z = i13;
        this.f15556E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15557w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3805e.m11618j(this.f15559y, this.f15558x, this.f15560z, this.f15556E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                Modifier modifier = this.f15559y;
                return AbstractC3805e.m11627s(this.f15558x, modifier, this.f15560z, this.f15556E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                Modifier modifier2 = this.f15559y;
                return AbstractC3805e.m11620l(this.f15558x, modifier2, this.f15560z, this.f15556E, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                Modifier modifier3 = this.f15559y;
                return AbstractC3805e.m11629u(this.f15558x, modifier3, this.f15560z, this.f15556E, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ C3803c(C3808h c3808h, Modifier modifier, int i13, int i14, int i15) {
        this.f15557w = i15;
        this.f15558x = c3808h;
        this.f15559y = modifier;
        this.f15560z = i13;
        this.f15556E = i14;
    }
}
