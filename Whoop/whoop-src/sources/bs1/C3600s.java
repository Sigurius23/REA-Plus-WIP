package bs1;

import c93.InterfaceC4351m;

/* JADX INFO: renamed from: bs1.s */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3600s implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14608w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f14609x;

    public /* synthetic */ C3600s(int i13, InterfaceC4351m interfaceC4351m) {
        this.f14608w = i13;
        this.f14609x = interfaceC4351m;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14608w) {
            case 0:
                return AbstractC3583c0.m10793T0(this.f14609x, (String) obj, (Long) obj2);
            default:
                return AbstractC3583c0.m10872o2(this.f14609x, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
        }
    }
}
