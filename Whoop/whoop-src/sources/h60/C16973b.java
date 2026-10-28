package h60;

import c93.InterfaceC4339a;
import com.whoop.access.reconfirmlabs.view.ReconfirmLabsFragment;

/* JADX INFO: renamed from: h60.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16973b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65136w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ReconfirmLabsFragment f65137x;

    public /* synthetic */ C16973b(ReconfirmLabsFragment reconfirmLabsFragment, int i13) {
        this.f65136w = i13;
        this.f65137x = reconfirmLabsFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f65136w) {
            case 0:
                return ReconfirmLabsFragment.m16986P(this.f65137x);
            case 1:
                return ReconfirmLabsFragment.m16982L(this.f65137x);
            case 2:
                return ReconfirmLabsFragment.m16981K(this.f65137x);
            case 3:
                return ReconfirmLabsFragment.m16984N(this.f65137x);
            default:
                return ReconfirmLabsFragment.m16985O(this.f65137x);
        }
    }
}
