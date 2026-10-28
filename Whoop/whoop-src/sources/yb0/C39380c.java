package yb0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import v41.AbstractC35664f;

/* JADX INFO: renamed from: yb0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C39380c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f169438w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC2994c0 f169439x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f169440y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC35664f f169441z;

    public /* synthetic */ C39380c(InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, AbstractC35664f abstractC35664f, int i13) {
        this.f169438w = i13;
        this.f169439x = interfaceC2994c0;
        this.f169440y = interfaceC4339a;
        this.f169441z = abstractC35664f;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f169438w) {
            case 0:
                return AbstractC39384g.m125637v(this.f169439x, this.f169440y, this.f169441z);
            default:
                return AbstractC39388k.m125701c0(this.f169439x, this.f169440y, this.f169441z);
        }
    }
}
