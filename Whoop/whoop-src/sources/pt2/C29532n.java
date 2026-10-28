package pt2;

import c93.InterfaceC4339a;
import com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeFragment;

/* JADX INFO: renamed from: pt2.n */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C29532n implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120264w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ HubAndSpokeFragment f120265x;

    public /* synthetic */ C29532n(HubAndSpokeFragment hubAndSpokeFragment, int i13) {
        this.f120264w = i13;
        this.f120265x = hubAndSpokeFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f120264w) {
            case 0:
                return HubAndSpokeFragment.m27950L(this.f120265x);
            case 1:
                return HubAndSpokeFragment.m27956T(this.f120265x);
            case 2:
                return HubAndSpokeFragment.m27953O(this.f120265x);
            case 3:
                return HubAndSpokeFragment.m27954P(this.f120265x);
            default:
                return HubAndSpokeFragment.m27955Q(this.f120265x);
        }
    }
}
