package c41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c41.j4 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4052j4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f16470E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f16471F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16472w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f16473x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C4108r4 f16474y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f16475z;

    public /* synthetic */ C4052j4(Modifier modifier, C4108r4 c4108r4, Function1 function1, int i13, int i14, int i15) {
        this.f16472w = i15;
        this.f16473x = modifier;
        this.f16474y = c4108r4;
        this.f16475z = function1;
        this.f16470E = i13;
        this.f16471F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16472w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4066l4.m12457r(this.f16473x, this.f16474y, this.f16475z, this.f16470E, this.f16471F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC4066l4.m12454o(this.f16473x, this.f16474y, this.f16475z, this.f16470E, this.f16471F, (Composer) obj, iIntValue2);
        }
    }
}
