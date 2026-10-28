package ey0;

import c93.InterfaceC4339a;
import cy0.C11184c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ey0.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C13736c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48999w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11184c.c f49000x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f49001y;

    public /* synthetic */ C13736c(C11184c.c cVar, Function1 function1, int i13) {
        this.f48999w = i13;
        this.f49000x = cVar;
        this.f49001y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f48999w) {
            case 0:
                return AbstractC13737d.m39018k(this.f49000x, this.f49001y);
            case 1:
                return AbstractC13737d.m39019l(this.f49000x, this.f49001y);
            case 2:
                return AbstractC13737d.m39020m(this.f49000x, this.f49001y);
            default:
                return AbstractC13737d.m39015h(this.f49000x, this.f49001y);
        }
    }
}
