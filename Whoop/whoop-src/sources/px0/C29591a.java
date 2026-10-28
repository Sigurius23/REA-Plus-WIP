package px0;

import c93.InterfaceC4339a;
import com.whoop.debug.dismissalplayground.DismissalPlaygroundFragment;

/* JADX INFO: renamed from: px0.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C29591a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120825w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DismissalPlaygroundFragment f120826x;

    public /* synthetic */ C29591a(DismissalPlaygroundFragment dismissalPlaygroundFragment, int i13) {
        this.f120825w = i13;
        this.f120826x = dismissalPlaygroundFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f120825w) {
            case 0:
                return DismissalPlaygroundFragment.m20042T(this.f120826x);
            case 1:
                return DismissalPlaygroundFragment.m20037O(this.f120826x);
            case 2:
                return DismissalPlaygroundFragment.m20038P(this.f120826x);
            default:
                return DismissalPlaygroundFragment.m20039Q(this.f120826x);
        }
    }
}
