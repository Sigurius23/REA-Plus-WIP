package p698au1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import zt1.InterfaceC41128c;

/* JADX INFO: renamed from: au1.p */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C2071p implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8204w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f8205x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC41128c.c f8206y;

    public /* synthetic */ C2071p(Function1 function1, InterfaceC41128c.c cVar, int i13) {
        this.f8204w = i13;
        this.f8205x = function1;
        this.f8206y = cVar;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f8204w) {
            case 0:
                return AbstractC2072q.m6517C(this.f8205x, this.f8206y);
            default:
                return AbstractC2072q.m6518D(this.f8205x, this.f8206y);
        }
    }
}
