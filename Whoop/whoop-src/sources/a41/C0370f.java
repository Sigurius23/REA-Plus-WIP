package a41;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: a41.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0370f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1265w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f1266x;

    public /* synthetic */ C0370f(Object obj, int i13) {
        this.f1265w = i13;
        this.f1266x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f1265w) {
            case 0:
                return Integer.valueOf(AbstractC0376l.m1029v((C0377m) this.f1266x));
            default:
                return AbstractC0376l.m1022o((InterfaceC4339a) this.f1266x);
        }
    }
}
