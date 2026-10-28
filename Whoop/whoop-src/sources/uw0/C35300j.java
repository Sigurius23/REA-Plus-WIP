package uw0;

import c93.InterfaceC4339a;
import km0.C22581e;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: uw0.j */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C35300j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f150324w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f150325x;

    public /* synthetic */ C35300j(Object obj, int i13) {
        this.f150324w = i13;
        this.f150325x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f150324w) {
            case 0:
                return Integer.valueOf(AbstractC35302l.m112010D((C22581e) this.f150325x));
            default:
                return AbstractC35304n.m112062m((InterfaceC28601c1) this.f150325x);
        }
    }
}
