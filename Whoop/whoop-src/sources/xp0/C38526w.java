package xp0;

import android.view.View;
import com.whoop.community.CommunityShowInviteFragment;
import p715kotlin.jvm.functions.Function1;
import rq0.C31665f1;

/* JADX INFO: renamed from: xp0.w */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38526w implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165799w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CommunityShowInviteFragment f165800x;

    public /* synthetic */ C38526w(CommunityShowInviteFragment communityShowInviteFragment, int i13) {
        this.f165799w = i13;
        this.f165800x = communityShowInviteFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f165799w) {
            case 0:
                return CommunityShowInviteFragment.m19173Z(this.f165800x, (C31665f1) obj);
            case 1:
                return CommunityShowInviteFragment.m19178e0(this.f165800x, (View) obj);
            case 2:
                return CommunityShowInviteFragment.m19179f0(this.f165800x, (View) obj);
            default:
                return CommunityShowInviteFragment.m19180g0(this.f165800x, (View) obj);
        }
    }
}
