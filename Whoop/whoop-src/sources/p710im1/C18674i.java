package p710im1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: im1.i */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18674i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73274w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f73275x;

    public /* synthetic */ C18674i(Function1 function1, int i13) {
        this.f73274w = i13;
        this.f73275x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f73274w) {
            case 0:
                return AbstractC18682m.m54249l(this.f73275x);
            case 1:
                return AbstractC18677j0.m54233t(this.f73275x);
            case 2:
                return AbstractC18697t0.m54306X0(this.f73275x);
            case 3:
                return AbstractC18697t0.m54316b1(this.f73275x);
            default:
                return AbstractC18697t0.m54331g1(this.f73275x);
        }
    }
}
