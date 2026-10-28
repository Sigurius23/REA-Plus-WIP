package o11;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o11.p */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C27410p implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110372w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f110373x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC27407m.d.a f110374y;

    public /* synthetic */ C27410p(Function1 function1, AbstractC27407m.d.a aVar, int i13) {
        this.f110372w = i13;
        this.f110373x = function1;
        this.f110374y = aVar;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f110372w) {
            case 0:
                return AbstractC27407m.d.a.m82759H(this.f110373x, this.f110374y);
            default:
                return AbstractC27407m.d.a.m82761J(this.f110373x, this.f110374y);
        }
    }
}
