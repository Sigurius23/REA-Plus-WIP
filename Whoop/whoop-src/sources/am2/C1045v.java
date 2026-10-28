package am2;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import p163g1.C15199y3;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: am2.v */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1045v implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f4029E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C15199y3 f4030F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC28601c1 f4031G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f4032w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC2994c0 f4033x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15199y3 f4034y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f4035z;

    public /* synthetic */ C1045v(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, InterfaceC28601c1 interfaceC28601c1, C15199y3 c15199y4, InterfaceC28601c1 interfaceC28601c2) {
        this.f4033x = interfaceC2994c0;
        this.f4034y = c15199y3;
        this.f4035z = function1;
        this.f4029E = interfaceC28601c1;
        this.f4030F = c15199y4;
        this.f4031G = interfaceC28601c2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f4032w) {
            case 0:
                InterfaceC28601c1 interfaceC28601c1 = this.f4031G;
                C15199y3 c15199y3 = this.f4030F;
                return AbstractC1046w.m3016a0(this.f4033x, this.f4035z, this.f4029E, this.f4034y, interfaceC28601c1, c15199y3);
            default:
                return AbstractC1035o0.m2852V0(this.f4033x, this.f4034y, this.f4035z, this.f4029E, this.f4030F, this.f4031G);
        }
    }

    public /* synthetic */ C1045v(InterfaceC2994c0 interfaceC2994c0, Function1 function1, InterfaceC28601c1 interfaceC28601c1, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c2, C15199y3 c15199y4) {
        this.f4033x = interfaceC2994c0;
        this.f4035z = function1;
        this.f4029E = interfaceC28601c1;
        this.f4034y = c15199y3;
        this.f4031G = interfaceC28601c2;
        this.f4030F = c15199y4;
    }
}
