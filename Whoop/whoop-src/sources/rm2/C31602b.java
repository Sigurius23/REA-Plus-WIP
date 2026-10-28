package rm2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p114eb.C12991u0;

/* JADX INFO: renamed from: rm2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31602b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130612w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12991u0 f130613x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f130614y;

    public /* synthetic */ C31602b(C12991u0 c12991u0, InterfaceC4339a interfaceC4339a) {
        this.f130612w = 2;
        this.f130614y = interfaceC4339a;
        this.f130613x = c12991u0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f130612w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC31605e.m97563G0(this.f130613x, this.f130614y, composer, iIntValue);
            case 1:
                return AbstractC31605e.m97602i0(this.f130613x, this.f130614y, composer, iIntValue);
            case 2:
                return AbstractC31605e.m97581W(this.f130614y, this.f130613x, composer, iIntValue);
            default:
                return AbstractC31605e.m97616p0(this.f130613x, this.f130614y, composer, iIntValue);
        }
    }

    public /* synthetic */ C31602b(C12991u0 c12991u0, InterfaceC4339a interfaceC4339a, int i13) {
        this.f130612w = i13;
        this.f130613x = c12991u0;
        this.f130614y = interfaceC4339a;
    }
}
