package yd2;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: yd2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C39461c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f169789w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f169790x;

    public /* synthetic */ C39461c(Object obj, int i13) {
        this.f169789w = i13;
        this.f169790x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f169789w) {
            case 0:
                return AbstractC39462d.m126031s((InterfaceC4339a) this.f169790x);
            case 1:
                return AbstractC39464f.m126061s((InterfaceC4339a) this.f169790x);
            default:
                return Boolean.valueOf(AbstractC39462d.a.m126038h((InterfaceC28670t2) this.f169790x));
        }
    }
}
