package v11;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: v11.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C35550h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151231w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f151232x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C35553k f151233y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f151234z;

    public /* synthetic */ C35550h(InterfaceC4339a interfaceC4339a, C35553k c35553k, Function1 function1) {
        this.f151231w = 2;
        this.f151233y = c35553k;
        this.f151234z = function1;
        this.f151232x = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f151231w) {
            case 0:
                return AbstractC35551i.m112715I(this.f151232x, this.f151233y, this.f151234z);
            case 1:
                return AbstractC35551i.m112716J(this.f151232x, this.f151233y, this.f151234z);
            default:
                return AbstractC35551i.m112717K(this.f151233y, this.f151234z, this.f151232x);
        }
    }

    public /* synthetic */ C35550h(InterfaceC4339a interfaceC4339a, C35553k c35553k, Function1 function1, int i13) {
        this.f151231w = i13;
        this.f151232x = interfaceC4339a;
        this.f151233y = c35553k;
        this.f151234z = function1;
    }
}
