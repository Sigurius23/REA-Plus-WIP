package f01;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: f01.m0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C13879m0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f49485E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49486w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f49487x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13885o0 f49488y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f49489z;

    public /* synthetic */ C13879m0(Modifier modifier, C13885o0 c13885o0, int i13, int i14, int i15) {
        this.f49486w = i15;
        this.f49487x = modifier;
        this.f49488y = c13885o0;
        this.f49489z = i13;
        this.f49485E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49486w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC13882n0.m39429m(this.f49487x, this.f49488y, this.f49489z, this.f49485E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC13882n0.m39414B(this.f49487x, this.f49488y, this.f49489z, this.f49485E, (Composer) obj, iIntValue2);
        }
    }
}
