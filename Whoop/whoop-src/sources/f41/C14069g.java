package f41;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import p730qt2.AbstractC30618x;
import w11.AbstractC36695b;

/* JADX INFO: renamed from: f41.g */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C14069g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50459w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f50460x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C14063a f50461y;

    public /* synthetic */ C14069g(Function1 function1, C14063a c14063a, int i13) {
        this.f50459w = i13;
        this.f50460x = function1;
        this.f50461y = c14063a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f50459w) {
            case 0:
                return AbstractC14078p.m40065P(this.f50460x, this.f50461y);
            case 1:
                return AbstractC30618x.m94000j(this.f50460x, this.f50461y);
            default:
                return AbstractC36695b.m117788y(this.f50460x, this.f50461y);
        }
    }
}
