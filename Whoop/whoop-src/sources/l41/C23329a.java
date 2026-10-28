package l41;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p390p1.InterfaceC28601c1;
import p724or1.Function2;
import wi0.AbstractC37313e;

/* JADX INFO: renamed from: l41.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C23329a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f92493w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f92494x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f92495y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f92496z;

    public /* synthetic */ C23329a(InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, int i13) {
        this.f92493w = i13;
        this.f92494x = interfaceC4351m;
        this.f92495y = interfaceC28601c1;
        this.f92496z = interfaceC28601c2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f92493w) {
            case 0:
                return AbstractC23332d.m67565l(this.f92494x, this.f92495y, this.f92496z);
            case 1:
                return Function2.m85154l(this.f92494x, this.f92495y, this.f92496z);
            default:
                return AbstractC37313e.m119491A(this.f92494x, this.f92495y, this.f92496z);
        }
    }
}
