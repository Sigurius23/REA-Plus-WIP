package xp0;

import android.text.Editable;
import android.view.View;
import com.whoop.community.CommunityRemoveMembersFragment;
import com.whoop.domain.model.teams.TeamUser;
import p715kotlin.jvm.functions.Function1;
import rq0.C31676j0;

/* JADX INFO: renamed from: xp0.s */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38522s implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165791w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CommunityRemoveMembersFragment f165792x;

    public /* synthetic */ C38522s(CommunityRemoveMembersFragment communityRemoveMembersFragment, int i13) {
        this.f165791w = i13;
        this.f165792x = communityRemoveMembersFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f165791w) {
            case 0:
                return CommunityRemoveMembersFragment.m19140j0(this.f165792x, (View) obj);
            case 1:
                return CommunityRemoveMembersFragment.m19139i0(this.f165792x, (C31676j0) obj);
            case 2:
                return CommunityRemoveMembersFragment.m19133c0(this.f165792x, (TeamUser) obj);
            case 3:
                return CommunityRemoveMembersFragment.m19134d0(this.f165792x, (TeamUser) obj);
            default:
                return CommunityRemoveMembersFragment.m19137g0(this.f165792x, (Editable) obj);
        }
    }
}
