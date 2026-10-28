package am2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import k21.AbstractC22159c;
import k21.C22160d;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: am2.l0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1029l0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3913w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22160d f3914x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f3915y;

    public /* synthetic */ C1029l0(C22160d c22160d, Function1 function1, int i13) {
        this.f3913w = i13;
        this.f3914x = c22160d;
        this.f3915y = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f3913w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC1035o0.m2862a0(this.f3914x, this.f3915y, composer, iIntValue);
            default:
                return AbstractC22159c.m63427i(this.f3914x, this.f3915y, composer, iIntValue);
        }
    }
}
