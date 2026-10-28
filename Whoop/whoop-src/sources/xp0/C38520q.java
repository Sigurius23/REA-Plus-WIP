package xp0;

import android.view.View;
import com.whoop.community.CommunityPendingInviteFragment;
import com.whoop.domain.model.teams.TeamInviteDto;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: xp0.q */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38520q implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165787w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CommunityPendingInviteFragment f165788x;

    public /* synthetic */ C38520q(CommunityPendingInviteFragment communityPendingInviteFragment, int i13) {
        this.f165787w = i13;
        this.f165788x = communityPendingInviteFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f165787w) {
            case 0:
                return CommunityPendingInviteFragment.m19106c0(this.f165788x, ((Integer) obj).intValue());
            case 1:
                return CommunityPendingInviteFragment.m19103Z(this.f165788x, (View) obj);
            default:
                return CommunityPendingInviteFragment.m19092O(this.f165788x, (TeamInviteDto) obj);
        }
    }
}
