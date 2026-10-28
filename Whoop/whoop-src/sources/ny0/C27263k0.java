package ny0;

import p134f2.C14015d;
import p270k2.InterfaceC22129c;
import p712j91.InterfaceC21430b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ny0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C27263k0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f109092w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC21430b f109093x;

    public /* synthetic */ C27263k0(InterfaceC21430b interfaceC21430b, int i13) {
        this.f109092w = i13;
        this.f109093x = interfaceC21430b;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f109092w) {
            case 0:
                return AbstractC27265l0.m82223o(this.f109093x, (C14015d) obj);
            default:
                return AbstractC27265l0.m82224p(this.f109093x, (InterfaceC22129c) obj);
        }
    }
}
