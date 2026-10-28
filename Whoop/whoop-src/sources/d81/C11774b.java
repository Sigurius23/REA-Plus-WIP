package d81;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import r81.AbstractC31066b;
import r81.C31069e;

/* JADX INFO: renamed from: d81.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C11774b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38162w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31069e f38163x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f38164y;

    public /* synthetic */ C11774b(C31069e c31069e, int i13, int i14) {
        this.f38162w = i14;
        this.f38163x = c31069e;
        this.f38164y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f38162w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC11775c.m31569h(this.f38163x, this.f38164y, composer, iIntValue);
            default:
                return AbstractC31066b.m95693k(this.f38163x, this.f38164y, composer, iIntValue);
        }
    }
}
