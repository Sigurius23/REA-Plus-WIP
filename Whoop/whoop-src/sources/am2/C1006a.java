package am2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: am2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1006a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3775w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f3776x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1037p0 f3777y;

    public /* synthetic */ C1006a(Function1 function1, C1037p0 c1037p0, int i13) {
        this.f3775w = i13;
        this.f3776x = function1;
        this.f3777y = c1037p0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f3775w) {
            case 0:
                return AbstractC1026k.m2788w(this.f3776x, this.f3777y);
            case 1:
                return AbstractC1026k.m2789x(this.f3776x, this.f3777y);
            case 2:
                return AbstractC1026k.m2790y(this.f3776x, this.f3777y);
            default:
                return AbstractC1046w.m2992D(this.f3776x, this.f3777y);
        }
    }
}
