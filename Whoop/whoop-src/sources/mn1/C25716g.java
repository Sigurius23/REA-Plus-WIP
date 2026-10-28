package mn1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mn1.g */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C25716g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101303w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f101304x;

    public /* synthetic */ C25716g(Function1 function1, int i13) {
        this.f101303w = i13;
        this.f101304x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f101303w) {
            case 0:
                return AbstractC25717h.m75763E(this.f101304x);
            case 1:
                return AbstractC25717h.m75760B(this.f101304x);
            default:
                return AbstractC25717h.m75784t(this.f101304x);
        }
    }
}
