package yd2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: yd2.g */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C39465g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f169815w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f169816x;

    public /* synthetic */ C39465g(Function1 function1, int i13) {
        this.f169815w = i13;
        this.f169816x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f169815w) {
            case 0:
                return AbstractC39469k.m126077O(this.f169816x);
            case 1:
                return AbstractC39469k.m126088Z(this.f169816x);
            case 2:
                return AbstractC39469k.m126115z(this.f169816x);
            default:
                return AbstractC39469k.m126082T(this.f169816x);
        }
    }
}
