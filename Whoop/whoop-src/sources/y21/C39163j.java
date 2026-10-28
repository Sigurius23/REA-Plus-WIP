package y21;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: y21.j */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C39163j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f168392w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28670t2 f168393x;

    public /* synthetic */ C39163j(InterfaceC28670t2 interfaceC28670t2, int i13) {
        this.f168392w = i13;
        this.f168393x = interfaceC28670t2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f168392w) {
            case 0:
                return AbstractC39162i.d.m124739d(this.f168393x);
            case 1:
                return AbstractC39162i.d.m124740e(this.f168393x);
            default:
                return AbstractC39162i.m124731v((InterfaceC28601c1) this.f168393x);
        }
    }
}
