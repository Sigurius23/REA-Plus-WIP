package xp0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.community.CommunityLandingHostFragment;
import qv1.C30656g;

/* JADX INFO: renamed from: xp0.j */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38513j implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165762w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30656g f165763x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ CommunityLandingHostFragment f165764y;

    public /* synthetic */ C38513j(C30656g c30656g, CommunityLandingHostFragment communityLandingHostFragment, int i13) {
        this.f165762w = i13;
        this.f165763x = c30656g;
        this.f165764y = communityLandingHostFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f165762w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return CommunityLandingHostFragment.m18905E0(this.f165763x, this.f165764y, composer, iIntValue);
            default:
                return CommunityLandingHostFragment.m18908F0(this.f165763x, this.f165764y, composer, iIntValue);
        }
    }
}
