package xp0;

import android.view.View;
import com.whoop.community.CommunityLandingHostFragment;
import com.whoop.domain.model.teams.FeatureTeam;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamInviteDto;
import nq0.C27047j;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: xp0.g */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38510g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165754w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CommunityLandingHostFragment f165755x;

    public /* synthetic */ C38510g(CommunityLandingHostFragment communityLandingHostFragment, int i13) {
        this.f165754w = i13;
        this.f165755x = communityLandingHostFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f165754w) {
            case 0:
                return CommunityLandingHostFragment.m19007z1(this.f165755x, ((Integer) obj).intValue());
            case 1:
                return CommunityLandingHostFragment.m18983n1(this.f165755x, (C27047j) obj);
            case 2:
                return CommunityLandingHostFragment.m18998v0(this.f165755x, (Team) obj);
            case 3:
                return CommunityLandingHostFragment.m18912G1(this.f165755x, (View) obj);
            case 4:
                return CommunityLandingHostFragment.m18951X0(this.f165755x, (View) obj);
            case 5:
                return CommunityLandingHostFragment.m18994t0(this.f165755x, (TeamInviteDto) obj);
            case 6:
                return CommunityLandingHostFragment.m18986p0(this.f165755x, (FeatureTeam) obj);
            case 7:
                return CommunityLandingHostFragment.m18911G0(this.f165755x, obj);
            case 8:
                return CommunityLandingHostFragment.m18898B0(this.f165755x, obj);
            case 9:
                return CommunityLandingHostFragment.m18953Y0(this.f165755x, (View) obj);
            case 10:
                return CommunityLandingHostFragment.m18900C0(this.f165755x, ((Integer) obj).intValue());
            case 11:
                return CommunityLandingHostFragment.m18955Z0(this.f165755x, (View) obj);
            case 12:
                return CommunityLandingHostFragment.m18957a1(this.f165755x, (View) obj);
            case 13:
                return CommunityLandingHostFragment.m18959b1(this.f165755x, (View) obj);
            case 14:
                return CommunityLandingHostFragment.m18961c1(this.f165755x, (View) obj);
            default:
                return CommunityLandingHostFragment.m18967f1(this.f165755x, (View) obj);
        }
    }
}
