package p709he2;

import bc3.InterfaceC2994c0;
import java.util.List;
import p163g1.C15199y3;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import pj2.AbstractC29310i;

/* JADX INFO: renamed from: he2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17219e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f66158w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC2994c0 f66159x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f66160y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C15199y3 f66161z;

    public /* synthetic */ C17219e(int i13, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1) {
        this.f66158w = i13;
        this.f66159x = interfaceC2994c0;
        this.f66160y = interfaceC28601c1;
        this.f66161z = c15199y3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f66158w) {
            case 0:
                return Function1.m48693G(this.f66159x, this.f66160y, this.f66161z, (String) obj);
            case 1:
                return p725ot1.Function1.m85801M(this.f66159x, this.f66160y, this.f66161z, (String) obj);
            default:
                return AbstractC29310i.m89067s0(this.f66159x, this.f66160y, this.f66161z, (List) obj);
        }
    }
}
