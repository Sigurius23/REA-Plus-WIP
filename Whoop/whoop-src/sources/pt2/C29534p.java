package pt2;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: pt2.p */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C29534p implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120270w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f120271x;

    public /* synthetic */ C29534p(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f120270w = i13;
        this.f120271x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f120270w) {
            case 0:
                return AbstractC29540v.m90432m0(this.f120271x);
            case 1:
                return AbstractC29540v.m90434n0(this.f120271x);
            default:
                return AbstractC29540v.m90365C0(this.f120271x);
        }
    }
}
