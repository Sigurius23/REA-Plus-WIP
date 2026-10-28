package bm2;

import p181h2.C16617b;
import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bm2.a1 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3425a1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13409w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f13410x;

    public /* synthetic */ C3425a1(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f13409w = i13;
        this.f13410x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13409w) {
            case 0:
                return AbstractC3487z0.d.m10283b(this.f13410x, (C16617b) obj);
            default:
                return AbstractC3468q.m10178m(this.f13410x, (InterfaceC39147y) obj);
        }
    }
}
