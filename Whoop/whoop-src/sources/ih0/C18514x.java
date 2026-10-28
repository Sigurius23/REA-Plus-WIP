package ih0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import k03.AbstractC22109n;
import n03.C26095f;

/* JADX INFO: renamed from: ih0.x */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18514x implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72143w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f72144x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f72145y;

    public /* synthetic */ C18514x(float f13, int i13, boolean z4) {
        this.f72143w = i13;
        this.f72144x = f13;
        this.f72145y = z4;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f72143w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC18491e0.m53420L0(this.f72145y, this.f72144x, composer, iIntValue);
            case 1:
                return AbstractC22109n.m63279P(this.f72144x, this.f72145y, composer, iIntValue);
            default:
                return C26095f.m77625w(this.f72144x, this.f72145y, composer, iIntValue);
        }
    }

    public /* synthetic */ C18514x(boolean z4, float f13) {
        this.f72143w = 0;
        this.f72145y = z4;
        this.f72144x = f13;
    }
}
