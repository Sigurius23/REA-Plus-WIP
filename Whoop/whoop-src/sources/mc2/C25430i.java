package mc2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mc2.i */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25430i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99609w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f99610x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C25429h f99611y;

    public /* synthetic */ C25430i(Function1 function1, C25429h c25429h, int i13) {
        this.f99609w = i13;
        this.f99610x = function1;
        this.f99611y = c25429h;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f99609w) {
            case 0:
                return AbstractC25433l.m74659k(this.f99610x, this.f99611y);
            default:
                return AbstractC25433l.m74665q(this.f99610x, this.f99611y);
        }
    }
}
