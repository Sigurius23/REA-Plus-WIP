package kf0;

import c93.InterfaceC4339a;
import kd0.C22383c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kf0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22426a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f87750w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22383c.d f87751x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f87752y;

    public /* synthetic */ C22426a(C22383c.d dVar, Function1 function1, int i13) {
        this.f87750w = i13;
        this.f87751x = dVar;
        this.f87752y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f87750w) {
            case 0:
                return AbstractC22427b.m64614h(this.f87751x, this.f87752y);
            case 1:
                return AbstractC22427b.m64615i(this.f87751x, this.f87752y);
            case 2:
                return AbstractC22427b.m64616j(this.f87751x, this.f87752y);
            default:
                return AbstractC22427b.m64619m(this.f87751x, this.f87752y);
        }
    }
}
