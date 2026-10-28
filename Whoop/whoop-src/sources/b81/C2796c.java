package b81;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: b81.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C2796c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10976w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f10977x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2803j f10978y;

    public /* synthetic */ C2796c(Function1 function1, C2803j c2803j, int i13) {
        this.f10976w = i13;
        this.f10977x = function1;
        this.f10978y = c2803j;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f10976w) {
            case 0:
                return AbstractC2797d.m7967h(this.f10977x, this.f10978y);
            default:
                return C2800g.m7975d(this.f10977x, this.f10978y);
        }
    }
}
