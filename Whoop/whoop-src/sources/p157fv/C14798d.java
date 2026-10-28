package p157fv;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: fv.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C14798d extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f54921w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14809o f54922x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14798d(C14809o c14809o, int i13) {
        super(0);
        this.f54921w = i13;
        this.f54922x = c14809o;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f54921w) {
            case 0:
                C14809o c14809o = this.f54922x;
                c14809o.f54992b.cancel();
                c14809o.f54992b.removeAllListeners();
                break;
            case 1:
                this.f54922x.f54992b.start();
                break;
            default:
                this.f54922x.f54992b.cancel();
                break;
        }
        return C23454a0.f92919a;
    }
}
