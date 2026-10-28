package cp0;

import c93.InterfaceC4339a;
import p329n0.C26068u;
import p390p1.InterfaceC28690z0;
import zi0.AbstractC40662a;

/* JADX INFO: renamed from: cp0.e0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C10954e0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f33941w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f33942x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f33943y;

    public /* synthetic */ C10954e0(Object obj, float f13, int i13) {
        this.f33941w = i13;
        this.f33943y = obj;
        this.f33942x = f13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f33941w) {
            case 0:
                return AbstractC10969j0.m29110D0((InterfaceC28690z0) this.f33943y, this.f33942x);
            default:
                return Float.valueOf(AbstractC40662a.m131977u((C26068u) this.f33943y, this.f33942x));
        }
    }
}
