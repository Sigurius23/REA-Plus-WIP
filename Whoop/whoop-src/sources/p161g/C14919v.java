package p161g;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: g.v */
/* JADX INFO: loaded from: classes.dex */
public final class C14919v extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55602w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14923z f55603x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14919v(C14923z c14923z, int i13) {
        super(0);
        this.f55602w = i13;
        this.f55603x = c14923z;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f55602w) {
            case 0:
                this.f55603x.m43018d();
                break;
            default:
                this.f55603x.m43017c();
                break;
        }
        return C23454a0.f92919a;
    }
}
