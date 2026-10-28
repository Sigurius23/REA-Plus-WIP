package ny0;

import p134f2.C14015d;
import p270k2.InterfaceC22129c;
import p712j91.InterfaceC21430b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ny0.j0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C27261j0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f109087w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC21430b f109088x;

    public /* synthetic */ C27261j0(InterfaceC21430b interfaceC21430b, int i13) {
        this.f109087w = i13;
        this.f109088x = interfaceC21430b;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f109087w) {
            case 0:
                return AbstractC27265l0.m82221m(this.f109088x, (C14015d) obj);
            default:
                return AbstractC27265l0.m82222n(this.f109088x, (InterfaceC22129c) obj);
        }
    }
}
