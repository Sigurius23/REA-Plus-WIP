package bm0;

import c93.InterfaceC4339a;
import p409q0.AbstractC29701y;

/* JADX INFO: renamed from: bm0.k */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3408k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13286w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f13287x;

    public /* synthetic */ C3408k(Object obj, int i13) {
        this.f13286w = i13;
        this.f13287x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int iM9817h;
        switch (this.f13286w) {
            case 0:
                iM9817h = AbstractC3409l.a.m9817h((AbstractC29701y) this.f13287x);
                break;
            default:
                iM9817h = AbstractC3409l.m9810q((C3410m) this.f13287x);
                break;
        }
        return Integer.valueOf(iM9817h);
    }
}
