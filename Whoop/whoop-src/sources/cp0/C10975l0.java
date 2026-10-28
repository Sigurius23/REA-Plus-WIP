package cp0;

import p390p1.InterfaceC28690z0;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: cp0.l0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C10975l0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34135w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28690z0 f34136x;

    public /* synthetic */ C10975l0(InterfaceC28690z0 interfaceC28690z0, int i13) {
        this.f34135w = i13;
        this.f34136x = interfaceC28690z0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f34135w) {
            case 0:
                return AbstractC10969j0.c.m29217k(this.f34136x, ((Float) obj).floatValue());
            case 1:
                return AbstractC10969j0.c.m29218l(this.f34136x, ((Float) obj).floatValue());
            case 2:
                return AbstractC10942a0.m28994D(this.f34136x, ((Float) obj).floatValue());
            case 3:
                return AbstractC10969j0.m29196r0(this.f34136x, ((Float) obj).floatValue());
            case 4:
                return AbstractC10969j0.m29198s0(this.f34136x, ((Float) obj).floatValue());
            default:
                return AbstractC11009x0.m29522s0(this.f34136x, (C39180l) obj);
        }
    }
}
