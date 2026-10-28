package p734sl0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import p329n0.C26068u;
import p715kotlin.jvm.functions.Function1;
import st1.AbstractC32987h;
import xq2.AbstractC38554c1;

/* JADX INFO: renamed from: sl0.m3 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32643m3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f135293E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f135294F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f135295G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f135296H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135297w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f135298x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f135299y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f135300z;

    public /* synthetic */ C32643m3(float f13, boolean z4, Modifier modifier, float f14, Function1 function1, int i13, int i14) {
        this.f135299y = f13;
        this.f135293E = z4;
        this.f135298x = modifier;
        this.f135300z = f14;
        this.f135296H = function1;
        this.f135294F = i13;
        this.f135295G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f135297w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC32648n3.m102049k(this.f135299y, this.f135293E, (Modifier) this.f135298x, this.f135300z, (Function1) this.f135296H, this.f135294F, this.f135295G, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC32987h.m104140g((Modifier) this.f135298x, this.f135299y, this.f135300z, this.f135293E, (List) this.f135296H, this.f135294F, this.f135295G, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC38554c1.m123580d0((List) this.f135298x, this.f135294F, this.f135299y, this.f135300z, (C26068u) this.f135296H, this.f135293E, this.f135295G, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C32643m3(Modifier modifier, float f13, float f14, boolean z4, List list, int i13, int i14) {
        this.f135298x = modifier;
        this.f135299y = f13;
        this.f135300z = f14;
        this.f135293E = z4;
        this.f135296H = list;
        this.f135294F = i13;
        this.f135295G = i14;
    }

    public /* synthetic */ C32643m3(List list, int i13, float f13, float f14, C26068u c26068u, boolean z4, int i14) {
        this.f135298x = list;
        this.f135294F = i13;
        this.f135299y = f13;
        this.f135300z = f14;
        this.f135296H = c26068u;
        this.f135293E = z4;
        this.f135295G = i14;
    }
}
