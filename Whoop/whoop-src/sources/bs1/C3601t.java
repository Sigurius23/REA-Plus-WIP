package bs1;

import p164g2.InterfaceC15237i;
import p715kotlin.jvm.functions.Function1;
import uw0.AbstractC35302l;

/* JADX INFO: renamed from: bs1.t */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3601t implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14610w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC15237i f14611x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f14612y;

    public /* synthetic */ C3601t(InterfaceC15237i interfaceC15237i, Function1 function1, int i13) {
        this.f14610w = i13;
        this.f14611x = interfaceC15237i;
        this.f14612y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14610w) {
            case 0:
                return AbstractC3583c0.m10808Y0(this.f14611x, this.f14612y, obj);
            case 1:
                return AbstractC3585d0.m10927h(this.f14611x, this.f14612y, obj);
            default:
                return AbstractC35302l.m112007A(this.f14611x, this.f14612y, ((Integer) obj).intValue());
        }
    }
}
