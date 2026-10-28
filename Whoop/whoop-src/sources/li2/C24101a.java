package li2;

import c93.InterfaceC4339a;
import com.whoop.strava.view.StravaFragment;

/* JADX INFO: renamed from: li2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C24101a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95193w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ StravaFragment f95194x;

    public /* synthetic */ C24101a(StravaFragment stravaFragment, int i13) {
        this.f95193w = i13;
        this.f95194x = stravaFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95193w) {
            case 0:
                return StravaFragment.m26326F(this.f95194x);
            case 1:
                return StravaFragment.m26338R(this.f95194x);
            case 2:
                return StravaFragment.m26336P(this.f95194x);
            default:
                return StravaFragment.m26335O(this.f95194x);
        }
    }
}
