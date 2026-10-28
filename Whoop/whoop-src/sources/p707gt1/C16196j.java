package p707gt1;

import c93.InterfaceC4339a;
import mf0.AbstractC25506e;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: gt1.j */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16196j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f61500w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f61501x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f61502y;

    public /* synthetic */ C16196j(boolean z4, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f61500w = i13;
        this.f61501x = z4;
        this.f61502y = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f61500w) {
            case 0:
                return Boolean.valueOf(AbstractC16198l.m45802s(this.f61501x, this.f61502y));
            default:
                return AbstractC25506e.m74918I(this.f61501x, this.f61502y);
        }
    }
}
