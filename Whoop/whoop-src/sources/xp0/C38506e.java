package xp0;

import android.view.View;
import com.whoop.community.CommunityFragment;
import com.whoop.domain.model.teams.Team;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: xp0.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38506e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165737w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CommunityFragment f165738x;

    public /* synthetic */ C38506e(CommunityFragment communityFragment, int i13) {
        this.f165737w = i13;
        this.f165738x = communityFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f165737w) {
            case 0:
                return CommunityFragment.m18841B0(this.f165738x, (View) obj);
            default:
                return CommunityFragment.m18885r0(this.f165738x, (Team) obj);
        }
    }
}
