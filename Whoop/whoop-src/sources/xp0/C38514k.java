package xp0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.community.CommunityLandingHostFragment;
import h51.C16934f;

/* JADX INFO: renamed from: xp0.k */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38514k implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165765w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16934f f165766x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ CommunityLandingHostFragment f165767y;

    public /* synthetic */ C38514k(C16934f c16934f, CommunityLandingHostFragment communityLandingHostFragment, int i13) {
        this.f165765w = i13;
        this.f165766x = c16934f;
        this.f165767y = communityLandingHostFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f165765w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return CommunityLandingHostFragment.m19006z0(this.f165766x, this.f165767y, composer, iIntValue);
            default:
                return CommunityLandingHostFragment.m18896A0(this.f165766x, this.f165767y, composer, iIntValue);
        }
    }
}
