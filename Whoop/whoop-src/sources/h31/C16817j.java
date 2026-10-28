package h31;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: h31.j */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C16817j implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f64588E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f64589F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64590w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f64591x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16824q f64592y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f64593z;

    public /* synthetic */ C16817j(Modifier modifier, C16824q c16824q, Function1 function1, int i13, int i14, int i15) {
        this.f64590w = i15;
        this.f64591x = modifier;
        this.f64592y = c16824q;
        this.f64593z = function1;
        this.f64588E = i13;
        this.f64589F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f64590w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                Modifier modifier = this.f64591x;
                return AbstractC16819l.m47380d(this.f64592y, this.f64593z, modifier, this.f64588E, this.f64589F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC16826s.m47413i(this.f64591x, this.f64592y, this.f64593z, this.f64588E, this.f64589F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC16826s.m47417m(this.f64591x, this.f64592y, this.f64593z, this.f64588E, this.f64589F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C16817j(C16824q c16824q, Function1 function1, Modifier modifier, int i13, int i14) {
        this.f64590w = 0;
        this.f64592y = c16824q;
        this.f64593z = function1;
        this.f64591x = modifier;
        this.f64588E = i13;
        this.f64589F = i14;
    }
}
