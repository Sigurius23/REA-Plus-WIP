package xp0;

import androidx.lifecycle.InterfaceC1633v0;
import com.whoop.community.CommunityRemoveMembersFragment;
import p217ib.AbstractC18317n;

/* JADX INFO: renamed from: xp0.u */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C38524u implements InterfaceC1633v0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165796w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CommunityRemoveMembersFragment f165797x;

    public /* synthetic */ C38524u(CommunityRemoveMembersFragment communityRemoveMembersFragment, int i13) {
        this.f165796w = i13;
        this.f165797x = communityRemoveMembersFragment;
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final void onChanged(Object obj) {
        switch (this.f165796w) {
            case 0:
                CommunityRemoveMembersFragment.m19142l0(this.f165797x, (AbstractC18317n) obj);
                break;
            default:
                CommunityRemoveMembersFragment.m19151u0(this.f165797x, (AbstractC18317n) obj);
                break;
        }
    }
}
