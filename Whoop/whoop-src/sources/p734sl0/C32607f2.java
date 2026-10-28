package p734sl0;

import af3.AbstractC0844t;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import iz0.C21054m;
import zk0.C40819i0;

/* JADX INFO: renamed from: sl0.f2 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32607f2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C40819i0 f135152E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C32588b3 f135153F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f135154G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f135155H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135156w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC0844t f135157x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f135158y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C21054m f135159z;

    public /* synthetic */ C32607f2(AbstractC0844t abstractC0844t, Modifier modifier, C21054m c21054m, C40819i0 c40819i0, C32588b3 c32588b3, int i13, int i14, int i15) {
        this.f135156w = i15;
        this.f135157x = abstractC0844t;
        this.f135158y = modifier;
        this.f135159z = c21054m;
        this.f135152E = c40819i0;
        this.f135153F = c32588b3;
        this.f135154G = i13;
        this.f135155H = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f135156w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC32637l2.m101937M(this.f135157x, this.f135158y, this.f135159z, this.f135152E, this.f135153F, this.f135154G, this.f135155H, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC32637l2.m101987y(this.f135157x, this.f135158y, this.f135159z, this.f135152E, this.f135153F, this.f135154G, this.f135155H, (Composer) obj, iIntValue2);
        }
    }
}
