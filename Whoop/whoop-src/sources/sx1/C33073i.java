package sx1;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p291l0.InterfaceC23013y;
import p715kotlin.jvm.functions.Function3;
import ux1.C35370d;

/* JADX INFO: renamed from: sx1.i */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C33073i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f137919w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35370d f137920x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4351m f137921y;

    public /* synthetic */ C33073i(C35370d c35370d, InterfaceC4351m interfaceC4351m, int i13) {
        this.f137919w = i13;
        this.f137920x = c35370d;
        this.f137921y = interfaceC4351m;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f137919w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC33074j.m104739H(this.f137920x, this.f137921y, (InterfaceC1103a) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC33074j.m104776y(this.f137920x, this.f137921y, (InterfaceC23013y) obj, (Composer) obj2, iIntValue2);
        }
    }
}
