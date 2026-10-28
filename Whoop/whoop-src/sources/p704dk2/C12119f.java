package p704dk2;

import c93.InterfaceC4339a;
import com.whoop.tiltgraph.view.TiltGraphFragment;

/* JADX INFO: renamed from: dk2.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12119f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40341w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TiltGraphFragment f40342x;

    public /* synthetic */ C12119f(TiltGraphFragment tiltGraphFragment, int i13) {
        this.f40341w = i13;
        this.f40342x = tiltGraphFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f40341w) {
            case 0:
                return TiltGraphFragment.m26485O(this.f40342x);
            default:
                return TiltGraphFragment.m26489S(this.f40342x);
        }
    }
}
