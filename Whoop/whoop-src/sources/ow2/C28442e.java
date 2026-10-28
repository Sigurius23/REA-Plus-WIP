package ow2;

import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;
import z72.AbstractC40161g;

/* JADX INFO: renamed from: ow2.e */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C28442e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114672w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC25312u f114673x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f114674y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f114675z;

    public /* synthetic */ C28442e(InterfaceC25312u interfaceC25312u, Function1 function1, Function1 function2, int i13) {
        this.f114672w = i13;
        this.f114673x = interfaceC25312u;
        this.f114674y = function1;
        this.f114675z = function2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f114672w) {
            case 0:
                return AbstractC28443f.m86200u(this.f114673x, this.f114674y, this.f114675z, obj);
            default:
                return AbstractC40161g.m128809W(this.f114673x, this.f114674y, this.f114675z, obj);
        }
    }
}
