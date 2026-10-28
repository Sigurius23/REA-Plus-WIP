package p734sl0;

import bc3.InterfaceC2994c0;
import nl0.AbstractC26802d;
import p163g1.C15199y3;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sl0.d0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32595d0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135070w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC2994c0 f135071x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f135072y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C15199y3 f135073z;

    public /* synthetic */ C32595d0(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1) {
        this.f135071x = interfaceC2994c0;
        this.f135073z = c15199y3;
        this.f135072y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135070w) {
            case 0:
                return AbstractC32600e0.m101725h(this.f135071x, this.f135073z, this.f135072y, (AbstractC26802d) obj);
            default:
                return AbstractC32600e0.m101726i(this.f135071x, this.f135072y, this.f135073z, (AbstractC26802d) obj);
        }
    }

    public /* synthetic */ C32595d0(InterfaceC2994c0 interfaceC2994c0, Function1 function1, C15199y3 c15199y3) {
        this.f135071x = interfaceC2994c0;
        this.f135072y = function1;
        this.f135073z = c15199y3;
    }
}
