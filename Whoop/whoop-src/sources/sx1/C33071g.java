package sx1;

import c93.InterfaceC4339a;
import com.whoop.membership.reactivationmodal.ReactivationModalFragment;

/* JADX INFO: renamed from: sx1.g */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C33071g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f137915w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ReactivationModalFragment f137916x;

    public /* synthetic */ C33071g(ReactivationModalFragment reactivationModalFragment, int i13) {
        this.f137915w = i13;
        this.f137916x = reactivationModalFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f137915w) {
            case 0:
                return ReactivationModalFragment.m22829F(this.f137916x);
            default:
                return ReactivationModalFragment.m22832I(this.f137916x);
        }
    }
}
