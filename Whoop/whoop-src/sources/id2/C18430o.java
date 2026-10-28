package id2;

import c93.InterfaceC4339a;
import com.whoop.share.view.WhoopShareFragment;

/* JADX INFO: renamed from: id2.o */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C18430o implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71687w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ WhoopShareFragment f71688x;

    public /* synthetic */ C18430o(WhoopShareFragment whoopShareFragment, int i13) {
        this.f71687w = i13;
        this.f71688x = whoopShareFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f71687w) {
            case 0:
                return WhoopShareFragment.m25823K(this.f71688x);
            case 1:
                return WhoopShareFragment.m25824L(this.f71688x);
            default:
                return WhoopShareFragment.m25822J(this.f71688x);
        }
    }
}
