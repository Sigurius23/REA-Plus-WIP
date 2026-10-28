package p747z81;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p208i2.InterfaceC17912t0;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: z81.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40183c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC17912t0 f173407E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f173408F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f173409G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f173410H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f173411w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f173412x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f173413y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC39332e f173414z;

    public /* synthetic */ C40183c(Modifier modifier, float f13, InterfaceC39332e interfaceC39332e, InterfaceC17912t0 interfaceC17912t0, float f14, int i13, int i14, int i15) {
        this.f173411w = i15;
        this.f173412x = modifier;
        this.f173413y = f13;
        this.f173414z = interfaceC39332e;
        this.f173407E = interfaceC17912t0;
        this.f173408F = f14;
        this.f173409G = i13;
        this.f173410H = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f173411w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return Function1.m128931j(this.f173412x, this.f173413y, this.f173414z, this.f173407E, this.f173408F, this.f173409G, this.f173410H, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return Function1.m128937p(this.f173412x, this.f173413y, this.f173414z, this.f173407E, this.f173408F, this.f173409G, this.f173410H, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return Function1.m128935n(this.f173412x, this.f173413y, this.f173414z, this.f173407E, this.f173408F, this.f173409G, this.f173410H, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return Function1.m128933l(this.f173412x, this.f173413y, this.f173414z, this.f173407E, this.f173408F, this.f173409G, this.f173410H, (Composer) obj, iIntValue4);
        }
    }
}
