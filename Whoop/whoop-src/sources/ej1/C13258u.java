package ej1;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import ib0.AbstractC18333d;
import lf0.AbstractC23899b0;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;
import ve0.AbstractC35927e;
import vv2.AbstractC36539e;
import xi2.AbstractC38328f;
import z72.AbstractC40161g;
import z72.AbstractC40163i;

/* JADX INFO: renamed from: ej1.u */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13258u implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45914w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC25312u f45915x;

    public /* synthetic */ C13258u(int i13, InterfaceC25312u interfaceC25312u) {
        this.f45914w = i13;
        this.f45915x = interfaceC25312u;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f45914w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC13259v.m37293k(this.f45915x, (InterfaceC25312u) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC18333d.m52744B(this.f45915x, (InterfaceC25312u) obj, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC23899b0.m70206B(this.f45915x, (InterfaceC25312u) obj, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return AbstractC35927e.m114114M(this.f45915x, (InterfaceC25312u) obj, (Composer) obj2, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj3).intValue();
                return AbstractC36539e.m117105O(this.f45915x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj3).intValue();
                return AbstractC38328f.m122887y(this.f45915x, (InterfaceC25312u) obj, (Composer) obj2, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj3).intValue();
                return AbstractC40161g.m128807U(this.f45915x, (InterfaceC25312u) obj, (Composer) obj2, iIntValue7);
            default:
                int iIntValue8 = ((Integer) obj3).intValue();
                return AbstractC40163i.m128879l(this.f45915x, (InterfaceC25312u) obj, (Composer) obj2, iIntValue8);
        }
    }
}
