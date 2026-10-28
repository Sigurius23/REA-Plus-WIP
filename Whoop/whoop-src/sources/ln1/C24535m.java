package ln1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ln1.m */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24535m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95743w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f95744x;

    public /* synthetic */ C24535m(Function1 function1, int i13) {
        this.f95743w = i13;
        this.f95744x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95743w) {
            case 0:
                return AbstractC24539q.m71513X(this.f95744x);
            case 1:
                return AbstractC24539q.m71515Z(this.f95744x);
            case 2:
                return AbstractC24539q.m71510U(this.f95744x);
            default:
                return AbstractC24539q.m71494E(this.f95744x);
        }
    }
}
