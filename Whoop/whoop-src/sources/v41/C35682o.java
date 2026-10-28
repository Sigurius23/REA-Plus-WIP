package v41;

import c93.InterfaceC4339a;
import p524ui.C34981i;

/* JADX INFO: renamed from: v41.o */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C35682o implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151676w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34981i f151677x;

    public /* synthetic */ C35682o(C34981i c34981i, int i13) {
        this.f151676w = i13;
        this.f151677x = c34981i;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        float fM113050k;
        switch (this.f151676w) {
            case 0:
                fM113050k = AbstractC35684p.m113050k(this.f151677x);
                break;
            default:
                fM113050k = AbstractC35687q0.m113110t(this.f151677x);
                break;
        }
        return Float.valueOf(fM113050k);
    }
}
