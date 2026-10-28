package h01;

import p294l3.C23277r0;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import um1.AbstractC35086d;
import un1.AbstractC35101g;

/* JADX INFO: renamed from: h01.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16547n implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63673w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f63674x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f63675y;

    public /* synthetic */ C16547n(int i13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f63673w = i13;
        this.f63674x = interfaceC28601c1;
        this.f63675y = interfaceC28601c2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f63673w) {
            case 0:
                return AbstractC16549p.m46756J(this.f63674x, this.f63675y, (C23277r0) obj);
            case 1:
                return AbstractC16559z.m46875q(this.f63674x, this.f63675y, (C23277r0) obj);
            case 2:
                return AbstractC35086d.m110964t(this.f63674x, this.f63675y, ((Boolean) obj).booleanValue());
            case 3:
                return AbstractC35101g.m111046s(this.f63674x, this.f63675y, ((Float) obj).floatValue());
            default:
                return AbstractC35101g.m111048u(this.f63674x, this.f63675y, ((Float) obj).floatValue());
        }
    }
}
