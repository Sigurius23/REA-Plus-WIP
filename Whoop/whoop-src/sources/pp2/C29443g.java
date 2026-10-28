package pp2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pp2.g */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29443g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f119574w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f119575x;

    public /* synthetic */ C29443g(Function1 function1, int i13) {
        this.f119574w = i13;
        this.f119575x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f119574w) {
            case 0:
                return AbstractC29444h.m89874w(this.f119575x);
            default:
                return AbstractC29450n.m89896j(this.f119575x);
        }
    }
}
